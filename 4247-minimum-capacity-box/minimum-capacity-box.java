class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int mini = Integer.MAX_VALUE;
        int idx = -1;

        for(int i = 0; i < capacity.length; i++){
            if(capacity[i] >= itemSize && capacity[i] < mini){
                mini = capacity[i];
                idx = i;
            }
        }

        return idx;
    }
}