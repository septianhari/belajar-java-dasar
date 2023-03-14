public class MethodOverLoading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Hari");
        sayHello("Hari", "Sabarno");
        sayHello("BAR", "N", "O");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static  void sayHello(String firstName, String middleName, String lastName){
        System.out.println("Hai " + firstName + " " + middleName + " " + lastName);
    }
}