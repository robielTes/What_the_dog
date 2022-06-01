package ch.cpnv.what_the_dog.db.dao

import androidx.room.*
import ch.cpnv.what_the_dog.db.entities.Client
import kotlinx.coroutines.flow.Flow

@Dao
interface ClientDao {

    @Query("SELECT * FROM clients")
    fun getClients() : Flow<List<Client>>

}