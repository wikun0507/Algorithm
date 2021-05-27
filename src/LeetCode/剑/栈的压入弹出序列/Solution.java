package LeetCode.剑.栈的压入弹出序列;

import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/5/24-22:20
 */
public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pu = 0;
        int po = 0;
        while (pu < pushed.length && po < popped.length) {
            while (pushed[pu] != popped[po]) {
                stack.push(pushed[pu++]);
                if(pu==pushed.length)
                    break;
            }
            if(pu<pushed.length){
                stack.push(pushed[pu]);
                pu += 1;
            }
            while (!stack.empty() && stack.peek() == popped[po]) {
                stack.pop();
                po++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pu = {1, 2, 3, 4, 5};
        int[] po = {4, 3, 5, 1, 2};
        int[] po2 = {4, 5, 3, 2, 1};
        int[] po3 = {3, 2, 1, 4, 5};

        int[] pu2 = {8, 9, 2, 3, 7, 0, 5, 4, 6, 1};
        int[] po4 = {6, 8, 2, 1, 3, 9, 0, 7, 4, 5};
        System.out.println(solution.validateStackSequences(pu, po));
        System.out.println(solution.validateStackSequences(pu, po2));
        System.out.println(solution.validateStackSequences(pu, po3));
        System.out.println(solution.validateStackSequences(pu2, po4));
    }


}
