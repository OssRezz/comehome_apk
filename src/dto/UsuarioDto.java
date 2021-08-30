package dto;

public class UsuarioDto {

    private int codigo;
    private String identificacion;
    private String nombre;
    private String email;
    private String password;
    private PerfilDto perfilDto;

    public UsuarioDto() {
    }

    public UsuarioDto(int codigo, String identificacion, String nombre, String email, String password, PerfilDto perfilDto) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.perfilDto = perfilDto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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
