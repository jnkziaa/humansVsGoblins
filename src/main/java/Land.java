public class Land {
    String[][] landGrid;


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
}
