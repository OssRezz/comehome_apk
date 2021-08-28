
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

    private Conexion cn = null;

    //Insetar escuela
    public boolean insertSede(SedeDto sedeDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_sedes`(`id_sede`, `nombre`, `direccion`, `telefono`, `aula`)"
                    + " VALUES (NULL,?,?,?,?)");

            ps.setString(1, sedeDto.getNombre());
            ps.setString(2, sedeDto.getDireccion());
            ps.setString(3, sedeDto.getTelefono());
            ps.setString(4, sedeDto.getAula());

            ps.execute();
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
            cn = new Conexion();
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
            cn.conectar().close();
            return listaDeSedes;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }
}
