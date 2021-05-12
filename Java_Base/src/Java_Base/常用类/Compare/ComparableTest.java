package Java_Base.常用类.Compare;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-15:27
 */
public class ComparableTest {

    public static void main(String[] args) {
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Goods[] goods = new Goods[5];
        goods[0] = new Goods("联想",45);
        goods[1] = new Goods("小米",5);
        goods[2] = new Goods("华为",15);
        goods[3] = new Goods("微软",9);
        goods[4] = new Goods("AA",9);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }


}
