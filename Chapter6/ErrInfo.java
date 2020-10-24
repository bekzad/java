
class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String errors[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index-Out-Of-Bound"
    };
    int howbad[] = {3,2,2,4};

    Err getErrorInfo(int i) {
        if(i >=0 & i < errors.length) 
            return new Err(errors[i], howbad[i]);
        else 
            return new Err("Invalid Error Code", 0);
    }
}


public class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo error = new ErrorInfo();
        Err answer;

        answer = error.getErrorInfo(3);
        System.out.println(answer.msg + " " + answer.severity);

        answer = error.getErrorInfo(99);
        System.out.println(answer.msg + " " + answer.severity);
    }
}