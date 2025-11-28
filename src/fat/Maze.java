package fat;

public class Maze {
    public static void main(String[] args) {

        boolean maze[][]={{true,true,true},
                {true,true,true},
                {true,true,true}};
        allpath("",maze,0,0);

    }
    static void allpath(String p,boolean[][] maze,int row,int col){

        if(row==1&& col==1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        if(row<maze.length-1){
            allpath(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            allpath(p+'R',maze,row,col+1);
        }
        if(row>0){
            allpath(p+'D',maze,row-1,col);

        }
        if(col>0){
            allpath(p+'R',maze,row,col-1);
        }
        maze[row][col]=true;


    }
}
