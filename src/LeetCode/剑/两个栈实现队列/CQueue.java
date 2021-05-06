package LeetCode.剑.两个栈实现队列;

import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/5/6-16:25
 */
public class CQueue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        stackIn.add(value);
    }

    public int deleteHead() {
        if (!stackIn.empty()&&stackOut.empty()){
            while(!stackIn.empty()){
                stackOut.add(stackIn.pop());
            }
            return stackOut.pop();
        }else if(stackIn.empty()&&stackOut.empty()){
            return -1;
        }else{
            return stackOut.pop();
        }
    }
}
