package dao;

import CONEXION.Conexion;
import dto.AsisprofeDto;
import dto.ClaseDto;
import dto.ProfesorDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AsisprofeDao {

    private Conexion cn = null;

    public boolean insertAsistenciaProfesor(AsisprofeDto asisprofeDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO "
                    + "`tbl_asisprofesores`(`id_asisprofesor`,"
                    + " `cc_profesor`, `id_clase`, `fecha`, `asistencia`)"
                    + " VALUES (NULL,?,?,?,?)");
            ps.setString(1, asisprofeDto.getProfesorDto().getCedula());
            ps.setInt(2, asisprofeDto.getClaseDto().getId_clase());
            ps.setString(3, asisprofeDto.getFecha());
            ps.setInt(4, asisprofeDto.getAsistencia());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<AsisprofeDto> listaAsistenciaProfesores() {
        List<AsisprofeDto> listaDeAsisProfe = new ArrayList();
        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TC.grupo,TC.numeroclases,"
                    + "P.nombre,TAP.id_asisprofesor, TAP.cc_profesor,TAP.id_clase,TAP.fecha,"
                    + "COUNT(TAP.asistencia) as 'asistencia' FROM `tbl_asisprofesores` as TAP"
                    + " INNER JOIN tbl_clases AS TC ON TC.id_clase=TAP.id_clase"
                    + " INNER JOIN tbl_profesores AS P ON P.cc_profesor=TAP.cc_profesor"
                    + " WHERE TC.estado = 1 GROUP BY (id_clase) ");

            while (rs.next()) {
                ProfesorDto profesorDto = new ProfesorDto();
                ClaseDto claseDto = new ClaseDto();

                profesorDto.setCedula(rs.getString("cc_profesor"));
                profesorDto.setNombre(rs.getString("nombre"));

                claseDto.setId_clase(rs.getInt("id_clase"));
                claseDto.setGrupo(rs.getString("grupo"));
                claseDto.setNumeroclases(rs.getInt("numeroclases"));

                listaDeAsisProfe.add(new AsisprofeDto(
                        rs.getInt("id_asisprofesor"),
                        rs.getString("fecha"),
                        rs.getInt("asistencia"),
                        profesorDto, claseDto
                ));

            }
            rs.close();
            cn.conectar().close();
            return listaDeAsisProfe;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
