package com.ctt.dogcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.dogcat.model.Animal

class DoggActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dogg)

        val listaAdotar = mutableListOf<Animal>(
            Animal(imagem = null, nomeDog = "Henrique", mensagem = "Vou pagar a breja!", idade = "8:01 PM"),
            Animal(imagem = null, nomeDog = "Priscilla", mensagem = "Vou pagar a porção!!", idade = "7:35 PM"),
        )

        val rvAdotar = findViewById<RecyclerView>(R.id.listaadocao)
        rvAdotar.adapter = DogAdapter(listaAdotar)

        rvAdotar.layoutManager = LinearLayoutManager(this)

         }
    }

//





//    val chamada = messagem.buscarDog(message)
//
//    chamada.enqueue(
//    object : Callback<message> {
//        //Comunicação com a API OK!
//        override fun onResponse(call: Call<message>, response: Response<message>) {
//
//
//            }
//        }
//
//
//    }
//
//
//    fun buscarDog() {
//        //Iniciar requisição a API para buscar CEP
//        val retrofitDog = Network.RetrofitConfig()
//
//    }
