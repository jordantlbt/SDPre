public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter, sum;
    counter = 1;
    sum = 0;

    while(counter <= 20) {
      counter = counter + 1;
      sum = sum + counter;
    }
    System.out.println(sum);
  }
}
