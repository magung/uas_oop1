/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoteknusantara;

import javax.swing.WindowConstants;

/**
 *
 * @author PLJC-PC
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        supplier = new javax.swing.JMenu();
        obat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 100)); // NOI18N
        jLabel1.setText("Apotek Nusantara");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        supplier.setText("Supplier");
        supplier.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                supplierMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierMouseClicked(evt);
            }
        });
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        jMenuBar1.add(supplier);

        obat.setText("Obat");
        obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatMouseClicked(evt);
            }
        });
        jMenuBar1.add(obat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
        
     
        
        
    }//GEN-LAST:event_supplierActionPerformed

    private void supplierMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_supplierMenuKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_supplierMenuKeyPressed

    private void supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierMouseClicked
        // TODO add your handling code here:
        
           supplier s=new supplier();
        s.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Form Supplier");
    }//GEN-LAST:event_supplierMouseClicked

    private void obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatMouseClicked
        // TODO add your handling code here:
        obat o=new obat();
        o.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        o.setVisible(true);
        o.setTitle("Form Obat");
        
        
    }//GEN-LAST:event_obatMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu obat;
    private javax.swing.JMenu supplier;
    // End of variables declaration//GEN-END:variables
}
