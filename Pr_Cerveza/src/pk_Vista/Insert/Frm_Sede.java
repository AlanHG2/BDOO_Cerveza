package pk_Vista.Insert;

import javax.swing.JOptionPane;
import pk_CRUD.Cls_Sede;
import pk_Modelo.Sede;
import pk_Vista.Preview.Frm_SedePrev;

public class Frm_Sede extends javax.swing.JFrame {

    private final Cls_Sede CA;
    private Sede s = null;

    public Frm_Sede() {
        initComponents();
        CA = new Cls_Sede();
        setTitle("Registro de Sede");
        setLocationRelativeTo(null);
        s=null;
    }
//    Constructor para recibir como parámetro un objeto con los datos del elemento a editar

    public Frm_Sede(Sede sede) {
        initComponents();
        CA = new Cls_Sede();
        setTitle("Registro de Sede");
        setLocationRelativeTo(null);
        System.out.println(sede.getId_Sede()); //!!!!!!!!
        cb_Estado.setSelectedItem(sede.getSed_Estado());
        cb_Tipo.setSelectedItem(sede.getSed_Tipo());
        txt_CP.setText(String.valueOf(sede.getSed_CPostal()));
        txt_Calle.setText(sede.getSed_Calle());
        txt_Mpio.setText(sede.getSed_Municipio());
        txt_Nombre.setText(sede.getSed_Nombre());
        txt_Telefono.setText(sede.getSed_Telefono());
        txt_num_exterior.setText(String.valueOf(sede.getSed_NumExt()));
        s = sede;

    }

    public void limpiar() {
        cb_Estado.setSelectedIndex(-1);
        cb_Tipo.setSelectedIndex(-1);
        txt_CP.setText("");
        txt_Calle.setText("");
        txt_Mpio.setText("");
        txt_Nombre.setText("");
        txt_Telefono.setText("");
        txt_num_exterior.setText("");
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
        txt_Nombre = new javax.swing.JTextField();
        cb_Tipo = new javax.swing.JComboBox<>();
        cb_Estado = new javax.swing.JComboBox<>();
        txt_Calle = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_CP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Mpio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_num_exterior = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "Secundaria" }));
        cb_Tipo.setSelectedIndex(-1);

        cb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila", "Colima", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        cb_Estado.setSelectedIndex(-1);

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo");

        jLabel4.setText("Estado");

        jLabel5.setText("Calle");

        jLabel6.setText("#Exterior");

        jLabel1.setText("Sede");

        btn_Agregar.setText("Confirmar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        jLabel7.setText("C. Postal");

        jLabel8.setText("Municipio");

        jLabel9.setText("Teléfono");

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Mpio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(txt_Calle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_num_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Mpio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_num_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
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

        String nombre = txt_Nombre.getText().trim();
        String telefono = txt_Telefono.getText().trim();
        String tipo = cb_Tipo.getSelectedItem() != null ? cb_Tipo.getSelectedItem().toString() : "";
        String calle = txt_Calle.getText().trim();
        String cpStr = txt_CP.getText().trim();
        String mpio = txt_Mpio.getText().trim(); // TODO cambiar por combobox
        String estado = cb_Estado.getSelectedItem() != null ? cb_Estado.getSelectedItem().toString() : "";
        String numExtStr = txt_num_exterior.getText().trim();

        StringBuilder mensajeError = new StringBuilder();

        Frm_SedePrev preview;
        // Validación del nombre (no vacío y mínimo 3 caracteres)
        if (nombre.isEmpty() || nombre.length() < 3) {
            mensajeError.append("El nombre debe tener al menos 3 caracteres y no puede estar vacío.\n");
        }

        // Validación del teléfono (no vacío y debe contener solo números)
        if (telefono.isEmpty() || !telefono.matches("\\d+")) {
            mensajeError.append("El teléfono no puede estar vacío y debe contener solo números.\n");
        }

        // Validación del tipo (asegurar que se ha seleccionado un valor)
        if (cb_Tipo.getSelectedIndex() == -1) {
            mensajeError.append("Debe seleccionar un tipo.\n");
        }

        // Validación de la calle (no vacía)
        if (calle.isEmpty()) {
            mensajeError.append("La calle no puede estar vacía.\n");
        }

        // Validación del Código Postal (no vacío, debe ser numérico y de 5 dígitos)
        if (cpStr.isEmpty() || !cpStr.matches("\\d{5}")) {
            mensajeError.append("El Código Postal no puede estar vacío y debe contener exactamente 5 dígitos numéricos.\n");
        }

        // Validación del municipio (no vacío)
        if (mpio.isEmpty()) {
            mensajeError.append("El municipio no puede estar vacío.\n");
        }

        // Validación del estado (asegurar que se ha seleccionado un valor)
        if (cb_Estado.getSelectedIndex() == -1) {
            mensajeError.append("Debe seleccionar un Estado.\n");
        }

        // Validación del número exterior (no vacío y debe ser numérico)
        if (numExtStr.isEmpty() || !numExtStr.matches("\\d+")) {
            mensajeError.append("El número exterior no puede estar vacío y debe ser un valor numérico.\n");
        }

        // Mostrar los mensajes de error si existen
        if (mensajeError.length() > 0) {
            JOptionPane.showMessageDialog(null, mensajeError.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Convertir valores numéricos después de las validaciones
            int cp = Integer.parseInt(cpStr);
            int numExt = Integer.parseInt(numExtStr);

            this.setVisible(false);
            //se crea una instancia de Sede y se pasa como parámetro al otro formulario
            //si el objeto s (sede) es nulo, considera que es un nuevo registro
            // de lo contrario, obtiene el id del registro para asignarlo al objeto que se pasa como parámetro para realizar una update
            if (s == null) {
                Sede sede = new Sede(0, nombre, telefono, tipo, calle, cp, mpio, estado, numExt);
                preview = new Frm_SedePrev(Frm_Sede.this, sede);
            } else {
                Sede sede = new Sede(s.getId_Sede(), nombre, telefono, tipo, calle, cp, mpio, estado, numExt);
                preview = new Frm_SedePrev(Frm_Sede.this, sede);
            }
            preview.setVisible(true);
        }

    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Sede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Sede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Sede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Sede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Sede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<String> cb_Estado;
    private javax.swing.JComboBox<String> cb_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CP;
    private javax.swing.JTextField txt_Calle;
    private javax.swing.JTextField txt_Mpio;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_num_exterior;
    // End of variables declaration//GEN-END:variables
}
