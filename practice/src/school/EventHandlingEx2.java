package school;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import java.awt.*;

class MyFrame2 extends JFrame {
    JButton jb;

    public MyFrame2() {
        super("판떼기 이름");

        // (1) 버튼 + 리스너
        jb = new JButton("날 눌러줘");
        jb.addActionListener(e -> System.out.println("버튼이 클릭됨"));

        // (2) 이미지 라벨
        ImageIcon icon = new ImageIcon("https://img.etnews.com/news/article/2025/03/24/news-p.v1.20250324.5013b084dfb54f06b87968ca7424bf01_P1.jpg"); // 프로젝트 기준 상대경로
        JLabel imgLabel = new JLabel(icon);

        // (3) 레이아웃에 배치
        setLayout(new BorderLayout());
        add(imgLabel, BorderLayout.CENTER);
        add(jb, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();              // 이미지 크기에 맞춰 창 크기 조정
        setLocation(200,200);
        setVisible(true);
    }
}

public class EventHandlingEx2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyFrame::new); // EDT 권장
    }
}

