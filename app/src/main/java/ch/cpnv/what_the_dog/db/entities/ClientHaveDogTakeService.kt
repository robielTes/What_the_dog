package ch.cpnv.what_the_dog.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clients_have_dog_take_services")
data class ClientHaveDogTakeService(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "id_client") val idClient: Int,
    @ColumnInfo(name = "id_service") val idService: Int,
    @ColumnInfo(name = "id_dog") val idDog: Int,
    @ColumnInfo(name = "paid") val paid: Boolean
) {

}
