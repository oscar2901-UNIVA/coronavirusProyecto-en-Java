/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

/**
 *
 * @author oscarjavierpereztorres
 */
public class AdministradorPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public AdministradorPrincipal() {
        initComponents();
    }

    AdministradorPrincipal(InicioPrograma aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegPacienteAdmin = new javax.swing.JButton();
        btnListaAdministrador = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        btnRegistrarAdm = new javax.swing.JButton();
        btnFarmacia = new javax.swing.JButton();
        btnHospitales = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/giphy (1).gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        btnRegPacienteAdmin.setText("Registrar nuevo paciente");
        btnRegPacienteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPacienteAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegPacienteAdmin);
        btnRegPacienteAdmin.setBounds(220, 240, 200, 29);

        btnListaAdministrador.setText("Base de datos");
        btnListaAdministrador.setToolTipText("");
        btnListaAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaAdministrador);
        btnListaAdministrador.setBounds(210, 360, 200, 29);

        btnMenuPrincipal.setText("Regresar al menu anterior");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(30, 520, 240, 29);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir);
        BtnSalir.setBounds(370, 520, 230, 29);

        btnRegistrarAdm.setText("Registrar un nuevo administrador");
        btnRegistrarAdm.setToolTipText("");
        btnRegistrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarAdm);
        btnRegistrarAdm.setBounds(170, 209, 300, 30);

        btnFarmacia.setText("Registrar farmacias");
        btnFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFarmacia);
        btnFarmacia.setBounds(240, 270, 150, 29);

        btnHospitales.setText("Regstrar hospitales");
        btnHospitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnHospitales);
        btnHospitales.setBounds(240, 300, 150, 29);

        btnMedicamentos.setText("Registrar medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicamentos);
        btnMedicamentos.setBounds(220, 330, 180, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 150, 480, 260);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/4480cbda6fa902310834104b6adfeb6f.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 210);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 150, 480, 260);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 150, 480, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegPacienteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPacienteAdminActionPerformed
       RegistroPacienteAdministrador AltPacAdm = new RegistroPacienteAdministrador();
       AltPacAdm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegPacienteAdminActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
       InicioPrograma pri=new InicioPrograma();
       pri.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void btnListaAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAdministradorActionPerformed
        BaseDeDatosGeneral AdmB=new BaseDeDatosGeneral();
        AdmB.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaAdministradorActionPerformed

    private void btnRegistrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAdmActionPerformed
        RegistroAdministrador altAdm=new RegistroAdministrador();
        altAdm.setVisible(true);
        this.dispose();
           
    }//GEN-LAST:event_btnRegistrarAdmActionPerformed

    private void btnHospitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalesActionPerformed
      RegistroHospitales hos= new RegistroHospitales();
      hos.setVisible(true);
      this.dispose();
      
        



    }//GEN-LAST:event_btnHospitalesActionPerformed

    private void btnFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaciaActionPerformed
       
        RegistroFarmacias far= new RegistroFarmacias();
        far.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnFarmaciaActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
     
        RegistroMedicamentos med = new RegistroMedicamentos();
        med.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_btnMedicamentosActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnFarmacia;
    private javax.swing.JButton btnHospitales;
    private javax.swing.JButton btnListaAdministrador;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegPacienteAdmin;
    private javax.swing.JButton btnRegistrarAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}