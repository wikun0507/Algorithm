package LeetCode.其他.砌墙;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/2-18:49
 */
public class Solution {
    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i = 0;
        while(i<wall.size()){
            int index = 0;
            for(int j = 0;j<wall.get(i).size();j++){
                int listNum = wall.get(i).get(j);
                index +=listNum;
//                if (!map.containsKey(index)){
//                    map.put(index,1);
//                }else{
//                    map.replace(index, map.get(index)+1);
//                }
                /**
                 * 优化上述过程
                 */
                map.put(index,map.getOrDefault(index,0)+1);
            }
            map.remove(index);
            i++;
        }
        int kongwei = 0;
        for (Integer value : map.values()) {
            kongwei = Math.max(kongwei,value);
        }
        return wall.size()-kongwei;
    }

    public static void main(String[] args) {
        List<List<Integer>> wall = new ArrayList<>();

//        List<Integer> arr1 = new ArrayList<>();
//        arr1.add(1);arr1.add(2);arr1.add(2);arr1.add(1);
//
//        List<Integer> arr2 = new ArrayList<>();
//        arr2.add(3);arr2.add(1);arr2.add(2);
//
//        List<Integer> arr3 = new ArrayList<>();
//        arr3.add(1);arr3.add(3);arr3.add(2);
//
//        List<Integer> arr4 = new ArrayList<>();
//        arr4.add(2);arr4.add(4);
//
//        List<Integer> arr5 = new ArrayList<>();
//        arr5.add(3);arr5.add(1);arr5.add(2);
//
//        List<Integer> arr6 = new ArrayList<>();
//        arr6.add(1);arr6.add(3);arr6.add(1);arr6.add(1);
//
//        wall.add(arr1);wall.add(arr2);
//        wall.add(arr3);wall.add(arr4);
//        wall.add(arr5);wall.add(arr6);

        List<Integer> arr7 = new ArrayList<>();
        arr7.add(1);
        List<Integer> arr8 = new ArrayList<>();
        arr8.add(1);
        List<Integer> arr9 = new ArrayList<>();
        arr9.add(1);

        wall.add(arr7);wall.add(arr8);wall.add(arr9);

        System.out.println(leastBricks(wall));

    }
}
