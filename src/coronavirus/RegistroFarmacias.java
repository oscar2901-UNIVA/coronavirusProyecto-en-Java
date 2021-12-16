/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.ArchivoEscrituraAdministrador;
import Clases.ArchivoEscrituraFarmacias;
import Clases.LecturaDeDatos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author oscarjavierpereztorres
 */
public class RegistroFarmacias extends javax.swing.JFrame {

    /**
     * Creates new form Farmacias
     */
    public RegistroFarmacias() {
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

        Municipio = new javax.swing.ButtonGroup();
        Precios = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnSalir5 = new javax.swing.JButton();
        btnRegresarMenuPrinc = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cmbMunicipio = new javax.swing.JComboBox<>();
        cmbPrecio = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 631));
        setMixingCutoutShape(null);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Farmacias");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 100, 160, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 220, 60, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Municipio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 270, 66, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precios:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 320, 50, 16);

        txtNombre.setToolTipText("");
        getContentPane().add(txtNombre);
        txtNombre.setBounds(140, 220, 130, 26);

        btnSalir5.setText("Salir");
        btnSalir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir5);
        btnSalir5.setBounds(420, 570, 190, 29);

        btnRegresarMenuPrinc.setText("Regresar al menu anterior");
        btnRegresarMenuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuPrincActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenuPrinc);
        btnRegresarMenuPrinc.setBounds(0, 570, 230, 29);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(270, 520, 93, 29);

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Zapopan", "Guadalajara", "Tlaquepaque", "El salto", "Ixtlahuacan", "Tlajomulco de zuñiga", "Juanacatlan", "Tonala", "Zapotlanejo" }));
        getContentPane().add(cmbMunicipio);
        cmbMunicipio.setBounds(140, 260, 130, 30);

        cmbPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Muy accesible", "Accesible", "Caros" }));
        cmbPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPrecio);
        cmbPrecio.setBounds(140, 310, 130, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(230, 570, 190, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        jLabel5.setMinimumSize(new java.awt.Dimension(632, 636));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir5ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalir5ActionPerformed

    private void btnRegresarMenuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuPrincActionPerformed
       AdministradorPrincipal adm=new AdministradorPrincipal();
       adm.setVisible(true);
    this.dispose();;
    }//GEN-LAST:event_btnRegresarMenuPrincActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
//    
//     ArchivoEscrituraFarmacias escFar= new ArchivoEscrituraFarmacias();
//       
//       
//      
//       escFar.setNombreFarmacia(txtNombreFarmacia.getText());
//       escFar.setMunicipio(cmbMunicipio.getSelectedItem().toString());
//       escFar.setPrecio(cmbPrecio.getSelectedItem().toString());
//      
//        
//        try{
//            if(escFar.save()){ // Se llama la funcion guardar de alumno
//            
//            JOptionPane.showMessageDialog(this,"La farmacia fue registrado exitosamente");
//            
//            txtNombreFarmacia.setText("");
//           
//            
//            }
//        }catch (Exception e) {
//             System.out.println("Error ");





      List<ArchivoEscrituraFarmacias> listaFarmacias= new ArrayList<>();
         LecturaDeDatos fr=new LecturaDeDatos();
         listaFarmacias=fr.ObtenerFarmacias();
        
        if(fr.BuscarFarmacia(txtNombre.getText())!=-1){
            JOptionPane.showMessageDialog(this,"No se pudo agregar la farmacia ya existe" );
        }else{
            ArchivoEscrituraFarmacias FarmaciaTemp=new ArchivoEscrituraFarmacias();
            FarmaciaTemp.setNombreFarmacia(txtNombre.getText());
            FarmaciaTemp.setMunicipio(cmbMunicipio.getSelectedItem().toString());
            FarmaciaTemp.setPrecio(cmbPrecio.getSelectedItem().toString());
            
            FarmaciaTemp.GuardarFarmacia2();
            JOptionPane.showMessageDialog(this,"La farmacia fue registrada exitosamente");
            int id=listaFarmacias.size()+1;
        }
        txtNombre.setText("");

       
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFarmacias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Municipio;
    private javax.swing.ButtonGroup Precios;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresarMenuPrinc;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
