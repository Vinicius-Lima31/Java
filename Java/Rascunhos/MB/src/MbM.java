
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FalaZezeBomDiaCara
 */
public class MbM extends javax.swing.JFrame {

    /**
     * Creates new form MbM
     */
    public MbM() {
        initComponents();
        //lblResultado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbael = new javax.swing.JLabel();
        btnMarcella = new javax.swing.JButton();
        btnMaria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstM = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbael.setBackground(new java.awt.Color(223, 19, 19));
        lbael.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbael.setForeground(new java.awt.Color(0, 53, 223));
        lbael.setText("Clique e Descubra o que você é ?");

        btnMarcella.setBackground(new java.awt.Color(51, 255, 255));
        btnMarcella.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMarcella.setForeground(new java.awt.Color(0, 118, 16));
        btnMarcella.setText("Marcella");
        btnMarcella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcellaActionPerformed(evt);
            }
        });

        btnMaria.setBackground(new java.awt.Color(255, 255, 0));
        btnMaria.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        btnMaria.setForeground(new java.awt.Color(17, 9, 234));
        btnMaria.setText("Maria Beatriz");
        btnMaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMariaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMarcella, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btnMaria))
                            .addComponent(lbael)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lbael)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaria)
                    .addComponent(btnMarcella, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMariaActionPerformed
        
        DefaultListModel lista = new DefaultListModel();
        
        for(int i = 0; i < 5; i++)
            lista.addElement("Corona Virus");
        
        lstM.setModel(lista);
    }//GEN-LAST:event_btnMariaActionPerformed

    private void btnMarcellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcellaActionPerformed
        
        DefaultListModel lista = new DefaultListModel();
        
        for(int i = 0; i < 5; i++)
            lista.addElement("Fumadora de Cigarro");
        lstM.setModel(lista);
    }//GEN-LAST:event_btnMarcellaActionPerformed

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
            java.util.logging.Logger.getLogger(MbM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MbM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MbM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MbM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MbM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarcella;
    private javax.swing.JButton btnMaria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbael;
    private javax.swing.JList lstM;
    // End of variables declaration//GEN-END:variables
}
