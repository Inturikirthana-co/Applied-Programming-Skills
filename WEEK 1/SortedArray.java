class SortedArray {
    public int[] sortedSquares(int[] nums) {
        int temp[] = new int[nums.length];

        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int head = 0, tail = nums.length - 1;

        
        for (int pos = nums.length - 1; pos >= 0; pos--) {
            if (nums[head] > nums[tail]) {
                temp[pos] = nums[head];
                head++;
            } else {
                temp[pos] = nums[tail];
                tail--;
            }
        }

        return temp; 
    }
}
