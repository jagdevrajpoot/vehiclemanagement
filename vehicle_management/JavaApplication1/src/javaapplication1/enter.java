/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.awt.Color;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author JAGDEV RAJPOOT
 */
public class enter extends javax.swing.JFrame {

    /**
     * Creates new form enter
     */
    public enter() {
        initComponents();
      
    }
    String s1,date2,time2;
    public enter(String date,String time,String gid)
    {
        initComponents();
        date1.setText(date);
        time1.setText(time);
        g_id.setText(gid);
        s1=gid;
        date2=date;
        time2=time;
        try
       {
           Connection con=null;
           
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jagdev?zeroDateTimeBehavior=convertToNull","root","");

            PreparedStatement ps = con.prepareStatement("select v_type from vehicle_type");

            ResultSet rs = ps.executeQuery();
             
            while (rs.next())
            {
                String s = rs.getString(1);
                 bx1.addItem(s);
             }
            ps = con.prepareStatement("select v_name from vehicle_name");
            rs = ps.executeQuery();
             
            while (rs.next())
            {
                String s = rs.getString(1);
                 bx.addItem(s);
             }
                con.close();
       }
    catch (Exception e)
    {
      System.err.println(e.getMessage());
    }
    }

   String str;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTime1 = new org.joda.time.DateTime();
        dateTime2 = new org.joda.time.DateTime();
        dateTimeZoneBuilder1 = new org.joda.time.tz.DateTimeZoneBuilder();
        leble1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        leble2 = new javax.swing.JLabel();
        leble3 = new javax.swing.JLabel();
        g_id = new javax.swing.JTextField();
        v_num1 = new javax.swing.JTextField();
        b_submit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pur = new javax.swing.JTextArea();
        date1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        time1 = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        bx = new javax.swing.JComboBox<>();
        bx1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leble1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        leble1.setForeground(new java.awt.Color(51, 0, 0));
        leble1.setText("Vehicle Type");

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("VEHICLE ENTRY INFORMATIONS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Vehicle Number");

        leble2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        leble2.setForeground(new java.awt.Color(51, 0, 0));
        leble2.setText("Vehicle Colour");

        leble3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        leble3.setForeground(new java.awt.Color(51, 0, 0));
        leble3.setText("Vehicle Name");

        g_id.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        g_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_idActionPerformed(evt);
            }
        });

        v_num1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        v_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_num1ActionPerformed(evt);
            }
        });

        b_submit.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        b_submit.setForeground(new java.awt.Color(0, 0, 51));
        b_submit.setText("Submit");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("Gaurd Id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("Purpose");

        pur.setColumns(20);
        pur.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        pur.setRows(5);
        jScrollPane1.setViewportView(pur);

        date1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("Time");

        time1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 51, 153));
        button1.setText("Color Chooser");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        bx.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        bx.setForeground(new java.awt.Color(0, 0, 102));
        bx.setToolTipText("");
        bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxActionPerformed(evt);
            }
        });

        bx1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        bx1.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(leble2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leble3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leble1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bx1, 0, 206, Short.MAX_VALUE)
                                    .addComponent(bx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(v_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(time1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(g_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(date1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGap(538, 538, 538)
                .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leble3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bx, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(leble1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(leble2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_idActionPerformed

    private void v_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_num1ActionPerformed

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitActionPerformed
       

       try
       {
           Connection cn=null;
           
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jagdev?zeroDateTimeBehavior=convertToNull","root","");
         
            
                   
           String query = " insert into vehicle_info (v_no, v_name, v_type, v_colour)"
                                + " values (?, ?, ?, ?)";

           String number=v_num1.getText();
     
           //int number = Integer.parseInt(num);
       
       //String name=v_name.getText();
       //String type=v_t.getText();
      // String colour=v_c.getText();
       String color=str;
      
      String type=bx1.getSelectedItem().toString();
       String name=bx.getSelectedItem().toString();
      PreparedStatement ptst = cn.prepareStatement(query);
      
      ptst.setString (1, number);
      ptst.setString (2, name);
      ptst.setString (3, type);
      ptst.setString (4, color);
       
       ptst.executeUpdate();
       ptst.close(); 
       
       //System.out.println(color);
    //java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
 //System.out.println(sqlDate);
        
                 //String time1=t.getText();
//            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//	    Date date = new Date();
//            
//           String time=formatter.format(date);
           String pur_pose=pur.getText();
           
           //String gid1 = g_id.getText();
           String gid=s1;
            //System.out.println(gid);
           //int gid = Integer.parseInt(gid1);
 
     
      query = " insert into history (date, v_no, in_time, ingaurd_id, purpose)"
                                + " values (?, ?, ?, ?, ?)";
      
      ptst = cn.prepareStatement(query);
      ptst.setString(1, date2);
      ptst.setString (2, number);
      ptst.setString (3, time2);
      ptst.setString(4, gid);
      ptst.setString (5,pur_pose);
      
      ptst.executeUpdate();
      ptst.close();
      cn.close();
      show f = new show("Insertion Successfully.............");
      f.show();
       }
    catch (Exception e)
    {
      //System.err.println("Got an exception!");
        show f2 = new show("Not Allow Duplicate Vehicle Number....");
           f2.show();
      //System.err.println(e.getMessage());
    }
       
       dispose();
    }//GEN-LAST:event_b_submitActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        final JFrame frame = new JFrame("JColorChooser Demo");
        Color newColor = null ;
                newColor= JColorChooser.showDialog(frame,"Choose Background Color",newColor);
                str=newColor.toString();
               //System.out.println(str);
    }//GEN-LAST:event_button1ActionPerformed

    private void bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bxActionPerformed

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
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_submit;
    private javax.swing.JButton button1;
    private javax.swing.JComboBox<String> bx;
    private javax.swing.JComboBox<String> bx1;
    private javax.swing.JTextField date1;
    private org.joda.time.DateTime dateTime1;
    private org.joda.time.DateTime dateTime2;
    private org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1;
    private javax.swing.JTextField g_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leble1;
    private javax.swing.JLabel leble2;
    private javax.swing.JLabel leble3;
    private javax.swing.JTextArea pur;
    private javax.swing.JTextField time1;
    private javax.swing.JTextField v_num1;
    // End of variables declaration//GEN-END:variables
}