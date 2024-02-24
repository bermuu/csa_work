import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------第一题-----------");
        computer t1 = new computer(2, 3);
        Usecompute t2 = new Usecompute();
        t2.usercom(t1, 1, 2);
        System.out.println("-----------第二题-----------");

        System.out.print("请输入分数：");
        int score = scanner.nextInt();
        try {
            if (score < 0 || score > 100) {
                throw new Exception("分数必须在 0—100 之间！");
            } else {
                System.out.println("成绩为：" + score);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------第三题-----------");
        int sum = 0;
        int count = 0;
        while (true)
        {
            try
            {
                System.out.print("请输入 N 的值：");
                int N = scanner.nextInt();
                if (N < 0)
                {
                    throw new Exception("N 必须是正数或者 0");
                }
                for (int i = 0; i < N; i++)
                {
                    System.out.print("请输入第 " + (i + 1) + " 个整数：");
                    int num = scanner.nextInt();
                    sum += num;
                    count++;
                }
                double average = (double) sum / count;
                System.out.println("平均值为：" + average);
                break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                scanner.next(); // 清除输入流中的非法输入
            }
        }
        System.out.println("-----------第四题-----------");
        MyDate birthday = new MyDate(2000, 1, 1);

        Employee employee = new ConcreteEmployee("张三", 123456, birthday);

        System.out.println(employee.toString());

        System.out.println("-----------第五题-----------");
        String s;
        System.out.println("输入字符串！");
        s = scanner.next();
        String copy = s;
        int num;
        System.out.println("输入单词个数！");
        num = scanner.nextInt();
        scanner.nextLine(); // 读取换行符
        String[] word = new String[num];
        for(int i=0;i<num;i++)
        {
            String ch;
            System.out.print("请输入第 " + (i + 1) + " 个单词：");
            ch  = scanner.nextLine();
            word[i] = ch;
        }
        int sumboy =0;
        for(int i=0;i< word.length;i++)// 遍历word数组
        {
            int little=0;

            for(int j=0;j<word[i].length();j++)//遍历word的字符串的字符
            {
                char item = word[i].charAt(j);
                int index;
                index = teturrn(s,item);//将字符和s比较，找到返回下标，没找到返回-1
                if(index == -1)
                {
                    break;
                }
                else
                {
                    s=s.substring(index+1,s.length());
                    little++;
                }
            }
            s = copy;
            if(little == word[i].length())
            {

                sumboy++;
            }
        }
        System.out.println("总数是"+sumboy);


    }
static int teturrn(String s,char item)
{
    int index=-1;
    for (int i = 0; i < s.length(); i++)
    {
        if(item==s.charAt(i))
        {
            System.out.println("匹配成功！"+item+"&"+"s.charAt("+i+")");
            index = i;
            return index;
        }
    }
    return index;
}


    static class computer {
        int a, b;

        computer(int m, int n) {
            a = m;
            b = n;
            jia();
            jian();
            chen();
            chu();
        }

        void jia() {
            int sum;
            sum = a + b;
            System.out.println(a + "+" + b + "=" + sum);
        }

        void jian() {
            int sum;
            sum = a - b;
            System.out.println(a + "-" + b + "=" + sum);
        }

        void chen() {
            int sum;
            sum = a * b;
            System.out.println(a + "*" + b + "=" + sum);
        }

        void chu() {
            float sum;
            sum = (float) a / b;
            System.out.println(a + "/" + b + "=" + sum);
        }
    }

    static class Usecompute {

        public void usercom(computer t1, int one, int two)
        {
            t1.a = one;
            t1.b = two;
            t1.jia();
            t1.chen();
            t1.chen();
            t1.chu();
        }
    }

    // MyDate 类表示日期
    static class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day)
        {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return year + "-" + month + "-" + day;
        }
    }

    // Employee 类
    static abstract class Employee {
        private String name;
        private int number;
        private MyDate birthday;

        public Employee(String name, int number, MyDate birthday)
        {
            this.name = name;
            this.number = number;
            this.birthday = birthday;
        }

        // 抽象方法，子类需要实现具体的计算方式
        public abstract double earnings();

        @Override
        public String toString()
        {
            return "姓名：" + name + ", 工号：" + number + ", 生日：" + birthday.toString();
        }
    }

    // 具体的员工类，继承自 Employee 类
    static class ConcreteEmployee extends Employee
    {
        public ConcreteEmployee(String name, int number, MyDate birthday)
        {
            super(name, number, birthday);
        }

        @Override
        public double earnings()
        {
            // 具体的计算方式在子类中实现
            return 0.0;
        }

    }
}
