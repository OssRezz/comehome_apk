package comehome_apk;

import dao.EscuelaDao;
import dao.EventoDao;
import dao.PerfilDao;
import dao.ProfesorDao;
import dao.SedeDao;
import dao.UsuarioDao;
import dto.EscuelaDto;
import dto.EventoDto;
import dto.PerfilDto;
import dto.ProfesorDto;
import dto.SedeDto;
import dto.UsuarioDto;

public class Comehome_apk {

    public static void main(String[] args) {
        ProfesorDto profesorDto = new ProfesorDto();
        ProfesorDao profesorDao = new ProfesorDao();

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
    
        //Ingresar usuarios
        String cedula = "1036957215";
        String nombre = "James Osorio Florez";
        String password = "1234";
        int perfil = 1;
        usuarioDto.setCedula(cedula);
        usuarioDto.setNombre(nombre);
        usuarioDto.setPassword(password);
        usuarioDto.setPerfil(perfil);
        if(usuarioDao.insertUsuario(usuarioDto)){
            System.out.println("Inserto");
        } else{
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
}
