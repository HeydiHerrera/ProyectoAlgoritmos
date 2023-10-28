package proyectoalgoritmos;

import java.security.SecureRandom;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import static proyectoalgoritmos.ProyectoAlgoritmos.GenerarContraseñaAleatoria.generarContraseña;

public class ProyectoAlgoritmos {
    
    private static final String ARCHIVOUsuarios= "usuarios.txt";
    private static final String ARCHIVOVotantes="votantes.txt";
    private static final String ARCHIVOCandidato="candidatos.txt";
    private static final String ARCHIVOElección="elección.txt";
    
    public static void main(String[] args){
        List<Usuarios> usuarios = obtenerUsuarios();
        Scanner scan = new Scanner(System.in);
        if (usuarios.size() > 0) {
            //System.out.println("Usuarios encontrados");
            solicitarDatosLogin();
             //menuRegistroUsuario();
            //Usuarios user1 = new Usuarios("Juan", "Perez", "juan@email.com", "1234", "admin","a");
           // usuarios.add(user1);
            //guardarUsuarios(usuarios);
        } else {

            System.out.println("Bienvenido al sistema de Votaciones");
            System.out.println("Ingrese una contraseña para el Sistema");
            String contra = scan.nextLine();
            Usuarios user1 = new Usuarios("Admin", "Admin", "juan@email.com", contra, "administrador","a");
            guardarUsuarios(List.of(user1));
        }
    }
public static Usuarios login(String email, String password) {

  List<Usuarios> usuarios = obtenerUsuarios();
  
  for(Usuarios u: usuarios) {
    if(u.getContraseña().equals(password)) {
      return u; 
    }
  }
return null;
}
    
public static void solicitarDatosLogin() {

  Scanner scanner = new Scanner(System.in); 
  
  System.out.print("Introduzca su email: ");
  String email = scanner.nextLine();

  System.out.print("Introduzca su contraseña: ");
  String password = scanner.nextLine();

  Usuarios user = login(email, password);

  if(user != null) {
      System.out.println("El usuario se encontro");
      menuRegistroUsuario();
      System.out.println(user.getRol());
      String[] arrayRol = user.getRol().split(",");
      for(int i = 0; i < arrayRol.length; i++) {
  System.out.println(arrayRol[i]); 
}
    // Login exitoso
  } else {  
      System.out.println("El usuario no se encuentra");
    // Mostrar error de credenciales inválidas
  }

}
    public static void menuRegistroUsuario(){
               
        Scanner scan = new Scanner(System.in);
            System.out.println("Registro de usuarios");
            System.out.println("1. Crear Usuario.");
            System.out.println("2. Modificar Usuario");
            System.out.println("3. Deshabilitar Usuario");
             
            int op=scan.nextInt();
            if(op==1){
                CrearUsuario();
            }
            if(op==2){
                ModificarUsuario();
            }
            if(op==3){
                DeshabilitarUsuario();
            }
    }
    
    public static void CrearUsuario(){
        boolean usuarioEncontrado=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellidos=scan.nextLine();
        System.out.println("Ingrese su correo");
        String correo=scan.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña=scan.nextLine();
        System.out.println("Ingrese su rol");
        String rol=scan.nextLine();
        System.out.println("Ingrese su estado (Activo o Inactivo)");
        String estado=scan.nextLine();
        List<Usuarios> usuarios = obtenerUsuarios();
        Usuarios user2 = new Usuarios(nombre,apellidos, correo, contraseña, rol,estado);
            guardarUsuarios(List.of(user2));
                  
            String[] arrayRol = user2.getRol().split(",");
String rol1 = "";
String rol2 = "";
String rol3 = "";
String rol4 = "";
String rol5 = "";

for (int i = 0; i < arrayRol.length; i++) {
    if (i == 0) {
        rol1 = arrayRol[i];
    } else if (i == 1) {
        rol2 = arrayRol[i];
    }else if (i == 2) {
        rol3 = arrayRol[i];
    }
    else if (i == 3) {
        rol4 = arrayRol[i];
    }
        else if (i == 4) {
        rol5 = arrayRol[i];
    }
    
}
        System.out.println("Ingrese el rol a elegir "+rol1);
        System.out.println(" "+rol2+" "+rol3+" "+rol4+" "+rol5);
        String Oprol = scan.nextLine();
            if(Oprol.equals("Administrador")){
                System.out.println("Ingrese la funcionalidad a la que desea acceder  1.Registro de votantes 2.Administración de elecciones 3.Conteo de votos");
                int Opad = scan.nextInt();
                if(Opad==1){
                    menuRegistrodeVotantes(); 
                }
                    if(Opad==2){
                       menuAdministraciónElecciones();
                }
                   if(Opad==3){
                       menuConteoDeVotos();
                   } 
            }
            if(Oprol.equals("Registradores de votantes")){
                    menuRegistrodeVotantes(); 
                }
    }
    
    public static void ModificarUsuario(){
            Scanner scan = new Scanner(System.in);
           System.out.println("Ingrese su correo");
           String correo=scan.nextLine();
           System.out.println("Ingrese su contraseña");
           String contraseña=scan.nextLine();
    
    }
    
    public static void DeshabilitarUsuario(){
        
    }
    
        public static void menuRegistrodeVotantes(){
               
        Scanner scan = new Scanner(System.in);
            System.out.println("Sistema de Votaciones");
            System.out.println("1. Agregar Votante");
            System.out.println("2. Modificar votante");
            System.out.println("3. Reiniciar contraseña de votante");
            System.out.println("4. Registrar fallecimiento de votante");
            System.out.println("5. Menu votaciones");
            int opReVo=scan.nextInt();
            if(opReVo==1){
                AgregarVotante();
            }
            if(opReVo==2){
                ModificarVotante();
            }
            if(opReVo==3){
                ReiniciarContraseña();
            }
            if(opReVo==4){
                RegistrarFallecimiento();  
            }
            
    }
        public static void AgregarVotante(){
int añon=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese nombres:");
    String nombres = scan.nextLine();
    System.out.println("Ingrese apellidos:");
    String apellidos = scan.nextLine();
    System.out.println("Ingrese CUI:");
    String Cui = scan.nextLine();
    System.out.println("Ingrese sexo:");
    String sexo = scan.nextLine();
    System.out.println("Ingrese fecha de nacimiento:");
    String fechadenacimiento = scan.nextLine();
            String[] partes = fechadenacimiento.split("/");
        
        if (partes.length == 3) {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int año = Integer.parseInt(partes[2]);

            System.out.println("Día: " + dia);
            System.out.println("Mes: " + mes);
            System.out.println("Año: " + año);
            añon=año;
        }

    System.out.println("Ingrese dirección de residencia:");
    String direcciónderesidencia = scan.nextLine();
    System.out.println("Ingrese departamento de residencia:");
    String departamentoderesidencia = scan.nextLine();
    System.out.println("Ingrese municipio de residencia:");
    String municipioderesidencia = scan.nextLine();
    System.out.println("Ingrese país de residencia:");
    String paisderesidencia = scan.nextLine();
    Votantes user3 = new Votantes(nombres,apellidos,Cui,sexo,fechadenacimiento,direcciónderesidencia, departamentoderesidencia,municipioderesidencia,paisderesidencia);
    guardarVotantes(List.of(user3));    
        int validarfecha = 2023-añon;    
        if(validarfecha>18){
       String contraseñaAleatoria = generarContraseña();
       System.out.println("¡Usuario registrado!");
            System.out.println("***Generando su contraseña aleatoria***");
        System.out.println("Contraseña aleatoria: " + contraseñaAleatoria);
        guardarVotantes(List.of(user3));
        }    }


public class GenerarContraseñaAleatoria {
    public static String generarContraseña() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);

        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String contraseñaAleatoria = generarContraseña();
        System.out.println("Contraseña aleatoria: " + contraseñaAleatoria);
    }
}
        
        public static void ModificarVotante(){
            Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese dirección de residencia:");
    String direcciónderesidencia = scan.nextLine();
    System.out.println("Ingrese departamento de residencia:");
    String departamentoderesidencia = scan.nextLine();
    System.out.println("Ingrese municipio de residencia:");
    String municipioderesidencia = scan.nextLine();
    System.out.println("Ingrese país de residencia:");
    String paisderesidencia = scan.nextLine();
    }    
            public static void ReiniciarContraseña(){
            Scanner scan = new Scanner(System.in);
           System.out.println("Ingrese su nueva contraseña");
           String conNueV=scan.nextLine();
           //conNueV=contrav;
    }
    
           public static void RegistrarFallecimiento(){
           
           System.out.println("Dar de baja a un votante por motivo de fallecimiento");
    
    }

    
                
     public static void menuAdministraciónElecciones(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Sistema de Votaciones - Menú Principal");
    System.out.println("1. Gestionar Elecciones");
    System.out.println("2. Gestionar Candidatos");
    System.out.println("3. Configurar opciones de elección");
    int op = scan.nextInt();
    if (op == 1) {
        gestionarElecciones();
    }
    if (op == 2) {
        gestionarCandidatos();
    } 
    if (op == 3) {
        configurarParaElección();
    } 
}
           public static void gestionarElecciones(){
           Scanner scan = new Scanner(System.in);
           System.out.println("1. Crear Elección");    
           System.out.println("2. Eliminar elección");
           int OpGesE=scan.nextInt();
           if(OpGesE==1){
               crearElección();
           }
           }
           
           public static void crearElección(){
               Scanner scan = new Scanner(System.in);
               System.out.println("Ingrese el titulo de la eleccion");
                    String TítulodelaElección =scan.nextLine();   
                    System.out.println("Ingrese el propósito de la eleccion");
                    String Propósito =scan.nextLine();
                    System.out.println("Ingrese la descripción de la eleccion");
                    String Descripción =scan.nextLine();  
                    System.out.println("Ingrese el Código unico de identificación");
                    String CódigoÚnicodeIdentificación =scan.nextLine();  
                    System.out.println("Establezca la fecha de y hora de inicio");
                    String FechayHoradeInicio =scan.nextLine();
                    System.out.println("Establezca la fecha de y hora de finalización");
                    String FechayHoradeFinalización=scan.nextLine();  
        List<Elección> Elección = obtenerElecciones();
        Elección user10 = new Elección(TítulodelaElección,Propósito,Descripción,CódigoÚnicodeIdentificación,FechayHoradeInicio,FechayHoradeFinalización);
            guardarElección(List.of(user10));  
               System.out.println("Desea regresar al menu de Administración de Elecciones 1.Sí 2.No");
               int opMe=scan.nextInt();
               if(opMe==1){
                   menuAdministraciónElecciones();
               }else{
                   
               }
           }
           public static void gestionarCandidatos(){
               System.out.println("1. Registrar candidato");
               System.out.println("2. Modificar la información de los candidatos");
               System.out.println("3. Eliminar candidatos");
                Scanner scan = new Scanner(System.in);
                         int OpGesC=scan.nextInt();
           if(OpGesC==1){
               RegistrarCandidato();
           } 
           }
           public static void RegistrarCandidato(){
               Scanner scan = new Scanner(System.in);
               System.out.println("Ingrese su nombre completo");
               String NombreCompleto=scan.nextLine();
               System.out.println("Ingrese su formación");
               String Formación=scan.nextLine();    
               System.out.println("Ingrese su nombre experiencia profesional");
               String ExperienciaProfesional=scan.nextLine();
               System.out.println("Ingrese su Codigo Unico de identificación");
               String CódigoÚnicodeIdentificación=scan.nextLine();
               Candidato user9=new Candidato(NombreCompleto, Formación, ExperienciaProfesional,CódigoÚnicodeIdentificación);
               guardarCandidatos(List.of(user9)); 
           }

           public static void configurarParaElección() {
    Scanner scan = new Scanner(System.in);

    // Mostrar una lista de elecciones disponibles con sus códigos únicos de identificación
    List<Elección> elecciones = obtenerElecciones();
    System.out.println("Lista de Elecciones Disponibles:");
    for (Elección elección : elecciones) {
        System.out.println("Código de Identificación: " + elección.getCódigoÚnicodeIdentificación());
        System.out.println("Título de la Elección: " + elección.getTítulodelaElección());
        System.out.println();
    }

    // Solicitar al usuario que ingrese el código único de identificación de la elección
    System.out.print("Ingrese el código único de identificación de la elección que desea configurar: ");
    String códigoElección = scan.nextLine();

    // Buscar la elección correspondiente en base al código único de identificación
    Elección elecciónSeleccionada = null;
    for (Elección elección : elecciones) {
        if (elección.getCódigoÚnicodeIdentificación().equals(códigoElección)) {
            elecciónSeleccionada = elección;
            break;
        }
    }

    if (elecciónSeleccionada == null) {
        System.out.println("No se encontró una elección con el código único de identificación proporcionado.");
        return;
    }

    // Mostrar la lista de candidatos registrados en el sistema
    List<Candidato> candidatos = obtenerCandidatos();
    System.out.println("Lista de Candidatos Registrados:");
    for (Candidato candidato : candidatos) {
        System.out.println("Nombre del Candidato: " + candidato.getNombreCompleto());
        System.out.println("Código Único de Identificación del Candidato: " + candidato.getCódigoÚnicodeIdentificación());
    }

    // Permitir al administrador seleccionar los candidatos que formarán parte de la elección
    List<Candidato> candidatosSelecionados = new ArrayList<>();
    System.out.println("Seleccione los candidatos que formarán parte de la elección (ingrese el código único de identificación del candidato):");
    while (true) {
        System.out.print("Código Único de Identificación del Candidato (o 'fin' para finalizar): ");
        String códigoCandidato = scan.nextLine();
        if (códigoCandidato.equalsIgnoreCase("fin")) {
            break;
        }

        // Buscar y agregar el candidato a la lista de candidatos seleccionados
        for (Candidato candidato : candidatos) {
            if (candidato.getCódigoÚnicodeIdentificación().equals(códigoCandidato)) {
                candidatosSelecionados.add(candidato);
                break;
            }
        }
    }

    // Asignar los candidatos seleccionados a la elección
    elecciónSeleccionada.setCandidatos(candidatosSelecionados);
    System.out.println("Los candidatos han sido configurados exitosamente para la elección.");
           
             
    
    }


           public static void menuConteoDeVotos(){
               
           }
    public static void guardarUsuarios(List<Usuarios> usuarios) {
        try {
            PrintWriter writer = new PrintWriter(ARCHIVOUsuarios);
            for (Usuarios u : usuarios) {
                writer.println(u.getNombre());
                writer.println(u.getApellidos());
                writer.println(u.getCorreo());
                writer.println(u.getContraseña());
                writer.println(u.getRol());
                writer.println(u.getEstado());
                writer.println(); // línea en blanco entre usuarios
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al guardar usuarios: " + e);
        }
    }
public static List<Usuarios> obtenerUsuarios() {
        List<Usuarios> usuarios = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File(ARCHIVOUsuarios));
            while (reader.hasNextLine()) {
               
                String nombre = reader.nextLine();
                String apellidos = reader.nextLine();
                String correo = reader.nextLine();
                String contraseña = reader.nextLine();
                String rol = reader.nextLine();
                String estado = reader.nextLine();
                reader.nextLine(); // saltar línea en blanco
                
                Usuarios u = new Usuarios(nombre,apellidos,correo,contraseña,rol,estado);
                usuarios.add(u);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al obtener usuarios " + e);
        }
        return usuarios;
}

      public static void guardarVotantes(List<Votantes>votantes){
        try {
            
            PrintWriter writer = new PrintWriter(ARCHIVOVotantes);
            for (Votantes v : votantes) {
                writer.println(v.getNombres());
                writer.println(v.getApellidos());
                writer.println(v.getCui());
                writer.println(v.getSexo());
                writer.println(v.getFechadenacimiento());
                writer.println(v.getDirecciónderesidencia());
                writer.println(v.getDepartamentoderesidencia());
                writer.println(v.getMunicipioderesidencia());
                writer.println(v.getPaisderesidencia());
                writer.println(); // línea en blanco entre usuarios
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al guardar votantes: " + e);
        }
      }
        
            public static List<Votantes> obtenerVotantes(){
        List<Votantes> votantes = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File(ARCHIVOVotantes));
            while (reader.hasNextLine()) {
                
                String nombres = reader.nextLine();
                String apellidos = reader.nextLine();
                String Cui = reader.nextLine();
                String sexo = reader.nextLine();
                String fechadenacimiento = reader.nextLine();
                String direcciónderesidencia=reader.nextLine();
                String departamentoderesidencia=reader.nextLine();
                String municipioderesidencia=reader.nextLine();
                String paisderesidencia=reader.nextLine();
                reader.nextLine(); // saltar línea en blanco

                Votantes v = new Votantes(nombres,apellidos,Cui,sexo,fechadenacimiento,direcciónderesidencia,departamentoderesidencia,municipioderesidencia,paisderesidencia);
                votantes.add(v);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al obtener votantes " + e);
        }
        return votantes;   
    }

            public static List<Candidato> obtenerCandidatos(){
    List<Candidato> Candidato= new ArrayList<>();
    try {
        Scanner reader = new Scanner(new File(ARCHIVOCandidato));
        while (reader.hasNextLine()) {
            String NombreCompleto = reader.nextLine();
            String Formación = reader.nextLine();
            String ExperienciaProfesional = reader.nextLine();
            String CódigoÚnicodeIdentificación = reader.nextLine();
            reader.nextLine(); // saltar línea en blanco
                
                Candidato c = new Candidato(NombreCompleto,Formación,ExperienciaProfesional,CódigoÚnicodeIdentificación);
                Candidato.add(c);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al obtener usuarios " + e);
        }
        return Candidato;
            }
            public static void guardarCandidatos(List<Candidato> candidato) {
    try {
        PrintWriter writer = new PrintWriter(ARCHIVOCandidato);
        for (Candidato c : candidato) {
            writer.println(c.getNombreCompleto());
            writer.println(c.getFormación());
            writer.println(c.getExperienciaProfesional());
            writer.println(c.getCódigoÚnicodeIdentificación());
            writer.println(); // línea en blanco entre candidatos
        }
        writer.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error al guardar candidatos: " + e);
    
    }
    }

public static List<Elección> obtenerElecciones() {
    List<Elección> Elección = new ArrayList<>();
    try {
        Scanner reader = new Scanner(new File(ARCHIVOElección));
        while (reader.hasNextLine()) {
            String TítulodelaElección = reader.nextLine();
            String Propósito = reader.nextLine();
            String Descripción = reader.nextLine();
            String CódigoÚnicodeIdentificación = reader.nextLine();
            String FechayHoradeInicio = reader.nextLine();
            String FechayHoradeFinalización = reader.nextLine();
            reader.nextLine(); // saltar línea en blanco
            
            Elección e = new Elección(TítulodelaElección,Propósito,Descripción,CódigoÚnicodeIdentificación,FechayHoradeInicio,FechayHoradeFinalización);
            Elección.add(e);
        }
        reader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error al obtener elecciones: " + e);
    }
    return Elección;
}
public static void guardarElección(List<Elección> elecciones) {
    try {
        PrintWriter writer = new PrintWriter(ARCHIVOElección);
        for (Elección e : elecciones) {
            writer.println(e.getTítulodelaElección());
            writer.println(e.getPropósito());
            writer.println(e.getDescripción());
            writer.println(e.getCódigoÚnicodeIdentificación());
            writer.println(e.getFechayHoradeInicio());
            writer.println(e.getFechayHoradeFinalización());
            writer.println(); // Línea en blanco entre elecciones
        }
        writer.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error al guardar elección: " + e);
    }
}
}