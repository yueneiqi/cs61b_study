public class Triangle {
    public static void main(String[] args) {
        int SIZE = 5;
        int row = 0;
        while (row < SIZE) {
            int col = 0;
            while (col < row + 1) {
                System.out.print("*");
                ++col;
            }
            System.out.print("\n");
            ++row;
        }
    }
}