
package darmaan;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jawad _PC
 */
public class CreattingTables {

public void tables(){
        
        final String USERDETAILS = "create table if not exists registeration(name varchar(100) , last_name varchar(100) , clinic_name varchar(100) , phone varchar(100) , email varchar(100) , username varchar(100) , pass varchar(100));";
        final String SICKDETAILS = "create table if not exists sickdetails(id int auto_increment ,id_number varchar(100) primary key , name varchar(100),last_name varchar(100), age varchar(100), b_sick varchar(100),phone varchar(100),kindof_sick varchar(1000),total varchar(100),first varchar(100), second varchar(100), third varchar(100),remain varchar(100),date varchar(100),sex varchar(100),address varchar(500),fourth varchar(100),fifth varchar(100),sixth varchar(100));";
        final String TEETHINFO = "create table if not exists tooth_info(id_number varchar(100), name varchar(100), date_1 varchar(50),date_2 varchar(50),date_3 varchar(50),date_4 varchar(50),date_5 varchar(50),date_6 varchar(50),description_1 varchar(500),description_2 varchar(500),description_3 varchar(500),description_4 varchar(500),description_5 varchar(500),description_6 varchar(500),teeth_location varchar(1000),teeth_num varchar(100));";
        final String CHICK = "create table if not exists chick(jen varchar(100));";
        try {
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection("jdbc:h2:~/dintest", "jawad", "1234");
            Statement pst = con.createStatement();
            pst.execute(USERDETAILS);
            pst.execute(SICKDETAILS);
            pst.execute(TEETHINFO);
            pst.execute(CHICK);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreattingTables.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreattingTables.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
