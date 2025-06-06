public class o11 {
    public static void main(String[] args) {
        String[][] ogrenciBilgileri = {
                { "2144757723", "Sedat", "AKSOY", "3", "3.42", "85", "61" },
                { "2018658333", "Kasım", "PARLAK", "2", "1.20", "32", "97" },
                { "2007738289", "Hakan", "TATAR", "2", "1.18", "100", "100" },
                { "1639874189", "Serkan", "TOSUN", "1", "1.68", "53", "69" },
                { "1603730366", "Nurullah", "ÇETİN", "2", "3.06", "98", "83" },
                { "2428576096", "Aşkın", "YAMEN", "1", "1.75", "59", "25" },
                { "1861826383", "Osman", "ÜNAL", "2", "3.80", "64", "70" },
                { "1814771716", "Erdem", "AKBULUT", "1", "2.75", "39", "100" },
                { "2125025702", "Muhammed a", "CEYLAN", "2", "2.37", "92", "30" },
                { "1612886236", "Bülent", "IŞILDAR", "1", "1.53", "74", "43" },
                { "1926987790", "Mehmet", "KARSAVURAN", "1", "2.53", "101", "90" },
                { "2216143044", "Murat", "AYDIN", "1", "1.58", "57", "95" },
                { "2026617639", "Mehmet", "DURSUN", "3", "2.38", "68", "66" },
                { "2114432679", "Hüseyin", "ŞAR", "2", "2.28", "40", "88" },
                { "1607476406", "Barış", "SARI", "3", "1.22", "100", "66" },
                { "1683119030", "Osman", "KORKMAZ", "1", "2.90", "65", "47" },
                { "1806588911", "Mustafa", "ADIYAMAN", "2", "1.43", "97", "88" },
                { "1916425828", "Eşref", "ŞİMŞEK", "1", "2.33", "82", "37" },
                { "2258212212", "Behzat", "AYTEKİN", "3", "3.29", "94", "98" },
                { "2017352191", "Levent", "CEYLAN", "1", "1.84", "33", "40" },
                { "1772474045", "Serdar", "YILDIZ", "1", "2.48", "39", "22" },
                { "2290245264", "Akın", "KIYOĞLU", "1", "2.83", "44", "42" },
                { "1843088218", "Erdem", "KOCA", "2", "2.11", "78", "26" },
                { "2055363724", "Ayhan", "DALKILIÇ", "2", "1.98", "34", "78" },
                { "1990180191", "Ali", "DİKBAŞ", "1", "1.72", "84", "56" },
                { "1833797876", "Haydar", "YAŞAR", "1", "2.50", "79", "79" },
                { "1994745116", "Halis", "KÜÇÜKER", "2", "3.12", "38", "33" },
                { "1716178786", "Fevzi", "ŞENTÜRK", "1", "0.94", "66", "67" },
                { "2074627968", "Gökhan", "İNCEKARA", "1", "3.40", "87", "55" },
                { "1683369963", "Gökhan", "BAHŞİ", "2", "2.02", "65", "83" },
                { "1922589815", "Mehmet", "YÜCEL", "2", "1.40", "32", "85" },
                { "2283947163", "Arif", "YEŞİL", "4", "1.57", "22", "63" },
                { "1629184791", "Kadir", "DÖNMEZ", "3", "2.88", "80", "76" },
                { "2238374303", "Ali", "AVCI", "1", "2.70", "33", "67" },
                { "1667341809", "Fatih", "PAKSOY", "2", "2.93", "83", "64" },
                { "2154395380", "Barış", "PATUR", "1", "1.28", "66", "55" },
                { "2106933008", "Özgür", "ÇAKIR", "1", "2.10", "84", "47" },
                { "2301526623", "Mehmet", "GÜNAL", "4", "2.10", "76", "78" },
                { "1757972342", "Mahmut", "ERKAL", "2", "2.35", "49", "73" },
                { "2251494820", "Abdullah", "KAHYA", "1", "1.28", "25", "82" },
                { "2079565081", "İrfan", "MADEN", "1", "1.87", "56", "26" },
                { "2307742246", "Engin", "SEZGİN", "2", "0.57", "91", "44" },
                { "2259091205", "Ahmet", "SÖZER", "2", "2.95", "27", "83" }
        };
        for (int i = 0; i < ogrenciBilgileri.length; i++) {
            String siradakiSinifBilgisi = ogrenciBilgileri[i][3];
            if (siradakiSinifBilgisi.equals("2"))
                System.out.println(ogrenciBilgileri[i][1] + " " + ogrenciBilgileri[i][2]);
        }

        System.out.println("************");
        for (int i = 0; i < ogrenciBilgileri.length; i++) {
            int siradakiSinifBilgisi = Integer.parseInt(ogrenciBilgileri[i][3]);
            if (siradakiSinifBilgisi>=2)
                System.out.println(ogrenciBilgileri[i][1] + " " + ogrenciBilgileri[i][2]);
        }

        System.out.println("*********");
        //gno 1.8 den büyük olanların ortalamasını hesapla
        for (int i = 0; i < ogrenciBilgileri.length; i++){
            double gno = Double.parseDouble(ogrenciBilgileri[i][4]);
            double vizeNotu = Double.parseDouble(ogrenciBilgileri[i][5]);
            double finalNotu = Double.parseDouble(ogrenciBilgileri[i][6]);
            double ort=0;
            if(gno>1.8){
                ort = vizeNotu*0.4+finalNotu*0.6;
                System.out.println(ort);
            }



        }
    }
}
