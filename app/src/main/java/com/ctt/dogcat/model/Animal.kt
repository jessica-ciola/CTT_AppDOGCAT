package com.ctt.dogcat.model

import android.graphics.Bitmap;



data class Animal(var imagem:Bitmap? =null,
                  val nomeDog: String,
                  val mensagem: String,
                  val idade: String)
