package LeetCode.递归.字符串的排列;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/6/22-11:33
 */
public class Solution {
    Set<String> result = new HashSet<>();
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] visited = new boolean[s.length()];
        DFS(chars,visited,"");
        return result.toArray(new String[0]);
    }

    public void DFS(char[] chars,boolean[] visited,String current){
        if(current.length()==chars.length){
            result.add(current);
            return;
        }
        for(int i = 0;i< chars.length;i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(chars,visited,current+chars[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.permutation("aab")));
    }
}
