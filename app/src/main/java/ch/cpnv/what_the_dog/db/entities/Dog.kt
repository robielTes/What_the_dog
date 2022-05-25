package ch.cpnv.what_the_dog.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "dogs")
data class Dog (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "male") val male: Boolean,
    @ColumnInfo(name = "birthdate") val birthdate: Date,
    @ColumnInfo(name = "sterilized") val sterilized: Boolean,
    @ColumnInfo(name = "chemical") val chemical: Boolean,
    @ColumnInfo(name = "color") val color: String?,
    @ColumnInfo(name = "breed") val breed: Int,
    @ColumnInfo(name = "crossbreed") val crossbreed: Int?,
    @ColumnInfo(name = "id_client") val idClient: Int
) {

}