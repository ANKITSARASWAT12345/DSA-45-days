
//Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. 
// If there is no such integer in the array, return 0.

 
/*Example 1:

Input: nums = [21,4,7]
Output: 32
 */



public class Main {
    public static void main(String[] args) {
        int arr[]={21,4,7};
        System.out.println(sumFourDivisors(arr));
    }

    public static  int sumFourDivisors(int[] nums) {
    int ans = 0;

    for (int num : nums) {
      int divisor = 0;
      for (int i = 2; i * i <= num; ++i)
        if (num % i == 0) {
          if (divisor == 0)
            divisor = i;
          else {
            divisor = 0;
            break;
          }
        }
      if (divisor > 0 && divisor * divisor < num)
        ans += 1 + num + divisor + num / divisor;
    }

    return ans;
  }
}
