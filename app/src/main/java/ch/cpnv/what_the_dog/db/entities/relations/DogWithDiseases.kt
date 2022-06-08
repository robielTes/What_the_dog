package ch.cpnv.what_the_dog.db.entities.relations
import CPNV.what_the_dog.db.entities.Disease
import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import ch.cpnv.what_the_dog.db.entities.*
data class DogWithDiseases(
    @Embedded val dog: Dog,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(DogHaveDisease::class)
    )
    val diseases: List<Disease>
) {
}
