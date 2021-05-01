package LeetCode.其他.员工的重要性;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-11:35
 */
public class Solution {
    public static int getImportance(List<Employee> employees, int id) {
//        if(employees.size()==0){
//            return 0;
//        }else if(employees.size()==1){
//            return employees.get(0).importance;
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        int sum = 0;
//        queue.add(employees.get(id-1).id);
//        while(!queue.isEmpty()){
//            Integer tmp = queue.poll();
//            sum+= employees.get(tmp-1).importance;
//            List<Integer> sub = employees.get(tmp-1).subordinates;
//            for(Integer i:sub){
//                System.out.printf(i+" ");
//            }
//            for(int j = 0;j<sub.size();j++){
//                queue.add(sub.get(j));
//            }
//        }
//        return sum;

//        if(employees.size()==0){
//            return 0;
//        }else if(employees.size()==1){
//            return employees.get(0).importance;
//        }
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        Map<Integer,Integer[]> subdation = new HashMap<>();
//        for (Employee employee : employees) {
//            hashMap.put(employee.id, employee.importance);
//            Integer[] tmp = employee.subordinates.toArray(new Integer[0]);
//            subdation.put(employee.id,tmp);
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        int sum = 0;
//        queue.add(id);
//        while(!queue.isEmpty()){
//            Integer tmp = queue.poll();
//            sum+= hashMap.get(tmp);
//            Integer[] sub = subdation.get(tmp);
//            queue.addAll(Arrays.asList(sub));
//        }
//        return sum;
        /**
         * 优化版本
         */
//        if(employees.size()==0){
//            return 0;
//        }else if(employees.size()==1){
//            return employees.get(0).importance;
//        }
//        Map<Integer, Employee> hashMap = new HashMap<>();
//        for (Employee employee : employees) {
//            hashMap.put(employee.id, employee);
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        int sum = 0;
//        queue.offer(id);
//        while(!queue.isEmpty()){
//            Integer curId = queue.poll();
//            sum += hashMap.get(curId).importance;
//            List<Integer> sub = hashMap.get(curId).subordinates;
//            queue.addAll(sub);
//        }
//        return sum;

        /**
         * 递归版本
         */
        Map<Integer, Employee> hashMap = new HashMap<>();
        for (Employee employee : employees) {
            hashMap.put(employee.id, employee);
        }
        return getImportanceHelper(hashMap,id);

    }

    public static int getImportanceHelper(Map<Integer,Employee> map,int curId){
        int size = map.get(curId).subordinates.size();
        int sum = map.get(curId).importance;
        if(size==0){
            return sum;
        }else{
            for(int i = 0;i<map.get(curId).subordinates.size();i++){
                sum += getImportanceHelper(map,map.get(curId).subordinates.get(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> sub1 = new ArrayList<>();
        sub1.add(2);
        Employee employee1 = new Employee(1, 15,sub1);

        List<Integer> sub2 = new ArrayList<>();
        sub2.add(3);
        sub2.add(4);
        Employee employee2 = new Employee(2, 10,sub2);

        List<Integer> sub3 = new ArrayList<>();
        Employee employee3 = new Employee(3, 5,sub3);

        List<Integer> sub4 = new ArrayList<>();
        Employee employee4 = new Employee(4, 5,sub4);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println(getImportance(employees,4));
        System.out.println(getImportance(employees,3));
        System.out.println(getImportance(employees,2));
        System.out.println(getImportance(employees,1));
    }
}
