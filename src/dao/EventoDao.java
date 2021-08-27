
package dao;

import CONEXION.Conexion;
import dto.EventoDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EventoDao {

    private Conexion cn = null;

    //Agregar un evento
    public boolean insertEvento(EventoDto eventoDto) {
        try {
            cn = new Conexion();
            PreparedStatement ps = cn.conectar().prepareStatement("INSERT INTO"
                    + " `tbl_eventos`(`id_evento`, `nombre`, `descripcion`, `fecha`, `horainicio`, `horafin`)"
                    + " VALUES (NULL,?,?,?,?,?)");

            ps.setString(1, eventoDto.getNombre());
            ps.setString(2, eventoDto.getDescripcion());
            ps.setString(3, eventoDto.getFecha());
            ps.setString(4, eventoDto.getHoraInicio());
            ps.setString(5, eventoDto.getHoraFin());

            ps.execute();

            ps.close();
            cn.conectar().close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //Lista de eventos
    public List<EventoDto> listarEventos() {

        List<EventoDto> listaDeEventos = new ArrayList<>();

        try {
            cn = new Conexion();
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_eventos");

            while (rs.next()) {
                listaDeEventos.add(new EventoDto(
                        rs.getInt("id_evento"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("fecha"),
                        rs.getString("horainicio"),
                        rs.getString("horafin")
                ));
            }

            rs.close();
            cn.conectar().close();
            return listaDeEventos;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return null;
    }

}
