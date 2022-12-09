import java.util.ArrayList;
import java.util.Scanner;

   public class PeopleMgr {
 ArrayList<People> peopleList =  new ArrayList<>();
    int n;
   public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so nguoi gui xe: ");
     n = sc.nextInt();

    for (int i = 1; i <= n ; i++){
        People people = new People();
        people.input(i);
        peopleList.add(people);
    }
  }
  public void showInfo(){
      for (int i = 0; i < n ; i++){
          peopleList.get(i).showInfo(i + 1);
      }

  }
}
