public class SwitchStatement {
    public static void main(String[] args) {


        var nilai = "K";

        switch (nilai){
            case "A":
                System.out.println("Anda Sukses!!");
                break;
            case "B":
            case "C":
                System.out.println("Jangan Menyerah!");
                break;
            case "D":
                System.out.println("Ayooo....Coba Terus");
                break;
            case "E":
                System.out.println("Selamat Anda Berhasil");
            default:
                System.out.println("Horeee");

        }
    }
}
