class Solution {
    public int GCD(int a, int b) { //a > b
        if (b == 0) {
            return a;
        }

        int rem = a%b; //a = rem + bq
        //rem < b
        return GCD(b, rem);
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];

        return GCD(smallest, largest);
    }
}
