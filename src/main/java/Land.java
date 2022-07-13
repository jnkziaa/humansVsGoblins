public class Land {
    private String[][] landGrid;
    private Humans human = new Humans(100, 15, 54);
    private int humanPosition = human.getPositioning();


    public Land(String[][] landGrid) {

        this.landGrid = landGrid;

    }

    public void getLandGrid() {
        for(int i = 0; i < landGrid.length; i++){
            for(int j = 0; j < landGrid[i].length; j++){
                System.out.print(landGrid[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void setLandGrid(String[][] landGrid) {
        this.landGrid = landGrid;
    }

    public void currentPlayerPosition(){
        StringBuilder strBuild = new StringBuilder();

        if(humanPosition < 10){
            strBuild.append(humanPosition);
            strBuild.insert(0, 0);
        }
        else{
            strBuild.append(humanPosition);
        }

        int col = Integer.parseInt(String.valueOf(strBuild.charAt(0)));
        int row = Integer.parseInt(String.valueOf(strBuild.charAt(1)));
        System.out.println(col + " " + row);
        landGrid[col][row] = "PL";

        setHumanPosition(Integer.parseInt(strBuild.toString()));
    }

    public void setHumanPosition(int humanPosition) {
        this.humanPosition = humanPosition;
    }

    public int getHumanPosition() {
        return humanPosition;
    }

    public void playerMoveEast(){
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(getHumanPosition());
        int col = Integer.parseInt(String.valueOf(strBuild.charAt(0)));
        int row = Integer.parseInt(String.valueOf(strBuild.charAt(1)));
        landGrid[col][row] = "--";
        this.setHumanPosition(humanPosition + 1);
        currentPlayerPosition();
        getLandGrid();
    }
    public void playerMoveSouth(){
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(getHumanPosition());
        int col = Integer.parseInt(String.valueOf(strBuild.charAt(0)));
        int row = Integer.parseInt(String.valueOf(strBuild.charAt(1)));
        landGrid[col][row] = "--";
        this.setHumanPosition(humanPosition + 10);
        currentPlayerPosition();
        getLandGrid();

    }
    public void playerMoveNorth(){
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(getHumanPosition());
        int col = Integer.parseInt(String.valueOf(strBuild.charAt(0)));
        int row = Integer.parseInt(String.valueOf(strBuild.charAt(1)));
        landGrid[col][row] = "--";
        this.setHumanPosition(humanPosition - 10);
        currentPlayerPosition();
        getLandGrid();
    }
    public void playerMoveWest(){

        StringBuilder strBuild = new StringBuilder();
        strBuild.append(getHumanPosition());
        int col = Integer.parseInt(String.valueOf(strBuild.charAt(0)));
        int row = Integer.parseInt(String.valueOf(strBuild.charAt(1)));
        if(row - 1 > -1) {
            landGrid[col][row] = "--";
            this.setHumanPosition(humanPosition - 1);
            currentPlayerPosition();
            getLandGrid();
        }
        else {
            System.out.println("We cannot move that way!");
            this.setHumanPosition(humanPosition);
            currentPlayerPosition();
            getLandGrid();
        }
    }
}
