
import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        int area=l*b;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
