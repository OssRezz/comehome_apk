package dao;

import CONEXION.Conexion;
import dto.EstudianteDto;
import dto.InscripcionDto;
import dto.ProgramaDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDao {

    private Conexion cn = null;

    //ibgresar inscripciones
    public boolean insertInscrpcion(InscripcionDto inscripciondto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO "
                    + "`tbl_inscripciones`(`id_inscripcion`, `fecha`, `id_programa`,"
                    + " `cc_estudiante`) VALUES (NULL,?,?,?)");
            ps.setString(1, inscripciondto.getFecha());
            ps.setInt(2, inscripciondto.getProgramaDto().getId_programa());
            ps.setString(3, inscripciondto.getEstudianteDto().getCedula());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //listar inscripciones
    public List<InscripcionDto> listarInscripciones() {
        List<InscripcionDto> listaDeInscripciones = new ArrayList();

        try {
            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TI.*, TP.nombre as 'nombrePrograma',"
                    + " E.nombre as 'nombreEstudiante'"
                    + " FROM `tbl_inscripciones` as TI"
                    + " INNER JOIN tbl_programas AS TP ON TP.id_programa=TI.id_inscripcion"
                    + " INNER JOIN tbl_estudiantes AS E ON E.cc_estudiante=TI.cc_estudiante");

            while (rs.next()) {
                ProgramaDto programaDto = new ProgramaDto();
                EstudianteDto estudianteDto = new EstudianteDto();

                programaDto.setId_programa(rs.getInt("id_programa"));
                programaDto.setNombre(rs.getString("nombrePrograma"));

                estudianteDto.setCedula(rs.getString("cc_estudiante"));
                estudianteDto.setNombre(rs.getString("nombreEstudiante"));

                listaDeInscripciones.add(new InscripcionDto(
                        rs.getInt("id_inscripcion"),
                        rs.getString("fecha"),
                        programaDto, estudianteDto
                ));
            }
            rs.close();
            cn.conectar().close();
            return listaDeInscripciones;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
