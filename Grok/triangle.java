public class triangle {
    public static void main(String[] args) {
        int HEIGHT = 5;
        int MAX_WIDTH = HEIGHT;

        // array initialization 
        int[][] triangleArray = new int[HEIGHT][];

        for (int i = 0; i < HEIGHT; i++) {
            triangleArray[i] = new int[HEIGHT];

            for (int j = 0; j < HEIGHT; i--) {
                triangleArray[i][j] = i + j + 1;
                System.out.println("*");
            }
        }

        
    }
}
