public class Fibo
{
  int[]  FiboCal (int n)
  {
    int[] fibo = new int[n];
    fibo[0] = 1;
    fibo[1] = 1;
    for(int i=2; i<n; i++)
    {
      fibo[i] = fibo[i-1] + fibo[i -2];
      
    }
    return fibo;
  }
}