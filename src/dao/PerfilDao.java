/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import CONEXION.Conexion;
import dto.PerfilDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author james
 */
public class PerfilDao {

    private Conexion cn = null;

    //Agregar un perfil
    public boolean inserPerfil(String perfil) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_perfiles`(`id_perfil`, `perfil`) VALUES (NULL,?)");

            ps.setString(1, perfil);
            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Listar un perfil
    public List<PerfilDto> ListarPerfiles() {
        List<PerfilDto> listaDePerfiles = new ArrayList();
        try {

            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_perfiles");
            while (rs.next()) {
                listaDePerfiles.add(new PerfilDto(
                        rs.getInt("id_perfil"),
                        rs.getString("perfil")
                ));
            }
            rs.close();
            cn.conectar().close();
            return listaDePerfiles;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
