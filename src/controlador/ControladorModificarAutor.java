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

import vista.FrmModificarAutor;

public class ControladorModificarAutor implements ActionListener, MouseListener, WindowListener {

    FrmModificarAutor fma = new FrmModificarAutor();
    AutorVO avo = new AutorVO();
    AutorDAO adao = new AutorDAO();

    public ControladorModificarAutor(FrmModificarAutor fma, AutorVO avo, AutorDAO adao) {
        this.fma = fma;
        this.avo = avo;
        this.adao = adao;

        fma.btnModificarInfo.addActionListener(this);
        fma.addWindowListener(this);
        fma.addMouseListener(this);
        fma.tblModificar.addMouseListener(this);
    }

    public void limpiar() {
        fma.txtNombreA.setText(null);
        fma.txtApellidoA.setText(null);
        fma.txtEdadA.setText(null);
        fma.txtDireccionA.setText(null);
        fma.txtLibroA.setText(null);
        fma.txtNombreA.requestFocus();
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
        for (AutorVO v : this.adao.consultarTablaAutor()) {
            m.addRow(new Object[]{v.getDpi_autor(), v.getNombre_autora(), v.getApellido_autor(), v.getEdad_autor(), v.getDireccion_autor(), v.getId_libro_fk()});
        }
        fma.tblModificar.setModel(m);
    }

    private void agregarDatos() {
        int seleccion;
        seleccion = fma.tblModificar.getSelectedRow();
        avo.setDpi_autor((int) fma.tblModificar.getValueAt(seleccion, 0));
        fma.txtNombreA.setText(String.valueOf(fma.tblModificar.getValueAt(seleccion, 1)));
        fma.txtApellidoA.setText(String.valueOf(fma.tblModificar.getValueAt(seleccion, 2)));
        fma.txtEdadA.setText(String.valueOf(fma.tblModificar.getValueAt(seleccion, 3)));
        fma.txtDireccionA.setText(String.valueOf(fma.tblModificar.getValueAt(seleccion, 4)));
        fma.txtLibroA.setText(String.valueOf(fma.tblModificar.getValueAt(seleccion, 5)));
    }

    private void modificar() {
        avo.getDpi_autor();
        avo.setNombre_autora(fma.txtNombreA.getText());
        avo.setApellido_autor(fma.txtApellidoA.getText());
        avo.setEdad_autor(Integer.parseInt(fma.txtEdadA.getText()));
        avo.setDireccion_autor(fma.txtDireccionA.getText());
        avo.setId_libro_fk(Integer.parseInt(fma.txtLibroA.getText()));
        adao.modificar(avo);
        JOptionPane.showMessageDialog(null, "Autor Modificado Correctamente");
        limpiar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fma.btnModificarInfo) {
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
