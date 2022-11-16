package ni.edu.uca.basededatosconrrom

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name: String,
    val lastName: String,
    val age: Int,
    val address: String
)