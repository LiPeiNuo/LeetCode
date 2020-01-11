package hasPath;
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        int[]flag = new int[matrix.length];
        for(int i = 0; i<rows; i++){
            for(int j = 0;j<cols;j++) {
                if(helper(matrix,rows,cols,i,j,0,str,flag))
                    return  true;
            }
        }
        return false;
    }
    public boolean helper(char[]matrix,int rows,int cols,int i,int j,int k,char[]str,int[]flag){
        int index=i*cols+j;
        if(i<0||i>=rows||j<0||j>=cols||flag[index]==1||matrix[index]!=str[k]){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        flag[index]=1;
        if(helper(matrix,rows,cols,i+1,j,k+1,str,flag)||helper(matrix,rows,cols,i-1,j,k+1,str,flag)||helper(matrix,rows,cols,i,j+1,k+1,str,flag)||helper(matrix,rows,cols,i,j-1,k+1,str,flag))
            return  true;
        flag[index]=0;
        return false;
    }
}
