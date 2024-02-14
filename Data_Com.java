package Data_Comes;

import java.awt.event.KeyEvent;
import java.lang.Math; 
import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;
public class Data_Com extends javax.swing.JFrame {
    /**
     * Creates new form Data_Com
     */  
     String operation;
     String A;
     String B;
     private Object math;
    public Data_Com() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        s2 = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        result1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2);
        s2.setBounds(350, 390, 440, 60);

        combobox.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        combobox.setForeground(new java.awt.Color(0, 204, 0));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Hamming Distance", "parity check", "Bit Stuffing", "Bit Destuffing", "Character Stuffing", "Character Destuffing" }));
        jPanel2.add(combobox);
        combobox.setBounds(420, 120, 460, 60);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("MD Dulal Hossain  213902116");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(420, 10, 470, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/gub logo.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 250, 250);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText(" INPUT :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(170, 280, 110, 51);

        s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(s1);
        s1.setBounds(350, 270, 440, 60);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText(" INPUT ( If Need ) :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 390, 210, 60);

        reset.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 0, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        convert.setForeground(new java.awt.Color(0, 0, 255));
        convert.setText("CALCULATE");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        result1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setText("OUTPUT :");

        s3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("FLAG (If Need ) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 72, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(s3)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(convert))
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      s3.setText(null);
          s2.setText(null);
          result1.setText(null);
          s1.setText(null);
          result.setText(null);        
    }//GEN-LAST:event_resetActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
          
        
           if(combobox.getSelectedItem().equals("Hamming Distance"))
           {
                if((s2.getText().equals("")) || (s1.getText().equals("")) )
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
                else
                {
               
          String str1 =s1.getText();
           String str2 =s2.getText();
            if(str1.length()!=str2.length())
      {
          JOptionPane.showMessageDialog(null, "You must enter value same length",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
            else
            {
          int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }
        String distance1 = Integer.toString(distance);
        result1.setText("Humming Distance");
        result.setText(distance1);
        
           }
           }
           }
            
  if(combobox.getSelectedItem().equals("parity check"))
           {
               if((s1.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute input 1 ",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
               else
               {
 int a=Integer.parseInt(s1.getText());
 
      
      
       
  String str3 =Integer.toBinaryString(a);
   s2.setText("Binary: "+str3);
   int counter = 0;
   
          for (int i = 0; i < str3.length(); i++) 
          {
            if (str3.charAt(i) == '1')
            {
                counter++;
            }
          }
            if(counter%2==0)
            {
                result1.setText("Parity");
           result.setText("Even Parity");
          
           } 
            else
                
            {
                result1.setText("Parity");
                result.setText("Odd parity");
                
            }
           }
           }
   if(combobox.getSelectedItem().equals("Bit Stuffing"))
  {
      if((s1.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
           String flag=s3.getText();
       String data = s1.getText();
        String res = new String();
        String out=new String();
          int counter = 0,i;
           for(i=0;i<data.length();i++)
           {
                 if(data.charAt(i) == '1')
                        {
                            counter++;
                            res = res + data.charAt(i);
                        }
                   else
                        {
                            res = res + data.charAt(i);
                            counter = 0;
                        }
                  if(counter == 5)
                        {
                            res = res + '0';
                            counter = 0;
                        }
           }
           result1.setText("Bit Stuffing");
           result.setText(flag+res+flag);
  }
  }
   if(combobox.getSelectedItem().equals("Bit Destuffing"))
   {
       if((s1.getText().equals("")) || (s3.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute input 1 and flag ",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
     
        else
        {
            
       String res = s1.getText();
       String flag=s3.getText();
        //String res = new String();
        String out=new String();
       int counter=0,i;
        for(i=0;i<res.length();i++)
                {
                   
                    if(res.charAt(i) == '1')
                        {
                            
                            counter++;
                            out = out + res.charAt(i);
                           
                        }
                    else
                        {
                             out = out + res.charAt(i);
                             counter = 0;
                        }
                   if(counter == 5)
                        {
                              if((i+2)!=res.length())
                              out = out + res.charAt(i+2);
                              else
                              out=out + '1';
                              i=i+2;
                              counter = 1;
                        }
               }
         result1.setText("Bit Destuffing");
        result.setText(flag+out+flag);
   }
   }
   if(combobox.getSelectedItem().equals("Character Stuffing"))
  {
      if((s1.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
           String flag=s3.getText();
       String data = s1.getText();
       String data1 = s2.getText();
        String res = new String();
        String out=new String();
          int i,j;
           for(i=0,j=0;i<data.length();i++)
           {
                 if(data.charAt(i) ==data1.charAt(j))
                        {
                           
                            res = res + data.charAt(i);
                             res = res + 'k';
                        }
                   else
                        {
                            res = res + data.charAt(i);
                            
                        }
                  
           }
           result1.setText("Character Stuffing");
           result.setText(flag+res+flag);
  }
  }
   if(combobox.getSelectedItem().equals("Character Destuffing"))
  {
      if(!"".equals(s1.getText()) || !"".equals(s2.getText()) || !"".equals(s3.getText()))
         
      {
          JOptionPane.showMessageDialog(null, "wait till update again. This option will work after next update. we are trying to add this button in future. thank you",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else if((s1.getText().equals("")) && (s2.getText().equals("")) && (s3.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  
    }//GEN-LAST:event_convertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
 Scanner sn=new Scanner(System.in);
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Com().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton convert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField result;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    // End of variables declaration//GEN-END:variables
}
