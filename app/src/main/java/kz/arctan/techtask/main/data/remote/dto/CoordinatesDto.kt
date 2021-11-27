package kz.arctan.techtask.main.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CoordinatesDto(
    @SerializedName("features")
    val features: List<FeatureDto>,
    @SerializedName("type")
    val type: String
)

