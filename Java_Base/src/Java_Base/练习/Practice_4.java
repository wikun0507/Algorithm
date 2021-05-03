package Java_Base.练习;

import java.util.Arrays;

public class Practice_4 {
    public void OutputSnakeArray(){
        /**
         * 输出蛇形数组
         */
        int w = 5,h = 5;
        int x, y;//维度
        int[][] numberMatric = new int[w][h];
        int num = numberMatric[x = 0][y = 0] = 1;
        while (num < w * h) {
            //往右移动
            while (y + 1 < h && numberMatric[x][y + 1] == 0/*未填充默认的项其值为0*/) {
                y++;
                numberMatric[x][y] = ++num;
            }
            //往下移动
            while (x + 1 < w && numberMatric[x + 1][y] == 0) {
                x++;
                numberMatric[x][y] = ++num;
            }
            //往左移动
            while (y - 1 >= 0 && numberMatric[x][y - 1] == 0) {
                y--;
                numberMatric[x][y] = ++num;
            }
            //往上移动
            while (x - 1 >= 0 && numberMatric[x - 1][y] == 0) {
                x--;
                numberMatric[x][y] = ++num;
            }
        }
        //打印输出
        for (x = 0; x < w; x++) {
            for (y = 0; y < h; y++) {
                System.out.printf("%4d", numberMatric[x][y]);
            }
            System.out.println();//换行
        }
    }

    /**
     * 二分查找
     */
    public static void BanSearch(){
        String str= "cdeaoijqja";
        char[] ch = str.toCharArray();
        char i = 'z';
        Arrays.sort(ch);
        int right = ch.length-1;
        int left = 0;
        while (left<=right){
            int middle = (left+right)/2;
            if(i==ch[middle]){
                System.out.println(middle);
                break;
            }else if(i<ch[middle]){
                right = middle-1;
            }else if(i>ch[middle]){
                left = middle+1;
            }
        }
    }

    /**
     * 冒泡排序实现
     * 简单来说就是进行n-1轮，每轮数组中两两进行比较。
     * 每轮都会求出一个当前轮次的最大值放在数组的最后。
     */
    public static void Sort(){
        int[] a = {8,9,71,6,7,12,47,94,3,7,95,5};
        for(int i = 0;i<a.length-1;i++){
            int index = 0;
            while(index<a.length-i-1){
                if(a[index]>a[index+1]) {
                    int tmp = a[index];
                    a[index] = a[index + 1];
                    a[index+1] = tmp;
                }
                index++;
            }
        }
        for(int tmp:a){
            System.out.print(tmp+" ");
        }

    }

    /**
     * 快速排序实现
     */
    public static void quickSort(int[] a,int left,int right){
        if(left<right){
            int index = getIndex(a,left,right);

            quickSort(a,left,index-1);
            quickSort(a,index+1,right);
        }
    }
    public static int getIndex(int[] a,int left,int right){
        int Pivot = a[left];

        while(left<right){
            // 当队尾的元素大于等于基准数据时,向左挪动right指针
            while(right>left&&a[right]>=Pivot){
                right--;
            }
            if(a[right]<Pivot)
                a[left] = a[right];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (left < right && a[left] <= Pivot) {
                left++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            a[right] = a[left];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        a[left] = Pivot;
        return left; // 返回tmp的正确位置
    }
    public static void swap(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
    public static void main(String[] args) {
        //Sort();
//        int[] a = {8,9,71,95,5};
//        quickSort(a,0, a.length-1);
        int[] a = {8,9,71,95,5};
        int[] b = {1,2,3,95,5};
        System.out.println(Arrays.equals(a,b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,1111);        //覆盖原数组为指定数据
        System.out.println(Arrays.toString(a));
        String str = "abcdeqwa";
        System.out.println(str.indexOf("cdea"));
    }

}


