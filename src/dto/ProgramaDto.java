package dto;

public class ProgramaDto {

    private int id_programa;
    private String nombre;
    private String edad;
    private int cupos;
    private float costo;
    private String fechainicio;
    private String fechafin;
    private String horario;
    private int estado;
    private EscuelaDto escuelaDto;
    private SedeDto sedeDto;

    public ProgramaDto() {
    }

    public ProgramaDto(int id_programa, String nombre, String edad, int cupos, float costo, String fechainicio, String fechafin, String horario, int estado, EscuelaDto escuelaDto, SedeDto sedeDto) {
        this.id_programa = id_programa;
        this.nombre = nombre;
        this.edad = edad;
        this.cupos = cupos;
        this.costo = costo;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.horario = horario;
        this.estado = estado;
        this.escuelaDto = escuelaDto;
        this.sedeDto = sedeDto;
    }

    public int getId_programa() {
        return id_programa;
    }

    public void setId_programa(int id_programa) {
        this.id_programa = id_programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public EscuelaDto getEscuelaDto() {
        return escuelaDto;
    }

    public void setEscuelaDto(EscuelaDto escuelaDto) {
        this.escuelaDto = escuelaDto;
    }

    public SedeDto getSedeDto() {
        return sedeDto;
    }

    public void setSedeDto(SedeDto sedeDto) {
        this.sedeDto = sedeDto;
    }

}
