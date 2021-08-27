/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import CONEXION.Conexion;
import dto.ProfesorDto;
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
public class ProfesorDao {

    private Conexion cn = null;

    //insertar un profesor
    public boolean insertProfesor(ProfesorDto profesorDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_profesores`(`cc_profesor`, `nombre`, `telefono`, `email`, `titulo`)"
                    + " VALUES (?,?,?,?,?)");

            ps.setString(1, profesorDto.getCedula());
            ps.setString(2, profesorDto.getNombre());
            ps.setString(3, profesorDto.getTelefono());
            ps.setString(4, profesorDto.getEmail());
            ps.setString(5, profesorDto.getTitulo());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista de profesores
    public List<ProfesorDto> listarProfesores() {

        List<ProfesorDto> listaDeProfesores = new ArrayList<>();

        try {
            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_profesores");

            while (rs.next()) {
                listaDeProfesores.add(new ProfesorDto(
                        rs.getString("cc_profesor"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("titulo")
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeProfesores;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }

}
