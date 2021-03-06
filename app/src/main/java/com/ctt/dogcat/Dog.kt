package com.ctt.dogcat

import android.graphics.Bitmap
import com.google.gson.annotations.SerializedName

data class Dog(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String,

) {
    //Sobrecarga de método
    override fun toString() : String {
        return message.toString()
    }
}