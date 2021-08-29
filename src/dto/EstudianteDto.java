package dto;

public class EstudianteDto {

    private String cedula;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private String fechanacimiento;
    private String sisben;
    private GeneroDto generoDto;
    private PoblacionDto poblacionDto;

    public EstudianteDto() {
    }

    public EstudianteDto(String cedula, String nombre, String direccion, String email, String telefono, String fechanacimiento, String sisben, GeneroDto generoDto, PoblacionDto poblacionDto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.sisben = sisben;
        this.generoDto = generoDto;
        this.poblacionDto = poblacionDto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSisben() {
        return sisben;
    }

    public void setSisben(String sisben) {
        this.sisben = sisben;
    }

    public GeneroDto getGeneroDto() {
        return generoDto;
    }

    public void setGeneroDto(GeneroDto generoDto) {
        this.generoDto = generoDto;
    }

    public PoblacionDto getPoblacionDto() {
        return poblacionDto;
    }

    public void setPoblacionDto(PoblacionDto poblacionDto) {
        this.poblacionDto = poblacionDto;
    }

}
