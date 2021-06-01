package modelo;

import java.util.ArrayList;

public interface ConsultasLibroDAO {

    public void insertar(LibroVO a);

    public ArrayList<LibroVO> consultarTablaLibro();

    public ArrayList<LibroVO> consultar(LibroVO lvo);

    public void modificar(LibroVO l);

    public void eliminar(LibroVO l);

}
