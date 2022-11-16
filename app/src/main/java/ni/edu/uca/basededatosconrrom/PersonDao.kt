package ni.edu.uca.basededatosconrrom

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonDao {
   @Query("SELECT * FROM Person")
suspend fun getAll(): List<Person>
    @Insert
    suspend  fun insertAll(vararg person: Person)

    @Delete
    suspend fun delete(person: Person)

    @Query("SELECT * FROM Person WHERE id =:id")
    suspend fun getById(id: Int): Person

    @Update
        suspend fun update(person: Person)
}