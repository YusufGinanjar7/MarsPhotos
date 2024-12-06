package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            // Arrange: Siapkan repository dengan FakeMarsApiService
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )

            // Act: Panggil getMarsPhotos()
            val result = repository.getMarsPhotos()

            // Assert: Verifikasi bahwa hasilnya sesuai dengan FakeDataSource.photosList
            assertEquals(FakeDataSource.photosList, result)
        }
}
