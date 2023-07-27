fun main(args: Array<String>) {
    println("Hello World!")
    var Usuarios = ArrayList<PerfilUsuario>()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    fun CargarDatos(){

        //Crear Lista de datos para ingresar
        val names = arrayOf("Derek", "Monica", "Isabella","Giovanni","Gabriela")
        val lstnames = arrayOf("Arreaga","Salvatierra","Miralles","Santos","Mazariegos")
        val urls = arrayOf("url1","url2","url3","url4","url5")
        val edades = arrayOf(19,19,20,20,21)
        val correos = arrayOf("drk.fab@gmail.com","sal22249@uvg.edu.gt","mir22131@uvg.edu.gt","san22412@uvg.edu.gt","maz22416@uvg.edu.gt")
        val bios = arrayOf("Me gustan los patos", "Tambien me gustan los patos",null, "Hey There!", null)
        val estados = arrayOf("Tengo sueño", "Tambien tengo sueño", "Zzz", "Vibin", "Slayin")


        //HOBBIES
        val hobbiesDeIngreso = listOf<Hobby>()
        //Atributos de Hobby
        val Titulos = arrayOf("Deportes", "Musica","Reposteria", "Viajar", "Películas")
        val Descripcion = arrayOf("Jugar y ver deportes", "Escuchar música 24/7", "Hacer cupcakes", "Conocer Guatemala", "Ver películas y series")
        val UrlPhoto  = arrayOf("url1","url2","url3","url4","url5")


        //Crear Hobbies en base a las listas
        for (i in Titulos.indices){
        //Crear Hobby
            val Newhob = Hobby(Titulos[i],Descripcion[i],UrlPhoto[i])
            //Agregar Hobby a la lista 

        }




    }
    CargarDatos()
    for (element in Usuarios) {
        println(element.Apellidos)
    }
}