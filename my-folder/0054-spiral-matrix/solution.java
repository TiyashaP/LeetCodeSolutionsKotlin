class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList=new ArrayList<>();
        int rows=matrix.length;
        int columns=matrix[0].length;
        int startRow=0;
        int startColumn=0;
        int endRow=rows-1;
        int endColumn=columns-1;
        int count=0;
        int total=rows*columns;
        while(count<total)
        {
           for(int i=startColumn;i<=endColumn && count<total;i++)
           {
               spiralList.add(matrix[startRow][i]);
               count++;
           }
            startRow++;
             for(int i=startRow;i<=endRow && count<total;i++)
           {
               spiralList.add(matrix[i][endColumn]);
               count++;  
           }
            endColumn--;
             for(int i=endColumn;i>=startColumn && count<total;i--)
           {
               spiralList.add(matrix[endRow][i]);
               count++;  
           }
            endRow--;
              for(int i=endRow;i>=startRow && count<total;i--)
           {
               spiralList.add(matrix[i][startColumn]);
               count++;   
           }
            startColumn++;
            
        }
        
        return spiralList;
    }
}
