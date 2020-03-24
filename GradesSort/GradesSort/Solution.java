package GradesSort;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int stu = sc.nextInt();
            int option = sc.nextInt();
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < stu; i++){
                String name = sc.next();
                int sore = sc.nextInt();
                list.add(sore);
                map.put(name + " " + sore, sore);
            }
            Collections.sort(list);
            if(option == 0){
                Collections.reverse(list);
            }
            int pre = -1;
            for(int i : list){
                if(pre == i) continue;
                for(String key : map.keySet()){
                    if(map.get(key).equals(i)){
                        System.out.println(key);
                    }
                }
                pre = i;
            }
        }
    }
}
