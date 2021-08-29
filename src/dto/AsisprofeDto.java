package dto;

public class AsisprofeDto {

    private int id_asisprofesor;
    private String fecha;
    private int asistencia;
    private ProfesorDto profesorDto;
    private ClaseDto claseDto;

    public AsisprofeDto() {
    }

    public AsisprofeDto(int id_asisprofesor, String fecha, int asistencia, ProfesorDto profesorDto, ClaseDto claseDto) {
        this.id_asisprofesor = id_asisprofesor;
        this.fecha = fecha;
        this.asistencia = asistencia;
        this.profesorDto = profesorDto;
        this.claseDto = claseDto;
    }

    public int getId_asisprofesor() {
        return id_asisprofesor;
    }

    public void setId_asisprofesor(int id_asisprofesor) {
        this.id_asisprofesor = id_asisprofesor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public ProfesorDto getProfesorDto() {
        return profesorDto;
    }

    public void setProfesorDto(ProfesorDto profesorDto) {
        this.profesorDto = profesorDto;
    }

    public ClaseDto getClaseDto() {
        return claseDto;
    }

    public void setClaseDto(ClaseDto claseDto) {
        this.claseDto = claseDto;
    }

}
