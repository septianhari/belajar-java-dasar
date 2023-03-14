public class operasiBoolean {
    public static void main(String[] args) {

        var absen = 90;
        var nilaiAkhir = 80;
        var ujian = 75;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        boolean lulusUjian = ujian >= 75;

        var lulus = (lulusAbsen && lulusNilai);
        System.out.println(lulus);


    }
}
