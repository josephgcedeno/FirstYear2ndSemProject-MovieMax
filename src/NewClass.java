/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rj
 */
public class section extends javax.swing.JFrame {

    /**
     * Creates new form section
     */
    int a=0,b=0,c=0;
    String csSection="",itSection="",isSection=""; 
    DefaultTableModel model;
    public section() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CS = new javax.swing.JCheckBox();
        IT = new javax.swing.JCheckBox();
        IS = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FList = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW BY SECTION");

        jLabel2.setText("Select Course:");

        CS.setText("CS");
        CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSActionPerformed(evt);
            }
        });

        IT.setText("IT");
        IT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITActionPerformed(evt);
            }
        });

        IS.setText("IS");
        IS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISActionPerformed(evt);
            }
        });

        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Section", "Year"
            }
        ));
        jScrollPane1.setViewportView(FList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CS)
                        .addGap(39, 39, 39)
                        .addComponent(IT)
                        .addGap(58, 58, 58)
                        .addComponent(IS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CS)
                    .addComponent(IT)
                    .addComponent(IS)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed
        if(CS.isSelected()){
            if(a==0){
                csSection = CS.getText();
                a=1;
            }
        }
        else{
            a=0;
            
            int rowcount = model.getRowCount()-1;
            for(int x = rowcount; x>=0;x--)
            {
                
                 if(csSection.equals(model.getValueAt(x, 3)))
                {
                    //FList.setRowSelectionInterval(x, x);
                    model.removeRow(x);
                }
               
            }
            
            
            
            csSection="";
        }
    }//GEN-LAST:event_CSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Scanner sc = new Scanner (new FileReader("src\\contacts\\List"));
            String line,id,fname,lname,course,year;
            model = (DefaultTableModel) FList.getModel();
            model.setRowCount(0);
             while(sc.hasNextLine())
            {
                
                line = sc.nextLine();
                Scanner lineinput = new Scanner(line);
                id=lineinput.next();
                fname=lineinput.next();
                lname=lineinput.next();
                course=lineinput.next();
                year=lineinput.next();
                Object row []={id,fname,lname,course,year};
                
                  
                if(csSection.equals(course))
                {
                    model.addRow(row);
                }
                 if(itSection.equals(course))
                {
                    model.addRow(row);
                }
                  if(isSection.equals(course))
                {
                    model.addRow(row);
                }
             
            
            
                
            }
            
            
            
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(section.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITActionPerformed
    if(IT.isSelected()){
            if(b==0){
                itSection = IT.getText();
                b=1;
            }
        }
        else{
            b=0;
            
            int rowcount = model.getRowCount()-1;
            for(int x = rowcount; x>=0;x--)
            {
                
                if(itSection.equals(model.getValueAt(x, 3)))
                {
                     model.removeRow(x);
                }
               
            }
            
            
            itSection="";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ITActionPerformed

    private void ISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISActionPerformed
        if(IS.isSelected()){
            if(c==0){
                isSection = IS.getText();
                c=1;
            }
        }
        else{
            c=0;
            
            int rowcount = model.getRowCount()-1;
           for(int x = rowcount; x>=0;x--)
            {
                if(isSection.equals(model.getValueAt(x, 3)))
                {
                     model.removeRow(x);
                }
               
            }
            
            
            isSection="";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ISActionPerformed

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
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new section().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CS;
    private javax.swing.JTable FList;
    private javax.swing.JCheckBox IS;
    private javax.swing.JCheckBox IT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
