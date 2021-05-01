package LeetCode.其他.员工的重要性;

import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-11:38
 */
public class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
