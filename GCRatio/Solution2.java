package GCRatio;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dna = scan.nextLine();
        int usedSize = scan.nextInt();
        String maxStr = "";
        //记录比例最高的字符串
        double maxRatio = 0;
        //记录目前出现的最高比例
        // 注意：最后一个子串的下标是：i = dna.length() - length;
        for (int i = 0; i < dna.length() - usedSize + 1; i++) {
            //这里提取长度为length的有效数据个数。
            String str = dna.substring(i, i + usedSize);
            if (GiveRatio(str) > maxRatio) {
                maxStr = str;
                maxRatio = GiveRatio(str);
            }
        }
        System.out.println(maxStr);
    }
    //返回一个字符串的GC比例
    public static double GiveRatio(String str) {
        double ratio = 0;
        //这里要用double型，如果用int型，2/5的结果为0
        double count = 0;
        //用double型，原因同上
        for (char ch : str.toCharArray()) {
            if (ch == 'G' || ch == 'C') count++;
        }
        ratio = count / (double) str.length();
        return ratio;
    }
}
