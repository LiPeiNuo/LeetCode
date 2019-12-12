package reOrderArray;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public void reOrderArray(int [] array) {
        List<Integer>ls1=new ArrayList<Integer>();
        List<Integer>ls2=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                ls1.add(array[i]);
            }
            else {
                ls2.add(array[i]);
            }
        }
        ls1.addAll(ls2);
        for(int i=0;i<array.length;i++){
            array[i]=ls1.get(i);
        }
    }
}