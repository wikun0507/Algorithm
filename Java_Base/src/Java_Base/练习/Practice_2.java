package Java_Base.练习;

public class Practice_2 {
    public static void main(String[] args) {
        /**
         * for(①；②;③){
         *      ④
         * }
         * 执行过程①→②→④→③→②→④→③....
         */

//        int i = 0;
//        for(System.out.print('a');i<3; System.out.print('c'),i++){
//            System.out.print('b');
//        }

        /**
         * 输出所有的水仙花数：三位数，每一位数的立方相加后等于其本身
         */
//        for(int i = 1;i<9;i++){
//            for(int j = 0;j<9;j++){
//                for(int k = 0;k<9;k++){
//                    double tmp = i*100+j*10+k;
//                    double pow = Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3);
//                    if (tmp == pow){
//                        System.out.println("水仙花:"+tmp);
//                    }
//                }
//            }
//        }
        /**
         * 最小公倍数和最大公约数优化算法
         */
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);
//        int temp;
//        int count = 0;
//        while (small!=0){
//            temp = big%small;
//            if (temp==0){
//                System.out.println("最大公约数为:"+small);
//                System.out.println("最小公倍数为:"+a*b/small);
//                break;
//            }
//            big = small;
//            small = temp;
//            System.out.println(++count);
//        }
        /**
         * while(true) 数输入有几个是字母和数字
         * Scanner获取char一般用下方形式
         *  scanner.next().charAt(0);
         */
//        int countN = 0;
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            char tmp = scanner.next().charAt(0);
//            if(Character.isLetterOrDigit(tmp))
//                countN++;
//            else
//                break;
//        }
//        System.out.println(countN);
        /**
         * 输出特殊形状
         */
//        for(int j = 0;j<5;j++){
//            for(int i = 4-j;i > 0;i--){
//                System.out.print(" ");
//            }
//            for(int k = 0;k<j+1;k++)
//                System.out.print("* ");
//            System.out.println();
//        }
//        for(int j = 0;j<4;j++){
//            for(int i = j+1;i > 0;i--){
//                System.out.print(" ");
//            }
//            for(int k = 0;k<4-j;k++)
//                System.out.print("* ");
//            System.out.println();
//        }
        /**
         * 乘法表
         */
//        for(int i = 1;i<=9;i++){
//            for(int j = 1;j <= i;j++){
//                System.out.print(j+"×"+i+"="+i*j+" ");
//            }
//            System.out.println();
//        }



    }
}
