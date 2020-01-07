//已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。 
//
// 不要使用系统的 Math.random() 方法。 
//
// 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: 1
//输出: [7]
// 
//
// 示例 2: 
//
// 
//输入: 2
//输出: [8,4]
// 
//
// 示例 3: 
//
// 
//输入: 3
//输出: [8,1,10]
// 
//
// 
//
// 提示: 
//
// 
// rand7 已定义。 
// 传入参数: n 表示 rand10 的调用次数。 
// 
//
// 
//
// 进阶: 
//
// 
// rand7()调用次数的 期望值 是多少 ? 
// 你能否尽量少调用 rand7() ? 
// 
// Related Topics Random Rejection Sampling

package leetcode.editor.cn;


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int rand7=rand7();
        int rand3=0;
        while (rand3>3 || rand3==0){
            rand3=rand7();
        }
        return rand3+rand7;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
