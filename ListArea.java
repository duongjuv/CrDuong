import java.util.ArrayList;
import java.util.Scanner;

public class ListArea {
    ArrayList<Area> areaList = new ArrayList<>();
    //ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so khu vuc can them: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n ; i++){
            Area area = new Area();
            area.input();
            areaList.add(area);
        }
    }
    public void inputVehicle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so xe can them: ");

        int n = scanner.nextInt();
        int choice;
        for(int i = 1; i <= n ; i++){
            showOptions();
             choice = scanner.nextInt();
            Vehicle vehicle;
            if(choice == 1) {
                vehicle = new MotoBike();
            }
            else  if(choice == 2)
                vehicle = new Car();
            else
                vehicle = new SuperCar();
            vehicle.input();
            // tim vi tri de xe
            for(int j = 0; j < areaList.size(); j++){
                if(areaList.get(i).checkAvaiable(vehicle)){
                    areaList.get(i).addVehicle(vehicle);

                }
            }

        }


    }

    public void showInfo(){
        for (int i = 0; i < areaList.size(); i++){
            areaList.get(i).showInfo();
        }

    }

    public void showOptions(){
        System.out.println("1. Xe may");
        System.out.println("2. Xe o to");
        System.out.println("3. Xe super");
        System.out.print("Lua chon cua ban la: ");
    }

}
