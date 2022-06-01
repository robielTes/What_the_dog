package ch.cpnv.what_the_dog.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "appointment")
data class Appointment(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "duration") val duration: Int,
    @ColumnInfo(name = "address") val address: String,
    @ColumnInfo(name = "city") val city: String,
    @ColumnInfo(name = "zipcode") val zipcode: String,
    @ColumnInfo(name = "state") val state: String,
    @ColumnInfo(name = "id_service") val id_service: Int,
    @ColumnInfo(name = "id_dog") val id_dog: Int,
    @ColumnInfo(name = "id_client") val id_client: Int

    )
