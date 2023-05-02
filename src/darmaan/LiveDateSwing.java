package darmaan;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LiveDateSwing extends JFrame {

    private JLabel label;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

    public static void main(String[] args) {
      new LiveDateSwing();
    }

    public LiveDateSwing() {
      label = new JLabel(" ");
      add(label);
      setVisible(true);

      pack();

      Runnable runnable = new Runnable() {

        @Override
        public void run() {
          while (true) {
            Date date = getDate();
            String dateString = simpleDateFormat.format(date);
            label.setText(dateString);
            try {
              Thread.sleep(1000);
            }
            catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
    };

      Thread t = new Thread(runnable);
      t.start();
    }

    public static java.util.Date getDate() {
      java.util.Date date = new java.util.Date();
      return date;
    }
}