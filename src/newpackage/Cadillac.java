/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cadillac.java
 *
 * Created on Jun 23, 2019, 11:08:00 AM
 */

package newpackage;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class Cadillac extends javax.swing.JFrame {

    /** Creates new form Cadillac */
    public Cadillac() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Freestyle Script", 3, 36));
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("   HERE ARE SOME CARS MANUFACTURED BY  Cadillac");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 24));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Search  model");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 20, 180, 30);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 24));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("SELECT MODEL");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 80, 200, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT CAR", "Porsche Cayenne", "Porsche Panamera", "Porsche 718", "Porsche 911", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(230, 80, 130, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(230, 20, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/cadillac logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(560, 0, 290, 190);

        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "MODEL NAME", "MILEAGE", "ENGINE", "TRANSMISSION", "PRICE_EX_SHOWROOM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 190, 850, 60);

        jLabel3.setText("select car");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 10, 10)));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 260, 470, 330);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icons8-color-48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(420, 20, 60, 30);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setForeground(new java.awt.Color(0, 204, 204));

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icons8-home-32.png"))); // NOI18N
        jMenuItem1.setText("HOME");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Car_Page1 h1= new   Car_Page1();
        h1.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Model_Name=(String)jComboBox1.getSelectedItem();
        DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
        String Modelname;
        String Mileage1;
        String transmission1;
        String  Engine1;
        String  Price_Ex_showroom1;
        try {
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/project","root","123");
            Statement s=c.createStatement();
            String query;
            query="  select * from cadillac where Model_Name ='"+Model_Name+"' ; ";
            ResultSet rs  =s.executeQuery(query);
            if(rs.next()) {
                do
                {
                    Modelname=rs.getString(1);
                    Mileage1 = rs.getString(2);
                    Engine1 =rs.getString(3);
                    transmission1=rs.getString(4);
                    Price_Ex_showroom1=rs.getString(5);
                  Object a[]={Modelname,Mileage1,Engine1,transmission1,Price_Ex_showroom1};
                    d.addRow(a);
                }while(rs.next());

            } else{

                JOptionPane.showMessageDialog(null, "table is empty");
            }
            c.close();
            rs.close();
            s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
       }
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name = jTextField1.getText();
       DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
       String Modelname;
        String Mileage1;
        String transmission1;
        String  Engine1;
        String  Price_Ex_showroom1;
        try {
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/project","root","123");
            Statement s=c.createStatement();
            String query;
            query="  select * from cadillac where Model_Name like'%"+name+"%' ; ";
            ResultSet rs  =s.executeQuery(query);
            if(rs.next()) {
                do
                {
                    Modelname=rs.getString(1);
                    Mileage1 = rs.getString(2);
                    Engine1 =rs.getString(3);
                    transmission1=rs.getString(4);
                   Price_Ex_showroom1=rs.getString(5);
                    Object a[]={Modelname,Mileage1,Engine1,transmission1,Price_Ex_showroom1};
                    d.addRow(a);
                }while(rs.next());
            } else{
                JOptionPane.showMessageDialog(null, "table is empty");
            }
            c.close();
            rs.close();
            s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadillac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
