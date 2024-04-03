public class printStar {
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int SIZE = 5;

        while(row < SIZE) {
            ++row;

            while(col < row) {
                System.out.print('*');
                ++col;
            }

            col = 0;
            System.out.println();
        }

    }
}
