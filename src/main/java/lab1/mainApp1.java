package lab1;


/**
 * @author Antoine Heurtier (393038)
 */
public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println(b+" to power "+n+" = "+ MyLibrary.Power(b,n));
        System.out.println(n+"! = " + MyLibrary.factorial(n));
        System.out.println("This is a debug print line");
        System.out.println("Program ..Ended …");
    }
}
