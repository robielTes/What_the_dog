package ch.cpnv.what_the_dog.db.entities.relations

data class DogWithBreed(
    @Embedded val dog: Dog,
    @Relation(parentColumn = "breed_id", entityColumn = "id")
    ){}
