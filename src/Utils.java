import java.util.Scanner;
public class Utils{
    public static void printTitle(){
        System.out.println("*******\n* OOP *\n*******");
    }
    
    public static int areaCalc(int width, int length){
        int area = 0;
        return area = width * length;
    }
    
    public static void main(String[] args){
        Utils utils = new Utils();
        Scanner sc = new Scanner(System.in);
        utils.printTitle();
        System.out.println("Width?");
        int width = Integer.parseInt(sc.nextLine());
        System.out.println("Length?");
        int length = Integer.parseInt(sc.nextLine());
        int result = utils.areaCalc(width,length);
        System.out.println("Area is "+result);
    }
}