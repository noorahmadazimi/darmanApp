
package darmaan;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Registeration extends javax.swing.JFrame {
    public Registeration() {
        initComponents();
//        
 setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/PicS/MainLogo.png")));
 setTitle("درمان");
        name.setEnabled(false);
        setResizable(false);
        UIManager.put("OptionPane.cancelButtonText","لغو");
      UIManager.put("OptionPane.okButtonText", "تایید");
      UIManager.put("OptionPane.yesButtonText", "تایید");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ragisterLabel = new javax.swing.JLabel();
        ragisterName = new javax.swing.JLabel();
        ragisterLastName = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        registerPhone = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        registeremailAddress = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        registerPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        registerConfirmPass = new javax.swing.JLabel();
        registerUsername = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        recommendition = new javax.swing.JLabel();
        savejButton1 = new javax.swing.JButton();
        clinicname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 522));
        getContentPane().setLayout(null);

        ragisterLabel.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        ragisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        ragisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ragisterLabel.setText("مشخصات خود را وارد نمایید");
        getContentPane().add(ragisterLabel);
        ragisterLabel.setBounds(230, 20, 410, 36);

        ragisterName.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        ragisterName.setForeground(new java.awt.Color(255, 255, 255));
        ragisterName.setText("نام :");
        getContentPane().add(ragisterName);
        ragisterName.setBounds(530, 70, 80, 20);

        ragisterLastName.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        ragisterLastName.setForeground(new java.awt.Color(255, 255, 255));
        ragisterLastName.setText("تخلص :");
        getContentPane().add(ragisterLastName);
        ragisterLastName.setBounds(530, 110, 110, 20);

        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        name.setText("نام داکتر را وارد کنید ");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(360, 70, 150, 20);

        lastname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lastname.setBorder(null);
        getContentPane().add(lastname);
        lastname.setBounds(360, 110, 149, 20);

        registerPhone.setBackground(new java.awt.Color(255, 255, 255));
        registerPhone.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        registerPhone.setForeground(new java.awt.Color(255, 255, 255));
        registerPhone.setText("شماره تماس :");
        getContentPane().add(registerPhone);
        registerPhone.setBounds(530, 190, 100, 30);

        phoneNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        phoneNumber.setBorder(null);
        getContentPane().add(phoneNumber);
        phoneNumber.setBounds(360, 190, 150, 20);

        registeremailAddress.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        registeremailAddress.setForeground(new java.awt.Color(255, 255, 255));
        registeremailAddress.setText("ایمل آدرس :");
        getContentPane().add(registeremailAddress);
        registeremailAddress.setBounds(530, 230, 130, 30);

        emailAddress.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        emailAddress.setBorder(null);
        getContentPane().add(emailAddress);
        emailAddress.setBounds(360, 230, 150, 20);

        registerPassword.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        registerPassword.setForeground(new java.awt.Color(255, 255, 255));
        registerPassword.setText("رمز کاربری :");
        getContentPane().add(registerPassword);
        registerPassword.setBounds(530, 310, 120, 30);

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(360, 310, 150, 20);

        confirmPassword.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        confirmPassword.setBorder(null);
        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(360, 350, 150, 20);

        registerConfirmPass.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        registerConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        registerConfirmPass.setText("تایید رمز کاربری :");
        getContentPane().add(registerConfirmPass);
        registerConfirmPass.setBounds(530, 350, 160, 30);

        registerUsername.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        registerUsername.setForeground(new java.awt.Color(255, 255, 255));
        registerUsername.setText("نام کاربری :");
        getContentPane().add(registerUsername);
        registerUsername.setBounds(530, 270, 110, 30);

        username.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        username.setBorder(null);
        getContentPane().add(username);
        username.setBounds(360, 270, 150, 20);

        recommendition.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        recommendition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recommendition.setText("برای امنیت بیشتر رمز کاربریتان حداقل باید ۸ رقم  و ترکیبی از اعداد حروف و علامه ها باشد!!");
        getContentPane().add(recommendition);
        recommendition.setBounds(190, 460, 486, 27);

        savejButton1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        savejButton1.setText("ثبت");
        savejButton1.setBorder(null);
        savejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(savejButton1);
        savejButton1.setBounds(440, 400, 70, 20);

        clinicname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        clinicname.setText("کلینیک ترمیم و زیبایی ");
        clinicname.setBorder(null);
        getContentPane().add(clinicname);
        clinicname.setBounds(360, 150, 150, 20);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("نام کلینیک :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 150, 120, 30);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicS/register.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void savejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButton1ActionPerformed
       
        
           String name = this.name.getText();
           String last = lastname.getText();
           String clinicName=clinicname.getText();
           String mobileNum = phoneNumber.getText();
           String emai = emailAddress.getText();
           String userName = username.getText();
           Demo dm = new Demo();
           char[] password1 = jPasswordField1.getPassword();
           
           String password = String.valueOf(password1);
           
           char [] newPass1 = confirmPassword.getPassword();
           String newPass = String.valueOf(newPass1);
        
        int num = JOptionPane.showOptionDialog(null, "مشخضات ذخیره گردد!!", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(num==0){
            
           if(userName.trim().isEmpty()|| password.trim().isEmpty()|| newPass.trim().isEmpty()){
           
           JOptionPane.showMessageDialog(null, "وارد کردن نام کاربری و رمز عبور الزامی می باشد!!","هشدار",JOptionPane.OK_OPTION);
           }else if(password.equals(newPass)){
           
               try {
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection("jdbc:h2:~/dintest", "jawad", "1234");
            Statement st;
            
                      
            String qury ="insert into "+Constances.TableNames.UserDetails+" values('"+name+"','"+last+"','"+clinicName+"','"+mobileNum+"','"+emai+"','"+userName+"','"+password+"')";
            if(con!=null){
            st = con.createStatement();
            int a = st.executeUpdate(qury);
            
            
            
            if(a!=0){
            
               
                JOptionPane.showMessageDialog(null, "مشخصات شما موفقانه ذخیره گردید","",JOptionPane.OK_OPTION);
                     
            dispose();
            dm.setVisible(true);
            
            }
            else{
            JOptionPane.showMessageDialog(null, "مشخصات شما ذخیره نگردید","",JOptionPane.OK_OPTION);
            
            }
            
                
            }
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        }

           
           } else{
        
           JOptionPane.showMessageDialog(null, "رمز تطابق ندارد!!","هشدار",JOptionPane.OK_OPTION);
           
           }
            
        
        }
        
        
        
                    
            
                   
    }//GEN-LAST:event_savejButton1ActionPerformed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setEnabled(true);
        name.setText("");
        
    }//GEN-LAST:event_nameMouseClicked

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clinicname;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel ragisterLabel;
    private javax.swing.JLabel ragisterLastName;
    private javax.swing.JLabel ragisterName;
    private javax.swing.JLabel recommendition;
    private javax.swing.JLabel registerConfirmPass;
    private javax.swing.JLabel registerPassword;
    private javax.swing.JLabel registerPhone;
    private javax.swing.JLabel registerUsername;
    private javax.swing.JLabel registeremailAddress;
    private javax.swing.JButton savejButton1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
