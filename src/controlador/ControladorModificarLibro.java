package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.LibroDAO;
import modelo.LibroVO;

import vista.FrmModificarLibro;

public class ControladorModificarLibro implements ActionListener, MouseListener, WindowListener {

    FrmModificarLibro fml = new FrmModificarLibro();
    LibroVO lvo = new LibroVO();
    LibroDAO ldao = new LibroDAO();

    public ControladorModificarLibro(FrmModificarLibro fml, LibroVO lvo, LibroDAO ldao) {
        this.fml = fml;
        this.lvo = lvo;
        this.ldao = ldao;
        fml.btnModificarInfo.addActionListener(this);
        fml.addWindowListener(this);
        fml.addMouseListener(this);
        fml.tblModificar.addMouseListener(this);
    }

    public void limpiar() {
        fml.txtNombreL.setText(null);
        fml.txtAnioL.setText(null);
        fml.txtNombreL.requestFocus();
    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("Id Libro");
        m.addColumn("Nombre Libro");
        m.addColumn("Anio Libro");

        for (LibroVO v : this.ldao.consultarTablaLibro()) {
            m.addRow(new Object[]{v.getId_libro(), v.getNombre_libro(), v.getAnio_libro()});
        }
        fml.tblModificar.setModel(m);
    }

    private void agregarDatos() {
        int seleccion;
        seleccion = fml.tblModificar.getSelectedRow();
        lvo.setId_libro((int) fml.tblModificar.getValueAt(seleccion, 0));
        fml.txtNombreL.setText(String.valueOf(fml.tblModificar.getValueAt(seleccion, 1)));
        fml.txtAnioL.setText(String.valueOf(fml.tblModificar.getValueAt(seleccion, 2)));
    }

    private void modificar() {
        lvo.getId_libro();
        lvo.setNombre_libro(fml.txtNombreL.getText());
        lvo.setAnio_libro(Integer.parseInt(fml.txtAnioL.getText()));
        ldao.modificar(lvo);
        JOptionPane.showMessageDialog(null, "Libro Modificado Correctamente");
        limpiar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fml.btnModificarInfo) {
            this.modificar();
            this.mostrar();

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.agregarDatos();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

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
