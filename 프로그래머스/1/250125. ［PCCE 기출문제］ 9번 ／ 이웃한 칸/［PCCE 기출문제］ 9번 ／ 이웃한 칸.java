class Solution {
    
    static int[] dh = {0, 1, -1, 0};
    static int[] dw = {1, 0, 0, -1};
    
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int answer = 0;
        
        for (int i = 0; i < 4; i++) {
            if (isIn(h + dh[i], w + dw[i], n) && board[h][w].equals(board[h + dh[i]][w + dw[i]])) answer++;
        }
        
        return answer;
    }
    
    public boolean isIn(int h, int w, int n) {
        if (h >= 0 && h < n && w >= 0 && w < n) return true;
        return false;
    }
}