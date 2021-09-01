package dao;

import CONEXION.Conexion;
import dto.EscuelaDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EscuelaDao {

    

    //Insetar escuela
    public boolean insertEscuela(String escuela) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO "
                    + "tbl_escuelas (id_escuela,escuela) VALUES (NULL,?)");

            ps.setString(1, escuela);

            ps.execute();
            ps.close();
            cn.conectar().close();

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista escuela
    public List<EscuelaDto> listarEscuelas() {

        List<EscuelaDto> listaDeEscuelas = new ArrayList<>();

        try {
            Conexion cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_escuelas");

            while (rs.next()) {
                listaDeEscuelas.add(new EscuelaDto(
                        rs.getInt("id_escuela"),
                        rs.getString("escuela")
                ));
            }

            rs.close();
            st.close();
            cn.conectar().close();
            return listaDeEscuelas;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }


}
