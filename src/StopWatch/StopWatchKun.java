package StopWatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatchKun extends JFrame implements ActionListener {

    Timer timer;
    JLabel label_sec, label_min, label_hour;
    int hour, min, sec;
    JButton startButton, stopButton, resetButton;


    public static void main(String[] args) {
        StopWatchKun frame = new StopWatchKun();
        frame.setBounds(10, 10, 300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("すとっぷうぉっちくん");
        frame.setVisible(true);
    }

    public StopWatchKun() {
        hour = 0;
        min = 0;
        sec = 0;
        label_hour = new JLabel();
        label_min = new JLabel();
        label_sec = new JLabel();

        JPanel labelPanel = new JPanel();
        labelPanel.add(label_hour);
        labelPanel.add(label_min);
        labelPanel.add(label_sec);

        timer = new Timer(1000, this);
        timer.setActionCommand("timer");

        // スタートボタン
        startButton = new JButton("start");
        startButton.addActionListener(this);
        startButton.setActionCommand("start");

        // ストップボタン
        stopButton = new JButton("stop");
        stopButton.addActionListener(this);
        stopButton.setActionCommand("stop");
        stopButton.setEnabled(false);

        // リセットボタン
        resetButton = new JButton("reset");
        resetButton.addActionListener(this);
        resetButton.setActionCommand("reset");
        resetButton.setEnabled(false);

        // パネル作成
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        getContentPane().add(labelPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("start")) {
            stopButton.setEnabled(true);
            startButton.setEnabled(false);
            resetButton.setEnabled(true);

            timer.start();
        } else if (cmd.equals("timer")) {

            if (sec == 60) {
                min += sec / 60;
                sec = 0;
            }

            if (min == 60) {
                hour += min / 60;
                min = 0;
            }

            label_hour.setText(hour + " hour");
            label_min.setText(min + " min");
            label_sec.setText(sec + " sec");

            sec++;
        } else if (cmd.equals("stop")) {
            stopButton.setEnabled(false);
            startButton.setEnabled(true);
            resetButton.setEnabled(true);

            timer.stop();
        } else if (cmd.equals("reset")) {
            resetButton.setEnabled(false);
            stopButton.setEnabled(false);
            startButton.setEnabled(true);

            hour = 0;
            min = 0;
            sec = 0;
        }
    }
}
