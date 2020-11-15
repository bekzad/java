class ChainExcDemo {

    static void demoproc() {

        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new ArithmeticException("cause"));

        throw e;

    }

    public static void main(String args[]) {

        try {

            demoproc();

        } catch(NullPointerException e) {

            System.out.print("Caught: " + e);

            System.out.print("Original cause: " + e.getCause());

        }

    }

}