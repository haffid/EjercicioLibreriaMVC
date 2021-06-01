package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.AutorDAO;
import modelo.AutorVO;
import vista.FrmCrearAutor1;

public class ControladorInsertarAutor implements ActionListener {

    AutorVO avo = new AutorVO();
    AutorDAO adao = new AutorDAO();
    FrmCrearAutor1 vista = new FrmCrearAutor1();

    public ControladorInsertarAutor(FrmCrearAutor1 ca, AutorVO av, AutorDAO ad) {
        this.vista = ca;
        this.avo = av;
        this.adao = ad;
        vista.btnCrearAutor.addActionListener(this);
    }

    public void limpiar() {
        vista.txtNombreAutor.setText(null);
        vista.txtApellidoAutor.setText(null);
        vista.txtEdadAutor.setText(null);
        vista.txtDireccionAutor.setText(null);
        vista.txtIdLibrofk.setText(null);
        vista.txtIdLibrofk.requestFocus();
    }

    private void insertarAutor() {
        avo.setNombre_autora(vista.txtNombreAutor.getText());
        avo.setApellido_autor(vista.txtApellidoAutor.getText());
        avo.setEdad_autor(Integer.parseInt(vista.txtEdadAutor.getText()));
        avo.setDireccion_autor(vista.txtDireccionAutor.getText());
        avo.setId_libro_fk(Integer.parseInt(vista.txtIdLibrofk.getText()));
        adao.insertar(avo);
        JOptionPane.showMessageDialog(null, "Autor Insertado Correctamente");
        limpiar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCrearAutor) {
            this.insertarAutor();
        }
    }

}
