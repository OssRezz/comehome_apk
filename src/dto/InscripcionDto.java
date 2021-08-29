package dto;

public class InscripcionDto {

    private int id_inscripcion;
    private String fecha;
    private ProgramaDto programaDto;
    private EstudianteDto estudianteDto;

    public InscripcionDto() {
    }

    public InscripcionDto(int id_inscripcion, String fecha, ProgramaDto programaDto, EstudianteDto estudianteDto) {
        this.id_inscripcion = id_inscripcion;
        this.fecha = fecha;
        this.programaDto = programaDto;
        this.estudianteDto = estudianteDto;
    }

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ProgramaDto getProgramaDto() {
        return programaDto;
    }

    public void setProgramaDto(ProgramaDto programaDto) {
        this.programaDto = programaDto;
    }

    public EstudianteDto getEstudianteDto() {
        return estudianteDto;
    }

    public void setEstudianteDto(EstudianteDto estudianteDto) {
        this.estudianteDto = estudianteDto;
    }

}
