package pk_Vista;

import pk_CRUD.Cls_Grano;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk_CRUD.Cls_Grano;

public class Frm_Cerveza extends javax.swing.JFrame{
    private JPanel jpanelMain;
    private JTextField txt_Nombre;
    private JButton btn_Accion;
    private final Cls_Grano CA;

    public Frm_Cerveza() {
        CA= new Cls_Grano();

        setContentPane(jpanelMain);
        setTitle("Registro de Cerveza");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,250);
        setLocationRelativeTo(null);
        btn_Accion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn_Accion,txt_Nombre.getText()+"Hola Mundo");
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Cerveza().setVisible(true);
            }
        });
    }
}
