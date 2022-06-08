package ch.cpnv.what_the_dog.db.dao

import androidx.room.*
import ch.cpnv.what_the_dog.db.entities.Dog

@Dao
interface DogDao {

    @Query("SELECT * FROM dogs")
    fun getDogs(): List<Dog>

    @Query("SELECT * FROM dogs WHERE id = :id")
    suspend fun getDog(id: Int): Dog

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(dog: Dog)

    @Update
    suspend fun updateDogs(vararg dogs: Dog)

    @Delete
    suspend fun deleteDogs(vararg dogs: Dog)
}