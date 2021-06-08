package LeetCode.剑.字符串的排列;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author WiKunZ
 * @Date 2021/6/8-19:55
 */
public class Solution {

    public String[] permutation(String s) {
        char[] ori = s.toCharArray();
        boolean[] visited = new boolean[s.length()];
        Set<String> set = new HashSet<>();
        combine(set,"",ori,visited);
        return set.toArray(new String[0]);
    }

    public void combine(Set<String> set,String current,char[] chars,boolean[] visited){
        if(current.length() == chars.length){
            set.add(current);
            return;
        }
        for(int i = 0;i< chars.length;i++){
            if(!visited[i]){
                visited[i] = true;
                combine(set,current+chars[i], chars, visited);
                visited[i] =false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.permutation("abc")));
        System.out.println(Arrays.toString(solution.permutation("a")));
        System.out.println(Arrays.toString(solution.permutation("ab")));
        System.out.println(Arrays.toString(solution.permutation("aba")));
    }
}
