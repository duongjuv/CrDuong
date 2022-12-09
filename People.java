import java.util.Scanner;

public class People {
    private String id;
    private String name;
    private String birth;
    private String sex;
    private String phoneNumber;
    private String soCanCuoc;

    public People(){

    }
    public People(String a, String b, String c, String d, String e, String f){
        this.id = a;
        this.name = b;
        this.soCanCuoc = c;
        this.birth = d;
        this.sex = e;
        this.phoneNumber = f;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSoCanCuoc() {
        return soCanCuoc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSoCanCuoc(String soCanCuoc) {
        this.soCanCuoc = soCanCuoc;
    }


    public void input(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nguoi thu " + i);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap BirthDay: ");
        birth = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex = sc.nextLine();
        System.out.print("Nhap phoneNumber: ");
        phoneNumber = sc.nextLine();
        System.out.print("Nhap can cuoc cong dan: ");
        soCanCuoc = sc.nextLine();

    }
    public String toString(int i){
        return "People "+ i +" {" + " ID: " + id + " Name: " + name +" Gioi tinh: " + sex + " Ngay sinh: " + birth
                + " So dien thoai: " + phoneNumber +" Chung minh thu: " + soCanCuoc +" } ";
    }
    public void showInfo(int i){
        System.out.println(toString(i));
    }
}
