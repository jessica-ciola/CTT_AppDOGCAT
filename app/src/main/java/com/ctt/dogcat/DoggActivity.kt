package com.ctt.dogcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.ctt.dogcat.model.Animal
import com.google.android.material.tabs.TabLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DoggActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dogg)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        viewPager.adapter = PageAdapter(supportFragmentManager)

        //vinculamos a viewpage ao tabLayout
        tabLayout.setupWithViewPager(viewPager)


         }


        }














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
