package dao;

import CONEXION.Conexion;
import dto.SedeDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SedeDao {

    //Insetar escuela
    public boolean insertSede(SedeDto sedeDto) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_sedes`(`id_sede`, `nombre`, `direccion`, `telefono`, `aula`)"
                    + " VALUES (NULL,?,?,?,?)");

            ps.setString(1, sedeDto.getNombre());
            ps.setString(2, sedeDto.getDireccion());
            ps.setString(3, sedeDto.getTelefono());
            ps.setString(4, sedeDto.getAula());

            ps.execute();
            ps.close();
            cn.conectar().close();

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista de sedes
    public List<SedeDto> listarSedes() {

        List<SedeDto> listaDeSedes = new ArrayList<>();

        try {
            Conexion cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_sedes");

            while (rs.next()) {
                listaDeSedes.add(new SedeDto(
                        rs.getInt("id_sede"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("aula")
                ));
            }
            rs.close();
            st.close();

            cn.conectar().close();
            return listaDeSedes;

        } catch (SQLException e) {
            System.out.println("Error listarSedes" + e);

        }
        return null;
    }

    //Lista de sedes por id
    public SedeDto MostrarSedeById(int sede) {
        try {
            Conexion cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_sedes"
                    + " WHERE id_sede=" + sede);

            rs.next();
            SedeDto sedeDto = new SedeDto(
                    rs.getInt("id_sede"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("telefono"),
                    rs.getString("aula")
            );
            rs.close();
            st.close();

            cn.conectar().close();
            return sedeDto;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }

    public boolean actualizarSede(SedeDto sedeDto) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("UPDATE `tbl_sedes`"
                    + " SET `id_sede`='" + sedeDto.getId_sede() + "',"
                    + "`nombre`='" + sedeDto.getNombre() + "',"
                    + "`direccion`='" + sedeDto.getDireccion() + "',"
                    + "`telefono`='" + sedeDto.getTelefono() + "',"
                    + "`aula`='" + sedeDto.getAula() + "'"
                    + " WHERE id_sede=" + sedeDto.getId_sede());

            ps.executeUpdate();
            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }

    public boolean eliminarSede(int sede) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("DELETE * "
                    + "FROM tbl_sedes WHERE id_sede" + sede);

            ps.executeUpdate();
            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }

}
