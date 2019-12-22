package FirstNotRepeatingChar;
import java.util.HashSet;
public class Solution {
    public int FirstNotRepeatingChar(String str){
        for(int i = 0; i < str.length(); i++ ){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }


    public int FirstNotRepeatingChar2(String str) {
        HashSet<Character> set = new HashSet<>(128);
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (set.contains(t)) {
                continue;
            }
            if (str.indexOf(t) == i && str.lastIndexOf(t) == i){
                return i;
            }
            set.add(t);
        }
        return -1;
    }
}