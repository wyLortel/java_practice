package ren1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(100, 2);
        System.out.println(result);
    }
}



class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}