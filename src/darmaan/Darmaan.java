
package darmaan;

 // @author Jawad _PC
 
public class Darmaan {

   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        NewJFrame2 jf = new NewJFrame2();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreattingTables tb = new CreattingTables();
                tb.tables();
                jf.setVisible(true);
        
            }
        });
        
         try {
            for(int i = 0; i<=100 ; i++){
                Thread.sleep(50);
            }
        } catch (Exception e) {
        }
        
        
        jf.dispose();
        Demo dm = new Demo();
                if(dm.countRows()==0||dm.countRows()==20||dm.countRows()==100||dm.countRows()==200||dm.countRows()==400||dm.countRows()==1000||dm.countRows()==2000||dm.countRows()==5000){
                
                NewJFrame fr = new NewJFrame();
                fr.setVisible(true);
                }else{
               
                BaseLog lg = new BaseLog();
                lg.setVisible(true);
                }

       
    }
    
    
}
