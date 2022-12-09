import java.awt.datatransfer.MimeTypeParseException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PeopleMgr peopleMgr = new PeopleMgr();
        Vehicle vehicle = new Vehicle();
        ListArea listArea = new ListArea();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            showMENU();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    peopleMgr.input();

                    break;
                case 2:
                    listArea.inputVehicle();
                    break;
                case 3:
                    listArea.input();
                    break;
                case 4:
                    peopleMgr.showInfo();
                    break;
                case 5:
                    listArea.showInfo();

                    break;
                default:
                    System.out.print("Choice Fail.");
                    break;
            }


        } while (choice != 6);
    }

    static void showMENU(){
        System.console();
        System.out.println();
        System.out.println("----------------- MENU -----------------");
        System.out.println("1. Nhap danh sach thong tin nguoi gui xe!");
        System.out.println("2. Nhap thong tin phuong tien! ");
        System.out.println("3. Nhap thong tin khu vuc ");
        System.out.println("4. Hien thi thong tin nguoi da gui xe");
        System.out.println("5. Hien thi thong tin xe da duoc gui");
        System.out.println("6. Exit! ");

        System.out.print("Nhap lua chon cua ban: ");
    }


    }
