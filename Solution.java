class Solution{
    public int removeElement(int[] nums, int val)
    {
        int j,i=0;
        for(j=0;j<nums.length;j++)
        {
            if(nums[j] != val)
            {
            nums[i]=nums[j];
            i++;
            }

        }
        return i;

        
    }
    public static void main (String[] args)
    {
        
        int i;
        Solution obj=new Solution();
        int k;
        int[] nums = {3, 2, 2, 3, 4}; 
        int val = 3;
        k=obj.removeElement( nums,val);
        for(i=0;i<k;i++)
        {
            System.out.println( nums[i] +"");
        }
    }
}