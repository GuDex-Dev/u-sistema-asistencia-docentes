/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframeproyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin-Martinez
 */
public class mostrarAsistenciasFrame extends javax.swing.JFrame {

    public static DefaultTableModel modelo;
    private static String[] info;

    /**
     * Creates new form mostrarAsistenciasFrame
     */
    public mostrarAsistenciasFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("HORA DE ENTRADA");
        modelo.addColumn("ESTADO DE ENTRADA");
        modelo.addColumn("HORA DE SALIDA");
        modelo.addColumn("ESTADO DE SALIDA");
        this.tabla.setModel(modelo);
        listaDocentes obj = new listaDocentes();
        for (int i = 0; i < listaDocentes.arrListDocente.size(); i++) {

            info = new String[7];

            info[0] = listaDocentes.arrListDocente.get(i).getDNI();
            info[1] = listaDocentes.arrListDocente.get(i).getNombre();
            info[2] = listaDocentes.arrListDocente.get(i).getApellidos();
            info[3] = listaDocentes.arrListDocente.get(i).getHoraEntrada();
            info[4] = listaDocentes.arrListDocente.get(i).getEstadoEntrada();
            info[5] = listaDocentes.arrListDocente.get(i).getHoraSalida();
            info[6] = listaDocentes.arrListDocente.get(i).getEstadoSalida();
            modelo.addRow(info);
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
        jLabel1 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bt_volver = new javax.swing.JButton();
        bt_g_asist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 183, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ASISTENCIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 50));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1040, 300));

        bt_volver.setBackground(new java.awt.Color(255, 102, 102));
        bt_volver.setForeground(new java.awt.Color(0, 0, 0));
        bt_volver.setText("VOLVER");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        jPanel1.add(bt_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 100, 40));

        bt_g_asist.setBackground(new java.awt.Color(255, 102, 102));
        bt_g_asist.setForeground(new java.awt.Color(0, 0, 0));
        bt_g_asist.setText("GUARDAR ASISTENCIAS");
        bt_g_asist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_g_asistActionPerformed(evt);
            }
        });
        jPanel1.add(bt_g_asist, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        adminFrame VadminFrame = new adminFrame();
        VadminFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_volverActionPerformed

    private void bt_g_asistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_g_asistActionPerformed
        Datos.guardarAsistencias(listaDocentes.arrListDocente);
        JOptionPane.showMessageDialog(null, "Asistencias guardadas exitosamente: " + iniciarSesionFrame.fechaHoy);
    }//GEN-LAST:event_bt_g_asistActionPerformed

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
            java.util.logging.Logger.getLogger(mostrarAsistenciasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrarAsistenciasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrarAsistenciasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrarAsistenciasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarAsistenciasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_g_asist;
    private javax.swing.JButton bt_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
