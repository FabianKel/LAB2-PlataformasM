
class PerfilUsuario(
    val ID          : Int,
    val Nombres     : String,
    val Apellidos   : String,
    val UrlPhoto    : String,
    val Edad        : Int,
    val Correo      : String,
    val Biografia   : String?,
    val Estado      : String,
    val Hobbies: MutableList<Hobby>
)
{
    //Función para agregar un Hobby
    fun AgregarHobbies(NewHobby: Hobby) {
        Hobbies.add(NewHobby)
    }
}
