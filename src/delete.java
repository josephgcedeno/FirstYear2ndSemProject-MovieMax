
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matataba
 */
public class delete extends javax.swing.JFrame {
String seats="";
String select="";
String data11="";
    public delete() {
        
          initComponents();
       buttonGroup1.add(hd);
        buttonGroup1.add(d3);
      
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hd = new javax.swing.JRadioButton();
        d3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(5, 5, 33));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remover", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Movie:");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hd.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        hd.setForeground(new java.awt.Color(255, 255, 255));
        hd.setText("HD");
        hd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdActionPerformed(evt);
            }
        });

        d3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        d3.setForeground(new java.awt.Color(255, 255, 255));
        d3.setText("3D");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("ZOMBIE", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rEMOVE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(d3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d3)
                    .addComponent(hd))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
      if(d3.isSelected()){
     select=d3.getText();      cb.removeAllItems();
          Scanner sc;
        try {
            sc = new Scanner(new FileReader("C:\\Users\\Matataba\\Documents\\NetBeansProjects\\Flower_CS\\src\\movies.txt"));
        
 
                while(sc.hasNextLine()){
             String line=sc.nextLine();
             Scanner sline = new Scanner(line);
             while(sline.hasNext()){
             String data=sline.next();
             String data1=sline.next();
             String data2=sline.next();
             String data3=sline.next();
             String data4=sline.next();
                  String c=sline.next();
             if(data.equals("Available")&&data1.equals("3D")){
                     cb.addItem(data2);
             data11=""+cb.getSelectedItem();
            
             }
             }
            }  
    } catch (FileNotFoundException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        }
      }    
    }//GEN-LAST:event_d3ActionPerformed

    private void hdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdActionPerformed
if(hd.isSelected()){
    select=hd.getText();
           cb.removeAllItems();
          Scanner sc;
        try {
            sc = new Scanner(new FileReader("C:\\Users\\Matataba\\Documents\\NetBeansProjects\\Flower_CS\\src\\movies.txt"));
        
 
                while(sc.hasNextLine()){
             String line=sc.nextLine();
             Scanner sline = new Scanner(line);
             while(sline.hasNext()){
             String data=sline.next();
             String data1=sline.next();
             String data2=sline.next();
             String data3=sline.next();
             String data4=sline.next();
                  String c=sline.next();
             if(data.equals("Available")&&data1.equals("HD")){
                     cb.addItem(data2);
             data11=""+cb.getSelectedItem();
              
             }
             }
            }  
    } catch (FileNotFoundException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
}
    }//GEN-LAST:event_hdActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
       seats=(String) cb.getSelectedItem();
    }//GEN-LAST:event_cbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Scanner sc;
       int counter=0;
       String content="";
    try {
        sc = new Scanner(new FileReader("C:\\Users\\Matataba\\Documents\\NetBeansProjects\\Flower_CS\\src\\movies.txt"));
       while(sc.hasNextLine()){
              
             String line=sc.nextLine();
             Scanner sline = new Scanner(line);
             while(sline.hasNext()){
             String data=sline.next();
             String data1=sline.next();
             String data2=sline.next();
             String data3=sline.next();
             String data4=sline.next();
             String c=sline.next();
             
             
            
             if(data.equals("Available")&&seats.equals(data2) && data1.equals(select) &&!data4.equals("0")){
                 counter++;
                 line="Deleted"+" "+data1+" "+data2+" "+data3+" "+data4+" "+c;
                 
                  JOptionPane.showMessageDialog(null,"DOne");  
               
             }
                content=content+line+"\n";
             }
          }
         
         if(counter==0){
             JOptionPane.showMessageDialog(null,"Error!");
         }
          sc.close();
           try (FileWriter writer = new FileWriter("C:\\Users\\Matataba\\Documents\\NetBeansProjects\\Flower_CS\\src\\movies.txt")) {
               writer.write(content);
           } 
                
    
    } catch (FileNotFoundException ex) {
        Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
    }
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 new MovieManagement().setVisible(true);
      setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

     
    
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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JRadioButton d3;
    private javax.swing.JRadioButton hd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
