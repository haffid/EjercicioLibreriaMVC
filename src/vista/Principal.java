/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author haffi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCrearA = new javax.swing.JMenuItem();
        mnuMostrarA = new javax.swing.JMenuItem();
        mnuBuscarAutor = new javax.swing.JMenuItem();
        mnuModificarA = new javax.swing.JMenuItem();
        mnuEliminarA = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCrearL = new javax.swing.JMenuItem();
        mnuMostrarL = new javax.swing.JMenuItem();
        mnuBuscarL = new javax.swing.JMenuItem();
        mnuModificarL = new javax.swing.JMenuItem();
        mnuEliminarL = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        mnuReporteJ = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/autor.png"))); // NOI18N
        jMenu1.setText("   Autor    ");

        mnuCrearA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuCrearA.setText("Crear Autor");
        jMenu1.add(mnuCrearA);

        mnuMostrarA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuMostrarA.setText("Mostrar Autor");
        jMenu1.add(mnuMostrarA);

        mnuBuscarAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuBuscarAutor.setText("Buscar Autor");
        jMenu1.add(mnuBuscarAutor);

        mnuModificarA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuModificarA.setText("Modificar Autor");
        jMenu1.add(mnuModificarA);

        mnuEliminarA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuEliminarA.setText("Eliminar Autor");
        jMenu1.add(mnuEliminarA);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jMenu2.setText("   Libro   ");

        mnuCrearL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuCrearL.setText("Crear Libro");
        jMenu2.add(mnuCrearL);

        mnuMostrarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuMostrarL.setText("Mostrar Libros");
        mnuMostrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMostrarLActionPerformed(evt);
            }
        });
        jMenu2.add(mnuMostrarL);

        mnuBuscarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuBuscarL.setText("Bucar Libro");
        jMenu2.add(mnuBuscarL);

        mnuModificarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuModificarL.setText("Modificar Libro");
        jMenu2.add(mnuModificarL);

        mnuEliminarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuEliminarL.setText("Eliminar Libro");
        jMenu2.add(mnuEliminarL);
        jMenu2.add(jSeparator1);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        jMenu3.setText("Reportes");

        mnuReporteJ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuReporteJ.setText("Reportes JOIN");
        jMenu3.add(mnuReporteJ);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMostrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMostrarLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JMenuItem mnuBuscarAutor;
    public javax.swing.JMenuItem mnuBuscarL;
    public javax.swing.JMenuItem mnuCrearA;
    public javax.swing.JMenuItem mnuCrearL;
    public javax.swing.JMenuItem mnuEliminarA;
    public javax.swing.JMenuItem mnuEliminarL;
    public javax.swing.JMenuItem mnuModificarA;
    public javax.swing.JMenuItem mnuModificarL;
    public javax.swing.JMenuItem mnuMostrarA;
    public javax.swing.JMenuItem mnuMostrarL;
    public javax.swing.JMenuItem mnuReporteJ;
    // End of variables declaration//GEN-END:variables
}
