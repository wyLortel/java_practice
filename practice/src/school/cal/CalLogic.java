package school.cal;

import java.util.ArrayList;
import java.util.List;

public class CalLogic {

    // 식을 숫자·연산 기호로 분리
    private List<String> tokenize(String input) {
        List<String> eq = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '+' || ch == '-' || ch == '×' || ch == '÷') {
                // 앞에 모아둔 숫자 먼저 추가
                if (num.length() > 0) {
                    eq.add(num.toString());
                    num.setLength(0);
                }
                // 첫 글자가 '-'이면 음수 시작 허용 (단, 바로 뒤 숫자가 와야 의미 있음)
                if (ch == '-' && (eq.isEmpty())) {
                    num.append(ch);
                } else {
                    eq.add(String.valueOf(ch));
                }
            } else if (Character.isDigit(ch) || ch == '.') {
                num.append(ch);
            } else if (Character.isWhitespace(ch)) {
                // 무시
            } else {
                throw new IllegalArgumentException("지원하지 않는 문자: " + ch);
            }
        }

        if (num.length() > 0) {
            eq.add(num.toString());
        }

        // 빈 토큰 제거
        eq.removeIf(String::isEmpty);
        return eq;
    }

    public double calculate(String input) {
        if (input == null || input.isBlank()) return 0.0;

        List<String> eq = tokenize(input);

        // 1단계: 곱셈/나눗셈 먼저 처리해 중간 결과로 치환
        for (int i = 0; i < eq.size(); i++) {
            String s = eq.get(i);

            if ("×".equals(s) || "÷".equals(s)) {
                double left = Double.parseDouble(eq.get(i - 1));
                double right = Double.parseDouble(eq.get(i + 1));
                double res = "×".equals(s) ? (left * right) : (left / right);

                // i-1, i, i+1 치우고 그 자리에 결과 넣기
                eq.set(i - 1, Double.toString(res));
                eq.remove(i);     // 연산자 제거
                eq.remove(i);     // 오른쪽 피연산자 제거 (앞에서 하나 빠져 index 유지)
                i--;              // 현재 위치를 결과 토큰으로 되돌리기
            }
        }

        // 2단계: 덧셈/뺄셈 처리
        double total = 0.0;
        String mode = "set"; // set/add/sub

        for (String t : eq) {
            switch (t) {
                case "+" -> mode = "add";
                case "-" -> mode = "sub";
                default -> {
                    double v = Double.parseDouble(t);
                    if ("set".equals(mode)) total = v;
                    else if ("add".equals(mode)) total += v;
                    else if ("sub".equals(mode)) total -= v;
                }
            }
            // 표시 자리수 제한(6자리 반올림)
            total = Math.round(total * 100000) / 100000.0;
        }

        return total;
    }
}
