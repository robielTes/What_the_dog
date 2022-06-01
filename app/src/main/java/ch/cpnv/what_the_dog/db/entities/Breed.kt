package ch.cpnv.what_the_dog.db.entities.relations

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "breeds")
data class Breed (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "link") val link: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "picture") val picture: String?,
    @ColumnInfo(name = "classification") val classification: String?,
    @ColumnInfo(name = "min_size_female") val minimumSizeFemale: Int?,
    @ColumnInfo(name = "max_size_female") val maximumSizeFemale: Int?,
    @ColumnInfo(name = "min_size_male") val minimumSizeMale: Int?,
    @ColumnInfo(name = "max_size_male") val maximumSizeMale: Int?,
    @ColumnInfo(name = "min_weight_female") val minimumWeightFemale: Int?,
    @ColumnInfo(name = "max_weight_female") val maximumWeightFemale: Int?,
    @ColumnInfo(name = "min_weight_male") val minimumWeightMale: Int?,
    @ColumnInfo(name = "max_weight_male") val maximumWeightMale: Int?,
    @ColumnInfo(name = "life_expectancy") val lifeExpectancy: Int?
) {
}