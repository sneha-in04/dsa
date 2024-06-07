package dsa.search;

public class binarysearch {
    public static void main(String[] args) {
        int[] nums={23,32,45,65};
        int target =45;
        int index=Bsearch(nums, target);
        System.out.println(index);
        int ceil=ceil_num(nums, 33);
        System.out.println(ceil);

    }
    static int Bsearch(int[]arr,int target){
        int start=0;
        int end=arr.length;
        while(start<end){
            int m=start+((end-start)/2);
            if(target>arr[m]){
                start=m+1;
            }
            else if(target<arr[m]){
                end=m-1;
            }
            else if(target==arr[m]){
                return m;
            }


            
        }
        return -1;
    }
    //ceiling of the number
    static int ceil_num(int[] arr ,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int m=start+((end-start)/2);
            if(target>arr[m]){
                start=m+1;

            }
            else if(arr[m]>target){
                end=m-1;

            }
            else if(arr[m]==target){
                return m;
            }
           
        }
        return arr[start];//for floor end


    }
    
}
