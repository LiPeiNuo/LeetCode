package GCRatio;

import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class Solution {
        private static void Solution(String s,int num){
            Map<Integer,String> map = new HashMap<>();
            for(int i = 0;i<s.length()-(num-1);i++){
                String r = s.substring(i,i+num);
                int count = 0;
                for(int j = 0;j<r.length();j++){
                    char ch = r.charAt(j);
                    if(ch=='C'||ch=='G'){
                        count++;
                    }
                }
                if(!map.containsKey(count)){
                    map.put(count,r);
                }
            }
            Set<Integer> set = map.keySet();
            int max = 0;
            for(Integer t : set){
                if(t>max){
                    max=t;
                }
            }
            String result = map.get(max);
            System.out.println(result);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int num = sc.nextInt();
            Solution(s,num);
        }




}
