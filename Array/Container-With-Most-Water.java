class Solution {
    public int maxArea(int[] height) {
        int max_ar = 0;

        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            int ar = Math.min(height[left],height[right]) * (right - left);
            max_ar = Math.max(max_ar, ar);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max_ar;
    }
}
