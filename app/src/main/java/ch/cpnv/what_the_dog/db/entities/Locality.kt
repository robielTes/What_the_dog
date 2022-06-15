package ch.cpnv.what_the_dog.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "localities")
data class Locality (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "city") val noun: String,
    @ColumnInfo(name = "zip") val zip: Int,
    @ColumnInfo(name = "state") val department: String,
){

}