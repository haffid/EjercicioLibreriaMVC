package modelo;

import java.util.ArrayList;

public interface ConsultasAutorDAO {

    public void insertar(AutorVO a);

    public ArrayList<AutorVO> consultarTablaAutor();

    public ArrayList<AutorVO> consultar(AutorVO avo);

    public void modificar(AutorVO a);

    public void eliminar(AutorVO a);

    public void insertar(LibroVO a);

}
