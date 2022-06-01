package ch.cpnv.what_the_dog.db
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ch.cpnv.what_the_dog.db.entities.*
import kotlinx.coroutines.CoroutineScope
import ch.cpnv.what_the_dog.db.dao.ClientDao

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(Client::class), version = 1, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class CynoDatabase : RoomDatabase() {

    // DAOs
    
    abstract fun clientDao(): ClientDao


    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: CynoDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): CynoDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CynoDatabase::class.java,
                    "CynoClient.db"
                )
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}