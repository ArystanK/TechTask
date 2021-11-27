package kz.arctan.techtask.main.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PropertiesDto(
    @SerializedName("abbrev")
    val abbrev: String,
    @SerializedName("abbrev_len")
    val abbrevLen: Int,
    @SerializedName("adm0_a3")
    val adm0A3: String,
    @SerializedName("adm0_a3_is")
    val adm0A3Is: String,
    @SerializedName("adm0_a3_un")
    val adm0A3Un: Int,
    @SerializedName("adm0_a3_us")
    val adm0A3Us: String,
    @SerializedName("adm0_a3_wb")
    val adm0A3Wb: Int,
    @SerializedName("adm0_dif")
    val adm0Dif: Int,
    @SerializedName("admin")
    val admin: String,
    @SerializedName("brk_a3")
    val brkA3: String,
    @SerializedName("brk_diff")
    val brkDiff: Int,
    @SerializedName("brk_group")
    val brkGroup: Any,
    @SerializedName("brk_name")
    val brkName: String,
    @SerializedName("continent")
    val continent: String,
    @SerializedName("economy")
    val economy: String,
    @SerializedName("featurecla")
    val featurecla: String,
    @SerializedName("filename")
    val filename: String,
    @SerializedName("fips_10_")
    val fips10: String,
    @SerializedName("formal_en")
    val formalEn: String,
    @SerializedName("formal_fr")
    val formalFr: Any,
    @SerializedName("gdp_md_est")
    val gdpMdEst: Int,
    @SerializedName("gdp_year")
    val gdpYear: Int,
    @SerializedName("geou_dif")
    val geouDif: Int,
    @SerializedName("geounit")
    val geounit: String,
    @SerializedName("gu_a3")
    val guA3: String,
    @SerializedName("homepart")
    val homepart: Int,
    @SerializedName("income_grp")
    val incomeGrp: String,
    @SerializedName("iso_a2")
    val isoA2: String,
    @SerializedName("iso_a3")
    val isoA3: String,
    @SerializedName("iso_n3")
    val isoN3: String,
    @SerializedName("labelrank")
    val labelrank: Int,
    @SerializedName("lastcensus")
    val lastcensus: Int,
    @SerializedName("level")
    val level: Int,
    @SerializedName("long_len")
    val longLen: Int,
    @SerializedName("mapcolor13")
    val mapcolor13: Int,
    @SerializedName("mapcolor7")
    val mapcolor7: Int,
    @SerializedName("mapcolor8")
    val mapcolor8: Int,
    @SerializedName("mapcolor9")
    val mapcolor9: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_alt")
    val nameAlt: Any,
    @SerializedName("name_len")
    val nameLen: Int,
    @SerializedName("name_long")
    val nameLong: String,
    @SerializedName("name_sort")
    val nameSort: String,
    @SerializedName("note_adm0")
    val noteAdm0: Any,
    @SerializedName("note_brk")
    val noteBrk: Any,
    @SerializedName("pop_est")
    val popEst: Int,
    @SerializedName("pop_year")
    val popYear: Int,
    @SerializedName("postal")
    val postal: String,
    @SerializedName("region_un")
    val regionUn: String,
    @SerializedName("region_wb")
    val regionWb: String,
    @SerializedName("scalerank")
    val scalerank: Int,
    @SerializedName("sov_a3")
    val sovA3: String,
    @SerializedName("sovereignt")
    val sovereignt: String,
    @SerializedName("su_a3")
    val suA3: String,
    @SerializedName("su_dif")
    val suDif: Int,
    @SerializedName("subregion")
    val subregion: String,
    @SerializedName("subunit")
    val subunit: String,
    @SerializedName("tiny")
    val tiny: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("un_a3")
    val unA3: String,
    @SerializedName("wb_a2")
    val wbA2: String,
    @SerializedName("wb_a3")
    val wbA3: String,
    @SerializedName("wikipedia")
    val wikipedia: Int,
    @SerializedName("woe_id")
    val woeId: Int,
    @SerializedName("woe_id_eh")
    val woeIdEh: Int,
    @SerializedName("woe_note")
    val woeNote: String
)