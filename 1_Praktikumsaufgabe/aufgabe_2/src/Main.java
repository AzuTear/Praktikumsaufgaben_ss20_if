/* Minh Bao Vo*/

public class Main {

    public static void main(String[] args) {
        //look out if input is there, throw exceptions if not
        if(args.length < 2){
            System.out.println("Missing input. Please try again!\n");
            System.exit(1);
        }
        //using switch-case to differentiate those operators
        switch(args[1]){
            case "+":
                System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                break;
            case "%":
                System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
                break;
                //sysout if any of those operator above are not used
            default:
                System.out.println("Operator is not supported. Please try again!");
        }
    }
}
