package dao;

import CONEXION.Conexion;
import dto.EstudianteDto;
import dto.GeneroDto;
import dto.PoblacionDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDao {

    private Conexion cn = null;

    //Ingresar estudiantes
    public boolean insertEstudiantes(EstudianteDto estudianteDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO "
                    + " `tbl_estudiantes` (`cc_estudiante`, `nombre`, `id_genero`,"
                    + " `id_poblacion`, `direccion`, `email`, `telefono`,"
                    + " `fechanaci`, `sisben`) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, estudianteDto.getCedula());
            ps.setString(2, estudianteDto.getNombre());
            ps.setInt(3, estudianteDto.getGeneroDto().getId_genero());
            ps.setInt(4, estudianteDto.getPoblacionDto().getId_problacion());
            ps.setString(5, estudianteDto.getDireccion());
            ps.setString(6, estudianteDto.getEmail());
            ps.setString(7, estudianteDto.getTelefono());
            ps.setString(8, estudianteDto.getFechanacimiento());
            ps.setString(9, estudianteDto.getSisben());
            ps.execute();
            
            ps.close();
            cn.conectar().close();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<EstudianteDto> listarEstudiantes() {
        List<EstudianteDto> listaDeEstudiantes = new ArrayList();
        try {
            cn = new Conexion();

            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT TE.*,TG.genero, TP.poblacion"
                    + " FROM `tbl_estudiantes` as TE"
                    + " INNER JOIN tbl_generos AS TG ON TG.id_genero=TE.id_genero"
                    + " INNER JOIN tbl_poblaciones AS TP ON TP.id_poblacion=TE.id_poblacion");

            while (rs.next()) {
                GeneroDto generoDto = new GeneroDto();
                PoblacionDto poblacionDto = new PoblacionDto();

                generoDto.setId_genero(rs.getInt("id_genero"));
                generoDto.setGenero(rs.getString("genero"));

                poblacionDto.setId_problacion(rs.getInt("id_poblacion"));
                poblacionDto.setPoblacion(rs.getString("poblacion"));

                listaDeEstudiantes.add(new EstudianteDto(
                        rs.getString("cc_estudiante"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("fechanaci"),
                        rs.getString("sisben"),
                        generoDto, poblacionDto
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeEstudiantes;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
