package modelo;

public class LibroVO {
    /* Crear variables en base a las creadas en la tabla*/
    private int id_libro;
    private String nombre_libro;
    private int anio_libro;
    
    /*Constructor vacio*/
    public LibroVO() {
    }
    /*Geters y seters*/
    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public int getAnio_libro() {
        return anio_libro;
    }

    public void setAnio_libro(int anio_libro) {
        this.anio_libro = anio_libro;
    }
    
    
}
