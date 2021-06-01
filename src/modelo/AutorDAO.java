package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class AutorDAO implements ConsultasAutorDAO {

    @Override
    public void insertar(AutorVO a) {
        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("INSERT INTO tbl_autor (nombre_autora, apellido_autor, edad_autor, direccion_autor, id_libro_fk) VALUES "
                    + "('" + a.getNombre_autora() + "','" + a.getApellido_autor() + "'," + a.getEdad_autor() + ",'" + a.getDireccion_autor() + "'," + a.getId_libro_fk() + ");");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public ArrayList<AutorVO> consultarTablaAutor() {
        Conector c = new Conector();
        ArrayList<AutorVO> infoa = new ArrayList();
        try {
            c.conectar();
            ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_autor;");
            while (rs.next()) {
                AutorVO avo = new AutorVO();
                avo.setDpi_autor(rs.getInt(1));
                avo.setNombre_autora(rs.getString(2));
                avo.setApellido_autor(rs.getString(3));
                avo.setEdad_autor(rs.getInt(4));
                avo.setDireccion_autor(rs.getString(5));
                avo.setId_libro_fk(rs.getInt(6));
                infoa.add(avo);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return infoa;
    }

    @Override
    public ArrayList<AutorVO> consultar(AutorVO avo) {
        Conector c = new Conector();
        ArrayList<AutorVO> infoa = new ArrayList();
        try {
            c.conectar();
            ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_autor WHERE nombre_autora LIKE '%" + avo.getNombre_autora() + "%';");
            while (rs.next()) {
                AutorVO av = new AutorVO();
                av.setDpi_autor(rs.getInt(1));
                av.setNombre_autora(rs.getString(2));
                av.setApellido_autor(rs.getString(3));
                av.setEdad_autor(rs.getInt(4));
                av.setDireccion_autor(rs.getString(5));
                av.setId_libro_fk(rs.getInt(6));
                infoa.add(av);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return infoa;
    }

    @Override
    public void modificar(AutorVO a) {

        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("UPDATE tbl_autor SET nombre_autora= '" + a.getNombre_autora() + "' ,apellido_autor= '" + a.getApellido_autor() + "' ,edad_autor= " + a.getEdad_autor() + ",direccion_autor='" + a.getDireccion_autor() + "',id_libro_fk=" + a.getId_libro_fk() + " WHERE dpi_autor =" + a.getDpi_autor());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(AutorVO a) {
        Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("DELETE FROM tbl_autor WHERE dpi_autor =" + a.getDpi_autor());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void insertar(LibroVO a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Reporte paises con Jasper Report
    public JasperViewer jv;

    public void reporteInner() {
        Conector c = new Conector();
        try {
            c.conectar();
            //variable que encuentra el reporte
            JasperReport reporteInner;
            //ruta del reporte
            String ruta = "src\\reportes\\reporteJoin.jasper";
            //asignacion de ruta
            reporteInner = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporteInner, null, c.con);
            JasperViewer jv = new JasperViewer(jp, false);
            this.jv = jv;
        } catch (Exception e) {
            System.err.println("Mensaje Reporte" + e.getMessage());
        }
    }

    public void reporteLeftJoin() {
        Conector c = new Conector();
        try {
            c.conectar();
            //variable que encuentra el reporte
            JasperReport reporteLeftJoin;
            //ruta del reporte
            String ruta = "src\\reportes\\reporteLeftJoin.jasper";
            //asignacion de ruta
            reporteLeftJoin = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporteLeftJoin, null, c.con);
            JasperViewer jv = new JasperViewer(jp, false);
            this.jv = jv;
        } catch (Exception e) {
            System.err.println("Mensaje Reporte" + e.getMessage());
        }
    }

    public void reporteRightJoin() {
        Conector c = new Conector();
        try {
            c.conectar();
            //variable que encuentra el reporte
            JasperReport reporteRightJoin;
            //ruta del reporte
            String ruta = "src\\reportes\\reporteRightJoin.jasper";
            //asignacion de ruta
            reporteRightJoin = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporteRightJoin, null, c.con);
            JasperViewer jv = new JasperViewer(jp, false);
            this.jv = jv;
        } catch (Exception e) {
            System.err.println("Mensaje Reporte" + e.getMessage());
        }
    }

}
