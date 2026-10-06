class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b)-> nums[b] - nums[a]);
       int[] res =new int[nums.length - k +1];
        int idx=0;
       for(int i=0;i<k;i++){
        
        pQueue.add(i);
       
       }
      
       res[idx++]=nums[pQueue.peek()];

       int left =1;
       int right=k;

       while (right<nums.length) 
        
       {

        pQueue.add(right);

        while (pQueue.peek() < left) {
            pQueue.poll();
        }
        

        res[idx++]=nums[pQueue.peek()];
        right++;
        left++;


       }

        return res; 
    }
}
