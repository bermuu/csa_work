import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1、 第一答案:b 2、第二答案:b 3、第二答案:d 4、第四答案:b 5、第五答案：d");

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数: ");

        int num = scan.nextInt();
        scan.nextLine();
        rectangle(num);

        System.out.print("请输入一个正整数: ");
        String inputstring;
        inputstring = scan.nextLine();
        reverseSUM(inputstring);

        System.out.print("请输入一个正整数: ");
        int number;
        number = scan.nextInt();
        isPalindrome(number);

        ShuiXianHua();
        arraysDemo();

    }

    public static void rectangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void reverseSUM(String s) {

        char[] chars = s.toCharArray(); // 字符串转化为字符数组
        int l = chars.length;
        System.out.println("您输入的正整数的位数是："+l);
        System.out.print("您输入的正整数的逆序是：");
        for(int i=0;i<chars.length;i++)
        {
            char item = chars[chars.length-1-i];
            System.out.print(item);
        }
        System.out.println("");
        //System.out.println(s);


    }

    public static void isPalindrome(int num) {
        boolean flag = false;
        String numStr = Integer.toString(num);
        char head;
        char tail;
        int leng = numStr.length();
        int range = leng/2;
        int i=0;
        while(i <= range)
        {
            int item = leng-i-1;
            if(numStr.charAt(i) != numStr.charAt(item))
            {
                flag = false;
                break;
            }
            if(i==range-1)
            {
                flag = true;
            }
            i++;
        }

        if (flag) {
            System.out.println("是的") ;
        } else
            System.out.println("不是") ;
    }

    public static void ShuiXianHua() {
    int i = 100;
    int a,b,c;
        System.out.println("三位数的水仙花数是：");
    while(i<=999)
    {
        a = i%10;
        b = (i%100-a)/10;
        c = (i-a-b*10)/100;
        if(a*a*a+b*b*b+c*c*c == i)
        {
            System.out.println(i);
        }
        i++;
    }
    }

    public static void arraysDemo() { //操作
        Scanner scan = new Scanner(System.in);
        int[] numarr = new int[10];
        System.out.println("请输入数字数组");
        for(int i=0;i<numarr.length;i++)
        {
            numarr[i] = scan.nextInt();
            System.out.println("");
        }
        int max=0;
        int min=999;
        for(int i=0;i<numarr.length;i++)
        {
            if(numarr[i]>max)
            {
                max = numarr[i];
            }
            if(numarr[i]<min)
            {
                min = numarr[i];
            }

        }

        System.out.println("打印两个 最值");
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
    }





}

