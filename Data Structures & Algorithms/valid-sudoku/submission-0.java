class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }

        for(int r=0;r<board.length;r++){

            for(int c=0;c<board[0].length;c++){
                char cell = board[r][c];

                if(cell == '.'){
                    continue;
                }

                if(row[r].contains(cell)){
                    return false;
                }
                row[r].add(cell);

                if(col[c].contains(cell)){
                    return false;
                }
                col[c].add(cell);

                int boxIdx= (r/3)*3 + (c/3);

                if(box[boxIdx].contains(cell)){
                    return false;
                }

                box[boxIdx].add(cell);
            }
        }
        return true;
    }
}
