//Find K Closest Elements
//Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. 
// The result should also be sorted in ascending order.
//Input: arr = [1,1,2,3,4,5], k = 4, x = -1
//Output: [1,1,2,3]

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        int arr[]={1,1,2,3,4,5};

        

         ArrayList<Integer> li=new ArrayList<>();

         findClosestElements(arr,4,-1,li);



        for(int i=0;i<li.size();i++){
           System.out.print(li.get(i)+" ");
        }



 
    }

    private static void findClosestElements(int[] arr, int k, int x,ArrayList<Integer> li) {
        

        
        int left=0;
        int right=arr.length-1;

        while(right-left+1>k){
            if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
                left++;
            }
            else{
                right--;
            }
        }

        for(int i=left;i<=right;i++){
            li.add(arr[i]);
        }
        
       

    }
}
