package dto;

public class AsisestudianteDto {

    private int id_asisestudiante;
    private String fecha;
    private int asistencia;
    private EstudianteDto estudianteDto;
    private ClaseDto claseDto;

    public AsisestudianteDto() {
    }

    public AsisestudianteDto(int id_asisestudiante, String fecha, int asistencia, EstudianteDto estudianteDto, ClaseDto claseDto) {
        this.id_asisestudiante = id_asisestudiante;
        this.fecha = fecha;
        this.asistencia = asistencia;
        this.estudianteDto = estudianteDto;
        this.claseDto = claseDto;
    }

    public int getId_asisestudiante() {
        return id_asisestudiante;
    }

    public void setId_asisestudiante(int id_asisestudiante) {
        this.id_asisestudiante = id_asisestudiante;
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

    public EstudianteDto getEstudianteDto() {
        return estudianteDto;
    }

    public void setEstudianteDto(EstudianteDto estudianteDto) {
        this.estudianteDto = estudianteDto;
    }

    public ClaseDto getClaseDto() {
        return claseDto;
    }

    public void setClaseDto(ClaseDto claseDto) {
        this.claseDto = claseDto;
    }

}
