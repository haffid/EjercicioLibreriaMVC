package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.AutorDAO;
import modelo.AutorVO;
import vista.FrmMostrarAutor;
import vista.FrmReporte;

public class ControladorMostrarAutor implements ActionListener, WindowListener {

    FrmMostrarAutor fma = new FrmMostrarAutor();
    FrmReporte fr = new FrmReporte();
    AutorVO avo = new AutorVO();
    AutorDAO adao = new AutorDAO();

    public ControladorMostrarAutor(FrmMostrarAutor fma, AutorVO avo, AutorDAO adao, FrmReporte fr) {

        this.fma = fma;
        this.avo = avo;
        this.adao = adao;
        this.fr = fr;

        fma.addWindowListener(this);
        fma.btnAcualizar.addActionListener(this);
        //Boton Reporte paises con Jasper Report
        fr.btnInnerJ.addActionListener(this);
        fr.btnLeftJ.addActionListener(this);
        fr.btnRightJ.addActionListener(this);

    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("DPI Autor");
        m.addColumn("Nombre del Autor");
        m.addColumn("Apellido del Autor");
        m.addColumn("Edad del Autor");
        m.addColumn("Direccion del Autor");
        m.addColumn("ID Libro del Autor");
        for (AutorVO v : this.adao.consultarTablaAutor()) {
            m.addRow(new Object[]{v.getDpi_autor(), v.getNombre_autora(), v.getApellido_autor(), v.getEdad_autor(), v.getDireccion_autor(), v.getId_libro_fk()});
        }
        fma.tblMostrar.setModel(m);
    }

    private void reporteInner() {
        adao.reporteInner();
        adao.jv.setDefaultCloseOperation(vista.Principal.DISPOSE_ON_CLOSE);
        adao.jv.setVisible(true);
    }

    private void reporteLeftJoin() {
        adao.reporteLeftJoin();
        adao.jv.setDefaultCloseOperation(vista.Principal.DISPOSE_ON_CLOSE);
        adao.jv.setVisible(true);
    }

    private void reporteRightJoin() {
        adao.reporteRightJoin();
        adao.jv.setDefaultCloseOperation(vista.Principal.DISPOSE_ON_CLOSE);
        adao.jv.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fma.btnAcualizar) {
            this.mostrar();
        }
        //Reporte paises con Jasper Report
        if (e.getSource() == fr.btnInnerJ) {
            this.reporteInner();
        }
        if (e.getSource() == fr.btnLeftJ) {
            this.reporteLeftJoin();
        }
        if (e.getSource() == fr.btnRightJ) {
            this.reporteRightJoin();
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
