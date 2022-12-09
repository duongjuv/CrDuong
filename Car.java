import java.util.Scanner;

public class Car extends Vehicle{

    public Car() {
        super(3.5, 2);

    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin xe: ");
        System.out.println("Nhap ID xe:  ");
        IDxe = sc.nextLine();
        System.out.println("Nhap bien so xe: ");
        BienSo = sc.nextLine();

    }
}
