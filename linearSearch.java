package dsa;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        /*int[] nums={12,1,3,54,22};
        int ans=search1(nums, 3);
        System.out.println(ans);
        String name="sneha";
        char target='h';
        System.out.println(searchatstring(name,target));
        String a="ram";
        char[] charArray=a.toCharArray();
        System.out.println(Arrays.toString(charArray));
        int min=search_min(nums);
        System.out.println("the minimum number is:"+min);*/
        int[] [] arr2={
            {23,45},
            {24,56,78},
            {12,67,31}
        };
        int tar=search_2d(arr2,12);
        System.out.println(tar);
        int arr3 =maximumWealth(arr2);
        System.out.println(arr3);



        
    }
    //search in array
    static int  search1(int[] arr, int target){
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //search in an string
    static boolean searchatstring(String str,char target){
        if(str.length()==0){//to check length of string in java we have built i n fuction atr.length()
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    //find min number from the array
    static int search_min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
    //search element in 2 d array
    static int search_2d(int[][] arr,int target){
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            for(int c=0;c<arr[i].length;c++){
                if(arr[i][c]==target){
                    return 1;
                }
            }
        }
        return -1;
    }
    static int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int[] arr=new int[m];
        int sum=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<accounts[r].length;c++){
                sum=sum+accounts[r][c];
                arr[r]=sum;                
            }
        }
        int max=arr[0];
        for(int j=0;j<arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        return max;
        
    }
    
}
