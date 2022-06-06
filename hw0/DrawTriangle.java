public class DrawTriangle {
    public static void drawTriangle(int N) {
        int row = 0;
        while (row < N) {
            int col = 0;
            while (col < row + 1) {
                System.out.print("*");
                ++col;
            }
            System.out.print("\n");
            ++row;
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}