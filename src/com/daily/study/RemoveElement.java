package com.daily.study;



/**
 * @author 郝启航
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    static void main() {

    }
}
 /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的数字");
        int target = sc.nextInt();
        int[] nums = new int[100];
        int numCount = 0;
        while (sc.hasNextInt() ) {

            int currentNum = sc.nextInt();
            if (currentNum != target) {
                nums[numCount] = currentNum;
                numCount++;
            }
        }
        for (int i = 0; i < numCount; i++) {

                System.out.println(nums[i]);

        }一个非常暴力的新手写法，在复杂度上无法解决问题，但是能完成逻辑，我的快慢指针掌握还是不太好*/