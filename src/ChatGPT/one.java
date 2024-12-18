package ChatGPT;

import java.awt.*;
import java.awt.event.*;

public class one {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me!");

        button.setBounds(50, 100, 100, 30);
        frame.add(button);

        // 設定按鈕點擊事件
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // 關閉視窗
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
