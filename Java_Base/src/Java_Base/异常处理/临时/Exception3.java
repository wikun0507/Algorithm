package Java_Base.异常处理.临时;

import Java_Base.异常处理.自定义异常.MyException;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-18:28
 */
public class Exception3 {
    public static void main(String[] args) {

        try {
            Student student = new Student();
            student.regist(-1000);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;
    public void regist(int id) throws Exception {
        if(id>0){
            this.id = id;
        }else{
//            System.out.println("输入非法");

            /**
             * 抛出运行时异常RuntimeException可以不显式处理，即该regist方法后面不用跟throws
             * 而Exception异常包含了编译时异常，regist方法后面要跟throws，并在调用该方法时使用try-catch进行处理
             */
            //手动抛出异常对象
            //throw new RuntimeException("输入非法");
            //throw new Exception("输入非法");
            throw new MyException("不能乱输入");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
