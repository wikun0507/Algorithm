package LeetCode.字符串.前K个高频单词;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/20-8:32
 */
public class Solution {
    /**
     * 调API
     */
//    public List<String> topKFrequent(String[] words, int k) {
//        Map<String,Integer> map = new TreeMap<>();
//        int index = 0;
//        while(index< words.length){
//            if(!map.containsKey(words[index])){
//                map.put(words[index],1 );
//            }else{
//                map.replace(words[index], map.get(words[index])+1 );
//            }
//            index++;
//        }
//        List<Map.Entry<String,Integer>> result = new ArrayList<>(map.entrySet());
//        Collections.sort(result, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                if(o1 instanceof Map.Entry&&o2 instanceof Map.Entry){
//                    int tmp = -Integer.compare(o1.getValue(),o2.getValue());
//                    if(tmp!=0){
//                        return tmp;
//                    }else{
//                        return o1.getKey().compareTo(o2.getKey());
//                    }
//                }
//                throw new RuntimeException("类型不匹配");
//            }
//        });
//        List<String> f = new ArrayList<>();
//        for(int i = 0;i<k;i++){
//            f.add(result.get(i).getKey());
//        }
//        return f;
//    }

    /**
     * 最小堆解决
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1 );
        }
        System.out.println(map);
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //System.out.println("o1: "+o1+" o2:"+o2);
                if(map.get(o1).equals(map.get(o2))){
                    System.out.println(o1+" 值相等于 "+o2+" 比较字符");
                    return o2.compareTo(o1);
                }else {
                    System.out.println(o1+" 值不相等于 "+o2);
                    return map.get(o1)-map.get(o2);
                }
            }
        });
        for(String str:map.keySet()){
            q.add(str);
            System.out.println(q);
//            if(q.size()>k){
//                q.poll();
//            }
        }
        System.out.println("final: "+q);
        List<String> result = new ArrayList<>(k);
        while(q.size()>0){
            result.add(q.poll());
        }
        Collections.reverse(result);
        return result;
    }

//    public List<String> topKFrequent(String[] ws, int k) {
//        Map<String, Integer> map = new HashMap<>();
//        for (String w : ws) map.put(w, map.getOrDefault(w, 0) + 1);
//        System.out.println(map);
//        PriorityQueue<Object[]> q = new PriorityQueue<>(k, (a, b)->{
//            // 如果词频不同，根据词频升序
//            int c1 = (Integer)a[1], c2 = (Integer)b[1];
//            System.out.println("c1 = " + c1+" c2= "+c2);
//            if (c1 != c2) return c1 - c2;
//            // 如果词频相同，根据字典序正序
//            String s1 = (String)a[0], s2 = (String)b[0];
//            System.out.println("s1 = " + s1+" s2= "+s2);
//            System.out.println(s1.compareTo(s2));
//            return s1.compareTo(s2);
//        });
//        for (String s : map.keySet()) {
//            q.add(new Object[]{s,map.get(s)});
//            if(q.size()>k)
//                q.poll();
//        }
//        List<String> ans = new ArrayList<>();
//        while (!q.isEmpty()) ans.add((String)q.poll()[0]);
//        Collections.reverse(ans);
//        return ans;
//    }

    public static void main(String[] args) {
        String[] str1 = {"i", "love", "leetcode", "i", "love", "coding"};
        String[] str2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        Solution solution = new Solution();
        System.out.println(solution.topKFrequent(str1, 2));
        //System.out.println(solution.topKFrequent(str2, 4));
        //System.out.println('i');
    }
}
