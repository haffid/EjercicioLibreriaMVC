package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.LibroDAO;
import modelo.LibroVO;
import vista.FrmMostrarLibro;

public class ControladorMostrarLibro implements ActionListener, WindowListener {

    FrmMostrarLibro fml = new FrmMostrarLibro();
    LibroVO lvo = new LibroVO();
    LibroDAO ldao = new LibroDAO();

    public ControladorMostrarLibro(FrmMostrarLibro fml, LibroVO lvo, LibroDAO ldao) {

        this.fml = fml;
        this.lvo = lvo;
        this.ldao = ldao;
        fml.addWindowListener(this);
        fml.btnAcualizar.addActionListener(this);
        //Boton Reporte paises con Jasper Report
//        fma.btnReporte.addActionListener(this);

    }

    private void mostrar() {

        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("ID Libro");
        m.addColumn("Nombre del Libro");
        m.addColumn("Anio del Libro");
        for (LibroVO v : this.ldao.consultarTablaLibro()) {
            m.addRow(new Object[]{v.getId_libro(), v.getNombre_libro(), v.getAnio_libro()});
        }
        fml.tblMostrar.setModel(m);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fml.btnAcualizar) {
            this.mostrar();
        }
        //Reporte paises con Jasper Report
//        if (e.getSource() == fma.btnReporte) {
//            this.reporte();
//        }
    }

//    private void reporte() {
//        adao.reporte();
//        pdao.jv.setDefaultCloseOperation(vista.Frm_Mostrar.DISPOSE_ON_CLOSE);
//        pdao.jv.setVisible(true);
//    }
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
