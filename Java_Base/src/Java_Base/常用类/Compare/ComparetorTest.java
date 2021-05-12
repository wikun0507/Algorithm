package Java_Base.常用类.Compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-16:12
 */
public class ComparetorTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator() {
            //按照字符串从大到小排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String&&o2 instanceof String){
                    String str1 = (String) o1;
                    String str2 = (String) o2;
                    return -str1.compareTo(str2);
                }
               throw new RuntimeException("类型不匹配！");
            }
        });
        System.out.println(Arrays.toString(arr));

        Goods[] goods = new Goods[5];
        goods[0] = new Goods("DD",45);
        goods[1] = new Goods("CC",5);
        goods[2] = new Goods("EE",15);
        goods[3] = new Goods("AA",19);
        goods[4] = new Goods("AA",9);
        Arrays.sort(goods, new Comparator() {
            //按照产品名称从低到高排序,再按照价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods&&o2 instanceof Goods){
                    Goods goods1 = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if(goods1.getName().equals(goods2.getName())){
                        return -Double.compare(goods1.getPrice(),goods2.getPrice());
                    }else {
                        return goods1.getName().compareTo(goods2.getName());
                    }
                }
                throw new RuntimeException("类型不匹配！");
            }
        });
        System.out.println(Arrays.toString(goods));

    }
}
