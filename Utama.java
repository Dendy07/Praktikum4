public class Utama {

        public static main(String[] args) {

            // membuat objek Bangun Datar
            BangunDatar bangunDatar = new BangunDatar();

            // membuat objek Lingkaran dan mengisi nilai properti
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.r = 22;

            // membuat objek Segitiga dan mengisi nilai properti
            Segitiga mSegitiga = new Segitiga();
            Segitiga.alas = 12;
            Segitiga.tinggi = 8;

            // membuat objek Persegi dan mengisi nilai properti
            mPersegi persegi = new Persegi();
            mpersegi.sisi = 2;

            // memanggil method luas dan keliling
            bangunDatar.luas();
            bangunDatar.keliling();

            lingkaran.luas();
            lingkaran.keliling();

            segitiga.luas();
            segitiga.keliling();

            mpersegi.luas();
            mpersegi.keliling();
        } 
}