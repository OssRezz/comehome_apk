package dao;

import CONEXION.Conexion;
import dto.PerfilDto;
import dto.UsuarioDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private Conexion cn = null;

    //Agregar un usuario
    public boolean insertUsuario(UsuarioDto usuarioDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_usuarios`(`cc_usuario`, `nombre`,`email`, `password`, `id_perfil`)"
                    + " VALUES (?,?,?,?,?)");

            ps.setString(1, usuarioDto.getCedula());
            ps.setString(2, usuarioDto.getNombre());
            ps.setString(3, usuarioDto.getEmail());
            ps.setString(4, usuarioDto.getPassword());
            ps.setInt(5, usuarioDto.getPerfilDto().getId_perfil());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista de usuarios
    public List<UsuarioDto> listarUsuarios() {

        List<UsuarioDto> listaDeUsuarios = new ArrayList<>();

        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT tu.cc_usuario,tu.nombre,"
                    + "tu.email,tu.password,tp.id_perfil,tp.perfil"
                    + " FROM tbl_usuarios AS tu INNER JOIN tbl_perfiles"
                    + " AS tp ON tp.id_perfil = tu.id_perfil");

            while (rs.next()) {
                
                PerfilDto perfilDto = new PerfilDto();
                perfilDto.setId_perfil(rs.getInt("id_perfil"));
                perfilDto.setPerfil(rs.getString("perfil"));
                
                listaDeUsuarios.add(new UsuarioDto(
                        rs.getString("cc_usuario"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("password"),
                        perfilDto
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeUsuarios;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }

}
