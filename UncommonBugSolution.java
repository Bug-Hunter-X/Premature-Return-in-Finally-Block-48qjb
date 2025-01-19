public class UncommonBugSolution {

    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; //Potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("In finally block");
            //The bug is fixed here: return statement is removed from finally
        }
        System.out.println("This will now be printed");
    }
}