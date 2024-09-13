/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pk_Vista.Preview;

import javax.swing.JOptionPane;
import pk_CRUD.Cls_Fabricante;
import pk_Modelo.Fabricante;
import pk_Modelo.Sede;
import pk_Vista.Insert.Frm_Fabricante;


/**
 *
 * @author ALAN
 */

public class Frm_FabricantePrev extends javax.swing.JFrame {
    
    private Frm_Fabricante fFabricante;
    private final Cls_Fabricante CA;
    boolean flag_insert = false;
    Fabricante f = new Fabricante();   
    private int id_sede;
    
    /**
     * Creates new form Frm_FabricantePrev
     * @param frmFabricante
     * @param fabricante
     * @param sede
     */
    public Frm_FabricantePrev(Frm_Fabricante frmFabricante, Fabricante fabricante, Sede sede) {             
        CA = new Cls_Fabricante();
        initComponents();
        setLocationRelativeTo(null);
        
        txt_PrevNombre.setText(fabricante.getFab_Nombre());
        txt_PrevSede.setText(sede.getSed_Nombre());  
        fFabricante = frmFabricante;
        f = fabricante;
        id_sede = sede.getId_Sede();
        if (f.getId_Sede() == 0) {            
            flag_insert = true;
        } else {
            flag_insert = false;
        }       
        fFabricante = frmFabricante;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Fabricante = new javax.swing.JPanel();
        txt_Titulo = new javax.swing.JLabel();
        txt_PrevNombre = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbSede = new javax.swing.JLabel();
        txt_PrevSede = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        btb_Confirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_Titulo.setText("¿Desea agregar los siguientes datos?");

        txt_PrevNombre.setText("jLabel2");

        lbNombre.setText("Nombre:");

        lbSede.setText("Sede:");

        txt_PrevSede.setText("jLabel5");

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        btb_Confirmar.setText("Confirmar");
        btb_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_ConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_FabricanteLayout = new javax.swing.GroupLayout(jp_Fabricante);
        jp_Fabricante.setLayout(jp_FabricanteLayout);
        jp_FabricanteLayout.setHorizontalGroup(
            jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_FabricanteLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txt_Titulo))
                    .addGroup(jp_FabricanteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbSede, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PrevSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_PrevNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_FabricanteLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(18, 18, 18)
                .addComponent(btb_Confirmar)
                .addGap(27, 27, 27)
                .addComponent(btnCancelar)
                .addGap(17, 17, 17))
        );
        jp_FabricanteLayout.setVerticalGroup(
            jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_Titulo)
                .addGap(36, 36, 36)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PrevNombre)
                    .addComponent(lbNombre))
                .addGap(30, 30, 30)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSede)
                    .addComponent(txt_PrevSede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btb_Confirmar)
                    .addComponent(btn_Regresar)
                    .addComponent(btnCancelar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_Fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_Fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btb_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_ConfirmarActionPerformed
        // TODO add your handling code here:        
        if (flag_insert){    
            int res = CA.insertarRegistro(f.getFab_Nombre(), id_sede);
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Registro Exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } 
            this.dispose();
            fFabricante.setVisible(true);
            fFabricante.limpiar();
        } else {
            int res = CA.actualizarRegistro(f.getId_Fabricante(),f.getFab_Nombre(), id_sede);
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito",1);
            } 
            this.dispose();
            fFabricante.limpiar(); 
            fFabricante.dispose();
        }
    }//GEN-LAST:event_btb_ConfirmarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fFabricante.setVisible(true);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fFabricante.setVisible(true);
        fFabricante.limpiar();
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
            java.util.logging.Logger.getLogger(Frm_FabricantePrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_FabricantePrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_FabricantePrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_FabricantePrev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Frm_FabricantePrev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_Confirmar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JPanel jp_Fabricante;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSede;
    private javax.swing.JLabel txt_PrevNombre;
    private javax.swing.JLabel txt_PrevSede;
    private javax.swing.JLabel txt_Titulo;
    // End of variables declaration//GEN-END:variables
}
