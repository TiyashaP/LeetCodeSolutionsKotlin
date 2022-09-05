class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int startColumn=0;
        int startRow=0;
        int endRow=rows-1;
        int endColumn=columns-1;
        while(startColumn<endColumn && startRow<endRow)
        {
            for(int offset=0;offset<endColumn-startColumn;offset++)
            {
                int temp=matrix[startRow][startColumn+offset];
                matrix[startRow][startColumn+offset]=matrix[endRow-offset][startColumn];
                matrix[endRow-offset][startColumn]=matrix[endRow][endColumn-offset];
                matrix[endRow][endColumn-offset]=matrix[startRow+offset][endColumn];
                matrix[startRow+offset][endColumn]=temp;
                
            }
            startColumn++;
            endColumn--;
            startRow++;
            endRow--;
        }
        
    }
}
