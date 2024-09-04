import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        double xM = sc.nextDouble();

        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        double xC = sc.nextDouble();

        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        double r = sc.nextDouble();

        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        double yM = sc.nextDouble();

        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        double yC = sc.nextDouble();

        double result = Math.sqrt((xM * xM - xC * xC) + (yM * yM - yC * yC));

        if(result < r){
            System.out.println("Diem M nam ngoai duong tron");
        }else if(result == r){
            System.out.println("Diem M nam tren duong tron");
        }else {
            System.out.println("Diem M nam trong duong tron");
        }
    }
}