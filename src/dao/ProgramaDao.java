package dao;

import CONEXION.Conexion;
import dto.EscuelaDto;
import dto.ProgramaDto;
import dto.SedeDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProgramaDao {

    //Ingresar Porgramas
    public boolean insertPrograma(ProgramaDto programaDto) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " tbl_programas(id_programa,id_escuela,nombre,edad,id_sede,cupos,"
                    + "costo,fechainicio,fechafin,horario,estado)"
                    + " VALUES(NULL,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, programaDto.getEscuelaDto().getId_escuela());
            ps.setString(2, programaDto.getNombre());
            ps.setString(3, programaDto.getEdad());
            ps.setInt(4, programaDto.getSedeDto().getId_sede());
            ps.setInt(5, programaDto.getCupos());
            ps.setDouble(6, programaDto.getCosto());
            ps.setString(7, programaDto.getFechainicio());
            ps.setString(8, programaDto.getFechafin());
            ps.setString(9, programaDto.getHorario());
            ps.setInt(10, programaDto.getEstado());

            ps.execute();
            ps.close();
            cn.conectar().close();

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Listar programas
    public List<ProgramaDto> listarProgramas() {
        List<ProgramaDto> listaDeProgramas = new ArrayList();
        try {
            Conexion cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TP.*, TS.nombre AS 'nombreSede',"
                    + " TE.escuela FROM tbl_programas as TP"
                    + " INNER JOIN tbl_sedes AS TS ON TS.id_sede = TP.id_sede"
                    + " INNER JOIN tbl_escuelas AS TE ON TE.id_escuela = TP.id_escuela ORDER BY TP.nombre ASC");
            while (rs.next()) {

                EscuelaDto escuelaDto = new EscuelaDto();
                SedeDto sedeDto = new SedeDto();
                escuelaDto.setId_escuela(rs.getInt("id_escuela"));
                escuelaDto.setEscuela(rs.getString("escuela"));
                sedeDto.setId_sede(rs.getInt("id_sede"));
                sedeDto.setNombre(rs.getString("nombreSede"));

                listaDeProgramas.add(new ProgramaDto(
                        rs.getInt("id_programa"),
                        rs.getString("nombre"),
                        rs.getString("edad"),
                        rs.getInt("cupos"),
                        rs.getDouble("costo"),
                        rs.getString("fechainicio"),
                        rs.getString("fechafin"),
                        rs.getString("horario"),
                        rs.getInt("estado"),
                        escuelaDto, sedeDto
                ));
            }
            rs.close();
            st.close();

            cn.conectar().close();
            return listaDeProgramas;

        } catch (SQLException e) {
            System.out.println("Error listarProgramas" + e);
        }
        return null;
    }

    public ProgramaDto MostrarUnProgramaById(int programa) {
        try {
            Conexion cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TP.*, TS.nombre AS 'nombreSede',"
                    + " TE.escuela FROM tbl_programas as TP"
                    + " INNER JOIN tbl_sedes AS TS ON TS.id_sede = TP.id_sede"
                    + " INNER JOIN tbl_escuelas AS TE ON TE.id_escuela = TP.id_escuela "
                    + " WHERE id_programa=" + programa);

            rs.next();
            EscuelaDto escuelaDto = new EscuelaDto();
            SedeDto sedeDto = new SedeDto();
            escuelaDto.setId_escuela(rs.getInt("id_escuela"));
            escuelaDto.setEscuela(rs.getString("escuela"));
            sedeDto.setId_sede(rs.getInt("id_sede"));
            sedeDto.setNombre(rs.getString("nombreSede"));

            ProgramaDto programaDto = new ProgramaDto(
                    rs.getInt("id_programa"),
                    rs.getString("nombre"),
                    rs.getString("edad"),
                    rs.getInt("cupos"),
                    rs.getDouble("costo"),
                    rs.getString("fechainicio"),
                    rs.getString("fechafin"),
                    rs.getString("horario"),
                    rs.getInt("estado"),
                    escuelaDto, sedeDto
            );

            rs.close();
            st.close();
            cn.conectar().close();

            return programaDto;

        } catch (SQLException e) {
            System.out.println("Error mostrar un programa" + e);
        }
        return null;
    }

    public boolean actualizarPrograma(ProgramaDto programaDto) {
        try {
            Conexion cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("UPDATE `tbl_programas`"
                    + " SET `id_programa`='" + programaDto.getId_programa() + "',"
                    + "`id_escuela`='" + programaDto.getEscuelaDto().getId_escuela() + "',"
                    + "`nombre`='" + programaDto.getNombre() + "',"
                    + "`edad`='" + programaDto.getEdad() + "',"
                    + "`id_sede`='" + programaDto.getSedeDto().getId_sede() + "',"
                    + "`cupos`='" + programaDto.getCupos() + "',"
                    + "`costo`='" + programaDto.getCosto() + "',"
                    + "`fechainicio`='" + programaDto.getFechainicio() + "',"
                    + "`fechafin`='" + programaDto.getFechafin() + "',"
                    + "`horario`='" + programaDto.getHorario() + "',"
                    + "`estado`='" + programaDto.getEstado() + "'"
                    + "  WHERE id_programa=" + programaDto.getId_programa());

            ps.executeUpdate();
            ps.close();
            cn.conectar().close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error actualizar programa" + e);
        }
        return false;
    }
}
