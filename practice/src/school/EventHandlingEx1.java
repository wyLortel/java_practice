package school;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    private JTextField input;
    private JButton button;
    private JLabel label;

    public MyFrame() {
        super("입력값 에코 (FlowLayout)");

        // 1) 레이아웃
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // 2) 컴포넌트 생성
        label = new JLabel("메시지:");
        input = new JTextField(15);
        button = new JButton("출력");

        // 3) 액션 리스너 정의
        ActionListener echoAction = e -> {
            String text = input.getText();
            if (text.isBlank()) {
                JOptionPane.showMessageDialog(this, "값을 입력하세요!", "경고", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "입력값: " + text, "결과", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("입력값: " + text);
            }
            input.requestFocusInWindow();
            input.selectAll();
        };

        // 버튼과 입력창 모두 액션 연결
        button.addActionListener(echoAction);
        input.addActionListener(echoAction);

        // 4) 조립
        this.add(label);
        this.add(input);
        this.add(button);

        // 5) 기본 설정
        this.setSize(350, 120);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

public class EventHandlingEx1 {
    public static void main(String[] args) {
        // 실행은 EDT에서 (스윙 권장 패턴)
        SwingUtilities.invokeLater(MyFrame::new);
    }
}
