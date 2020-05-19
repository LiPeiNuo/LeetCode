package Practice;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] A = {29,6,28,20,2,24};
        for(int i = 1; i <= 3; i++){
            int e = A[i];
            int j = i;
            while (j > 0){
                if(A[j-1] > e){
                    A[j] = A[j-1];
                }else{
                    break;
                }
                j--;
            }
            A[j] = e;
        }
        System.out.println(Arrays.toString(A));
    }
}
