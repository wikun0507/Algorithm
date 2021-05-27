package LeetCode.剑.包含min函数的栈;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/23-22:14
 */
class MinStack {
    int[] stack;
    int[] record;
    int indexPop;
//    int preSmallIndex = 0;
//    int nowMin = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new int[20000];
        record = new int[20000];
        indexPop = 0;
    }

    public void push(int x) {
        stack[indexPop] = x;
        if(indexPop==0){
            record[indexPop] = x;
        }else {
            record[indexPop] = Math.min(record[indexPop-1],x);
        }
        indexPop++;
    }

    public void pop() {
        stack[indexPop-1] = 0;
        record[indexPop-1] = 0;
        indexPop--;
        if(indexPop<0)
            indexPop = 0;
    }

    public int top() {
        return stack[indexPop-1];
    }

    public int min() {
        return record[indexPop-1];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop(); //-2 0
        System.out.println(minStack.top()); //0
        System.out.println(minStack.min()); //-2
        minStack.pop(); //-2
        System.out.println(minStack.top());//-2
        System.out.println(minStack.min());//-2
        minStack.pop();
        System.out.println(Arrays.toString(minStack.stack));
    }
}