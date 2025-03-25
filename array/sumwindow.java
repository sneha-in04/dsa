package dsa.array;

public class sumwindow {
    public static void main(String[] args) {
        int[] arr={2,6,10,1,5};
        int k=18;
        int l=0;
        int r=0;
        int sum=0;
        int maxlength=0;
        while(r<arr.length){
            sum=sum+arr[r];
            if (sum <= k) {
                maxlength = r - l + 1;
            } else {
                sum -= arr[l]; // Remove arr[l] from sum to shrink the window
                l++;          // Move the left pointer to the right
            }
            r++;  // Move the right pointer to the right
        

        }
        System.out.printf("%d %d",sum,maxlength);
    }
    
}
