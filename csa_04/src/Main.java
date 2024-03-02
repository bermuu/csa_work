import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------第一题------------");
        System.out.println("请输入你要反转的数字");
        String aa;
        aa = scan.nextLine();
        int len = aa.length();
        int lowerBound = -2147483648; // 下限
        int upperBound = 2147483647; // 上限
        Long bb = Long.parseLong(aa);
        if(checkBounds(bb, lowerBound, upperBound)) {
            if(len == 1)
            {
                System.out.println("aa");
            }else{
                if(aa.charAt(0) == '-')
                {
                    System.out.print("-");
                    for(int i=0;i<len-1;i++)
                    {
                        System.out.print(aa.charAt(len-i-1));
                    }
                }else{

                    for(int i=0;i<len;i++)
                    {
                        System.out.print(aa.charAt(len-i-1));
                    }
                }
            }

        } else {
            System.out.println("0");
        }
        System.out.println("--------------第二题------------");
        System.out.println("请输入步数");
        int n = scan.nextInt(); // 要爬的楼梯阶数
        int ways = palouti(n);
        System.out.println("爬楼梯的方式数为: " + ways);
        System.out.println("--------------第三题------------");
        SubsetsGenerator subsetsGenerator = new SubsetsGenerator();
        int[] nums = {1, 2, 3}; // 示例整数数组
        List<List<Integer>> subsets = subsetsGenerator.subsets(nums);
        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static boolean checkBounds(Long value, int lowerBound, int upperBound) {
        return value >= lowerBound && value <= upperBound;
    }

    public static int palouti(int n)
    {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return palouti(n-1) + palouti(n-2);
    }
}

class SubsetsGenerator {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<>());
        return res;
    }

    private void backtrack(int startIndex, int[] nums, List<List<Integer>> res, List<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int i = startIndex; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtrack(i + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
