class Solution {
    public int numIslands(char[][] grid) {
       int rows=grid.length;
        int columns=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]=='1')
                { dfsRec(i,j, grid,rows,columns);
                    count++;
                }
            }
        return count;
        
    }
    
    public static void dfsRec(int i, int j, char[][] grid, int rows, int columns) {
        if(i<0||j<0||i+1>rows||j+1>columns)
            return;
        if(grid[i][j]=='1') {
            grid[i][j]='0';
            dfsRec(i + 1, j, grid, rows, columns);
            dfsRec(i, j + 1, grid, rows, columns);
            dfsRec(i - 1, j, grid, rows, columns);
            dfsRec(i, j - 1, grid, rows, columns);
        }


    }
}
