class RunningSum {
    public int[] runningSum(int[] nums) {
        for(int itr=1;itr<nums.length;itr++){
            nums[itr]=nums[itr]+nums[itr-1];
        }
        return nums;
    }
}
