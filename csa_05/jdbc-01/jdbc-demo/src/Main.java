import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
        String um = "root";
        String pw = "1234";
        Connection conn = DriverManager.getConnection(url, um, pw);

        // 3.定义sql语句
        String createTableSql = "CREATE TABLE IF NOT EXISTS student (" +
                "SNO VARCHAR(20), " +
                "NAME VARCHAR(10), " +
                "Age INT, " +
                "College VARCHAR(30)" +
                ")";

        String insertSql = "INSERT INTO student (SNO, NAME, Age, College) " +
                "VALUES ('s001', '老大', 20, '计算机学院'), " +
                "('s002', '老二', 19, '计算机学院'), " +
                "('s003', '老三', 18, '计算机学院'), " +
                "('s004', '老四', 17, '计算机学院')";

        String selectSql = "SELECT * FROM student";

        String deleteSql = "DELETE FROM student WHERE SNO = 's004'";

        String searchSql = "SELECT * FROM student WHERE SNO = 's003'";

        String updateSql = "UPDATE student SET College = '通信学院' WHERE SNO = 's001'";

        // 4.获取执行sql的对象statement
        Statement stmt = conn.createStatement();

        // 5.执行创建表格操作
        stmt.executeUpdate(createTableSql);

        // 6.执行插入数据操作
        int n1 = stmt.executeUpdate(insertSql);
        System.out.println("插入数据影响的行数：" + n1);
        System.out.println("-------------第一题效果-----------------");

        // 7.执行查询操作
        ResultSet rs = stmt.executeQuery(selectSql);
        while (rs.next()) {
            String sno = rs.getString("SNO");
            String name = rs.getString("NAME");
            int age = rs.getInt("Age");
            String college = rs.getString("College");

            System.out.println("学号: " + sno + ", 姓名: " + name + ", 年龄: " + age + ", 学院: " + college);
        }

        // 删除操作
        System.out.println("-------------第三题效果-----------------");
        ResultSet rsBeforeDelete = stmt.executeQuery("SELECT * FROM student WHERE SNO = 's004'");
        if (rsBeforeDelete.next()) {
            String sno = rsBeforeDelete.getString("SNO");
            String name = rsBeforeDelete.getString("NAME");
            int age = rsBeforeDelete.getInt("Age");
            String college = rsBeforeDelete.getString("College");

            System.out.println("即将被删除的数据：");
            System.out.println("学号: " + sno + ", 姓名: " + name + ", 年龄: " + age + ", 学院: " + college);
        }
        stmt.executeUpdate(deleteSql);

        // 查询操作
        System.out.println("-------------第四题效果-----------------");
        ResultSet rsSearch = stmt.executeQuery(searchSql);
        while (rsSearch.next()) {
            String sno = rsSearch.getString("SNO");
            String name = rsSearch.getString("NAME");
            int age = rsSearch.getInt("Age");
            String college = rsSearch.getString("College");

            System.out.println("学号: " + sno + ", 姓名: " + name + ", 年龄: " + age + ", 学院: " + college);
        }

        // 更新操作
        System.out.println("-------------第五题效果-----------------");
        stmt.executeUpdate(updateSql);

        // 再次查询以查看更新后的结果
        ResultSet rsUpdate = stmt.executeQuery(selectSql);
        while (rsUpdate.next()) {
            String sno = rsUpdate.getString("SNO");
            String name = rsUpdate.getString("NAME");
            int age = rsUpdate.getInt("Age");
            String college = rsUpdate.getString("College");

            System.out.println("学号: " + sno + ", 姓名: " + name + ", 年龄: " + age + ", 学院: " + college);
        }

        rs.close(); // 关闭结果集
        rsSearch.close();
        rsUpdate.close();
        stmt.close();
        conn.close();
        System.out.println("-------------冒泡排序-----------------");
        popp();
        System.out.println("-------------插入排序-----------------");
        insert();
        System.out.println("-------------快速排序-----------------");
        int[] arr = packageQuickly();
        printlist(arr);
        System.out.println("-------------归并排序-----------------");
        merge_sort();
        System.out.println("-------------堆排序-----------------");
        heap_sort();
    }

    //冒泡排序
    public static void popp() {
        int[] arr = {10, 5, 6, 8, 9, 2, 7, 6, 9, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printlist(arr);
    }

    public static void printlist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    //插入排序
    public static void insert() {
        int[] arr = {10, 5, 6, 8, 9, 2, 7, 6, 9, 7};
        for (int i = 1; i < arr.length; i++) {
            int j = i;//遍历无序数组的变量
            int tmp = arr[i];
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = tmp;
            }

        }
        printlist(arr);
    }

    //快速排序
    public static int[] quickly(int[] arr, int left, int right) {
        if (left < right) {
            int index = basic(arr, left, right);
            quickly(arr, left, index - 1);
            quickly(arr, index + 1, right);
        }
        return arr;
    }

    public static int[] packageQuickly() {
        int[] arr = {10, 5, 6, 8, 9, 2, 7, 6, 9, 7};
        return quickly(arr, 0, arr.length - 1);
    }

    public static int basic(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //归并排序
    public static void merge_sort() {
        int[] arr = {10, 5, 6, 8, 9, 2, 7, 6, 9, 7};
        sort(arr, 0, arr.length - 1);
        printlist(arr);
    }

    public static void sort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = (r + l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(l, mid + 1, r, arr);
    }

    public static void merge(int s1, int s2, int end, int[] arr) {
        int len = s2 - s1;
        int p1 = 0;
        int p2 = s2;
        int[] tmp = new int[len];//tmp[0,len],arr[s2,end]存放第一段的数字,arr在第一段长的区间置空
        System.arraycopy(arr, s1, tmp, 0, len);
        for (int i = s1; i <= end; i++) {
            if (tmp[p1] < arr[p2]) {
                arr[i] = tmp[p1];
                p1++;
                if (p1 == len) {
                    break;
                }
            } else {
                arr[i] = arr[p2];
                p2++;
                if (p2 > end) {
                    while (p1 < len) {//数组后面置空将临时数组全部放入
                        i++;
                        arr[i] = tmp[p1];
                        p1++;
                    }
                }
            }
        }
    }

    private static void heap_sort() {
        int[] arr = {10, 5, 6, 8, 9, 2, 7, 6, 9, 7};
        heapSort(arr);
        printlist(arr);
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建最大堆
        buildMaxHeap(arr);

        // 逐步将最大值交换到数组末尾，并调整堆结构
        for (int i = n - 1; i > 0; i--) {
            // 将当前最大值交换到数组末尾
            swap(arr, 0, i);

            // 调整堆结构，使得剩余元素重新满足最大堆性质
            heapify(arr, 0, i);
        }
    }

    // 构建最大堆
    private static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        // 从最后一个非叶子节点开始进行下沉操作
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    // 堆调整操作
    private static void heapify(int[] arr, int i, int n) {
        int largest = i; // 节点i、左子节点和右子节点中最大值的索引
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 找出最大值的索引
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果最大值不是当前节点，则交换节点，并继续调整下方的子堆
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }


}