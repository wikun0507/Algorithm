package Java_Base.常用类.String;

/**
 * @Author WiKunZ
 * @Date 2021/5/11-20:04
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverse(str,2,5));
    }

    public static String  reverse(String str,int start,int end){
        char[] ch = str.toCharArray();
        while(end>start){
            char tmp = ch[end];
            ch[end--] = ch[start];
            ch[start++] = tmp;
        }
        return String.valueOf(ch);
    }
}
