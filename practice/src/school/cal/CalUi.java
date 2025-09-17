package school.cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalUi extends JFrame {

    private final JTextField inputSpace = new JTextField();
    private final CalLogic logic;

    private String prevOp = ""; // 직전 키 기억 (연산자 중복 방지 등)

    public CalUi(CalLogic logic) {
        super("계산기");
        this.logic = logic;

        setLayout(null);

        // 디스플레이
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
        inputSpace.setBounds(8, 10, 270, 70);
        add(inputSpace);

        // 버튼 패널
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBounds(8, 90, 270, 235);
        add(buttonPanel);

        String[] labels = {"C","÷","×","=","7","8","9","+","4","5","6","-","1","2","3","0"};
        for (int i = 0; i < labels.length; i++) {
            JButton b = new JButton(labels[i]);
            b.setFont(new Font("Arial", Font.BOLD, 20));

            // 색상
            if ("C".equals(labels[i])) b.setBackground(Color.RED);
            else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14)) b.setBackground(Color.BLACK);
            else b.setBackground(Color.GRAY);
            b.setForeground(Color.WHITE);
            b.setBorderPainted(false);

            b.addActionListener(keyHandler());
            buttonPanel.add(b);
        }

        setSize(300, 370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private ActionListener keyHandler() {
        return e -> {
            String op = ((JButton) e.getSource()).getText();

            if ("C".equals(op)) {
                inputSpace.setText("");
                prevOp = "";
                return;
            }

            if ("=".equals(op)) {
                String expr = inputSpace.getText();
                if (!expr.isBlank()) {
                    try {
                        double result = logic.calculate(expr);
                        inputSpace.setText(Double.toString(result));
                        prevOp = "=";
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "식이 올바르지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
                    }
                }
                return;
            }

            // 연산자
            boolean isOp = "+-×÷".contains(op);

            if (isOp) {
                String cur = inputSpace.getText();

                // 첫 글자 음수 허용
                if (cur.isBlank() && "-".equals(op)) {
                    inputSpace.setText("-");
                    prevOp = "-";
                    return;
                }

                // 직전도 연산자면 교체(중복 방지)
                if (!cur.isBlank() && "+-×÷".contains(prevOp)) {
                    inputSpace.setText(cur.substring(0, cur.length() - 1) + op);
                } else if (!cur.isBlank()) {
                    inputSpace.setText(cur + op);
                }

                prevOp = op;
                return;
            }

            // 숫자/점
            inputSpace.setText(inputSpace.getText() + op);
            prevOp = op;
        };
    }

    public void showUI() {
        setVisible(true);
    }
}
