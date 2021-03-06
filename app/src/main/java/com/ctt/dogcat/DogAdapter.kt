package com.ctt.dogcat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.dogcat.model.Animal
import com.squareup.picasso.Picasso


class DogAdapter(private val listaAdocao:MutableList<Animal>) :RecyclerView.Adapter<DogAdapter.DogHolder>()  {



        //PRIMEIRO PASSO A SER LIDO
        //Item final a ser visualizado e inserido na RecyclerView
        class DogHolder(view: View) : RecyclerView.ViewHolder(view){
            val nomeDog: TextView = view.findViewById(R.id.txtNome)
            val mensagem: TextView = view.findViewById(R.id.txtMensagem)
            val idade: TextView = view.findViewById(R.id.txtIdade)
            val fotoDog: ImageView = view.findViewById(R.id.imgDog)
        }

        //Equivalente ao onCreate da Activity, só que no caso, da nossa célula/item
        //Da RecyclerView
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogHolder {
            val view = LayoutInflater.from(parent.context).
            inflate(R.layout.lista_adocao, parent, false)

            return DogHolder(view)
        }

        //Responsável por VINCULAR os dados com os componentes do xml
        //Contato da lista = texto de contato do xml
        override fun onBindViewHolder(holder: DogHolder, position: Int) {
            //Picasso.get().load(listaAdocao[position].imagem).into(fotoDog)

//                holder.fotoDog.setImageDrawable(it)
            var imagemfinal = Picasso.get().load(listaAdocao[position].imagem).into(holder.fotoDog)
            holder.nomeDog.text = listaAdocao[position].nomeDog
            holder.mensagem.text = listaAdocao[position].mensagem
            holder.idade.text = listaAdocao[position].idade
        }

        override fun getItemCount(): Int = listaAdocao.size
}