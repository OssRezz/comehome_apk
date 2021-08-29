package dto;

public class UsuarioDto {

    private String cedula;
    private String nombre;
    private String email;
    private String password;
    private PerfilDto perfilDto;

    public UsuarioDto() {
    }

    public UsuarioDto(String cedula, String nombre, String email, String password, PerfilDto perfilDto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.perfilDto = perfilDto;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PerfilDto getPerfilDto() {
        return perfilDto;
    }

    public void setPerfilDto(PerfilDto perfilDto) {
        this.perfilDto = perfilDto;
    }

}
