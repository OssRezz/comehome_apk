package dao;

import CONEXION.Conexion;
import dto.AsisestudianteDto;
import dto.ClaseDto;
import dto.EstudianteDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AsisestudianteDao {

    private Conexion cn = null;

    public boolean insertAsistenciaEstudiante(AsisestudianteDto asisestudianteDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_asisestudiantes`(`id_asisestudiante`,"
                    + " `cc_estudiante`, `id_clase`, `fecha`,`asistencia`)"
                    + " VALUES (NULL,?,?,?,?)");

            ps.setString(1, asisestudianteDto.getEstudianteDto().getCedula());
            ps.setInt(2, asisestudianteDto.getClaseDto().getId_clase());
            ps.setString(3, asisestudianteDto.getFecha());
            ps.setInt(4, asisestudianteDto.getAsistencia());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<AsisestudianteDto> listarAsisEstudiantes() {
        List<AsisestudianteDto> listaDeAsisEstudiantes = new ArrayList();
        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TC.grupo,TC.numeroclases,"
                    + "E.nombre,TAE.id_asisestudiante, TAE.cc_estudiante,"
                    + "TAE.id_clase,TAE.fecha,COUNT(TAE.asistencia) as 'asistencia'"
                    + " FROM `tbl_asisestudiantes` as TAE"
                    + " INNER JOIN tbl_clases AS TC ON TC.id_clase=TAE.id_clase"
                    + " INNER JOIN tbl_estudiantes AS E ON E.cc_estudiante=TAE.cc_estudiante"
                    + " WHERE TC.estado = 1 GROUP BY (id_clase) ");
            while (rs.next()) {
                EstudianteDto estudianteDto = new EstudianteDto();
                ClaseDto claseDto = new ClaseDto();

                estudianteDto.setCedula(rs.getString("cc_estudiante"));
                estudianteDto.setNombre(rs.getString("nombre"));

                claseDto.setId_clase(rs.getInt("id_clase"));
                claseDto.setGrupo(rs.getString("grupo"));
                claseDto.setNumeroclases(rs.getInt("numeroClases"));

                listaDeAsisEstudiantes.add(new AsisestudianteDto(
                        rs.getInt("id_asisestudiante"),
                        rs.getString("fecha"),
                        rs.getInt("asistencia"),
                        estudianteDto, claseDto
                ));

            }

            rs.close();
            cn.conectar().close();
            return listaDeAsisEstudiantes;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
