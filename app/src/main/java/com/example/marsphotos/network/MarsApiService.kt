package com.example.marsphotos.network

import retrofit2.Retrofit
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.http.GET

// URL dasar untuk Retrofit
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

// Interface untuk API Mars
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto> // Ubah ke suspend jika menggunakan coroutine
}

// Objek singleton Retrofit
object MarsApi {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    // Properti retrofitService
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
