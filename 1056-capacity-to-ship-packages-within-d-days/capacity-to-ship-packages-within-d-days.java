class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mini = 0;  
        int maxi = 0;  

        for (int w : weights) {
            mini = Math.max(mini, w);
            maxi += w;
        }

        int left = mini;
        int right = maxi;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid - 1;  
            } else {
                left = mid + 1;   
            }
        }

        return left;
    }

    public boolean canShip(int[] weights, int days, int capacity) {
        int curr = 0;
        int usedDays = 1;

        for (int i = 0; i < weights.length; i++) {
            if (curr + weights[i] > capacity) {
                usedDays++;
                curr = weights[i];

                if (usedDays > days) return false;
            } else {
                curr += weights[i];
            }
        }
        return true;
    }
}
