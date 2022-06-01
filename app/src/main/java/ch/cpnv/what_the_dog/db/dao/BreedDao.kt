package ch.cpnv.what_the_dog.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ch.cpnv.what_the_dog.db.entities.Breed

@Dao
interface BreedDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addBreed(breed: Breed)

    @Query("SELECT * from breeds")
    fun getBreeds(): LiveData<List<Breed>>

}