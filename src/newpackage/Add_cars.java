/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Add_cars.java
 *
 * Created on Jun 30, 2019, 3:32:27 PM
 */

package newpackage;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Add_cars extends javax.swing.JFrame {

    /** Creates new form Add_cars */
    public Add_cars() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 48)); // NOI18N
        jLabel1.setText("   \"ENTER YOUR CAR DETAIL\"");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 30, 870, 50);

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel2.setText("ENTER EX-SHOWROOM PRICE    ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 450, 410, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mercedese", "Lamborghini", "BMW", "Audi", "Cadillac", " ", " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(390, 100, 150, 20);

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel3.setText("SELECT COMPANY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 240, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(390, 450, 300, 40);

        jLabel4.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel4.setText("SELECT MODEL NAME ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 290, 40);

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel5.setText("ENTER MILEAGE ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 240, 240, 40);

        jLabel6.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel6.setText("ENTER ENGINE STRENGTH");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 310, 350, 40);

        jLabel7.setFont(new java.awt.Font("Bell MT", 3, 24));
        jLabel7.setText("ENTER TRANSMOSSION");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 380, 310, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(380, 160, 310, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(380, 230, 310, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 36));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(380, 310, 310, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton1.setText("ADD CAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(710, 250, 130, 110);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("AUTOMATIC ");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(380, 390, 89, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MANUAL");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(520, 390, 67, 23);

        jMenu1.setText("File");

        jMenuItem1.setText("back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Manufacturer=(String)jComboBox1.getSelectedItem();
          String Model_Name=jTextField2.getText();
          String Mileage =jTextField3.getText();
          String Engine= jTextField4.getText();
          String trans = "";
          if(jRadioButton1.isSelected())
          {
          trans="Automatic";
          }
          else if(jRadioButton1.isSelected())
          {
         trans="Manual";
          }
          String Price=jTextField1.getText();
          try {
              Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/project","root","123");
            Statement s=c.createStatement();
            String query;
           query=" insert into "+Manufacturer+" values('"+Model_Name+"','"+Mileage+"','"+Engine+"','"+trans+"','"+Price+"');";
             s.executeUpdate(query);
              JOptionPane.showMessageDialog(null," car added  successully");
        }
          catch (Exception e) {
          JOptionPane.showMessageDialog(null, e.getMessage());

          }
                          Audi a1= new Audi();
                                    a1.setVisible(false);
                                   jComboBox1.addItem(Model_Name);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       User u1= new User();
       u1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
