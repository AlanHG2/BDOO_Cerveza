
package pk_Vista.Insert;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pk_CRUD.Cls_Cerveza;
import pk_CRUD.Cls_Marca;
import pk_Modelo.Cerveza;
import pk_Modelo.Marca;
import pk_Vista.Preview.Frm_CervezaPrev;


public class Frm_Cerveza extends javax.swing.JFrame {

    
    ArrayList<Marca> list;
    private final Cls_Cerveza CA;
    private Cerveza c = null;
    
    public Frm_Cerveza() {
        initComponents();
        setLocationRelativeTo(null);
        CA=new Cls_Cerveza();
        llenarMarca();
    }
    private void llenarMarca(){
        list=new Cls_Marca().getMarcas();
        for (int i = 0; i < list.size(); i++) {
            Marca m =list.get(i);
            cb_Marca.addItem(m.getMar_Nombre());
        }
        cb_Marca.setSelectedIndex(-1);
    }
    
    public void limpiar(){
        txt_Nombre.setText("");
        txt_Graduacion.setText("");
        cb_Marca.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_Marca = new javax.swing.JComboBox<>();
        txt_Graduacion = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cerveza");

        jLabel2.setText("Nombre");

        jLabel3.setText("Graduación");

        jLabel4.setText("Marca");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Marca, 0, 129, Short.MAX_VALUE)
                            .addComponent(txt_Graduacion)
                            .addComponent(txt_Nombre))))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btn_Agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Graduacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String nombre=txt_Nombre.getText();
        float graduacion = 0.0f;
        StringBuilder mensajeError = new StringBuilder();
        int id = cb_Marca.getSelectedIndex();
        
        if (nombre.isEmpty() || nombre.length() > 30 || nombre.length() < 3) {
            mensajeError.append("Longitud de nombre no válida (entre 3 y 30 caracteres).\n");
        }
        
        // Obtén el texto del campo de texto
        String graduaciontxt = txt_Graduacion.getText();

// Verifica si el campo está vacío
        if (graduaciontxt.isEmpty()) {
            mensajeError.append("El campo de graduación no puede estar vacío.\n");
        } else {
            try {
                // Intenta convertir el texto a un valor float
                graduacion = Float.parseFloat(graduaciontxt);

                // Verifica si el valor está dentro del rango deseado
                if (graduacion < 0.0 || graduacion > 100.0) {
                    mensajeError.append("La graduación debe estar entre 0.0 y 100.0.\n");
                }
            } catch (NumberFormatException e) {
                // Si no se puede convertir el texto a un número, muestra un mensaje de error
                mensajeError.append("El valor de graduación debe ser un número flotante válido.\n");
            }
        }
        
        if(id == -1){
            mensajeError.append("Debe seleccionar una sede válida.\n");
        }else{
            Marca m = list.get(id);
            if(m.getId_Marca() < 0){
                mensajeError.append("La sede seleccionada no es válida.\n");
            }
        }
        
        if(mensajeError.length() > 0){
            JOptionPane.showMessageDialog(null, mensajeError.toString(),
            "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // Si no hay errores, declara el id que el usuario selecciono
            int id_marca = list.get(id).getId_Marca();
            String nombreMarca = (String) cb_Marca.getSelectedItem();
            Cerveza cerveza = new Cerveza(0,nombre,graduacion,
                    id_marca,0);
            Frm_CervezaPrev preview = new Frm_CervezaPrev(Frm_Cerveza.this, cerveza,
                    nombreMarca);
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
            java.util.logging.Logger.getLogger(Frm_Cerveza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Cerveza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Cerveza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Cerveza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Cerveza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JComboBox<String> cb_Marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Graduacion;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
