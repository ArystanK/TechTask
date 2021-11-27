package kz.arctan.techtask.main.data.remote.dto


import com.google.gson.annotations.SerializedName

data class GeometryDto(
    @SerializedName("coordinates")
    val coordinates: List<List<List<List<Double>>>>,
    @SerializedName("type")
    val type: String
)