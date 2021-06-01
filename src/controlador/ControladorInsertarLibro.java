package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.LibroDAO;
import modelo.LibroVO;
import vista.FrmInsertarLibro;

public class ControladorInsertarLibro implements ActionListener {

    LibroVO lvo = new LibroVO();
    LibroDAO ldao = new LibroDAO();
    FrmInsertarLibro vista = new FrmInsertarLibro();

    public ControladorInsertarLibro(FrmInsertarLibro cl, LibroVO lv, LibroDAO ld) {
        this.vista = cl;
        this.lvo = lv;
        this.ldao = ld;
        vista.btnInsertarL.addActionListener(this);
    }
        public void limpiar() {
        vista.txtNombreL.setText(null);
        vista.txtAnioL.setText(null);
        vista.txtNombreL.requestFocus();
    }

    private void insertarLibro() {
        lvo.setNombre_libro(vista.txtNombreL.getText());
        lvo.setAnio_libro(Integer.parseInt(vista.txtAnioL.getText()));
        ldao.insertar(lvo);
        JOptionPane.showMessageDialog(null, "Libro Insertado Correctamente");
        limpiar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnInsertarL) {
            this.insertarLibro();
        }
    }

}
