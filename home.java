/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author this pc
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        wlcm_l.setText(wlcm_l.getText()+ " "+usrname);
        pane.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_l = new javax.swing.JLabel();
        wlcm_l = new javax.swing.JLabel();
        pane = new javax.swing.JPanel();
        old_l = new javax.swing.JLabel();
        new_l = new javax.swing.JLabel();
        confirm_new_l = new javax.swing.JLabel();
        paschange = new javax.swing.JButton();
        old = new javax.swing.JPasswordField();
        newpas = new javax.swing.JPasswordField();
        confrm = new javax.swing.JPasswordField();
        info = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        search = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        student = new javax.swing.JMenu();
        sturec = new javax.swing.JMenuItem();
        setting = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        password = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img_l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/loginimg.jpg"))); // NOI18N
        img_l.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), java.awt.Color.black, new java.awt.Color(204, 204, 255)));

        wlcm_l.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        wlcm_l.setForeground(new java.awt.Color(255, 51, 0));
        wlcm_l.setText("Welcome ");

        pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password change", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 255))); // NOI18N

        old_l.setText("Old Password:");

        new_l.setText("New Password:");

        confirm_new_l.setText("Confirm Password:");

        paschange.setText("Change Password");
        paschange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paschangeActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(paschange)
                .addGap(72, 72, 72)
                .addComponent(back)
                .addContainerGap(751, Short.MAX_VALUE))
            .addGroup(paneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirm_new_l)
                            .addComponent(new_l)
                            .addComponent(old_l))
                        .addGap(10, 10, 10)
                        .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(old)
                            .addComponent(newpas)
                            .addComponent(confrm))))
                .addContainerGap())
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old_l)
                    .addComponent(old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_l)
                    .addComponent(newpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_new_l)
                    .addComponent(confrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paschange)
                    .addComponent(back))
                .addGap(28, 28, 28))
        );

        search.setText("Search ");

        jMenuItem1.setText("search book");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        search.add(jMenuItem1);

        menubar.add(search);

        student.setText("Student");

        sturec.setText("Student Record");
        sturec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sturecActionPerformed(evt);
            }
        });
        student.add(sturec);

        menubar.add(student);

        setting.setText("Settings");

        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        setting.add(logout);

        password.setText("change password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        setting.add(password);

        menubar.add(setting);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img_l, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(wlcm_l, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(img_l))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(wlcm_l, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        searchbook.main();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sturecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sturecActionPerformed
        // TODO add your handling code here:
       StudentRecord.main();
    }//GEN-LAST:event_sturecActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
     
        System.exit(0);
        
       
    }//GEN-LAST:event_logoutActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        pane.setVisible(true);
        old.setText("");
        newpas.setText("");
        confrm.setText("");
        
    }//GEN-LAST:event_passwordActionPerformed

    private String stringMaker(char str1[])
    {
        String str2="";
        
        for(int i=0;i<str1.length;i++)
        {
            str2=str2+str1[i];
        }
        return str2;
    }
    private void paschangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paschangeActionPerformed
        // TODO add your handling code here:
        info.setText("");
        String pass1= stringMaker(old.getPassword());
        String pass2=stringMaker(newpas.getPassword());
        String pass3=stringMaker(confrm.getPassword());
        boolean found=false;
        
        try
        {
            
           // InputStream i=getClass().getResourceAsStream("/com/library/rec.txt");
          //this method first removes the / then sends com/library/rec.txt(Absolute path) to getClass().getClassLoader().getResourceAsStream("com/library/rec.txt")
            File f=new File(Library.url+"/rec.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String str=null;
            while((str=br.readLine())!=null)
            {
             String parts[]=str.split("-");
             if(parts[1].equals(pass1))
             {
                 found=true;
                 break;
             }
            }
            br.close();
            fr.close();
            
           
            
            if(found==true)
            {
                if(pass2.equals(pass3)&&pass2.length()>0)
                {
                    info.setText("new password created and confirmed");
                    
                    
                     File f1=new File(Library.url+"/rec.txt");
                     FileReader fr1=new FileReader(f1);
                     BufferedReader br1=new BufferedReader(fr1);
                     File f2=new File(Library.url+"/temp.txt");
                     FileWriter fo1=new FileWriter(f2);
                     String s;
                     while((s=br1.readLine())!=null)
                     {
                         String parts[]=s.split("-");
                         if(parts[0].equals(usrname))
                         {
                             fo1.write(usrname+"-"+pass2+"\r\n");
                         }
                         else
                         {
                             fo1.write(s+"\r\n");
                         }
                     }
                    br1.close(); 
                    fr1.close();
                   
                    fo1.close();
                    f1.delete();
                    f2.renameTo(f1);
                    old.setText("");
                    newpas.setText("");
                    confrm.setText("");
                    
                    
                }
                else
                {
                    info.setText("either new password is not confirmed or field is empty ");
                }
            }
            else
            {
                info.setText("password do not match");
            }
        }
        catch(Exception e)
        {
            info.setText("unable to connect to database"+e);
        }
        
    }//GEN-LAST:event_paschangeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        pane.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
    public static void main(String usr) {
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                usrname=usr;
                new home().setVisible(true);
                
                
                
            }
        });
    }
    private static String usrname=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel confirm_new_l;
    private javax.swing.JPasswordField confrm;
    private javax.swing.JLabel img_l;
    private javax.swing.JLabel info;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel new_l;
    private javax.swing.JPasswordField newpas;
    private javax.swing.JPasswordField old;
    private javax.swing.JLabel old_l;
    private javax.swing.JPanel pane;
    private javax.swing.JButton paschange;
    private javax.swing.JMenuItem password;
    private javax.swing.JMenu search;
    private javax.swing.JMenu setting;
    private javax.swing.JMenu student;
    private javax.swing.JMenuItem sturec;
    private javax.swing.JLabel wlcm_l;
    // End of variables declaration//GEN-END:variables
}