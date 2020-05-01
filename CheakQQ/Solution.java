package CheakQQ;

/*
* 对QQ号码进行校验
* 只能出现数字 长度5-15位 首位不能出线0
* */

public class Solution {
    public static void main(String[] args) {
        //Cheak_1();
        Cheak_2();
    }

    public static void Cheak_1(){
        String QQ = "04443456754";
        int len = QQ.length();
        char[] arr = QQ.toCharArray();
        if(len >= 5 && len <= 15){
            if(!(QQ.startsWith("0"))){
                boolean flag = true;
                for(int i = 0 ; i < arr.length; i++){
                    if(!(arr[i] >= '0' && arr[i] <= '9')){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("QQ账号输入正确");
                }else{
                    System.out.println("出现非法字符");
                }
            }
            else{
                System.out.println("QQ账号不能以0开始");
            }
        }else{
            System.out.println("输入的QQ账号长度有误");
        }
    }



    public static void Cheak_2(){
        String QQ = "1234567";
        String regex = "[1-9][0-9]{4,14}";
        boolean flag = QQ.matches(regex);
        if(flag){
            System.out.println("QQ:" + QQ);
        }
        else{
            System.out.println("你输入的QQ号码有误");
        }
    }
}
