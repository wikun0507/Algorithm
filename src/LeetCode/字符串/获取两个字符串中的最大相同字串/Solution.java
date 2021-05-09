package LeetCode.字符串.获取两个字符串中的最大相同字串;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-15:20
 */
public class Solution {
    public String getSame(String str1,String str2){
        String MinStr = str1.length()>str2.length()?str2:str1;
        String BigStr = str1.length()>str2.length()?str1:str2;
        int Min = MinStr.length();
        String result = "";
        for(int i = 0;i<Min;i++){
            for(int j = i+1;j<Min;j++){
                String tmp = MinStr.substring(i,j);
                if (BigStr.contains(tmp)){
                    result = result.length()>tmp.length()?result:tmp;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getSame("allbo", "cvhellobnm"));
    }
}
