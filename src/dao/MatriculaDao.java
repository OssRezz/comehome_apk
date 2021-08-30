package dao;

import CONEXION.Conexion;
import dto.EstudianteDto;
import dto.InscripcionDto;
import dto.MatriculaDto;
import dto.ProgramaDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDao {

    private Conexion cn = null;

    public boolean insertMatricula(MatriculaDto matriculaDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO "
                    + "`tbl_matriculas`(`id_matricula`, `valorpago`,"
                    + " `fechamatricula`, `id_inscripcion`) VALUES (NULL,?,?,?)");

            ps.setFloat(1, matriculaDto.getValorpago());
            ps.setString(2, matriculaDto.getFecha());
            ps.setInt(3, matriculaDto.getInscripcionDto().getId_inscripcion());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<MatriculaDto> listarMatriculas() {
        List<MatriculaDto> listaDeMatriculas = new ArrayList();
        try {
            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TM.*, E.cc_estudiante,"
                    + " E.nombre as 'nombreEstudiante', P.id_programa,"
                    + " P.nombre AS 'nombrePrograma' FROM `tbl_matriculas` as TM"
                    + " INNER JOIN tbl_inscripciones AS I ON I.id_inscripcion=TM.id_inscripcion"
                    + " INNER JOIN tbl_estudiantes AS E ON E.cc_estudiante=I.cc_estudiante"
                    + " INNER JOIN tbl_programas AS P ON P.id_programa=I.id_programa");
            while (rs.next()) {
                InscripcionDto inscripcionDto = new InscripcionDto();
                EstudianteDto estudianteDto = new EstudianteDto();
                ProgramaDto programaDto = new ProgramaDto();

                inscripcionDto.setId_inscripcion(rs.getInt("id_inscripcion"));

                estudianteDto.setCedula(rs.getString("cc_estudiante"));
                estudianteDto.setNombre(rs.getString("nombreEstudiante"));
                inscripcionDto.setEstudianteDto(estudianteDto);

                programaDto.setId_programa(rs.getInt("id_programa"));
                programaDto.setNombre(rs.getString("nombrePrograma"));
                inscripcionDto.setProgramaDto(programaDto);

                listaDeMatriculas.add(new MatriculaDto(
                        rs.getInt("id_matricula"),
                        rs.getFloat("valorpago"),
                        rs.getString("fechamatricula"),
                        inscripcionDto
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeMatriculas;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
