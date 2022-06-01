package CPNV.what_the_dog.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "diseases")
data class Disease (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "symptoms") val symptoms: String,
    @ColumnInfo(name = "diagnosis ") val diagnosis: String,
    @ColumnInfo(name = "prevention") val prevention: String,
    @ColumnInfo(name = "remedies") val remedies: String,
    @ColumnInfo(name = "zoonosis") val zoonosis: Boolean
) {

}