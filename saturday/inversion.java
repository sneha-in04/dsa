package dsa.saturday;

public class inversion {
    public static void main(String[] args) {
        int[] arr={70,50,60,10,20,30,80,15};
        int count=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("total number of inversion are:"+count);
    }
    static int pass (String s){
        int pass=0;
        int i=0;
        int n=s.length();
        while(i<n){
            if(i+1<n && s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                pass++;
                i+=2;
            }
            else{
                pass++;
                i++;
            }
            return pass;
        }

    }
}
