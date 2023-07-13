class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int nums[] = new int[m+n];
        double median = 0;
        
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            }
            else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            nums[k] = nums2[j];
            j++;
            k++;
        }

        median = nums[nums.length/2];

        if (nums.length%2 == 0) {
            median += nums[nums.length/2 - 1];
            median /= 2;
        }

        return median;
    }
}
Console
