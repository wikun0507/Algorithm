package Java_Base.练习;

import java.util.Scanner;

public class Practice_1 {
//    public static void tenTotwo(int tmp){
//        List<Integer> result = new ArrayList<Integer>();
//        while (tmp>0){
//            result.add(tmp%2==1?1:0);
//            tmp /= 2;
//        }
//        for(int i = result.size()-1;i>=0;i--){
//            System.out.print(result.get(i));
//        }
//    }
//    public static void getEach(int num){
//        List<Integer> result = new ArrayList<Integer>();
//        while(num!=0){
//            int tmp = num%10;
//            result.add(tmp);
//            num /= 10;
//        }
//        for(int i = 0;i<result.size();i++){
//            System.out.print(result.get(i));
//        }
//    }

    public static void main(String[] args) {
//        int a = 8;
//        tenTotwo(a);
//        int b = 109874;
//        getEach(b);
//        int a = 0b1101;
//        int b = 0b0110;
//        int result = a&b;
//        System.out.println(Integer.toBinaryString(result));

//        int c = -16;
//        System.out.println(c);
//        c = c>>2;
//        System.out.println(Integer.toBinaryString(c));
//        System.out.println(c);

        /**
         * 位运算交换两个变量的值
         */
//        int a = 10;
//        int b = 20;
//        a = a^b;    //k
//        b = a^b;    //a
//        a = a^b;    //b
//        System.out.println("a="+a+" b="+b);

//        boolean x = true;
//        boolean y = false;
//        short z = 40;
//        if ((z++ == 40)&&(y = true)){
//            z++;
//        }
//        if ((x = true) ||(++z == 43)){
//            z++;
//        }
//        赋值运算如果右边不是ture或false直接用在if里面做判断是不行的，一开始我以为赋值运算表达式都是返回true
//        System.out.println((x = 1));
//        System.out.println("z ="+z);

        /**
         * 十进制转16进制
         */
//        int i = 800;
//        String str = "";
//        while(i!=0){
//            int j = i&15;
//            str += j>9?(char)(j-10+'A'):j+"";
//            i = i>>>4;
//        }
//        char[] c = str.toCharArray();
//        for(int k = c.length-1;k>=0;k--)
//            System.out.print(c[k]);
//        StringBuffer stringBuffer = new StringBuffer(str);
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);
        /**
         * Scanner的使用
         */
//        Scanner scanner = new Scanner(System.in);
//        int[] a = new int[200];
//        int index = 0;
//        while(index<5){
//            a[index++] = scanner.nextInt();
//        }
//        for(int num:a){
//            System.out.print(num+" ");
//        }
        /**
         * split的使用
         */
//        String str=new String("I Love China");
//        String[] destString = str.split(" ");
//        System.out.println("destString的长度为"+destString.length);
//        for(int i=0; i < destString.length; i++)
//            System.out.println(destString[i]);
//        System.out.println(str);
        /**
         * ==和equals()
         */
//        String a = new String("abc");
//        String b = new String("abc");
//        String c = "abc";
//        String d = "abc";
//        System.out.println(d==c);   //c和d存在于常量池当中
//        System.out.println(a==b);   //a和b存在于栈内存当中
//        System.out.println(a.equals(b));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a/60) {
            case 1:
                System.out.println("及格");
                break;
            case 0:
                System.out.println("不及格");
                break;
        }

        }

    }




