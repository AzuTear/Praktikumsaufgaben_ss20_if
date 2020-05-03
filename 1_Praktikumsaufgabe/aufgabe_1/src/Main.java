/* Minh Bao Vo*/

public class Main {

    public static void main(String[] args) {
        //Declaration and initialization of n
        int n = 1;
        //Using while-loop method to output every line till it reach 100
        while (n <= 100){
            //if-statement if number CAN be divided by 3 and 5
            if (n % 3 == 0 || n % 5 == 0){
                //divided by 3 and 5
                if (n % 3 == 0 && n % 5 == 0){
                    System.out.print("FizzBuzz\n");
                }else{
                    //divided by 3 and not 5
                    if (n % 3 == 0 && n % 5 != 0) {
                        System.out.print("Fizz\n");
                    }
                    //divided by 5 and not 3
                    if (n % 3 != 0 && n % 5 == 0) {
                        System.out.print("Buzz\n");
                    }
                }
            }
            else {
                //if cannot divided by those numbers, output number
                System.out.print(n + "\n");
            }
            //increment n
            n++;
        }
    }
}
