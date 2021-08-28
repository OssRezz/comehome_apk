package comehome_apk;

import dao.ClaseDao;
import dto.ClaseDto;
import dto.ProgramaDto;

public class Comehome_apk {

    public static void main(String[] args) {
 
        
    }

    /* PERFIL
        PerfilDto perfilDto = new PerfilDto();
        PerfilDao perfilDao = new PerfilDao();
    
        //ingresar perfil
        String mensaje = perfilDao.inserPerfil("Usuario") ? "Se insertó" : "No se insertó";  
        System.out.println(mensaje);
    
        //Listar perfil
        perfilDao.ListarPerfiles().forEach((perfil) -> {
        System.out.print(perfil.getId_perfil() + " - ");
        System.out.println(perfil.getPerfil());
        });
     */
 /* USUARIOS
        UsuarioDto usuarioDto = new UsuarioDto();
        UsuarioDao usuarioDao = new UsuarioDao();
        PerfilDto perfilDto = new PerfilDto();
    
        //Ingresar usuarios

        usuarioDto.setCedula("65423412");
        usuarioDto.setNombre("Andres Osorio Florez");
        usuarioDto.setPassword("1234");
        perfilDto.setId_perfil(4);
        usuarioDto.setPerfilDto(perfilDto);

        if (usuarioDao.insertUsuario(usuarioDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    
    
         //Listar usuarios
        usuarioDao.listarUsuarios().forEach((usuario) -> {
            System.out.print(usuario.getCedula() + " - ");
            System.out.print(usuario.getNombre() + " - ");
            System.out.print(usuario.getPassword() + " - ");
            System.out.print(usuario.getPerfilDto().getId_perfil()+ " - ");
            System.out.println(usuario.getPerfilDto().getPerfil());
        });
     */
 /* EVENTOS
        EventoDto eventoDto = new EventoDto();
        EventoDao eventoDao = new EventoDao();
    
        //Ingresar eventos
        String nombre = "Comer empanadas";
        String descripcion = "1036957215";
        String fecha = "2020-05-09";
        String fechaInicio = "10:00 am";
        String fechaFfin = "2:00 pm";

        eventoDto.setNombre(nombre);
        eventoDto.setDescripcion(descripcion);
        eventoDto.setFecha(fecha);
        eventoDto.setHoraInicio(fechaInicio);
        eventoDto.setHoraFin(fechaFfin);

        if (eventoDao.insertEvento(eventoDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    
    
        //Listar eventos
        eventoDao.listarEventos().forEach((evento) -> {
            System.out.print(evento.getId_evento() + " - ");
            System.out.print(evento.getNombre() + " - ");
            System.out.print(evento.getDescripcion() + " - ");
            System.out.print(evento.getFecha() + " - ");
            System.out.print(evento.getHoraInicio() + " - ");
            System.out.println(evento.getHoraFin());

        });
     */
 /* ESCUELAS
        EscuelaDto escuelaDto = new EscuelaDto();
        EscuelaDao escuelaDao = new EscuelaDao();
        
        //Ingresar una escuela
        String mensaje = escuelaDao.insertEscuela("Josefina Munoz") ? "Se insertó" : "No se insertó";  
        System.out.println(mensaje);
    
    
        //Listar escuelas
        escuelaDao.listarEscuelas().forEach((escuela) -> {
            System.out.print(escuela.getId_escuela() + " - ");
            System.out.print(escuela.getEscuela());
        });
     */
 /* SEDES
        SedeDto sedeDto = new SedeDto();
        SedeDao sedeDao = new SedeDao();
        
        //Ingresar sedes
        String nombre = "JoseFina Munoz";
        String direccion = "Carca al parque";
        String telefono = "12344567";
        String aula = "2B-46";

        sedeDto.setNombre(nombre);
        sedeDto.setDireccion(direccion);
        sedeDto.setTelefono(telefono);
        sedeDto.setAula(aula);
        if (sedeDao.insertSede(sedeDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }

        //Listar sedes
        sedeDao.listarSedes().forEach((sede) -> {
            System.out.print(sede.getId_sede()+ " - ");
            System.out.print(sede.getNombre()+ " - ");
            System.out.print(sede.getDireccion()+ " - ");
            System.out.print(sede.getTelefono()+ " - ");
            System.out.println(sede.getAula());
        });
     */
 /* PROFESORES
        ProfesorDto profesorDto = new ProfesorDto();
        ProfesorDao profesorDao = new ProfesorDao();

        //Ingresar profefsores
        String cedula = "1036957215";
        String nombre = "James Osorio Florez";
        String telefono = "123445123";
        String email = "OssRezz.13@gmail.com";
        String titulo = "El que juega con las bolas";
        profesorDto.setCedula(cedula);
        profesorDto.setNombre(nombre);
        profesorDto.setTelefono(telefono);
        profesorDto.setEmail(email);
        profesorDto.setTitulo(titulo);

        if (profesorDao.insertProfesor(profesorDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
  
        //Listar profesores
        profesorDao.listarProfesores().forEach((profesor) -> {
            System.out.print(profesor.getCedula()+ " - ");
            System.out.print(profesor.getNombre()+ " - ");
            System.out.print(profesor.getTelefono()+ " - ");
            System.out.print(profesor.getEmail()+ " - ");
            System.out.println(profesor.getTitulo());
        });
     */
 /* GENEROS
        GeneroDto generoDto = new GeneroDto();
        GeneroDao generoDao = new GeneroDao();
        //Ingresar generos
        String genero = "Desconocido";
        generoDto.setGenero(genero);
        
        if(generoDao.insertGenero(generoDto)){
            System.out.println("Inserto");
        } else{
            System.out.println("Fuck");
        }
        //Listar generos
        generoDao.listarGeneros().forEach((genero) -> {
        System.out.print(genero.getId_genero()+ " - ");
        System.out.println(genero.getGenero());
        });
     */
 /* POBLACIONES
        PoblacionDto poblacionDto = new PoblacionDto();
        PoblacionDao poblacionDao = new PoblacionDao();
        //Ingresar poblaciones
        String genero = "alienígeno";
        poblacionDto.setPoblacion(genero);
        
        if(poblacionDao.insertPoblacion(poblacionDto)){
            System.out.println("Inserto");
        } else{
            System.out.println("Fuck");
        }
        //Listar poblaciones
        poblacionDao.listarPoblaciones().forEach((poblaciones) -> {
        System.out.print(poblaciones.getId_problacion()+ " - ");
        System.out.println(poblaciones.getPoblacion());
        });
     */
 /* PROGRAMAS
        ProgramaDto programaDto = new ProgramaDto();
        ProgramaDao programaDao = new ProgramaDao();
        EscuelaDto escuelaDto = new EscuelaDto();
        SedeDto sedeDto = new SedeDto();

        //ingresar programa
        escuelaDto.setId_escuela(1);
        programaDto.setEscuelaDto(escuelaDto);

        programaDto.setNombre("Musica con el pelo");
        programaDto.setEdad("18");

        sedeDto.setId_sede(1);
        programaDto.setSedeDto(sedeDto);

        programaDto.setCupos(10);
        programaDto.setCosto(10000);
        programaDto.setFechainicio("2019-10-10");
        programaDto.setFechafin("2019-02-10");
        programaDto.setHorario("En la noche");
        programaDto.setEstado(1);

        if (programaDao.insertPrograma(programaDto)) {
            System.out.println("Nice");
        } else {
            System.out.println("Fuck");
        }

        //Listar programas
        programaDao.listarProgramas().forEach((programa) -> {
            System.out.print(programa.getId_programa() + " - ");
            System.out.print(programa.getEscuelaDto().getEscuela() + " - ");
            System.out.print(programa.getNombre() + " - ");
            System.out.print(programa.getEdad() + " - ");
            System.out.print(programa.getSedeDto().getNombre() + " - ");
            System.out.print(programa.getCupos() + " - ");
            System.out.print(programa.getCosto() + " - ");
            System.out.print(programa.getFechainicio() + " - ");
            System.out.print(programa.getFechafin() + " - ");
            System.out.print(programa.getHorario() + " - ");
            System.out.println(programa.getEstado());
        });
     */
 /* CLASES
        ClaseDto claseDto = new ClaseDto();
        ClaseDao claseDao = new ClaseDao();
        ProgramaDto programaDto = new ProgramaDto();
        //ingresar clase
        programaDto.setId_programa(1);
        claseDto.setProgramaDto(programaDto);
        
        claseDto.setGrupo("Ahjab al kabeh");
        claseDto.setNumeroclases(10);
        claseDto.setFechainicio("2015-05-04");
        claseDto.setFechafin("2019-07-20");
        claseDto.setEstado(1);

        if (claseDao.insertClase(claseDto)) {
            System.out.println("Nice");
        } else {
            System.out.println("Fuck");
        }
        //Listar clase
        claseDao.listarClases().forEach((clase) -> {
            System.out.print(clase.getId_clase() + " - ");
            System.out.print(clase.getProgramaDto().getNombre() + " - ");
            System.out.print(clase.getGrupo() + " - ");
            System.out.print(clase.getNumeroclases() + " - ");
            System.out.print(clase.getFechainicio() + " - ");
            System.out.print(clase.getFechafin() + " - ");
            System.out.println(clase.getEstado());

        });
     */
}
