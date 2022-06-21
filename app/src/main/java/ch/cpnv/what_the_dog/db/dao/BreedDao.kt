package ch.cpnv.what_the_dog.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ch.cpnv.what_the_dog.db.entities.Breed

@Dao
interface BreedDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addBreed(breed: Breed)

    @Query("SELECT * from breeds")
    fun getBreeds(): LiveData<List<Breed>>

    @Query("SELECT * FROM breeds WHERE id = :id")
    suspend fun getBreed(id: Int): Breed

    @Update
    suspend fun updateBreed(vararg dogs: Breed)

    @Delete
    suspend fun deleteBreed(vararg dogs: Breed)

}