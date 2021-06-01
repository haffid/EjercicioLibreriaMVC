package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AutorDAO;
import modelo.AutorVO;
import vista.FrmEliminarAutor;

public class ControladorEliminarAutor implements ActionListener, MouseListener, WindowListener {

    FrmEliminarAutor fme = new FrmEliminarAutor();
    AutorVO evo = new AutorVO();
    AutorDAO edao = new AutorDAO();

    public ControladorEliminarAutor(FrmEliminarAutor fme, AutorVO evo, AutorDAO edao) {
        this.fme = fme;
        this.evo = evo;
        this.edao = edao;

        fme.btnEliminarInfo.addActionListener(this);
        fme.addWindowListener(this);
        fme.addMouseListener(this);
        fme.tblModificar.addMouseListener(this);
    }
        public void limpiar() {
        fme.txtNombreA.setText(null);
        fme.txtApellidoA.setText(null);
        fme.txtEdadA.setText(null);
        fme.txtDireccionA.setText(null);
        fme.txtLibroA.setText(null);
        fme.txtNombreA.requestFocus();
    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("Id");
        m.addColumn("Nombre");
        m.addColumn("Apellido");
        m.addColumn("Edad");
        m.addColumn("Direccion");
        m.addColumn("ID Libro");

        for (AutorVO v : this.edao.consultarTablaAutor()) {
            m.addRow(new Object[]{v.getDpi_autor(), v.getNombre_autora(), v.getApellido_autor(), v.getEdad_autor(), v.getDireccion_autor(), v.getId_libro_fk()});
        }
        fme.tblModificar.setModel(m);
    }

    private void agregarDatos() {
        int seleccion;
        seleccion = fme.tblModificar.getSelectedRow();
        evo.setDpi_autor((int) fme.tblModificar.getValueAt(seleccion, 0));
        fme.txtNombreA.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 1)));
        fme.txtApellidoA.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 2)));
        fme.txtEdadA.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 3)));
        fme.txtDireccionA.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 4)));
        fme.txtLibroA.setText(String.valueOf(fme.tblModificar.getValueAt(seleccion, 5)));

    }

    private void eliminar() {
        evo.getDpi_autor();
//        evo.setNombre_autora(fme.txtNombreA.getText());
//        evo.setApellido_autor(fme.txtApellidoA.getText());
//        evo.setEdad_autor(Integer.parseInt(fme.txtEdadA.getText()));
//        evo.setDireccion_autor(fme.txtDireccionA.getText());
//        evo.setId_libro_fk(Integer.parseInt(fme.txtLibroA.getText()));
        edao.eliminar(evo);
        JOptionPane.showMessageDialog(null, "Autor Eliminado Correctamente");
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
