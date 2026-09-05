class Solution {
    public void gameOfLife(int[][] board) {

        int row = board.length;
        int col = board[0].length;
        int[][] temp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                int count = 0;
                if (i - 1 >= 0) {

                    if (temp[i - 1][j] == 1) count++;
              
                    if (j - 1 >= 0) {
                        if (temp[i - 1][j - 1] == 1) count++;
                    }
                
                    if (j + 1 < col) {
                        if (temp[i - 1][j + 1] == 1) count++;
                    }
                }
            
                if (j - 1 >= 0) {
                    if (temp[i][j - 1] == 1) count++;
                }

               
                if (j + 1 < col) {
                    if (temp[i][j + 1] == 1) count++;
                }
            
                if (i + 1 < row) {

                    if (temp[i + 1][j] == 1) count++;
            
                    if (j - 1 >= 0) {
                        if (temp[i + 1][j - 1] == 1) count++;
                    }
                   
                    if (j + 1 < col) {
                        if (temp[i + 1][j + 1] == 1) count++;
                    }
                }

                if (temp[i][j] == 1) {
                   
                    if (count < 2 || count > 3) {
                        board[i][j] = 0;
                    }

                } else {
                   
                    if (count == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}