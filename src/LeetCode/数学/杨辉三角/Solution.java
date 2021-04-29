package LeetCode.数学.杨辉三角;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-11:13
 */
//public class Solution {
//    public  static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        List<Integer> row = new ArrayList<>();
//        for(int i = 0;i<numRows;i++){
//            row.add(0,1);
//            for(int j = 1;j<row.size()-1;j++){
//                row.set(j,row.get(j+1)+row.get(j));
//            }
//            result.add(new ArrayList<>(row));
//        }
//        return result;
//    }

public class Solution {
    public  static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(0,1);
            for(int j = 1;j<i;j++){
                int temp = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                row.add(temp);
            }
            if(numRows>=1&&i!=0){
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
    }
}
