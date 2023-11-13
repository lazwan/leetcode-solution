//<p>给你一个数组 <code>nums</code> ，请你完成两类查询。</p>
//
//<ol> 
// <li>其中一类查询要求 <strong>更新</strong> 数组&nbsp;<code>nums</code>&nbsp;下标对应的值</li> 
// <li>另一类查询要求返回数组&nbsp;<code>nums</code>&nbsp;中索引&nbsp;<code>left</code>&nbsp;和索引&nbsp;<code>right</code>&nbsp;之间（&nbsp;<strong>包含&nbsp;</strong>）的nums元素的 <strong>和</strong>&nbsp;，其中&nbsp;<code>left &lt;= right</code></li> 
//</ol>
//
//<p>实现 <code>NumArray</code> 类：</p>
//
//<ul> 
// <li><code>NumArray(int[] nums)</code> 用整数数组 <code>nums</code> 初始化对象</li> 
// <li><code>void update(int index, int val)</code> 将 <code>nums[index]</code> 的值 <strong>更新</strong> 为 <code>val</code></li> 
// <li><code>int sumRange(int left, int right)</code> 返回数组&nbsp;<code>nums</code>&nbsp;中索引&nbsp;<code>left</code>&nbsp;和索引&nbsp;<code>right</code>&nbsp;之间（&nbsp;<strong>包含&nbsp;</strong>）的nums元素的 <strong>和</strong>&nbsp;（即，<code>nums[left] + nums[left + 1], ..., nums[right]</code>）</li> 
//</ul>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入</strong>：
//["NumArray", "sumRange", "update", "sumRange"]
//[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
//<strong>输出</strong>：
//[null, 9, null, 8]
//
//<strong>解释</strong>：
//NumArray numArray = new NumArray([1, 3, 5]);
//numArray.sumRange(0, 2); // 返回 1 + 3 + 5 = 9
//numArray.update(1, 2);   // nums = [1,2,5]
//numArray.sumRange(0, 2); // 返回 1 + 2 + 5 = 8
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= nums.length &lt;= 3 *&nbsp;10<sup>4</sup></code></li> 
// <li><code>-100 &lt;= nums[i] &lt;= 100</code></li> 
// <li><code>0 &lt;= index &lt; nums.length</code></li> 
// <li><code>-100 &lt;= val &lt;= 100</code></li> 
// <li><code>0 &lt;= left &lt;= right &lt; nums.length</code></li> 
// <li>调用 <code>update</code> 和 <code>sumRange</code> 方法次数不大于&nbsp;<code>3 * 10<sup>4</sup></code>&nbsp;</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>设计</li><li>树状数组</li><li>线段树</li><li>数组</li></div></div><br><div><li>👍 633</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * @author wangzhiheng
 * @date 2023-11-13 08:32:59
 */
public class RangeSumQueryMutable {
    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {

        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public void update(int index, int val) {
            nums[index] = val;
        }

        public int sumRange(int left, int right) {
            int ans = 0;
            for (int i = left; i <= right; i++) {
                ans += nums[i];
            }
            return ans;
        }
    }

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * obj.update(index,val);
     * int param_2 = obj.sumRange(left,right);
     */
    //leetcode submit region end(Prohibit modification and deletion)

    public static void main(String[] args) {
        NumArray solution = new RangeSumQueryMutable().new NumArray(new int[]{});
    }
}