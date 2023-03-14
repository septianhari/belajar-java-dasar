public class ForEach {
    public static void main(String[] args) {


        String[] names ={
          "Septian", "Hari", "Sabarno",
           "Programmer", "From", "Now"
        };

        for (var i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Contoh ForEach");
        for (var name : names){
            System.out.println(name);
        }
    }
}
