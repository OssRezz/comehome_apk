package comehome_apk;

import dao.AsisestudianteDao;
import dao.AsisprofeDao;
import dao.ClaseDao;
import dao.EstudianteDao;
import dao.GeneroDao;
import dao.InscripcionDao;
import dao.MatriculaDao;
import dao.PerfilDao;
import dao.PoblacionDao;
import dao.ProfesorDao;
import dao.ProgramaDao;
import dao.UsuarioDao;
import dto.AsisestudianteDto;
import dto.AsisprofeDto;
import dto.ClaseDto;
import dto.EscuelaDto;
import dto.EstudianteDto;
import dto.GeneroDto;
import dto.InscripcionDto;
import dto.MatriculaDto;
import dto.PerfilDto;
import dto.PoblacionDto;
import dto.ProfesorDto;
import dto.ProgramaDto;
import dto.SedeDto;
import dto.UsuarioDto;

public class Comehome_apk {

    private static ProgramaDto programaDto = new ProgramaDto();
    private static ProgramaDao programaDao = new ProgramaDao();
    private static EscuelaDto escuelaDto = new EscuelaDto();
    private static SedeDto sedeDto = new SedeDto();
    private static ClaseDto claseDto = new ClaseDto();
    private static ClaseDao claseDao = new ClaseDao();
    private static UsuarioDto usuarioDto = new UsuarioDto();
    private static UsuarioDao usuarioDao = new UsuarioDao();
    private static PerfilDto perfilDto = new PerfilDto();
    private static PerfilDao perfilDao = new PerfilDao();
    private static AsisprofeDto asisprofeDto = new AsisprofeDto();
    private static AsisprofeDao asisprofeDao = new AsisprofeDao();
    private static ProfesorDto profesorDto = new ProfesorDto();
    private static ProfesorDao profesorDao = new ProfesorDao();
    private static GeneroDto generoDto = new GeneroDto();
    private static GeneroDao generoDao = new GeneroDao();
    private static PoblacionDto poblacionDto = new PoblacionDto();
    private static PoblacionDao poblacionDao = new PoblacionDao();
    private static EstudianteDto estudianteDto = new EstudianteDto();
    private static EstudianteDao estudianteDao = new EstudianteDao();
    private static AsisestudianteDto asisestudianteDto = new AsisestudianteDto();
    private static AsisestudianteDao asisestudianteDao = new AsisestudianteDao();
    private static InscripcionDto inscripcionDto = new InscripcionDto();
    private static InscripcionDao inscripcionDao = new InscripcionDao();
    private static MatriculaDto matriculaDto = new MatriculaDto();
    private static MatriculaDao matriculaDao = new MatriculaDao();

    public static void main(String[] args) {

        //ingresarPerfil();
        //listarPerfiles();
        //listarUsuario();
        //ingresarUsuario("1036545234",2); 
        //ingresarProfesor("1036754213","Andres cubijo rodriguez");
        //listarProfesores();
        //listarPrograma();
        //insertPrograma("nombre");
        //listarClase();
        //insertAsistenciaProfesor("1036754213", 2);
        //listarAsistenciaProfesor();
        //insertGenero("Ku Klux Klan");
        //listarGeneros();
        //insertPoblacion("Poblaciones coloniales");
        //listarPoblaciones();
        //insertEstudiante("1036543654", "Valentina valencia");
        //listarEstudiantes();
        //insertAsistenciaEstudiante("1036543654", 4);
        //listarAsistenciaEstudiantes();
        //insertInscripcion(3, "1036543654");
        //listarInscripciones();
        //insertMatricula(1);
    }

    public static void ingresarPerfil() {
        String mensaje = perfilDao.insertPerfil("Párvulo") ? "Se insertó" : "No se insertó";
        System.out.println(mensaje);
    }

    public static void listarPerfiles() {
        perfilDao.ListarPerfiles().forEach((perfil) -> {
            System.out.print(perfil.getId_perfil() + " - ");
            System.out.println(perfil.getPerfil());
        });
    }

    public static void ingresarUsuario(String cedula, int perfil) {

        //Ingresar usuarios
        usuarioDto.setCedula(cedula);
        usuarioDto.setNombre("James Osorio Florez");
        usuarioDto.setEmail("OssRezz.13@gmail.com");
        usuarioDto.setPassword("1234");
        perfilDto.setId_perfil(perfil);
        usuarioDto.setPerfilDto(perfilDto);

        if (usuarioDao.insertUsuario(usuarioDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarUsuario() {
        usuarioDao.listarUsuarios().forEach((usuario) -> {
            System.out.print(usuario.getCedula() + " - ");
            System.out.print(usuario.getNombre() + " - ");
            System.out.print(usuario.getEmail() + " - ");
            System.out.print(usuario.getPassword() + " - ");
            System.out.print(usuario.getPerfilDto().getId_perfil() + " - ");
            System.out.println(usuario.getPerfilDto().getPerfil());
        });
    }

    public static void ingresarProfesor(String cedula, String nombre) {
        profesorDto.setCedula(cedula);
        profesorDto.setNombre(nombre);
        profesorDto.setTelefono("123445123");
        profesorDto.setEmail("Jose.16@gmail.com");
        profesorDto.setTitulo("El que juega con las bolas");

        if (profesorDao.insertProfesor(profesorDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarProfesores() {
        //Listar profesores
        profesorDao.listarProfesores().forEach((profesor) -> {
            System.out.print(profesor.getCedula() + " - ");
            System.out.print(profesor.getNombre() + " - ");
            System.out.print(profesor.getTelefono() + " - ");
            System.out.print(profesor.getEmail() + " - ");
            System.out.println(profesor.getTitulo());
        });
    }

    public static void listarClase() {
        claseDao.listarClases().forEach((clase) -> {
            System.out.print(clase.getId_clase() + " - ");
            System.out.print(clase.getGrupo() + " - ");
            System.out.print(clase.getNumeroclases() + " - ");
            System.out.print(clase.getFechainicio() + " - ");
            System.out.print(clase.getFechafin() + " - ");
            System.out.print(clase.getEstado() + " - ");
            System.out.print(clase.getProgramaDto().getId_programa() + " - ");
            System.out.println(clase.getProgramaDto().getNombre());

        });
    }

    public static void insertPrograma(String nombre) {

        //ingresar programa
        escuelaDto.setId_escuela(1);
        programaDto.setEscuelaDto(escuelaDto);

        programaDto.setNombre(nombre);
        programaDto.setEdad("14 a 15");

        sedeDto.setId_sede(1);
        programaDto.setSedeDto(sedeDto);

        programaDto.setCupos(10);
        programaDto.setCosto(10000);
        programaDto.setFechainicio("2014-10-10");
        programaDto.setFechafin("2015-02-10");
        programaDto.setHorario("En el dia");
        programaDto.setEstado(1);

        if (programaDao.insertPrograma(programaDto)) {
            System.out.println("Nice");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarPrograma() {
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
    }

    public static void insertAsistenciaProfesor(String cedula, int clase) {

        profesorDto.setCedula(cedula);
        asisprofeDto.setProfesorDto(profesorDto);

        claseDto.setId_clase(clase);
        asisprofeDto.setClaseDto(claseDto);

        asisprofeDto.setFecha("2020-11-09");
        asisprofeDto.setAsistencia(1);

        if (asisprofeDao.insertAsistenciaProfesor(asisprofeDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarAsistenciaProfesor() {

        asisprofeDao.listaAsistenciaProfesores().forEach((asisProfe) -> {
            System.out.print(asisProfe.getProfesorDto().getCedula() + " - ");
            System.out.print(asisProfe.getProfesorDto().getNombre() + " - ");

            System.out.print(asisProfe.getClaseDto().getGrupo() + " - ");
            System.out.print(asisProfe.getClaseDto().getNumeroclases() + " - ");
            System.out.println(asisProfe.getAsistencia());
        });
    }

    public static void insertGenero(String genero) {
        generoDto.setGenero(genero);

        if (generoDao.insertGenero(generoDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarGeneros() {
        generoDao.listarGeneros().forEach((genero) -> {
            System.out.print(genero.getId_genero() + " - ");
            System.out.println(genero.getGenero());
        });
    }

    public static void insertPoblacion(String poblacion) {
        //Ingresar poblaciones
        poblacionDto.setPoblacion(poblacion);

        if (poblacionDao.insertPoblacion(poblacionDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarPoblaciones() {
        //Listar poblaciones
        poblacionDao.listarPoblaciones().forEach((poblaciones) -> {
            System.out.print(poblaciones.getId_problacion() + " - ");
            System.out.println(poblaciones.getPoblacion());
        });
    }

    public static void insertEstudiante(String cedula, String nombre) {

        //ingresar estudiantes
        estudianteDto.setCedula(cedula);
        estudianteDto.setNombre(nombre);
        estudianteDto.setDireccion("Calle 45 N~ 72-10, Rionegro");
        estudianteDto.setEmail("Aseo@hotmail.com");
        estudianteDto.setTelefono("3210952312");
        estudianteDto.setFechanacimiento("1996-06-15");
        estudianteDto.setSisben("Categoria A");

        generoDto.setId_genero(1);
        estudianteDto.setGeneroDto(generoDto);

        poblacionDto.setId_problacion(1);
        estudianteDto.setPoblacionDto(poblacionDto);

        if (estudianteDao.insertEstudiantes(estudianteDto)) {
            System.out.println("Nice");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarEstudiantes() {
        estudianteDao.listarEstudiantes().forEach((estudiante) -> {
            System.out.print(estudiante.getCedula() + " - ");
            System.out.print(estudiante.getNombre() + " - ");
            System.out.print(estudiante.getDireccion() + " - ");
            System.out.print(estudiante.getEmail() + " - ");
            System.out.print(estudiante.getTelefono() + " - ");
            System.out.print(estudiante.getFechanacimiento() + " - ");
            System.out.print(estudiante.getSisben() + " - ");
            System.out.print(estudiante.getGeneroDto().getGenero() + " - ");
            System.out.println(estudiante.getPoblacionDto().getPoblacion());

        });
    }

    public static void insertAsistenciaEstudiante(String cedula, int clase) {

        estudianteDto.setCedula(cedula);
        asisestudianteDto.setEstudianteDto(estudianteDto);

        claseDto.setId_clase(clase);
        asisestudianteDto.setClaseDto(claseDto);

        asisestudianteDto.setFecha("2020-11-09");
        asisestudianteDto.setAsistencia(1);

        if (asisestudianteDao.insertAsistenciaEstudiante(asisestudianteDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }

    }

    public static void listarAsistenciaEstudiantes() {

        asisestudianteDao.listarAsisEstudiantes().forEach((asisEstudiante) -> {
            System.out.print(asisEstudiante.getEstudianteDto().getCedula() + " - ");
            System.out.print(asisEstudiante.getEstudianteDto().getNombre() + " - ");
            System.out.print(asisEstudiante.getClaseDto().getGrupo() + " - ");
            System.out.print(asisEstudiante.getClaseDto().getNumeroclases() + " - ");
            System.out.println(asisEstudiante.getAsistencia());
        });

    }

    public static void insertInscripcion(int programa, String cedula) {
        estudianteDto.setCedula(cedula);
        inscripcionDto.setEstudianteDto(estudianteDto);

        programaDto.setId_programa(programa);
        inscripcionDto.setProgramaDto(programaDto);

        inscripcionDto.setFecha("2021-05-05");

        if (inscripcionDao.insertInscrpcion(inscripcionDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

    public static void listarInscripciones() {

        inscripcionDao.listarInscripciones().forEach((inscripcion) -> {
            System.out.print(inscripcion.getId_inscripcion() + " - ");
            System.out.print(inscripcion.getEstudianteDto().getCedula() + " - ");
            System.out.print(inscripcion.getEstudianteDto().getNombre() + " - ");
            System.out.print(inscripcion.getProgramaDto().getNombre() + " - ");
            System.out.println(inscripcion.getFecha());

        });
    }

    public static void insertMatricula(int inscripcion) {
        inscripcionDto.setId_inscripcion(inscripcion);
        matriculaDto.setInscripcionDto(inscripcionDto);
        
        matriculaDto.setValorpago(59000);
        matriculaDto.setFecha("2021-05-05");

        if (matriculaDao.insertMatricula(matriculaDto)) {
            System.out.println("Inserto");
        } else {
            System.out.println("Fuck");
        }
    }

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
     */
}
