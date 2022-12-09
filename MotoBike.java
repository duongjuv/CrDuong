import java.util.Scanner;

public class MotoBike extends Vehicle{
    public MotoBike() {
        super(2.5, 1.0);
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
