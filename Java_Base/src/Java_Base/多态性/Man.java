package Java_Base.多态性;

public class Man extends Person{
    int age = 15;
    @Override
    public void eat(){
        System.out.println("我喜欢吃香批");
    }
    @Override
    public void out(String str){
        System.out.println("我是ManString型的"+str);
    }
    @Override
    public void out(int i){
        System.out.println("我是ManInt型的"+i);
    }
    public void fuck(){
        System.out.println("fuck");
    }

    @Override
    public void showage(){
        System.out.println(age);
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
