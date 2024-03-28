package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Week7 {

    static Random random = new Random();


    public static void test() {
        System.out.println(task1("abbc", "dog cat cat fish"));
        System.out.println(task2(new int[]{1, 2, 2, 3, 0}));
        for (int i = 0; i < 5; i++) {
            int target = random.nextInt(15) - 3;
            System.out.println("target:" + target + "\tresult" + task3(new int[]
                    {0, 4, 5, 6, 8}, target));
        }
    }


    public static void main(String[] args) {
        System.out.println("---------------");
        test();
        System.out.println("---------------");
    }


    public static boolean task1(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(ch,words[i]);
            }else{
                if((!map.get(ch).equals(words[i]))){
                    return false;
                }
            }
        }
        return  true;
    }


    public static int task2(int[] nums) {
//第二题代码
        int res = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num: nums) {
            if(set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }


    public static int task3(int[] nums, int target) {
//第三题代码
        int res = 0;
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid = (low+high) / 2;
            if(target == nums[mid]){
                res = mid;
                return res;
            }
            if(target > nums[mid]){
                low = mid + 1;
            }
            if(target < nums[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}