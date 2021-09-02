package dao;

import CONEXION.Conexion;
import dto.ClaseDto;
import dto.ProgramaDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClaseDao {

    private Conexion cn = null;

    //ingresar clase
    public boolean insertClase(ClaseDto claseDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_clases`(`id_clase`, `id_programa`, `grupo`,"
                    + "`numeroclases`, `fechainicio`, `fechafin`, `estado`)"
                    + " VALUES (NULL,?,?,?,?,?,?)");
            ps.setInt(1, claseDto.getProgramaDto().getId_programa());
            ps.setString(2, claseDto.getGrupo());
            ps.setInt(3, claseDto.getNumeroclases());
            ps.setString(4, claseDto.getFechainicio());
            ps.setString(5, claseDto.getFechafin());
            ps.setInt(6, claseDto.getEstado());

            ps.execute();
            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista de clases
    public List<ClaseDto> listarClases() {
        List<ClaseDto> listaDeClases = new ArrayList();
        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TC.*, TP.nombre  "
                    + "FROM tbl_clases AS TC "
                    + "INNER JOIN tbl_programas AS TP ON TP.id_programa = TC.id_programa ");
            while (rs.next()) {
                
                ProgramaDto programaDto = new ProgramaDto();
                programaDto.setId_programa(rs.getInt("id_programa"));
                programaDto.setNombre(rs.getString("nombre"));

                listaDeClases.add(new ClaseDto(
                        rs.getInt("id_clase"),
                        rs.getString("grupo"),
                        rs.getInt("numeroclases"),
                        rs.getString("fechainicio"),
                        rs.getString("fechafin"),
                        rs.getInt("estado"),
                        programaDto
                ));
            }
            
            rs.close();
            st.close();            
            cn.conectar().close();
            return listaDeClases;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
