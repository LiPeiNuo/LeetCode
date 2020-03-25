package getValue;

import java.util.HashMap;
import java.util.Map;
//微信红包
//重复元素个数超过一半以上的值
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,2,2,2,2,2,2,3,3};
        getValue(arr,13);
    }
    public static int getValue(int[] gifts, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int num = 0;
        if(n % 2 ==0){
            num = n /2;
        }else{
            num = (n + 1) /2;
        }
        for(int i = 0; i < gifts.length; i++){
            int count = map.getOrDefault(gifts[i],0);
            map.put(gifts[i],count +1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int a = entry.getKey();
            int b = entry.getValue();
            if(b >= num){
                result = a;
            }
        }
        return result;
    }
}
