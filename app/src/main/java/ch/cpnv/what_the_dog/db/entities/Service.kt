package ch.cpnv.what_the_dog.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "services")
data class Service (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="id") val id:Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "duration") val duration: Float,
    @ColumnInfo(name = "Price") val Price: Int,
    @ColumnInfo(name = "description") val description: String?
)
{
}
