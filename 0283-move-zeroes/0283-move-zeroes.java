class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length,i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                if(i!=j){
                     int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }   
                i++;
            }
        }
    }
}