class Solution
 {
    public boolean isPalindrome(int x) 
    {
        if (x<0)
        return false;
        int c=x;
        int a=0;
        int d=0;
        while(c != 0)
        {
            d = c%10;
            a = a*10 + d;
            c = c/10;
        }
        if (a==x)
        return true;
        else 
        return false;

    }
}