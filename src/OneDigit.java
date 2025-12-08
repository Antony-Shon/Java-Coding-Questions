
/*OneDigit means the sum of the digits is found by recusively doing the same process until the sum is a one digit number
For example, if number = 99999999999929
--> 9+9+9+9+9+9+9+9+9+9+9+9+2+9 = 119
--> 1+1+9 = 11
--> 1+1 = 2 --> Stop
Answer : 2
 */
public class OneDigit
{
    public static void main(String args[])
    {
        long num = 99999999999929L;
        OneDigit obj = new OneDigit();
        long ans = obj.digit(num);
        System.out.println(ans);
    }
    public long digit(long n)
    {
        if(n/10 < 1)
            return n;
        long d,sum=0;
        while(n>0)
        {
            d = n%10;
            sum += d;
            n=n/10;
        }
        if(sum<10)
            return sum;
        else
            return digit(sum);
    }
}
