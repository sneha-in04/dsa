package dsa.search;

public class merg {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,2};
        mergesort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.println(num);
        }


    }
    static void merge(int[] arr,int low,int mid,int high){
        int len=arr.length;
        int[] temp=new int[len];
        int i=0;
        int l=low;
        int r=mid+1;
        while(l<=mid && r<=high){
            if(arr[l]<arr[r]){
                temp[i]=arr[l];
                l++;
                i++;
            }
            else{
                temp[i]=arr[r];
                r++;
                i++;
            }

        }
        while(l<=mid){
            temp[i]=arr[l];
            l++;
            i++;
        }
        while(r<=high){
            temp[i]=arr[r];
            r++;
            i++;
        }
        for (i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
        
    }
    static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    
}
