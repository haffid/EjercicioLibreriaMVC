package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class ControladorPrincipal implements ActionListener {

    Principal vPC = new Principal();
    FrmCrearAutor1 vCA = new FrmCrearAutor1();
    FrmMostrarAutor vMA = new FrmMostrarAutor();
    FrmBuscarAutor vBA = new FrmBuscarAutor();
    FrmModificarAutor vMO = new FrmModificarAutor();
    FrmEliminarAutor vME = new FrmEliminarAutor();
    FrmInsertarLibro vCL = new FrmInsertarLibro();
    FrmMostrarLibro vML = new FrmMostrarLibro();
    FrmBuscarLibro vBL = new FrmBuscarLibro();
    FrmModificarLibro vMOL = new FrmModificarLibro();
    FrmEliminarLibro vEL = new FrmEliminarLibro();
    FrmReporte vRE = new FrmReporte();

    public ControladorPrincipal(Principal vPC, FrmCrearAutor1 vCA, FrmMostrarAutor vMA, FrmBuscarAutor vBA,
            FrmModificarAutor vMO, FrmEliminarAutor vME, FrmInsertarLibro vCL, FrmMostrarLibro vML,
            FrmBuscarLibro vBL, FrmModificarLibro vMOL, FrmEliminarLibro vEL, FrmReporte vRE) {
        this.vPC = vPC;
        this.vCA = vCA;
        this.vMA = vMA;
        this.vBA = vBA;
        this.vMO = vMO;
        this.vME = vME;
        this.vCL = vCL;
        this.vML = vML;
        this.vBL = vBL;
        this.vMOL = vMOL;
        this.vEL = vEL;
        this.vRE = vRE;
        vPC.mnuCrearA.addActionListener(this);
        vPC.mnuMostrarA.addActionListener(this);
        vPC.mnuBuscarAutor.addActionListener(this);
        vPC.mnuModificarA.addActionListener(this);
        vPC.mnuEliminarA.addActionListener(this);
        vPC.mnuCrearL.addActionListener(this);
        vPC.mnuMostrarL.addActionListener(this);
        vPC.mnuBuscarL.addActionListener(this);
        vPC.mnuModificarL.addActionListener(this);
        vPC.mnuEliminarL.addActionListener(this);
        vPC.mnuReporteJ.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vPC.mnuCrearA) {
            vCA.setVisible(true);
            vCA.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuMostrarA) {
            vMA.setVisible(true);
            vMA.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuBuscarAutor) {
            vBA.setVisible(true);
            vBA.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuModificarA) {
            vMO.setVisible(true);
            vMO.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuEliminarA) {
            vME.setVisible(true);
            vME.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuCrearL) {
            vCL.setVisible(true);
            vCL.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuMostrarL) {
            vML.setVisible(true);
            vML.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuBuscarL) {
            vBL.setVisible(true);
            vBL.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuModificarL) {
            vMOL.setVisible(true);
            vMOL.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuEliminarL) {
            vEL.setVisible(true);
            vEL.setLocationRelativeTo(vPC);
        }
        if (e.getSource() == vPC.mnuReporteJ) {
            vRE.setVisible(true);
            vRE.setLocationRelativeTo(vPC);
        }
    }

}
