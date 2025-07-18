public class pattern{

    public static void main(String[] args) {
        Square(5);
        RightAngledTriangle(5);
        LeftAngledTriangle(5);
        InvertedRightAngledTriangle(5);
    }

    public static void Square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_____________________________");
    }

    public static void RightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_____________________________");
    }

    public static void LeftAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
          
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_____________________________");
    }

     public static void InvertedRightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
          
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_____________________________");
    }
}
