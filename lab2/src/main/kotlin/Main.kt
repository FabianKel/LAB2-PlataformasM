fun main(args: Array<String>) {
    println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //Lista de Usuarios
    var usuariosList = mutableListOf<PerfilUsuario>()

    //Muestra Nombre, apellido y Hobby
    fun MostrarDatos(){
        for (element in usuariosList) {
            println((element.Nombres+" ")+(" "+element.Hobbies[0].Título))
        }
    }



    fun CargarDatos(){
        //Crear Lista de datos para ingresar
        val ids = arrayOf(1,2,3,4,5)
        val names = arrayOf("Derek", "Monica", "Isabella","Giovanni","Gabriela")
        val lstnames = arrayOf("Arreaga","Salvatierra","Miralles","Santos","Mazariegos")
        val urls = arrayOf("url1","url2","url3","url4","url5")
        val edades = arrayOf(19,19,20,20,21)
        val correos = arrayOf("drk.fab@gmail.com","sal22249@uvg.edu.gt","mir22131@uvg.edu.gt","san22412@uvg.edu.gt","maz22416@uvg.edu.gt")
        val bios = arrayOf("Me gustan los patos", "Tambien me gustan los patos",null, "Hey There!", null)
        val estados = arrayOf("Tengo sueño", "Tambien tengo sueño", "Zzz", "Vibin", "Slayin")



        //HOBBIES
        val hobbiesDeIngreso = mutableListOf<Hobby>()
        //Atributos de Hobby
        val Titulos = arrayOf("Deportes", "Musica","Reposteria", "Viajar", "Películas")
        val Descripcion = arrayOf("Jugar y ver deportes", "Escuchar música 24/7", "Hacer cupcakes", "Conocer Guatemala", "Ver películas y series")
        val UrlPhoto  = arrayOf("url1","url2","url3","url4","url5")



        //Crear Usuarios y agregarlos a la lista
        for (i in names.indices){

            //Crear Hobbie en base a las listas
            val Newhobby = Hobby(Titulos[i],Descripcion[i],UrlPhoto[i])

            //Agregar Hobby a la lista para agregarla como parámetro
            var hobbies = mutableListOf<Hobby>(Newhobby)

            //Crear Hobby
            val NewUser = PerfilUsuario(ids[i],names[i],lstnames[i] ,urls[i],edades[i], correos[i],bios[i], estados[i], hobbies)
            usuariosList.add(NewUser)
        }

    }

    //MENU
    //Cargar datos Default:
    CargarDatos()
    MostrarDatos()
}