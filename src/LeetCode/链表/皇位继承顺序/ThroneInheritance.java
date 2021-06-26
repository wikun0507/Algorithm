package LeetCode.链表.皇位继承顺序;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ThroneInheritance {
    String king;
    Map<String,List<String>> peoples = new HashMap<>();
    Map<String, Boolean> isDie = new HashMap<>();

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        peoples.put(kingName,new ArrayList<>());
        isDie.put(kingName,false);
    }

    public void birth(String parentName, String childName) {
        peoples.put(childName,new ArrayList<>());
        peoples.get(parentName).add(childName);
        isDie.put(childName,false);
    }

    public void death(String name) {
        isDie.put(name,true);
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        DFS(result,king);
        return result;
    }

    public void DFS(List<String> result,String name){
        if(name==null){
            return;
        }
        if(!isDie.get(name))    result.add(name);
        for(int i = 0;i<peoples.get(name).size();i++){
            String tmp = peoples.get(name).get(i);
            DFS(result,tmp);
        }
    }
    public static void main(String[] args) {
        ThroneInheritance t = new ThroneInheritance("king");
        t.getInheritanceOrder();
        t.birth("king","logan");
        t.birth("logan","hosea");
        t.birth("king","leonard");
        t.death("king");
        System.out.println(t.getInheritanceOrder());
        t.birth("logan","carl");

    }

}