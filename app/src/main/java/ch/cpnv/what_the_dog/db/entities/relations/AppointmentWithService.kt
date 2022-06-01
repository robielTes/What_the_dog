package ch.cpnv.what_the_dog.db.entities.relations;

import androidx.room.Embedded
import ch.cpnv.what_the_dog.db.entities.Appointment
import androidx.room.Junction
import androidx.room.Relation
import ch.cpnv.what_the_dog.db.entities.Service
import java.util.*

data class AppointmentWithService(
    @Embedded val appointment: Appointment,
    @Relation(
        parentColumn = "id_service",
        entityColumn = "id"
    )
    val service: Service?
){

}