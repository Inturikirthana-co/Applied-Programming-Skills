class SumAbsoluteDiffrence { 
    public int[] getSumAbsoluteDifferences(int[] nums) { 
        int[] res=new int[nums.length]; 
        int n=nums.length; 
         
        int totSum=0; 
        for(int num:nums){ 
            totSum+=num; 
        } 
 
        int leftSum=0,rightSum=0; 
        for(int i=0;i<n;i++){ 
            rightSum=totSum-leftSum-nums[i]; 
            res[i]=nums[i]*i-leftSum+rightSum-nums[i]*(n-i-1); 
            leftSum+=nums[i]; 
        } 
        return res; 
    } 
}
