import java.util.Scanner;
public class Vehicle {
    protected String BienSo;
    protected String IDxe;
    protected double height;
    protected double width;

    public Vehicle(){

    }
    public Vehicle(String bs, String id, double d, double r){
        this.BienSo = bs;
        this.IDxe = id;
        this.height = d;
        this.width = r;
    }

    public Vehicle(double doDaixe, double doRongXe) {
        this.height = doDaixe;
        this.width = doRongXe;
    }

    public String getBienSo() {
        return BienSo;
    }

    public String getIDxe() {
        return IDxe;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin xe: ");
        System.out.println("Nhap ID xe:  ");
        IDxe = sc.nextLine();
        System.out.println("Nhap bien so xe: ");
        BienSo = sc.nextLine();
        System.out.println("Nhap chieu dai xe: ");
        height = sc.nextDouble();
        System.out.println("Nhap chieu rong xe: ");
        width = sc.nextDouble();
    }

    public String toString(int i){
        return "Vehicle "+ i +" {" + "ID" + getIDxe() + "Bien so: " + getBienSo() + "Chieu dai: " + getHeight() + "Chieu rong: " + getWidth() +" } ";
    }
    public void showInfo(int i){
        System.out.print(toString(i));
    }




}
