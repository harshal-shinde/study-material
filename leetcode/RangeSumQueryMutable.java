public class RangeSumQueryMutable {
  int[] sums;
  int[] nums;
  public RangeSumQueryMutable(int[] nums) {
      sums = new int[nums.length + 1];
      this.nums = new int[nums.length];
      for (int i = 0; i < nums.length; i ++) {
          update(i, nums[i]);
      }
  }

  public void update(int i, int val) {
      int diff = val - nums[i];
      int j = i + 1;
      while (j < sums.length) {
          sums[j] += diff;
          j = j + (j&(-j));
      }
      nums[i] = val;
  }
  private int getSum(int i) {
      int sum = 0;
      while (i > 0) {
          sum += sums[i];
          i = i - (i&(-i));
      }
      return sum;
  }

  public int sumRange(int i, int j) {
      return getSum(j + 1) - getSum(i);
  }
}