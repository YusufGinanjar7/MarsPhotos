package com.example.marsphotos.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName("img_src")
    val img_src: String
)
