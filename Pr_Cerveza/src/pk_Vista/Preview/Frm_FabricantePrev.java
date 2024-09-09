/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pk_Vista.Preview;

import javax.swing.JOptionPane;
import pk_CRUD.Cls_Fabricante;
import pk_Modelo.Sede;


/**
 *
 * @author ALAN
 */

public class Frm_FabricantePrev extends javax.swing.JFrame {

    private final Cls_Fabricante CA;
    
    /**
     * Creates new form Frm_FabricantePrev
     */
    public Frm_FabricantePrev(String nombre, int id_sede ) {      
        initComponents();
        txt_Nombre.setText(nombre);
        txt_Sede.setText(String.valueOf(id_sede));
        setLocationRelativeTo(null);
        CA = new Cls_Fabricante();
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
        txt_Nombre = new javax.swing.JLabel();
        txt_Sede = new javax.swing.JLabel();
        txt_PrevSede = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        btb_Confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Titulo.setText("¿Desea agregar los siguientes datos?");

        txt_PrevNombre.setText("jLabel2");

        txt_Nombre.setText("Nombre:");

        txt_Sede.setText("Sede:");

        txt_PrevSede.setText("jLabel5");

        btn_Regresar.setText("Regresar");

        btb_Confirmar.setText("Confirmar");
        btb_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_ConfirmarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");

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
                            .addComponent(txt_Nombre)
                            .addComponent(txt_Sede, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PrevSede, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PrevNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_FabricanteLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(18, 18, 18)
                .addComponent(btb_Confirmar)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
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
                    .addComponent(txt_Nombre))
                .addGap(30, 30, 30)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Sede)
                    .addComponent(txt_PrevSede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btb_Confirmar)
                    .addComponent(btn_Regresar)
                    .addComponent(jButton1))
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
        String nombre = txt_Nombre.getText();
        int id_sede = Integer.parseInt(txt_Sede.getText());
        
        try{
            int res = CA.insertarDatos(nombre, id_sede);
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Registro Exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
       
        
    }//GEN-LAST:event_btb_ConfirmarActionPerformed

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
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jp_Fabricante;
    private javax.swing.JLabel txt_Nombre;
    private javax.swing.JLabel txt_PrevNombre;
    private javax.swing.JLabel txt_PrevSede;
    private javax.swing.JLabel txt_Sede;
    private javax.swing.JLabel txt_Titulo;
    // End of variables declaration//GEN-END:variables
}
