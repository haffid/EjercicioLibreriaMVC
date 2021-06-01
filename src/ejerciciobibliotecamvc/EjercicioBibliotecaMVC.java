package ejerciciobibliotecamvc;

import controlador.ControladorBuscarAutor;
import controlador.ControladorBuscarLibro;
import controlador.ControladorEliminarAutor;
import controlador.ControladorEliminarLibro;
import controlador.ControladorInsertarAutor;
import controlador.ControladorInsertarLibro;
import controlador.ControladorModificarAutor;
import controlador.ControladorModificarLibro;
import controlador.ControladorMostrarAutor;
import controlador.ControladorMostrarLibro;
import controlador.ControladorPrincipal;
import static java.awt.Frame.MAXIMIZED_BOTH;
import modelo.AutorDAO;
import modelo.AutorVO;
import modelo.LibroDAO;
import modelo.LibroVO;
import vista.FrmBuscarAutor;
import vista.FrmBuscarLibro;
import vista.FrmCrearAutor;
import vista.FrmCrearAutor1;
import vista.FrmEliminarAutor;
import vista.FrmEliminarLibro;
import vista.FrmInsertarLibro;
import vista.FrmModificarAutor;
import vista.FrmModificarLibro;
import vista.FrmMostrarAutor;
import vista.FrmMostrarLibro;
import vista.FrmReporte;
import vista.Principal;

public class EjercicioBibliotecaMVC {

    public static void main(String[] args) {
        Principal a = new Principal();
        FrmCrearAutor1 ca = new FrmCrearAutor1();
        FrmMostrarAutor ma = new FrmMostrarAutor();
        FrmBuscarAutor ba = new FrmBuscarAutor();
        FrmModificarAutor mo = new FrmModificarAutor();
        FrmEliminarAutor me = new FrmEliminarAutor();
        FrmInsertarLibro cl = new FrmInsertarLibro();
        FrmMostrarLibro ml = new FrmMostrarLibro();
        FrmBuscarLibro bl = new FrmBuscarLibro();
        FrmModificarLibro mol = new FrmModificarLibro();
        FrmEliminarLibro fme = new FrmEliminarLibro();
        FrmReporte fr = new FrmReporte();
        AutorVO avo = new AutorVO();
        AutorDAO adao = new AutorDAO();
        ControladorPrincipal cp = new ControladorPrincipal(a, ca, ma, ba, mo, me, cl, ml, bl, mol, fme, fr);
        ControladorInsertarAutor cia = new ControladorInsertarAutor(ca, avo, adao);
        ControladorMostrarAutor cma = new ControladorMostrarAutor(ma, avo, adao, fr);
        ControladorBuscarAutor cba = new ControladorBuscarAutor(ba, avo, adao);
        ControladorModificarAutor cmo = new ControladorModificarAutor(mo, avo, adao);
        ControladorEliminarAutor cme = new ControladorEliminarAutor(me, avo, adao);
        LibroVO lvo = new LibroVO();
        LibroDAO ldao = new LibroDAO();
        ControladorInsertarLibro cil = new ControladorInsertarLibro(cl, lvo, ldao);
        ControladorMostrarLibro cml = new ControladorMostrarLibro(ml, lvo, ldao);
        ControladorBuscarLibro cbl = new ControladorBuscarLibro(bl, lvo, ldao);
        ControladorModificarLibro cmol = new ControladorModificarLibro(mol, lvo, ldao);
        ControladorEliminarLibro cel = new ControladorEliminarLibro(fme, lvo, ldao);
        a.setVisible(true);
        a.setExtendedState(MAXIMIZED_BOTH);
    }
}
