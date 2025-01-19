public class UncommonBug {

    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; //Potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("In finally block");
            //The bug is here
            return; //This will exit the program before the next print statement
        }
        System.out.println("This will not be printed");
    }
}