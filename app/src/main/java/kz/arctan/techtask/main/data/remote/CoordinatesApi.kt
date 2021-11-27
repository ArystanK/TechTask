package kz.arctan.techtask.main.data.remote

import kz.arctan.techtask.main.data.remote.dto.CoordinatesDto
import retrofit2.http.GET

interface CoordinatesApi {
    @GET("/api/russia.geo.json")
    suspend fun getCoordinates(): CoordinatesDto
}