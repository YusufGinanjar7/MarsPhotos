package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import retrofit2.http.GET

// URL dasar untuk Retrofit
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

// Interface untuk API Mars
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto> // Ubah ke suspend jika menggunakan coroutine
}
