public class SwitchLambda {
    public static void main(String[] args) {

        var nilai = "L";

        switch (nilai){
            case "A" -> System.out.println("Good boys");
            case "B", "C" -> System.out.println("Nice Try Dude");
            case "D" -> System.out.println("well broo");
            default -> {
                System.out.println("Awesome..");
            }
        }


    }
}
