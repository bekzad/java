package defaultmethod;

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIfImp ob = new MyIfImp();

        System.out.println("User Id is: " + ob.getUserId());

        // Implemented as a default method from interface
        System.out.println("Admin Id is: " + ob.getAdminId());

        MyIfImp2 ob2 = new MyIfImp2();

        System.out.println("User ID is: " + ob2.getUserId());

        // Implemented as overridden method from class
        System.out.println("Admin ID is: " + ob2.getAdminId());

        // Usage of static method in an interface
        System.out.println(MyIf.getUniversalId());
    }
}
