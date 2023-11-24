class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] squares = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (rows[i].contains(val) || cols[j].contains(val) || squares[i / 3][j / 3].contains(val)) {
                        return false;
                    }

                    rows[i].add(val);
                    cols[j].add(val);
                    squares[i / 3][j / 3].add(val);
                }
            }
        }

        return true;
        
    }
}
