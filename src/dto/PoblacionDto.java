
package dto;


public class PoblacionDto {

    private int id_problacion;
    private String poblacion;

    public PoblacionDto() {
    }

    public PoblacionDto(int id_problacion, String poblacion) {
        this.id_problacion = id_problacion;
        this.poblacion = poblacion;
    }

    public int getId_problacion() {
        return id_problacion;
    }

    public void setId_problacion(int id_problacion) {
        this.id_problacion = id_problacion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

}
