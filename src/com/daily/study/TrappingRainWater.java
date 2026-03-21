package com.daily.study;

/**
 * @author 郝启航
 */
/*public class TrappingRainWater {
    public static int []trap(int[] height) {
        int aspect =0;
        int []rightSum=new int[height.length];
        for(int i =0; i < height.length; i++){
            if(height[i] > aspect){
                aspect = height[i];
            }
            rightSum[i]+= aspect;
        }
        aspect = 0;
        int []leftSum=new int[height.length];
        for(int i = height.length-1; i >=0; i--){
            if(height[i]>aspect){
                aspect = height[i];
            }
            leftSum[i]+=aspect;
        }
        int []sum = new int[height.length];
        for(int i =0; i < height.length; i++){
            sum[i]=Math.min(leftSum[i],rightSum[i])-height[i];
        }
        return sum;
    }
    static void main(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] sum = trap(height);
        int numSum = 0;
        for(int i =0; i < sum.length; i++){
            System.out.print(sum[i]+"\t");
            numSum+=sum[i];
        }
        System.out.println();
        System.out.println(numSum);
    }
}
这是一个简单的方法下面是一个比较进阶一点点的吧*/
public class TrappingRainWater {
    public static int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        while (left < right) {
            if (leftMax <= rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                sum += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                sum += rightMax - height[right];
            }

        }
        return sum;
    }

    static void main() {

    }
}