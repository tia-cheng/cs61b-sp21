public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int col = 0;
        int row = 0;

        while (row < N) {
            ++row;

            while (col < row) {
                System.out.print('*');
                ++col;
            }

            col = 0;
            System.out.println();
        }
    }
    public static void main(String[] args){
        drawTriangle(6);
    }
}
