package isNumeric;

public class Solution {

    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str) ;

        return string.matches("[\\+\\-]?[0-9]*(\\.[0-9]*)?([eE][\\+\\-]?[0-9]+)?");
    }

}