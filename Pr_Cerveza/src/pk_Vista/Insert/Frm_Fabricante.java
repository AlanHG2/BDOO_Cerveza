
package pk_Vista.Insert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pk_CRUD.Cls_Fabricante;
import pk_CRUD.Cls_Sede;
import pk_Modelo.Sede;


public class Frm_Fabricante extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Fabricante
     */ 
    ArrayList<Sede> list;
    private final Cls_Fabricante CA;
    public Frm_Fabricante() {
        initComponents();
        setTitle("Registro de Fabricantes");
        setLocationRelativeTo(null);
        
        llenarSedes();
        CA = new Cls_Fabricante();
    }
    private void llenarSedes(){
//        Instancia la clase controladora (de pk_Crud)
        Cls_Sede o=new Cls_Sede();
//        Almacena el arraylist obtenido de getsedes en list
        list =o.getSedes();
//        se recorre el arraylist para añadir los elementos de "nombre" de cada índice de la lista al combobox
        for(int i=0; i<list.size();i++){
            Sede s=list.get(i);
            cb_Sede.addItem(s.getSed_Nombre()); //aquí necesita más detalles
        }
        cb_Sede.setSelectedIndex(-1);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        cb_Sede = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Sede");

        cb_Sede.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_SedeItemStateChanged(evt);
            }
        });
        cb_Sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SedeActionPerformed(evt);
            }
        });

        jLabel3.setText("Fabricante");

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_FabricanteLayout = new javax.swing.GroupLayout(jp_Fabricante);
        jp_Fabricante.setLayout(jp_FabricanteLayout);
        jp_FabricanteLayout.setHorizontalGroup(
            jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_FabricanteLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre)
                            .addComponent(cb_Sede, 0, 196, Short.MAX_VALUE)))
                    .addGroup(jp_FabricanteLayout.createSequentialGroup()
                        .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel3))
                            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btn_Agregar)))
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_FabricanteLayout.setVerticalGroup(
            jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_FabricanteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jp_FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_SedeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_SedeItemStateChanged
        
    }//GEN-LAST:event_cb_SedeItemStateChanged

    private void cb_SedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SedeActionPerformed
//        Para seleccionar el id del elemento seleccionado en el combobox
//        Sede s=list.get(cb_Sede.getSelectedIndex());
//        System.out.println("Id seleccionado:"+s.getId_Sede());
    }//GEN-LAST:event_cb_SedeActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String nombre=txt_Nombre.getText();
        Sede s=list.get(cb_Sede.getSelectedIndex());
        int id_sede=s.getId_Sede();
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id_sede < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una sede", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int res = CA.insertarDatos(nombre, id_sede);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        int res = CA.insertarDatos(nombre,id_sede);

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
            java.util.logging.Logger.getLogger(Frm_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Fabricante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JComboBox<String> cb_Sede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jp_Fabricante;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
