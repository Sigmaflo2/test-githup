public class Calculator(){
  public static void main(String[] args){
    int a = 4;
    int b = 2;
    System.out.println(sum(a,b));
    System.out.println(minus(a,b));
    System.out.println(mul(a,b));
    System.out.println(div(a,b));
  }

  public int sum(int a, int b){
    return a + b;
  }

  public int minus(int a, int b){
    return a - b;
  }

  public int mul(int a, int b) {
    return a * b;
  }

  public int div(int a, int b) {
    return a / b;
  }
}
