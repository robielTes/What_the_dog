package ch.cpnv.what_the_dog.db.dao

import androidx.room.*
import ch.cpnv.what_the_dog.db.entities.Dog

@Dao
interface DogDao {

    @Query("SELECT * FROM dogs")
    fun loadAllDogs(): Array<Dog>

    @Query("SELECT * FROM dogs WHERE id = :id")
    fun loadDog(id: Int): Dog

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDogs(vararg dogs: Dog)

    @Update
    fun updateDogs(vararg dogs: Dog)

    @Delete
    fun deleteDogs(vararg users: Dog)
}