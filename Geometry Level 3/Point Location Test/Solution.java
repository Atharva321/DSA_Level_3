import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // Write Code here
    int tests = scn.nextInt();
    while(tests>0){
      long x1 = scn.nextInt();
      long y1 = scn.nextInt();
      long x2 = scn.nextInt();
      long y2 = scn.nextInt();
      long x3 = scn.nextInt();
      long y3 = scn.nextInt();
      long direction = (y2-y1)*(x3-x2) - (y3-y2)*(x2-x1);
      if(direction < 0){
        System.out.println("LEFT");
      } 
      else if(direction > 0){
        System.out.println("RIGHT");
      }
      else{
        System.out.println("TOUCH");
      }
      tests--;
    }
    scn.close();
  }
}
