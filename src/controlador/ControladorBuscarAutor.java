package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import modelo.AutorDAO;
import modelo.AutorVO;
import vista.FrmBuscarAutor;

public class ControladorBuscarAutor implements ActionListener, KeyListener {

    FrmBuscarAutor fba = new FrmBuscarAutor();
    AutorVO avo = new AutorVO();
    AutorDAO adao = new AutorDAO();

    public ControladorBuscarAutor(FrmBuscarAutor fba, AutorVO avo, AutorDAO adao) {
        this.fba = fba;
        this.avo = avo;
        this.adao = adao;

        fba.btnBuscarID.addActionListener(this);
        fba.txtBuscarID.addKeyListener(this);
    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        AutorVO pvo = new AutorVO();
        avo.setNombre_autora(fba.txtBuscarID.getText());
        m.setColumnCount(0);
        m.addColumn("DPI Autor");
        m.addColumn("Nombre del Autor");
        m.addColumn("Apellido del Autor");
        m.addColumn("Edad del Autor");
        m.addColumn("Direccion del Autor");
        m.addColumn("ID Libro del Autor");

        for (AutorVO v : this.adao.consultar(avo)) {
            m.addRow(new Object[]{v.getDpi_autor(), v.getNombre_autora(), v.getApellido_autor(), v.getEdad_autor(), v.getDireccion_autor(), v.getId_libro_fk()});
        }
        fba.tblBuscarID.setModel(m);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fba.btnBuscarID) {
            this.mostrar();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.mostrar();
    }

}
