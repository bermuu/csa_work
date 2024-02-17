import java.util.Scanner;
//请注释一题一题检查
//不然会报错
public class Main {
    public static void main(String[] args) {
/*
        System.out.println("<-------第一题------->");
        Book book = new Book();
        Scanner scanf = new Scanner(System.in);
        System.out.print("please input title:");
        book.title = scanf.next();
        System.out.println("");
        System.out.print("please input author:");
        book.author = scanf.next();
        System.out.println("");
        System.out.print("please input Date:");
        book.Date = scanf.next();
        System.out.println("");
        book.displayInfio();
        System.out.println("<-------第二题------->");
        car car = new car();
        Truck truck = new Truck();
        System.out.println("<-------第三题------->");
        Calculate c1 = new Calculate();
        System.out.println("<-------第四题------->");
        stringlength s1 = new stringlength();
        String str;
        str = s1.creatstringlength();
        System.out.println((str));*/
        System.out.println("<-------第五题------->");
        Stack r1 = new Stack(12);
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        r1.push(arr[1]);
        int tmp = arr[1];
        int sum = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] <= tmp) {
                r1.push(i);
                tmp = arr[i];
            } else {
                while (!r1.isEmpty() && arr[i] > arr[r1.peek()]) {
                    int pop = r1.pop();
                    if (r1.isEmpty()) {
                        break;
                    }
                    int width = i - r1.peek() - 1;
                    int height = Math.min(arr[i], arr[r1.peek()]) - arr[pop];
                    sum += width * height;
                }
                r1.push(i);
            }
        }
        System.out.println("Total water trapped: " + sum);


}
class Book{
    String title;
    String author;
    String Date;
    void displayInfio()
    {
        System.out.println("title is "+title);
        System.out.println("authot is "+author);
        System.out.println("Date is "+Date);
    }
}
class vehicle{
    int wheels,speed;
    String color,brand;
}

class car extends vehicle
{
    int loder;
    Scanner scanf = new Scanner(System.in);
    public car()
    {
        this.wheels = 4;
        this.speed = 60;

        System.out.print("请输入人员个数：");
        this.loder = scanf.nextInt();
        System.out.println("");
        if(this.loder<=6)
        {
            System.out.println("车轮的个数是："+wheels);
            System.out.println("这是一辆小车，能载6人，实载"+loder+"人");
            this.start();
            this.accelerate(this.speed);
            this.brake();
        }
        else
        {
            System.out.println("车轮的个数是："+wheels);
            System.out.println("这是一辆小车，能载6人，实载"+loder+"人,你超员了！！！");
        }
    }


    void start()
    {
        System.out.println("Car is started");
    }
    void accelerate(int speed)
    {
        System.out.println("Car is accelerating at speed 60 km/h");
    }
    void brake()
    {
        System.out.println("Car is braking");
    }


}
class Truck extends vehicle
{
    int loder;
    int payload;
    Scanner scanf = new Scanner(System.in);
    public Truck()
    {
        this.wheels = 6;
        this.speed = 60;

        System.out.print("请输入人员个数：");
        this.loder = scanf.nextInt();
        System.out.println("");
        System.out.print("请输入货物重量：");
        this.payload = scanf.nextInt();
        System.out.println("");
        if(this.loder<=3)
        {
            System.out.println("车轮的个数是："+wheels);
            System.out.println("这是一辆卡车，能载3人，实载"+loder+"人");
            if(this.payload<=5000)
            {
                System.out.println("这是一辆卡车，能载5000kg，实载"+payload+"kg");
                this.start();
                this.accelerate(this.speed);
                this.brake();
            }
            else
            {
                System.out.println("这是一辆卡车，能载5000kg，实载"+payload+"kg"+",你超载了！！！");
            }

        }
        else
        {
            System.out.println("车轮的个数是："+wheels);
            System.out.println("这是一辆小车，能载6人，实载"+loder+"人,你超员了！！！");
            if(this.payload<=5000)
            {
                System.out.println("这是一辆卡车，能载5000kg，实载"+payload+"kg");
            }
            else
            {
                System.out.println("这是一辆卡车，能载5000kg，实载"+payload+"kg"+"你超载了！！！");
            }
        }
    }


    void start()
    {
        System.out.println("Car is started");
    }
    void accelerate(int speed)
    {
        System.out.println("Car is accelerating at speed 60 km/h");
    }
    void brake()
    {
        System.out.println("Car is braking");
    }


}
class Calculate
{
    Scanner scanf = new Scanner(System.in);
    public Calculate()
    {


        System.out.println("输入样例");
        System.out.println("****************");
        System.out.println("1");
        System.out.println("+");
        System.out.println("1");
        System.out.println("****************");
        System.out.println("输入要计算的表达式：");
        int a = scanf.nextInt();
        char operator = scanf.next().charAt(0);
        int b = scanf.nextInt();
        switch(operator)
        {
            case '+':
                this.add(a,b);
                break;
            case '-':
                this.subtract(a,b);
                break;
            case '*':
                this.multiply(a,b);
                break;
            case '/':
                this.division(a,b);
                break;
            default:
                System.out.println("error");
        }
    }

    void add(int a,int b)
    {
        int addition = a+b;
        System.out.println("Addition："+addition);
    }
    void subtract(int a,int b)
    {
        int subtract = a-b;
        System.out.println("Subtract："+subtract);
    }
    void multiply(int a,int b)
    {
        int multiply = a*b;
        System.out.println("Multiply："+multiply);
    }
    void division(int a,int b)
    {
        if(b==0)
        {
            System.out.println("除数不能为0！！！");
        }else{
            int division = a/b;
            System.out.println("Division："+division);
        }
    }
}
class stringlength
{
    Scanner scanf = new Scanner(System.in);
    String color[] = new String[3];
    char c;
    int i=0;int j=0;
    String creatstringlength()
    {
        for(i=0;i<3;i++)
        {
            color[i] = scanf.next();
        }
        int len = color[0].length();
        if(color==null||color.length==0)
        {
            return "";
        }
        for(i=0;i<len;i++)
        {
            c = color[0].charAt(i);
            for(j=1;j<3;j++)
            {
                System.out.println(color[0]);
                if(color[j].length()==i||color[j].charAt(i)!=c)
                {
                    return color[0].substring(0,i);
                }

            }
        }
        return color[0];
    }
}
    static class Stack {
        private int[] array;
        private int top;

        public Stack(int capacity) {
            array = new int[capacity];
            top = -1; // 初始化栈顶指针为-1，表示栈为空
        }

        public void push(int element) {
            if (top == array.length - 1) {
                System.out.println("Stack is full. Cannot push element.");
                return;
            }
            array[++top] = element;
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1;
            }
            return array[top--];
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return array[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }
    }
}