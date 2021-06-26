package LeetCode.其他.打开转盘锁;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/6/25-10:42
 */
public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        Set<String> record = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        String start = "0000";
        if(start.equals(target)){
            return 0;
        }
        for (int i = 0; i < deadends.length; i++) {
            if(deadends[i].equals(start)){
                return -1;
            }else{
                dead.add(deadends[i]);
            }
        }
        queue.add(start);
        record.add(start);
        int step = 0;
        while (!queue.isEmpty()){
            ++step;
            int limit = queue.size();
            for(int i = 0;i < limit;i++){
                String current = queue.poll();
                List<String> allStatus = allStatus(current);
                for(String str: allStatus){
                    if(str.equals(target)){
                        return step;
                    }
                    if(!dead.contains(str)&&!record.contains(str)){
                        record.add(str);
                        queue.add(str);
                    }
                }
            }
        }
        return -1;
    }

    public String changeStr(String str,int index,int operands){
        char[] chs = str.toCharArray();
        if(chs[index]=='9' && operands==1){
            chs[index] = '0';
        }else if(chs[index]=='0'&& operands==-1){
            chs[index] = '9';
        }else{
            chs[index] = (char)(chs[index]+operands);
        }
        return new String(chs);
    }

    public List<String> allStatus(String current){
        List<String> list = new ArrayList<>();
        for(int i = 0;i<4;i++) {
            list.add(changeStr(current,i,1));
            list.add(changeStr(current,i,-1));
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"0201","0101","0102","1212","2002"};
        String[] strings1 = {"8888"};
        System.out.println(solution.openLock(strings, "0202"));
        System.out.println(solution.openLock(strings1, "0009"));
    }
}

