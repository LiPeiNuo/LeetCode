package FindContinuousSequence;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=1; i < sum; i++){
            int temp = 0;
            int j = i;
            while(temp < sum){
                temp += j;
                j++;
            }
            if(temp == sum){//如果找到了那么就要把数据添加到结果数据中。
                ArrayList<Integer> newArray = new  ArrayList<Integer>();
                for(int k=i;k< j;k++){
                    newArray.add(k);
                }
                result.add(newArray);
            }
        }
        return result;

    }
}