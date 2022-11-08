class NumArray {

  public NumArray(int[] nums) {
      //Create prefix array
      prefix = new int[nums.length +1];
      for(int i=0; i<nums.length; ++i) {
          // System.out.printf("prefix[%d] = nums[%d] + prefix[%d] = %d + (%d) => %d \n", i+1, i, i,nums[i], prefix[i], nums[i] +prefix[i]);
          prefix[i+1] = nums[i] +prefix[i];
      }
  }
  
  public int sumRange(int left, int right) {
      return prefix[right+1] -prefix[left];
  }
  
  private int[] prefix;
}

/**
* Your NumArray object will be instantiated and called as such:
* NumArray obj = new NumArray(nums);
* int param_1 = obj.sumRange(left,right);
*/


// ["NumArray","sumRange","sumRange","sumRange"]
// [[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]


// STDOUT

// prefix[1] = nums[0] + prefix[0] = -2 + (0) => -2 
// prefix[2] = nums[1] + prefix[1] = 0 + (-2) => -2 
// prefix[3] = nums[2] + prefix[2] = 3 + (-2) => 1 
// prefix[4] = nums[3] + prefix[3] = -5 + (1) => -4 
// prefix[5] = nums[4] + prefix[4] = 2 + (-4) => -2 
// prefix[6] = nums[5] + prefix[5] = -1 + (-2) => -3 

//output = 
// [null,1,-1,-3]