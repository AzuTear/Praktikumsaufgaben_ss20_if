public class Main {

    //create own function to have a better overview
    private static double bisection(double l, double r) {
        double c = 0;
        //for-loop for exactly 10 iteration
        for (int t = 1; t <= 10; t++) {
            c = (l + r) / 2;
            if (f(c) > 0) {
                l = c;
            }
            if (f(c) < 0) {
                r = c;
            }
            //using String.format to print out exactly 6 decimal places
            System.out.println("Iteration "+ t  + ": f(" + String.format("%.6f",c) +  ") = " + String.format("%.6f",f(c)));
        }
        return c;
    }

    private static double f(double x) {
        return Math.cos(x);
    }

    public static void main(String[] args) {
        //throw exception if input are missing or not enough
        if (args.length < 2) {
            System.out.println("Not enough input. Please try again!");
            System.exit(1);
        }

        //read input and convert
        double l = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        //first error message
        if (l > r) {
            System.out.println("First parameter cannot be bigger than your second one!");
        }
        //second error massage
        if (!(f(l) > 0 && f(r) < 0)) {
            System.out.println("First parameter have to be bigger and second parameter have to be smaller than 0");
        } else {
            //using above function
            double c = bisection(l, r);
            //separate result in sysout
            System.out.print("Ergebnis: " + "f(" + String.format("%.6f",c) + ") = " + String.format("%.6f",f(c)));
        }

    }
}
