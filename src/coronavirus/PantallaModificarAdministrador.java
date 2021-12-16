/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.ArchivoEscrituraAdministrador;
import Clases.ArchivoEscrituraPaciente;
import Clases.LecturaDeDatos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author apple
 */
public class PantallaModificarAdministrador extends javax.swing.JFrame {

    int index;
    BaseDeDatosGeneral administradorbasededatos;
    
    public PantallaModificarAdministrador(int idx,BaseDeDatosGeneral pA) {
        administradorbasededatos = pA;
        initComponents();
        index=idx;
        List<ArchivoEscrituraAdministrador> ListaAdministradores= new ArrayList<>();
        ListaAdministradores = new LecturaDeDatos().ObtenerAdministrador();
        
        txtUsuarioAdm.setText(String.valueOf(ListaAdministradores.get(idx).getNombre()));
        txtpasword.setText(String.valueOf(ListaAdministradores.get(idx).getPassword()));
       
      }
  
            
    public PantallaModificarAdministrador() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioAdm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnModificarAdm = new javax.swing.JButton();
        txtpasword = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 320, 56, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 350, 80, 16);
        getContentPane().add(txtUsuarioAdm);
        txtUsuarioAdm.setBounds(250, 320, 130, 26);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar administrador");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 180, 290, 40);

        btnModificarAdm.setText("Modificar");
        btnModificarAdm.setToolTipText("");
        btnModificarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarAdm);
        btnModificarAdm.setBounds(100, 530, 150, 29);
        getContentPane().add(txtpasword);
        txtpasword.setBounds(250, 350, 130, 26);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(390, 530, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAdmActionPerformed
        //        Crear();
 List<ArchivoEscrituraAdministrador> listaAdministrador= new ArrayList<>();
        LecturaDeDatos LD = new LecturaDeDatos();
//        
        listaAdministrador =LD.ObtenerAdministrador();
//        
        ArchivoEscrituraAdministrador AdministradorTemp = new ArchivoEscrituraAdministrador();
        AdministradorTemp.setNombre(txtUsuarioAdm.getText());
        AdministradorTemp.setPassword(txtpasword.getText());
//        
        AdministradorTemp.GuardarAdministrador2();
        listaAdministrador.set(index, AdministradorTemp);
        listaAdministrador.get(index).BorrarAdministrador();
        for (Iterator<ArchivoEscrituraAdministrador> iterator = listaAdministrador.iterator(); iterator.hasNext();) {
            ArchivoEscrituraAdministrador next = iterator.next();
            next.GuardarAdministrador2();
        }
            
       administradorbasededatos.TablaAdminstradores();
        
        dispose();
    
     
    }//GEN-LAST:event_btnModificarAdmActionPerformed
//  
    
    
    
    
    
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaModificarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaModificarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUsuarioAdm;
    private javax.swing.JPasswordField txtpasword;
    // End of variables declaration//GEN-END:variables
}