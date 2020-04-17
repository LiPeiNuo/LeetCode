package PrinterArr;
//二维数组打印：
//        有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
//        给定一个二位数组arr及题目中的参数n，请返回结果数组。
//测试样例：
//        [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
//        返回：
//        [4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
//
//        解题思路：
//        | 0  1  2  3
//        ——|———————————
//        0 | 1  2  3  4
//        1 | 5  6  7  8
//        2 | 9  10 11 12
//        3 | 13 14 15 16
//        首先打印数字下标为(0,3),其次打印数字3的下标(0,2),接着打印8(1,3) 2(0,1) 7(1,2) 12(2,3)
//        从3开始，横坐标加一，纵坐标也加一


public class Solution {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] res = new int[n*n];
        int index = 0;
        int startX = 0;
        int startY = n-1;
        while(startX < n){
            int x = startX;
            int y = startY;
            while(x<n&&y<n) {
                res[index++] = arr[x++][y++];
                if (startY > 0) {
                    startY--;//确定新的开始纵坐标
                }
                else {
                    startX++;//确定新的开始横坐标
                }
            }
        }
        return res;
    }
}
