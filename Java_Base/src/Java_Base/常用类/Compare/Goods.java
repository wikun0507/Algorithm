package Java_Base.常用类.Compare;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-15:47
 */
public class Goods implements Comparable{
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //指定商品比较大小的方式,按价格排由低到高
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods tmp = (Goods) o;
            if(this.price>tmp.price)
                return 1;
            else if(this.price< tmp.price) {
                return -1;
            }
            else{
                //return 0;
                //如果相等，再按照名字来排序
                return this.name.compareTo(tmp.name);
            }

        }
        throw new RuntimeException("传入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
