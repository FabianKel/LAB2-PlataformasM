fun main(args: Array<String>) {
    println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //Lista de Usuarios
    val usuariosList = mutableListOf<PerfilUsuario>()


    //Muestra Nombre, apellido y Hobby
    fun MostrarDatos(){
        println("ID    Nombre     Apellido      Hobbies:")
        for (element in usuariosList) {
            var listaHobbies : String = " "
                for (hob in element.Hobbies){
                    listaHobbies += ", ${hob.Título}"
                }
            println("${element.ID}   ${element.Nombres}     ${element.Apellidos}     $listaHobbies")
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



        //Atributos de Hobby
        val Titulos = arrayOf("Deportes", "Musica","Reposteria", "Viajar", "Películas")
        val Descripcion = arrayOf("Jugar y ver deportes", "Escuchar música 24/7", "Hacer cupcakes", "Conocer Guatemala", "Ver películas y series")
        val UrlPhoto  = arrayOf("url1","url2","url3","url4","url5")



        //Crear Usuarios y agregarlos a la lista
        for (i in names.indices){

            //Crear Hobbie en base a las listas
            val Newhobby = Hobby(Titulos[i],Descripcion[i],UrlPhoto[i])

            //Agregar Hobby a la lista para agregarla como parámetro
            val hobbies = mutableListOf<Hobby>(Newhobby)

            //Crear Hobby
            val NewUser = PerfilUsuario(ids[i],names[i],lstnames[i] ,urls[i],edades[i], correos[i],bios[i], estados[i], hobbies)
            usuariosList.add(NewUser)
        }

    }

    fun AgregarUser(){
        //user
        val ID          : Int
        val Nombres     : String
        val Apellidos   : String
        val UrlPhoto    : String
        val Edad        : Int
        val Correo      : String
        val Biografia   : String?
        val Estado      : String
        val Hobbies: MutableList<Hobby>  = mutableListOf()

        println("Ingrese el ID:")
        val idInput = readLine()
        ID = idInput?.toIntOrNull() ?: 0
        println("Ingrese el nombre del Usuario:")
        Nombres = readLine() ?: ""
        println("Ingrese el Apellido del Usuario:")
        Apellidos = readLine() ?: ""
        println("Ingrese la dirección URL de su foto de perfil:")
        UrlPhoto = readLine() ?: ""
        println("Ingrese su edad:")
        val edadInput = readLine()
        Edad = edadInput?.toIntOrNull() ?: 0
        println("Ingrese su correo electrónico:")
        Correo = readLine() ?: ""
        println("Ingrese su biografía:")
        Biografia = readlnOrNull()
        println("Cómo se siente ahora? Ingrese su estado:")
        Estado = readLine() ?: " "

        println("Ahora cuentanos sobre uno de tus Hobbies")
        //Hobby
        println("¿Cómo se llama tu hobby?:")
        val Titulo      : String = readLine() ?: ""
        println("Ingresa una breve descripción de tu Hobby $Titulo")
        val Descripcion : String = readLine() ?: ""
        println("Ingrese la dirección URL de una foto de su Hobby:")
        val UrlPhotoHby    : String? = readlnOrNull()

        //Agregar Hobby al parámetro de la lista de Hobbies
        val NewHobby = Hobby(Titulo,Descripcion,UrlPhotoHby)
        Hobbies.add(NewHobby)
        //Crear PerfilUsuario
        val NewPerfilUsuario = PerfilUsuario(ID,Nombres,Apellidos ,UrlPhoto,Edad, Correo, Biografia, Estado, Hobbies)
        usuariosList.add(NewPerfilUsuario)
        println("Usuario: ${NewPerfilUsuario.Nombres} ${NewPerfilUsuario.Apellidos} Creado correctamente")

    }

    fun AgregarHobby(){
        MostrarDatos()
        println("Ingrese el ID del Usuario al que le quiere agregar un Hobby")
        val idUsuario = readlnOrNull()?.toIntOrNull()

        // Buscar el usuario en la lista por su ID
        val usuario = usuariosList.find { it.ID == idUsuario }

        if (usuario != null) {
            println("¿Cómo se llama tu nuevo hobby?:")
            val Titulo      : String = readLine() ?: ""
            println("Ingresa una breve descripción de tu Hobby $Titulo")
            val Descripcion : String = readLine() ?: ""
            println("Ingrese la dirección URL de una foto de su Hobby:")
            val UrlPhotoHby    : String? = readlnOrNull()

            val NewHobby = Hobby(Titulo,Descripcion,UrlPhotoHby)
            usuario.Hobbies.add(NewHobby)

            println("Se ha agregado el hobby ${usuario.Hobbies[(usuario.Hobbies.size)-1].Título} al usuario ${usuario.Nombres}")
        } else {
            println("ID de usuario inválido. No se encontró ningún usuario con ese ID.")
        }
    }

    //MENU
    fun menu(){
        var opcion: Int
        do {
            println("Menú:\n1. Ver Usuarios\n2. Agregar Usuario \n3. Agregar Hobby a Usuario\n0. Salir")
            print("Ingrese el número de la opción deseada: ")

            // Leer la opción ingresada por el usuario
            val input = readLine()
            opcion = input?.toIntOrNull() ?: -1

            // Evaluar la opción seleccionada
            when (opcion) {
                1 -> MostrarDatos()
                2 -> AgregarUser()
                3 -> AgregarHobby()
                0 -> println("Saliendo del programa...")
                else -> println("Opción inválida. Por favor, ingrese una opción válida.")
            }
        } while (opcion != 0)
    }
    //Cargar datos Default:
    CargarDatos()
    //Ejecutar Menu
    menu()
}