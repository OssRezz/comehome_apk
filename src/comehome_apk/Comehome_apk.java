package comehome_apk;

import dao.PerfilDao;
import dto.PerfilDto;

public class Comehome_apk {

    public static void main(String[] args) {
        PerfilDto perfilDto = new PerfilDto();
        PerfilDao perfilDao = new PerfilDao();
        perfilDao.ListarPerfiles().forEach((perfil) -> {
        System.out.print(perfil.getId_perfil() + " - ");
        System.out.println(perfil.getPerfil());
        });
    }

    /* PERFIL
        //ingresar perfil
        String mensaje = perfilDao.inserPerfil("Usuario") ? "Se insertó" : "No se insertó";  
        System.out.println(mensaje);
    
        //Listar perfil
        perfilDao.ListarPerfiles().forEach((perfil) -> {
        System.out.print(perfil.getId_perfil() + " - ");
        System.out.println(perfil.getPerfil());
        });
     */
}
