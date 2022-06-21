package ch.cpnv.what_the_dog.model

import androidx.lifecycle.LiveData
import ch.cpnv.what_the_dog.db.dao.BreedDao
import ch.cpnv.what_the_dog.db.entities.Breed

class BreedRepository (private val breedDao: BreedDao) {

    val getBreeds: LiveData<List<Breed>> = breedDao.getBreeds()

    suspend fun addBreed (breed: Breed){
        breedDao.addBreed(breed)
    }

    suspend fun getBreed (id: Int){
        breedDao.getBreed(id)
    }

    suspend fun updateBreed (breed: Breed){
        breedDao.updateBreed(breed)
    }

    suspend fun deleteBreed (breed: Breed){
        breedDao.updateBreed(breed)
    }

}