package com.dj.easy;

public class Solution {
    //2021.9.10
    /*数字反转
    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
    如果反转后整数超过 32 位的有符号整数的范围 [−2的31次方,  2的31次方 − 1] ，就返回 0。

    示例 2：
    输入：x = -123
    输出：-321

    示例 3：
    输入：x = 120
    输出：21

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/reverse-integer
    */
    public static int reverse(int x) {
        int res = 0;
        int last = 0;
        while (x!=0){
            //每次取末尾的值
            int tep = x%10;
            last = res;
            //更新res
            res = res*10+tep;

            //每次更新的值/10和上一次不一样为溢出
            if (last!=res/10){
                return 0;
            }

            //去掉取出来的值
            x = x/10;

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Solution.reverse(456));
    }
}
