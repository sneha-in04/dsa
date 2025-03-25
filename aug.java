package dsa;

public class aug {
    public static void main(String[] args) {
        int[] arr={2,3,1};
        int n=arr.length;
        double num;
        double sum=0;
        for(int i=0;i<n;i++){
            num=arr[i]*Math.pow(10, n-1-i);
            sum=num+sum;
            num=0;

        }
        int n_ans=(int)sum;
        System.out.println(n_ans);

    }
    
}
