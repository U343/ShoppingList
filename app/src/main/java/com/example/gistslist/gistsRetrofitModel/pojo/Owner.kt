package com.example.gistslist.gistsRetrofitModel.pojo

import com.google.gson.annotations.SerializedName

data class Owner(
        @SerializedName("login") val login : String
)