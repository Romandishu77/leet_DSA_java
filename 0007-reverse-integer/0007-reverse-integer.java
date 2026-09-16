class Solution 
{
    public int reverse(int x) 
    {
        long c = 0;
        int d = 0 ;
        while(x != 0)
        {
         d = x % 10;
         c = (c*10) + d;
         x = x / 10;
        } 
        if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE )
        return 0 ;
        else 
        return (int)c;
    }
}