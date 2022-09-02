class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int startRow=0;
        int startColumn=0;
        int endRow=rows-1;
        int endColumn=columns-1;
        while(startRow<endRow && startColumn<endColumn){
        for(int i=0;i<=endColumn-startColumn-1;i++)
        {
           int temp=matrix[startRow][startColumn+i];
            matrix[startRow][startColumn+i]=matrix[endRow-i][startColumn];
            matrix[endRow-i][startColumn]=matrix[endRow][endColumn-i];
            matrix[endRow][endColumn-i]= matrix[startRow+i][endColumn];
            matrix[startRow+i][endColumn]=temp;
            
        }
        startColumn++;
        startRow++;
        endRow--;
        endColumn--;
        }
        
        
        
    }
}
