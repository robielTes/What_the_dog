package ch.cpnv.what_the_dog.db.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import ch.cpnv.what_the_dog.db.entities.Dog

data class DogWithBreed(
    @Embedded val dog: Dog,
    @Relation(parentColumn = "breed_id", entityColumn = "id")

    ){}
