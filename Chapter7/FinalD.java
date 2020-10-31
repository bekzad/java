// Demonstrates the use of final constants
// Final constants can be inherited and used, but can't be changed
// Final methods cannot be overridden, but can be used
// Final classes cannot be inherited
// Demonstration of object class

class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String errors[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index-Out-Of-Bound"
    };


    String getErrorMsg(int i) {
        if(0 <= i & i < errors.length)
            return errors[i];
        else
            return "Invalid Error Code";
    }
}

public class FinalD {
    public static void main(String args[]) {
        ErrorMsg error = new ErrorMsg();

        System.out.println(error.getErrorMsg(error.OUTERR));
        System.out.println(error.getErrorMsg(error.DISKERR));

        // Object class
        Object error2 = new ErrorMsg();
        Object error3 = new ErrorMsg();
        System.out.println(error2.toString());
        System.out.println(error2.equals(error3));

        Object error4 = error3.hashCode();
        System.out.println(error4);

        System.out.println(error4.getClass());
    }
}