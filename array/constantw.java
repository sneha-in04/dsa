package dsa.array;

public class constantw {
    public static void main(String[] args) {
        int[] arr={2,1,4,9,1,0};
        int k=4;
        //calculate maximum sum of substring of window size 4
        //first we calculate the max sum as intial 4 
        int maxsum=0;
        for (int i=0;i<k;i++){
            maxsum=arr[i]+maxsum;
        }
        int l=0;
        int r=k-1;
        int sum=maxsum;
        while(r<arr.length-1){
            sum=maxsum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxsum=Math.max(maxsum,sum);

        }
        System.out.println(maxsum);
    }
    
}
