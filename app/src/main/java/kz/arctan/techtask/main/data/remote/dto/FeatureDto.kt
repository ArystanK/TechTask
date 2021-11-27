package kz.arctan.techtask.main.data.remote.dto


import com.google.gson.annotations.SerializedName

data class FeatureDto(
    @SerializedName("geometry")
    val geometry: GeometryDto,
    @SerializedName("properties")
    val properties: PropertiesDto,
    @SerializedName("type")
    val type: String
)