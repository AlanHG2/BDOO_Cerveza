package pk_Vista;

import javax.swing.*;
import java.awt.event.*;

import pk_CRUD.Cls_Grano;

public class Frm_Grano extends JFrame {
    private final Cls_Grano CA;

    private JPanel panelGrano;
    private JTextField txt_Nombre;
    private JPanel panel_Etiquetas;
    private JPanel panel_Texto;
    private JComboBox cmb_Procedencia;
    private JLabel label_Procedencia;
    private JLabel label_Nombre;
    private JButton btn_Regresar;
    private JButton btn_Aceptar;
    private JPanel panel_Botones;
    private JPanel panel_Titulo;

    public Frm_Grano() {
        CA= new Cls_Grano();

        // Constructor del formulario
        setContentPane(panelGrano);
        setTitle("Registro de Granos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,250);
        setLocationRelativeTo(null);
        setVisible(true);

        // Metodo para insertar los datos

        btn_Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gra_nombre = txt_Nombre.getText().trim();
                String gra_procedencia = cmb_Procedencia.getSelectedItem().toString();
                StringBuilder mensajeError = new StringBuilder();

                // Validación del nombre
                if (gra_nombre.length() < 3) {
                    mensajeError.append("El nombre debe tener al menos 3 caracteres.\n");
                }

                // Validación de la procedencia
                if (cmb_Procedencia.getSelectedIndex() == 0) {
                    mensajeError.append("Seleccione un Estado.\n");
                }

                // Mostrar errores si existen
                if (mensajeError.length() > 0) {
                    JOptionPane.showMessageDialog(null, mensajeError.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Si no hay errores, proceder con la inserción
                    int res = CA.insertarDatos(gra_nombre, gra_procedencia);
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Registro Exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        //Crear un formulario del tipo Frm_Grano
        new Frm_Grano();
    }
}
