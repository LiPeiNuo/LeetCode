package weatherBuy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。
// 于是小红要你帮忙判断一下，某串珠子里是否包含了全部自己想要的珠子？
// 如果是，那么告诉她有多少多余的珠子；
// 如果不是，那么告诉她缺了多少珠子。
// 为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。
// 例如，YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了全部她想要的珠子，还多了8颗不需要的珠子；
// ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String have = sc.nextLine();
        String need = sc.nextLine();
        Map<Character,Integer> map1 = new HashMap<>();
        for(char c : have.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else {
                map1.put(c,1);
            }
        }

        Map<Character,Integer> map2 = new HashMap<>();
        for(char c : need.toCharArray()){
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }

        boolean weatherby = true;
        int lack = 0;
        for(Map.Entry<Character,Integer> en : map2.entrySet()){
            char k = en.getKey();
            int v = en.getValue();
            if(map1.containsKey(k) && map1.get(k) < v){
                weatherby = false;
                lack += v- map1.get(k);
            }else if(!map1.containsKey(k)){
                weatherby = false;
                lack += v;
            }
        }
        if(weatherby){
            System.out.println("Yea " +  (have.length() - need.length()));
        }else{
            System.out.println("No " +  lack);
        }
    }
}
