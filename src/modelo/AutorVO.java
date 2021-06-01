package modelo;

public class AutorVO {

    /* Crear variables en base a las creadas en la tabla*/
    private int dpi_autor;
    private String nombre_autora;
    private String apellido_autor;
    private int edad_autor;
    private String direccion_autor;
    private int id_libro_fk;

    /*Constructor vacio*/
    public AutorVO() {
    }

    /*Metodos geter y seter*/
    public int getDpi_autor() {
        return dpi_autor;
    }

    public void setDpi_autor(int dpi_autor) {
        this.dpi_autor = dpi_autor;
    }

    public String getNombre_autora() {
        return nombre_autora;
    }

    public void setNombre_autora(String nombre_autor) {
        this.nombre_autora = nombre_autor;
    }

    public String getApellido_autor() {
        return apellido_autor;
    }

    public void setApellido_autor(String apellido_autor) {
        this.apellido_autor = apellido_autor;
    }

    public int getEdad_autor() {
        return edad_autor;
    }

    public void setEdad_autor(int edad_autor) {
        this.edad_autor = edad_autor;
    }

    public String getDireccion_autor() {
        return direccion_autor;
    }

    public void setDireccion_autor(String direccion_autor) {
        this.direccion_autor = direccion_autor;
    }

    public int getId_libro_fk() {
        return id_libro_fk;
    }

    public void setId_libro_fk(int id_libro_fk) {
        this.id_libro_fk = id_libro_fk;
    }

}
