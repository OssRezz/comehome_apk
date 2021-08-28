
package dto;


public class GeneroDto {

    private int id_genero;
    private String genero;

    public GeneroDto() {
    }

    public GeneroDto(int id_genero, String genero) {
        this.id_genero = id_genero;
        this.genero = genero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
