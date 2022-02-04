import java.util.Scanner;

public class _2578 {

    static int row_bingo(int[][] board, int c) {
        int row = -1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(board[i][j]==c) {
                    row = j;
                    break;
                }
            }
            if(row!=-1) break;
        }
        return row;
    }

    static int col_bingo(int[][] board, int c) {
        int col = -1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(board[i][j]==c) {
                    col = i;
                    break;
                }
            }
            if(col!=-1) break;
        }
        return col;
    }

    static int count_bingo(int[][] bingo, int row, int col) {
        int cnt = 0;

        if(col==row) {
            int a = 0;
            for(int i=0; i<5; i++) {
                a += bingo[i][i];
            }
            if(a==5) cnt++;
        } // \ 방향 대각선
        if(col==5-row-1) {
            int b = 0;
            for(int i=0; i<5; i++) {
                b += bingo[i][5-i-1];
            }
            if(b==5) cnt++;
        } // / 방향 대각선

        int c = 0;
        int d = 0;

        for(int i=0; i<5; i++) {
            c+=bingo[row][i];
            d+=bingo[i][col];
        }

        if(c==5) cnt++;
        if(d==5) cnt++;

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[5][5];
        int[][] bingo = new int[5][5];
        int cnt=0;
        int out=0;

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<25; i++) {
            int c = sc.nextInt();

            int row = row_bingo(board, c);
            int col = col_bingo(board, c);

            bingo[row][col] = 1;

            cnt+=count_bingo(bingo,row,col);

            if(cnt>=3 && out == 0) {
                System.out.println(i+1);
                out=-1;
            }
        }
    }
}
