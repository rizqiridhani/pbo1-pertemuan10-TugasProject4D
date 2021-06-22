import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Pengunjung dhani = new Pengunjung();
       Pengunjung adit  = new Pengunjung();
       Pengunjung rizqi = new Pengunjung( 1,"rizqi","lenovo",
               "matot","ganti Pasta",new Date(),new Date(),"500000");
       Pengunjung yudha = new Pengunjung(2,"yudha","Asus",
               "HDD rusak","tidak ada",new Date(),new Date(), "450000");
       Pengunjung wahyu = new Pengunjung(3, "wahyu", "Asus");
       Pengunjung rahman = new Pengunjung(4,"rahman","Macbook");

    }

}
