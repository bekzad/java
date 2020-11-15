class FinallyDemo {

    static void procA() {

        try {

            System.out.print("inside procA");

            throw new RuntimeException("demo");

        } finally {

            System.out.print("/procA's finally");

        }

    }

    static void procB() {

        try {

            System.out.print("inside procB");

            return;

        } finally {

            System.out.print("/procB's finally");

        }

    }

    static void procC() {

        try {

            System.out.print("inside procC");

        } finally {

            System.out.print("/procC's finally");

        }

    }

    public static void main(String args[]) {

        try {

            procA();

        } catch (Exception e) {

            System.out.print("/Exception caught");

        }

        procB();

        procC();

    }

}