//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int q = sc.nextInt();
      int ind[]=new int[q]; 
      for(int i=0;i<q;i++) ind[i]=sc.nextInt();
      Solution obj = new Solution();
      int ans[] = obj.count_NGEs(n,a,q,ind);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    // code here
     Map<Integer,Integer> map= new HashMap<>();
     for(int i=0;i<N;i++)
     {
         int cnt=0;
         for(int j=i;j<N;j++)
         {
             if(arr[i]<arr[j])
             {
                 cnt++;
             }
         }
         
         map.put(i,cnt);
     }
     
     int[] ans=new int[indices.length];
     
     for(int i=0;i<indices.length;i++)
     {
         
         ans[i]=map.get(indices[i]);;
     }
     
     return ans;
  }
}
     