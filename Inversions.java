/* You are given an integer array nums of length n which represents a permutation of all the integers in the range 
[0, n - 1]... The number of global inversions is the number of the different pairs (i, j) where:
1. 0 <= i < j < n
2. nums[i] > nums[j]
The number of local inversions is the number of indices i where:
1. 0 <= i < n - 1
2. nums[i] > nums[i + 1]
Return true if the number of global inversions is equal to the number of local inversions...
* Eg 1 :  Input = [1,0,2]                                Output = True
* Eg 2 :  Input = [2,0,1]                                Output = False
 */
import java.util.*;
public class Inversions
{
      public boolean IdealPermutation(int nums[])
      {
            int local = 0;                //*    Variable => O(1)
            for(int i = 0; i < nums.length - 1; i++)    //! Local Inversion => O(N)
            {
                  if(nums[i] > nums[i + 1])    // Adjacent elements checked...
                        local++;    // Incrementing the Local variable counter...
            }
            if(local >= 2)    // If we have more than or two Local Inversions...
                  return false;
            return true;    // Non-Ideal Permutation case...
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of elements : ");
            x = sc.nextInt();
            int nums[] = new int[x];
            for(int i = 0; i < nums.length; i++)
            {
                  System.out.print("Enter data : ");
                  nums[i] = sc.nextInt();
            }
            Inversions inversions = new Inversions();     // object creation...
            System.out.println("Ideal Permutation is : "+inversions.IdealPermutation(nums));  // Function calling...
            sc.close();
      }
}



//! Time Complexity => O(N)
//* Space Complexity => O(1)

/** //? DEDUCTIONS :-
 * ? Every Local Inversion is a global inversions...
 * ? If two local Inversions are there then, they can behave as a Global Inversion, since two local inversions will
 * ? create a space of more than 1 index hence, Global Inversion...
 */
