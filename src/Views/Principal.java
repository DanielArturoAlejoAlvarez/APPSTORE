/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author daniel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        WinPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        HelpMenu = new javax.swing.JMenu();
        Help = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GenerateSale = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ClientsMaintenance = new javax.swing.JMenuItem();
        ProductsMaintenance = new javax.swing.JMenuItem();
        UserMaintenance = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SaleReports = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);

        jMenuBar1.setBackground(java.awt.Color.white);

        HelpMenu.setBackground(new java.awt.Color(60, 57, 55));
        HelpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HelpMenu.setForeground(java.awt.Color.black);
        HelpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-menú-xbox-50.png"))); // NOI18N
        HelpMenu.setText("MENU");

        Help.setForeground(java.awt.Color.darkGray);
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        HelpMenu.add(Help);

        Exit.setForeground(java.awt.Color.darkGray);
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        HelpMenu.add(Exit);

        jMenuBar1.add(HelpMenu);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setForeground(java.awt.Color.black);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-carro-favorito-48.png"))); // NOI18N
        jMenu2.setText("SALES");

        GenerateSale.setForeground(java.awt.Color.darkGray);
        GenerateSale.setText("Generate Sale");
        GenerateSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateSaleActionPerformed(evt);
            }
        });
        jMenu2.add(GenerateSale);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setForeground(java.awt.Color.black);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-mantenimiento-52.png"))); // NOI18N
        jMenu3.setText("MAINTENANCE");

        ClientsMaintenance.setForeground(java.awt.Color.darkGray);
        ClientsMaintenance.setText("Clients");
        ClientsMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientsMaintenanceActionPerformed(evt);
            }
        });
        jMenu3.add(ClientsMaintenance);

        ProductsMaintenance.setForeground(java.awt.Color.darkGray);
        ProductsMaintenance.setText("Products");
        ProductsMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsMaintenanceActionPerformed(evt);
            }
        });
        jMenu3.add(ProductsMaintenance);

        UserMaintenance.setForeground(java.awt.Color.darkGray);
        UserMaintenance.setText("Users");
        UserMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserMaintenanceActionPerformed(evt);
            }
        });
        jMenu3.add(UserMaintenance);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setForeground(java.awt.Color.black);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-gráfico-circular-48.png"))); // NOI18N
        jMenu4.setText("REPORTS");

        SaleReports.setForeground(java.awt.Color.darkGray);
        SaleReports.setText("Sale Reports");
        SaleReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleReportsActionPerformed(evt);
            }
        });
        jMenu4.add(SaleReports);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WinPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WinPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        
    }//GEN-LAST:event_HelpActionPerformed

    private void GenerateSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateSaleActionPerformed
        //String fullname = jTextField1.getText();
        SaleForm sf = new SaleForm();
        //WinPrincipal.add(sf);
       // sf.txtFullName.setText(fullname);
        
        sf.setVisible(true);
        windowCentered(sf);
    }//GEN-LAST:event_GenerateSaleActionPerformed

    private void SaleReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleReportsActionPerformed
        SaleForm sf = new SaleForm();
        sf.setVisible(true);
        windowCentered(sf);
    }//GEN-LAST:event_SaleReportsActionPerformed

    private void ProductsMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsMaintenanceActionPerformed
        ProductForm pf = new ProductForm();
        windowCentered(pf);
    }//GEN-LAST:event_ProductsMaintenanceActionPerformed

    private void ClientsMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientsMaintenanceActionPerformed
        ClientForm cf = new ClientForm();
        windowCentered(cf);
    }//GEN-LAST:event_ClientsMaintenanceActionPerformed

    private void UserMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserMaintenanceActionPerformed
        UserForm uf = new UserForm();
        windowCentered(uf);
    }//GEN-LAST:event_UserMaintenanceActionPerformed

    void windowCentered(JInternalFrame frame) {
        WinPrincipal.add(frame);
        Dimension dimension = WinPrincipal.getSize();
        Dimension DFrame = frame.getSize();
        frame.setLocation((dimension.width - DFrame.height)/2, (dimension.height - DFrame.width)/2);
        frame.show();
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClientsMaintenance;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem GenerateSale;
    private javax.swing.JMenuItem Help;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem ProductsMaintenance;
    private javax.swing.JMenuItem SaleReports;
    private javax.swing.JMenuItem UserMaintenance;
    public static javax.swing.JDesktopPane WinPrincipal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
