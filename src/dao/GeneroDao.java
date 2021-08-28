package dao;

import CONEXION.Conexion;
import dto.GeneroDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GeneroDao {

    private Conexion cn = null;

    //ingresar genero
    public boolean insertGenero(GeneroDto generodto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_generos`(`id_genero`, `genero`) VALUES (NULL,?)");
            ps.setString(1, generodto.getGenero());
            ps.execute();
            
            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Listar generos
    public List<GeneroDto> listarGeneros() {
        List<GeneroDto> listaDeGeneros = new ArrayList();
        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  tbl_generos");

            while (rs.next()) {
                listaDeGeneros.add(new GeneroDto(
                        rs.getInt("id_genero"),
                        rs.getString("genero")
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeGeneros;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
