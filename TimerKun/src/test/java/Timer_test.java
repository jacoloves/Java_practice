import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Timer_test extends JFrame {

    DClockView aClock;

    public Timer_test(String title) {
        super(title);
        int winWidth = 400;
        int winHeight = 400;
        setSize(winWidth, winHeight);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        aClock = new DClockView(winWidth, winHeight);
        aClock.setLocation(0, 0);
        getContentPane().add(aClock);
        repaint();
    }


    public static void main(String[] args) {
        Timer_test f = new Timer_test("デジタル時計");

    }

    class DClockView extends JComponent implements Runnable {

        Thread thread = null;
        int ihour, imin, isec;
        Font font;

        /**
         * コンストラクタ
         *
         *
         * @param w
         * @param h
         */

        public DClockView(int w, int h) {
            setSize(w, h);
            font = new Font("Lucida Blackletter", Font.BOLD, 72);
            setHMS();
            thread = new Thread(this);
            thread.start();
            repaint();
        }

        /**
         * 時刻の表示
         */

        private void setHMS() {
            Calendar now = Calendar.getInstance();
            ihour = now.get(Calendar.HOUR_OF_DAY);
            imin = now.get(Calendar.MINUTE);
            isec = now.get(Calendar.SECOND);
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.WHITE);
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.setColor(Color.RED);
            g2.setFont(font);

            String clock = String.format("%02d:%02d:%02d", ihour, imin, isec);
            g2.drawString(clock, 50, 200);
        }


        @Override
        public void run() {
            Thread.currentThread().setPriority(Thread.NORM_PRIORITY-3);
            while (thread != null) {
                try {
                    setHMS();
                    repaint();
                    thread.sleep(20);
                } catch (InterruptedException e) { }
            }
            thread = null;
        }
    }
}
