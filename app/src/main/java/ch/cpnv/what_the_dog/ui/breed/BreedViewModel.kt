package ch.cpnv.what_the_dog.ui.breed

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import ch.cpnv.what_the_dog.db.CynoDatabase
import ch.cpnv.what_the_dog.db.entities.Breed
import ch.cpnv.what_the_dog.model.BreedRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class BreedViewModel(application: Application) :AndroidViewModel(application){
    private val getBreeds: LiveData<List<Breed>>
    private val repository: BreedRepository

    init {
        val breedDao = CynoDatabase.getDatabase(application, CoroutineScope(SupervisorJob())).breedDao()
        repository = BreedRepository(breedDao)
        getBreeds = repository.getBreeds
    }

    fun addBreed(breed: Breed){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addBreed(breed)
        }
    }

    fun getBreed(id: Int){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getBreed(id)
        }
    }

    fun updateBreed(breed: Breed){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateBreed(breed)
        }
    }

    fun deleteBreed(breed: Breed){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateBreed(breed)
        }
    }

}