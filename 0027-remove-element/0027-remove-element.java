class Solution 
{
    public int removeElement(int[] nums, int val)
    {
        int nn[] = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
         if (nums[i]!=val)
         {
          nn[k] = nums[i];
          k++;
         }
        }
        for(int i =0;i<nums.length;i++)
        {
            nums[i]=nn[i];
        }
        return k;
    }
}