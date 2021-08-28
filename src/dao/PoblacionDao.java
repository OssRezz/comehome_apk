
package dao;

import CONEXION.Conexion;
import dto.PoblacionDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PoblacionDao {

    private Conexion cn = null;

    //ingresar poblaciones
    public boolean insertPoblacion(PoblacionDto poblacionDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " tbl_poblaciones (id_poblacion,poblacion) VALUES (NULL,?)");
            ps.setString(1, poblacionDto.getPoblacion());
            ps.execute();
            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Listar poblaciones
    public List<PoblacionDto> listarPoblaciones() {
        List<PoblacionDto> listaDePoblaciones = new ArrayList();
        try {
            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_poblaciones");
            while (rs.next()) {
                listaDePoblaciones.add(new PoblacionDto(
                        rs.getInt("id_poblacion"),
                        rs.getString("poblacion")
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDePoblaciones;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
