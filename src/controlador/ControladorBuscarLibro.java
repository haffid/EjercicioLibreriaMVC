package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import modelo.LibroDAO;
import modelo.LibroVO;
import vista.FrmBuscarLibro;

public class ControladorBuscarLibro implements ActionListener, KeyListener {

    FrmBuscarLibro fbl = new FrmBuscarLibro();
    LibroVO lvo = new LibroVO();
    LibroDAO ldao = new LibroDAO();

    public ControladorBuscarLibro(FrmBuscarLibro fbl, LibroVO lvo, LibroDAO ldao) {
        this.fbl = fbl;
        this.lvo = lvo;
        this.ldao = ldao;
        fbl.btnBuscarID.addActionListener(this);
        fbl.txtBuscarID.addKeyListener(this);
    }
    
    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        LibroVO lvo = new LibroVO();
        lvo.setNombre_libro(fbl.txtBuscarID.getText());
        m.setColumnCount(0);
        m.addColumn("ID Libro");
        m.addColumn("Nombre del Libro");
        m.addColumn("Anio del Libro");

        for (LibroVO v : this.ldao.consultar(lvo)) {
            m.addRow(new Object[]{v.getId_libro(), v.getNombre_libro(), v.getAnio_libro()});
        }
        fbl.tblBuscarID.setModel(m);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fbl.btnBuscarID) {
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
