public class MazePath {
     public static void printMazePathTwo(int cr, int cc, int dr, int dc, String ans) {
        
        if(cr > dr || cc > dc) {
            return;
        }
        
        if(cr == dr && cc == dc) {
            System.out.println(ans);
            return;
        }
        printMazePathTwo(cr, cc + 1, dr, dc, ans + 'H');
        printMazePathTwo(cr + 1, cc, dr, dc, ans + 'V');
    }
    public static void main(String [] args){
        printMazePathTwo(0, 0, 2,2, "");
    }
}
