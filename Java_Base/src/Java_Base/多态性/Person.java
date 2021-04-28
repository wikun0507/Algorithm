package Java_Base.多态性;

public class Person {
    int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showage(){
        System.out.println(age);
    }
    public void eat(){
        System.out.println("我喜欢吃面");
    }

    public void out(int i){
        System.out.println("我是整形的"+i);
    }
    public void out(String i){
        System.out.println("我是String型的"+i);
    }
}
