/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pk_Vista.Insert;

import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pk_CRUD.Cls_Cerveza;
import pk_Modelo.Cerveza;
import pk_Modelo.Lote;
import pk_Vista.Preview.Frm_LotePrev;

/**
 *
 * @author jadey
 */
public class Frm_Lote extends javax.swing.JFrame {

    
    ArrayList<Cerveza> list;
    
    /**
     * Creates new form Frm_Lote
     */
    public Frm_Lote() {
        initComponents();
        setLocationRelativeTo(null);
        
        llenarCerveza();
    }
    
    private void llenarCerveza(){
         list=new Cls_Cerveza().getCervezas();
        for (int i = 0; i < list.size(); i++) {
            Cerveza c =list.get(i);
            cmb_Cerveza.addItem(c.getCer_Nombre());
        }
        cmb_Cerveza.setSelectedIndex(-1);
    }
    
    public void limpiar(){
        cmb_Cerveza.setSelectedIndex(-1);
        date_Produccion.setDate(null);
        date_Caducidad.setDate(null);
        txt_Cantidad.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date_Produccion = new com.toedter.calendar.JDateChooser();
        date_Caducidad = new com.toedter.calendar.JDateChooser();
        txt_Cantidad = new javax.swing.JTextField();
        cmb_Cerveza = new javax.swing.JComboBox<>();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cerveza:");

        jLabel2.setText("Fecha de Produccion:");

        jLabel3.setText("Fecha de caducidad:");

        jLabel4.setText("Cantidad:");

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Agregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_Caducidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Cantidad)
                            .addComponent(cmb_Cerveza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_Produccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_Cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(date_Produccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
        int cantidad = 0;
        String cantidadtxt = txt_Cantidad.getText();
        Date fech_prod = (Date) date_Produccion.getDate();
        Date fech_cadu = (Date) date_Caducidad.getDate();
        int id = cmb_Cerveza.getSelectedIndex();
        StringBuilder mensajeError = new StringBuilder();

        // Validación de selección de cerveza
        if (id == -1) {
            mensajeError.append("Debe seleccionar una cerveza válida.\n");
        } else {
            Cerveza m = list.get(id);
            if (m.getId_Cerveza() < 0) {
                mensajeError.append("La cerveza seleccionada no es válida.\n");
            }
        }

        // Validación de cantidad
        if (cantidadtxt.isEmpty()) {
            mensajeError.append("El campo de cantidad no puede estar vacío.\n");
        } else {
            try {
                cantidad = Integer.parseInt(cantidadtxt);

                if (cantidad <= 0) {
                    mensajeError.append("La cantidad no puede ser negativa o nula.\n");
                }
            } catch (NumberFormatException e) {
                mensajeError.append("El valor de cantidad debe ser un número entero válido.\n");
            }
        }

        // Validación de fechas
        if (fech_prod == null) {
            mensajeError.append("Debe ingresar una fecha de producción.\n");
        }
        if (fech_cadu == null) {
            mensajeError.append("Debe ingresar una fecha de caducidad.\n");
        }
        if (fech_prod != null && fech_cadu != null) {
            if (fech_prod.after(fech_cadu)) {
                mensajeError.append("La fecha de producción no puede ser posterior a la fecha de caducidad.\n");
            }

            // Validar que la fecha de producción no esté en el futuro
            Date fechaActual = new Date();
            if (fech_prod.after(fechaActual)) {
                mensajeError.append("La fecha de producción no puede estar en el futuro.\n");
            }
        }

        // Mostrar mensajes de error si existen
        if (mensajeError.length() > 0) {
            JOptionPane.showMessageDialog(null, mensajeError.toString(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            java.sql.Date prod = new java.sql.Date(fech_prod.getTime());
            java.sql.Date cadu = new java.sql.Date(fech_cadu.getTime());
            
            
            int id_cerveza = list.get(id).getId_Cerveza();
            String nombreCerveza = (String) cmb_Cerveza.getSelectedItem();
            Lote lote = new Lote(0,id_cerveza,prod,
                    cadu,cantidad);
            Frm_LotePrev preview = new Frm_LotePrev(this, lote, nombreCerveza);
            
            preview.setVisible(true);
            this.setVisible(false);  
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Lote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Lote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Lote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Lote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Lote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JComboBox<String> cmb_Cerveza;
    private com.toedter.calendar.JDateChooser date_Caducidad;
    private com.toedter.calendar.JDateChooser date_Produccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txt_Cantidad;
    // End of variables declaration//GEN-END:variables
}
