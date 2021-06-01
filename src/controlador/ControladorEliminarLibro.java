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
import vista.FrmEliminarLibro;

public class ControladorEliminarLibro implements ActionListener, MouseListener, WindowListener {

    FrmEliminarLibro fme = new FrmEliminarLibro();
    LibroVO lvo = new LibroVO();
    LibroDAO ldao = new LibroDAO();

    public ControladorEliminarLibro(FrmEliminarLibro fme, LibroVO lvo, LibroDAO ldao) {
        this.fme = fme;
        this.lvo = lvo;
        this.ldao = ldao;
        fme.btnEliminarInfo.addActionListener(this);
        fme.addWindowListener(this);
        fme.addMouseListener(this);
        fme.tblModificar.addMouseListener(this);
    }

    public void limpiar() {
        fme.txtNombreL.setText(null);
        fme.txtAnioL.setText(null);
        fme.txtNombreL.requestFocus();
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
        fme.tblModificar.setModel(m);
    }

    private void agregarDatos() {
        int seleccion;
        seleccion = fme.tblModificar.getSelectedRow();
        lvo.setId_libro((int) fme.tblModificar.getValueAt(seleccion, 0));
        fme.txtNombreL.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 1)));
        fme.txtAnioL.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 2)));
    }

    private void eliminar() {
        lvo.getId_libro();
//        evo.setNombre_autora(fme.txtNombreA.getText());
//        evo.setApellido_autor(fme.txtApellidoA.getText());
//        evo.setEdad_autor(Integer.parseInt(fme.txtEdadA.getText()));
//        evo.setDireccion_autor(fme.txtDireccionA.getText());
//        evo.setId_libro_fk(Integer.parseInt(fme.txtLibroA.getText()));
        ldao.eliminar(lvo);
        JOptionPane.showMessageDialog(null, "Libro Eliminado Correctamente");
        limpiar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fme.btnEliminarInfo) {
            this.eliminar();
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
