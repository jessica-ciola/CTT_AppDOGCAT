package com.ctt.dogcat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.dogcat.model.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class AdocaoFragment : Fragment() {

    lateinit var imageend: String
    lateinit var imageend2: String
    lateinit var imageend3: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adocao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //buscarDog()


        val listaAdocao = mutableListOf<Animal>(
            Animal(
                imagem = imageend,
                nomeDog = "Toquin",
                mensagem = "Quer ser meu amigo???",
                idade = "2 meses"
            ),
            Animal(
                imagem = imageend,
                nomeDog = "Pri",
                mensagem = "Vamos brncar?",
                idade = "6 meses"
            ),
            Animal(
                imagem = imageend,
                nomeDog = "Nina",
                mensagem = "Quero ser seu companheiro",
                idade = "2 anos"
            )
        )

        val rvConversas = view.findViewById<RecyclerView>(R.id.listaAdocao)
        //val addContato = view.findViewById<Button>(R.id.btnAddContato)

        val adapterContato = DogAdapter(listaAdocao)
        rvConversas.adapter = adapterContato

        rvConversas.layoutManager = LinearLayoutManager(requireContext())




    }



    fun buscarDog() {

        val retrofitClient = Network.RetrofitConfig("https://dog.ceo/api/breeds/image/random/")

        val servico = retrofitClient.create(DogService::class.java)

        val chamada = servico.buscarDog()

        chamada.enqueue(
            object : Callback<Dog> {
                //Comunicação com a API OK!
                override fun onResponse(call: Call<Dog>, response: Response<Dog>) {
                    val endImagem = response.body().toString()

                    imageend = endImagem

                }

                override fun onFailure(call: Call<Dog>, t: Throwable) {
                    Toast.makeText(requireContext(), "Algo deu errado",Toast.LENGTH_SHORT).show()

                }
            }
        )


    }
}