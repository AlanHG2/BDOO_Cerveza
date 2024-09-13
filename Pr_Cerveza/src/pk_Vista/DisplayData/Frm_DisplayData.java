/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pk_Vista.DisplayData;

import javax.swing.JOptionPane;
import pk_CRUD.Cls_Almacen;
import pk_CRUD.Cls_Cerveza;
import pk_CRUD.Cls_Expendio;
import pk_CRUD.Cls_Fabricante;
import pk_CRUD.Cls_Grano;
import pk_CRUD.Cls_Marca;
import pk_CRUD.Cls_Receta;
import pk_CRUD.Cls_Sede;
import pk_Modelo.Fabricante;
import pk_Modelo.Sede;
import pk_Vista.Insert.Frm_Fabricante;
import pk_Vista.Insert.Frm_Sede;

/**
 *
 * @author ALAN
 */
public class Frm_DisplayData extends javax.swing.JFrame {

    /**
     * Creates new form Frm_DisplaySede
     */
    String[] cols_Sede = {"ID", "Nombre", "Tipo", "Estado", "Municipio", "C. Postal", "Calle", "NumExterior", "Teléfono"};
    String[] cols_Fabricante = {"ID", "Nombre", "Sede"};
    String[] cols_Marca = {"ID", "Nombre", "Fabricante"};
    String[] cols_Cerveza = {"ID", "Nombre", "Graduación", "Marca", "Existencia"};
    String[] cols_Receta = {"ID", "Procedimiento", "Grano", "Cerveza"};
    String[] cols_Grano = {"ID", "Nombre", "Procedencia"};
    String[] cols_Lote = {"ID", "Cerveza", "Fecha de producción", "Fecha de caducidad", "Cantidad producida"};
    String[] cols_Presentacion = {"ID", "Cerveza", "Descripcion", "Envase", "Capacidad"};
    String[] cols_Pedido = {"ID", "Presentación", "Expendio", "Cantidad", "Fecha de orden", "Fecha de despacho", "Total $", "Subtotal", "IVA"};
    String[] cols_Expendio = {"ID", "Nombre", "RFC", "Estado", "Municipio", "C. Postal", "Calle", "NumExterior"};
    String[] cols_Almacen = {"ID", "Existencia", "Capacidad", "Presentación", "Expendio"};
    String[] cols_Venta = {"ID", "Precio unitario", "Cantidad", "Fecha", "Expendio", "Presentación"};

    Cls_Sede CS = new Cls_Sede();
    Cls_Fabricante CF = new Cls_Fabricante();
    Cls_Marca CM = new Cls_Marca();
    Cls_Cerveza CC = new Cls_Cerveza();
    Cls_Receta CR = new Cls_Receta();
    Cls_Grano CG = new Cls_Grano();
    Cls_Almacen CA = new Cls_Almacen();
    Cls_Expendio CE = new Cls_Expendio();
    

    public Frm_DisplayData() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void llenar_cbColumna(String[] cols) {
        cb_Columna.removeAllItems();
        for (int i = 1; i < cols.length; i++) {
            cb_Columna.addItem(cols[i]);
        }
        cb_Columna.setSelectedIndex(-1);
    }

    private void listarDatos(String tabla) {
        switch (tabla) {
            case "sede":
                llenar_cbColumna(cols_Sede);
                table_Datos.setModel(CS.getDatosSedes());
                break;
            case "fabricante":
                llenar_cbColumna(cols_Fabricante);
                table_Datos.setModel(CF.getDatosFabricantes());
                break;
            case "marca":
                llenar_cbColumna(cols_Marca);
                table_Datos.setModel(CM.getDatosMarcas());
                //...
                break;
            case "cerveza":
                llenar_cbColumna(cols_Cerveza);
                table_Datos.setModel(CC.getDatosCervezas());
                //...

                break;
            case "receta":
                llenar_cbColumna(cols_Receta);
                table_Datos.setModel(CR.getDatosRecetas());
                //...

                break;
            case "grano":
                llenar_cbColumna(cols_Grano);
                table_Datos.setModel(CG.getDatosGranos());
                //...

                break;
            case "lote":
                llenar_cbColumna(cols_Lote);
                //...

                break;
            case "presentación":
                llenar_cbColumna(cols_Presentacion);
                //...

                break;
            case "pedido":
                llenar_cbColumna(cols_Pedido);
                //...

                break;
            case "expendio":
                llenar_cbColumna(cols_Expendio);
                table_Datos.setModel(CE.getDatosExpendios());
                //...

                break;
            case "almacén":
                llenar_cbColumna(cols_Almacen);
                table_Datos.setModel(CA.getDatosAlmacenes());
                //...

                break;
            case "venta":
                llenar_cbColumna(cols_Venta);
                //...
                break;
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Criterio = new javax.swing.JTextField();
        cb_Columna = new javax.swing.JComboBox<>();
        btn_Buscar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        cb_Tabla = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_Datos);

        jLabel1.setText("Buscar en");

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        cb_Tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede", "Fabricante", "Marca", "Cerveza", "Receta", "Grano", "Lote", "Presentación", "Pedido", "Expendio", "Almacén", "Venta" }));
        cb_Tabla.setSelectedIndex(-1);
        cb_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TablaActionPerformed(evt);
            }
        });

        jLabel2.setText("Por");

        jLabel3.setText("Criterio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Editar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_Criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Buscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cb_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel2)
                                        .addGap(41, 41, 41)
                                        .addComponent(cb_Columna, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Columna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cb_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void cb_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TablaActionPerformed
        String tabla = cb_Tabla.getSelectedItem().toString().toLowerCase();
        listarDatos(tabla);

    }//GEN-LAST:event_cb_TablaActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        int row = table_Datos.getSelectedRow();
        String tabla = cb_Tabla.getSelectedItem().toString().toLowerCase();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla para editar", "Error", 2);
        } else {          
            switch (tabla){
                case "sede":
                    Sede s = new Sede(
                            Integer.parseInt(table_Datos.getValueAt(row, 0).toString()),
                            table_Datos.getValueAt(row, 1).toString(),
                            table_Datos.getValueAt(row, 8).toString(),
                            table_Datos.getValueAt(row, 2).toString(),
                            table_Datos.getValueAt(row, 6).toString(),
                            Integer.parseInt(table_Datos.getValueAt(row, 5).toString()),
                            table_Datos.getValueAt(row, 4).toString(),
                            table_Datos.getValueAt(row, 3).toString(),
                            Integer.parseInt(table_Datos.getValueAt(row, 7).toString())
                    );
                    Frm_Sede frmsede = new Frm_Sede(s);
                    frmsede.setVisible(true);
                    break;
                case "fabricante":
                    Fabricante f = new Fabricante(
                            Integer.parseInt(table_Datos.getValueAt(row,0).toString()),
                            table_Datos.getValueAt(row,1).toString(),
                            Integer.parseInt(table_Datos.getValueAt(row, 2).toString())
                    );
                    Frm_Fabricante frmfabricante = new Frm_Fabricante(f);
                    frmfabricante.setVisible(true);
                    break;
            }
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        //int row = table_Datos.getSelectedRow();
        String tabla = cb_Tabla.getSelectedItem().toString().toLowerCase();
        String criterio = txt_Criterio.getText();
        String columna = cb_Columna.getSelectedItem().toString().toLowerCase();
        String errorMessage = "";
        if (cb_Columna.getSelectedIndex() != -1 && (criterio != null && !criterio.trim().isEmpty() && criterio.length() >= 2)) {
            switch (tabla){
                case "sede":
                    table_Datos.setModel(CS.getCriterio(columna, criterio));
                    break;
                case "fabricante":
                    table_Datos.setModel(CF.getCriterio(columna, criterio));
                    break;
                case "marca":
                    table_Datos.setModel(CM.getCriterio(columna, criterio));
                    break;
                case "cerveza":
                    table_Datos.setModel(CC.getCriterio(columna, criterio));
                    break;
                case "receta":
                    table_Datos.setModel(CR.getCriterio(columna, criterio));
                    break;
                case "grano":
                    table_Datos.setModel(CG.getCriterio(columna, criterio));
                    break;
                case "expendio":
                    table_Datos.setModel(CE.getCriterio(columna, criterio));
                    break;
                case "almacén":
                    table_Datos.setModel(CA.getCriterio(columna, criterio));
                    break;
            }
            
        } else {
            if (cb_Columna.getSelectedIndex() == -1) {
                errorMessage += "Seleccione una columna de búsqueda";
            }
            if (criterio == null || criterio.trim().isEmpty() || criterio.length() < 3) {
                errorMessage += "Ingrese un criterio válido \nNo puede estar vacío ni contener menos de 3 caracteres";
            }
            JOptionPane.showMessageDialog(this, errorMessage, "Error", 2);

        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int row = table_Datos.getSelectedRow();
        int res = 0;
        String tabla = cb_Tabla.getSelectedItem().toString().toLowerCase();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla para eliminar", "Error", 2);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Está seguro de eliminar este registro?", "Advertencia", JOptionPane.WARNING_MESSAGE);
            int id = Integer.parseInt(String.valueOf(table_Datos.getValueAt(row, 0)));
            switch (tabla) {
                case "sede":
                    if (confirm == 0) {
                        res = CS.eliminarRegistro(id);
                    }
                    break;
                case "fabricante":
                    if (confirm == 0) {
                        res = CF.eliminarRegistro(id);
                    }
                    break;
                case "marca":
                    if (confirm == 0) {
                        res = CM.eliminarRegistro(id);
                    }
                    break;
                case "cerveza":
                    if (confirm == 0) {
                        res = CC.eliminarRegistro(id);
                    }
                    break;
                case "receta":
                    if (confirm == 0) {
                        res = CR.eliminarRegistro(id);
                    }
                    break;
                case "grano":
                    if (confirm == 0) {
                        res = CG.eliminarRegistro(id);
                    }
                    break;
                case "lote":
                    break;
                case "presentación":
                    break;
                case "pedido":
                    break;
                case "expendio":
                    if (confirm == 0) {
                        res = CE.eliminarRegistro(id);
                    }
                    break;
                case "almacén":
                    if (confirm == 0) {
                        res = CA.eliminarRegistro(id);
                    }
                    break;
                case "venta":
                    break;
            }
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Registro eliminado con éxito", "Eliminación", 1);
                listarDatos(tabla);
            } else if (res == -1) {
                JOptionPane.showMessageDialog(this, "No se puede eliminar el registro:\nestá referenciado en otras tablas",
                        "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "El registro no se ha eliminado", "!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_DisplayData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_DisplayData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_DisplayData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_DisplayData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_DisplayData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JComboBox<String> cb_Columna;
    private javax.swing.JComboBox<String> cb_Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Datos;
    private javax.swing.JTextField txt_Criterio;
    // End of variables declaration//GEN-END:variables
}
