package dsa.hashing;

public class count {
    public static void main(String[] args) {
        int[] arr={2,3,2,2,8,6,3};//array
        int[] hash= new int [13];//created a hash array
        for(int i=0;i<arr.length;i++){//to iterate through whole arr and count which element has occured how many times;
            hash[arr[i]]+=1;
        }
        System.out.println(hash[2]);


    }
    
}
