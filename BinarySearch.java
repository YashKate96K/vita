public class BinarySearch {
    public static void main(String[] args) {
      // int arr[] = {9,8,7,6,5,4,3,2,1};
      int arr[] ={1,2,3,4,5,6,7,8,9} ;
       int target = 3;
        int ans = binarySearch(arr,target);
       System.out.println(ans);
    }
    static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length -1 ;
        boolean aSc = arr[start]<arr[end] ;
        while (start<=end) {
            int m = start + (end-start)/2 ;
            if(target==arr[m]){
              return m;
            }
          
            if(aSc){
            if(target>arr[m]){
                start = m+1;
            }
            else if(target<arr[m]){
                end = m-1;
            }
        } else {
            if(target<arr[m]){
                start = m+1;
            }
            else if(target>arr[m]){
                end = m-1;
            }
        }
        }
        return -1;
    }
}
