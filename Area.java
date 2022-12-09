import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    public String address;
    public double height;
    public double width;
    ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
    public Area(){

    }
    public void addVehicle(Vehicle vehicle){
         vehicleArrayList.add(vehicle);
    }
    public Area(String vt, double a, double b){
        this.address = vt;
        this.height = a;
        this.width = b;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap dia chi area: ");
        address = sc.nextLine();
        System.out.print("Nhap chieu dai area: ");
        height= sc.nextDouble();
        System.out.print("Nhap chieu rong area: ");
        width = sc.nextDouble();

    }
    public boolean checkAvaiable(Vehicle vehicle){
        double usedHeight = 0.00;
        double usedWidth = 0.00;
        for (int i = 1; i <= vehicleArrayList.size(); i++){
            usedWidth += vehicleArrayList.get(i).width;
            usedHeight += vehicleArrayList.get(i).height;
        }
        double avaiableHeight = height - usedHeight;
        double avaialbeWidth = width - usedWidth;
        if(avaiableHeight > vehicle.getHeight() && avaiableHeight > vehicle.getWidth()){
            return  true;
        }

        return false;
    }
    public void showInfo(){
        for (int i = 0; i < vehicleArrayList.size(); i++){
            vehicleArrayList.get(i).showInfo(i + 1);
        }
    }




}
