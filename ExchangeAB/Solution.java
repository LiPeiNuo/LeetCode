package ExchangeAB;

public class Solution {
    public static void main(String[] args) {

    }
    public static int[] exchangeAB(int[] AB){
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;
    }
}
