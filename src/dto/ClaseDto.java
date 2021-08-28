package dto;

public class ClaseDto {

    private int id_clase;
    private String grupo;
    private int numeroclases;
    private String fechainicio;
    private String fechafin;
    private int estado;
    private ProgramaDto programaDto;

    public ClaseDto() {
    }

    public ClaseDto(int id_clase, String grupo, int numeroclases, String fechainicio, String fechafin, int estado, ProgramaDto programaDto) {
        this.id_clase = id_clase;
        this.grupo = grupo;
        this.numeroclases = numeroclases;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
        this.programaDto = programaDto;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNumeroclases() {
        return numeroclases;
    }

    public void setNumeroclases(int numeroclases) {
        this.numeroclases = numeroclases;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ProgramaDto getProgramaDto() {
        return programaDto;
    }

    public void setProgramaDto(ProgramaDto programaDto) {
        this.programaDto = programaDto;
    }

}
