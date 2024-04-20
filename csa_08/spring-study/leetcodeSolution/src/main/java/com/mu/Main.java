package com.mu;

import java.util.Arrays;

public class Main {
    class Solution {

        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i - 1] == nums[i]) {
                    return true;
                }
            }
            return false;
        }

        public int maxSubArray(int[] nums) {
            int res = -10000000;
            int sum = 0;
            for (int num : nums) {
                if (sum > 0) {
                    sum += num;
                } else {
                    sum = num;
                }
                res = Math.max(sum, res);
            }
            return res;
        }


        class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
                next = null;
            }
        }

        public boolean hasCycle(ListNode head) {
            ListNode fast = head, latter = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                latter = latter.next;
                if (fast == latter) {
                    return true;
                }
            }
            return false;
        }

        public ListNode reverseList(ListNode head) {
            ListNode newHead = null;
            ListNode point = head;
            while (point != null) {
                ListNode nextNode = point.next; // 保存下一个节点
                point.next = newHead; // 将当前节点的next指针指向新的头结点
                newHead = point; // 更新新的头结点为当前节点
                point = nextNode; // 移动到下一个节点
            }
            return newHead;
        }
    }
}