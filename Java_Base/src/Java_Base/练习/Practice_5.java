package Java_Base.练习;

public class Practice_5 {
    public static void changeNum(int a){
        a = 0;
    }
    public static void changeCh(char[] str){
       str[0] = 'H';
    }
    public static int changeCh(String str){
        str = "newStr";
        return 0;
    }
    public static void swapNum(int[] array,int m,int n){
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
    public static int fib(int n){
        if(n==1 || n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int stage(int n){
//        if(n==1)
//            return 1;
//        else if(n==2)
//            return 2;
//        return stage(n-1)+stage(n-2);
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        long[] l = new long[n+1];
        l[1] = 1;
        l[2] = 2;
        for(int i = 3;i<=n;i++){
            l[i] = l[i-1]+l[i-2];
        }
        return (int)l[n];
    }
    public static void main(String[] args) {
/*        int result = 1;
        changeNum(result);
        System.out.println(result); //1

        String str1 = "ZWG";
        String str2 = str1;
        changeStr(str1);
        System.out.println(str1);
        str1.replace(str1.charAt(0),'H');//repalce函数有返回值，返回替换后的字符串
        System.out.println("str1:"+str1+" "+"str2:"+str2);
        str2 = "ZWZ";
        System.out.println("str1:"+str1+" "+"str2:"+str2);*/


        String str1 = "ZWG";
        System.out.println(changeCh(str1));
        char[] ch = str1.toCharArray();
        changeCh(ch);  //传了地址。
        System.out.println(ch[0]);

//        int[] a = {1,2,3,4,5};
//        swapNum(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));

//        System.out.println(fib(44));

//        System.out.println(stage(44));
    }
}
