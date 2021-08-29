package dto;

public class MatriculaDto {

    private int id_matricula;
    private float valorpago;
    private String fecha;
    private InscripcionDto inscripcionDto;

    public MatriculaDto() {
    }

    public MatriculaDto(int id_matricula, float valorpago, String fecha, InscripcionDto inscripcionDto) {
        this.id_matricula = id_matricula;
        this.valorpago = valorpago;
        this.fecha = fecha;
        this.inscripcionDto = inscripcionDto;
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public float getValorpago() {
        return valorpago;
    }

    public void setValorpago(float valorpago) {
        this.valorpago = valorpago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public InscripcionDto getInscripcionDto() {
        return inscripcionDto;
    }

    public void setInscripcionDto(InscripcionDto inscripcionDto) {
        this.inscripcionDto = inscripcionDto;
    }

}
