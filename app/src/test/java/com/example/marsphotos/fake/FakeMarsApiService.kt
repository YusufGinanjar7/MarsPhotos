package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.model.MarsPhoto

class FakeMarsApiService : MarsApiService {

    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}