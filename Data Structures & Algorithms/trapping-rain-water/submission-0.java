class Solution {
    public int trap(int[] height) {
        int totalWater=0;

        int[] preContLimit = new int[height.length];
        preContLimit[0]=height[0];

        for(int i=1;i<preContLimit.length;i++){
            preContLimit[i] = Math.max(preContLimit[i-1], height[i]);

        }

        int postContLimit[] = new int[height.length];
        postContLimit[postContLimit.length-1]=height[height.length-1];
        for(int i= postContLimit.length - 2 ;i>= 0;i--){
            postContLimit[i] = Math.max(postContLimit[i+1], height[i]);
        }


        for(int i=0;i<height.length;i++){
            totalWater += Math.min(preContLimit[i], postContLimit[i]) - height[i];
        }

        return totalWater; 
    }
}
