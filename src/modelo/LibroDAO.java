package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

public class LibroDAO implements ConsultasLibroDAO {

    @Override
    public void insertar(LibroVO a) {
        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("INSERT INTO tbl_libro (titulo_libro, anio_libro) VALUES "
                    + "('" + a.getNombre_libro() + "', " + a.getAnio_libro() + ");");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public ArrayList<LibroVO> consultarTablaLibro() {
        Conector c = new Conector();
        ArrayList<LibroVO> infol = new ArrayList();
        try {
            c.conectar();
            ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_libro;");
            while (rs.next()) {
                LibroVO lvo = new LibroVO();
                lvo.setId_libro(rs.getInt(1));
                lvo.setNombre_libro(rs.getString(2));
                lvo.setAnio_libro(rs.getInt(3));
                infol.add(lvo);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return infol;
    }

    @Override
    public ArrayList<LibroVO> consultar(LibroVO lvo) {
        Conector c = new Conector();
        ArrayList<LibroVO> infol = new ArrayList();
        try {
            c.conectar();
            ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_libro WHERE titulo_libro LIKE '%" + lvo.getNombre_libro() + "%';");
            while (rs.next()) {
                LibroVO lv = new LibroVO();
                lv.setId_libro(rs.getInt(1));
                lv.setNombre_libro(rs.getString(2));
                lv.setAnio_libro(rs.getInt(3));
                infol.add(lv);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return infol;
    }

    @Override
    public void modificar(LibroVO l) {
        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("UPDATE tbl_libro SET titulo_libro= '" + l.getNombre_libro() + "' ,anio_libro= " + l.getAnio_libro() + " WHERE id_libro =" + l.getId_libro());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(LibroVO l) {
        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("DELETE FROM tbl_libro WHERE id_libro =" + l.getId_libro());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
