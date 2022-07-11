public class Main {
    public static void main(String[] args) {
        String[][] defaultGrid = new String[10][10];
        for(int i = 0; i < defaultGrid.length; i++){
            for(int j = 0; j < defaultGrid[i].length; j++){
                defaultGrid[i][j] = "--";
            }
        }
        Humans human = new Humans(100, 5, 54);
        Land land = new Land(defaultGrid);
        land.getLandGrid();
    }
}
