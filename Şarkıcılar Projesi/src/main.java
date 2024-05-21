
import java.util.Scanner;


public class main {
    public static Sarkicilar sarkicilar = new Sarkicilar();
    public static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_goruntule(){
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
        
    }
    
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
        
    }
    
    public static void sarkici_ekle(){
        System.out.println("Sarkicinin ismini giriniz:");
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_ekle(isim);
    }
    
    public static void sarkici_guncelle(){
        
        System.out.println("Güncellemek istediğiniz pozisyonu seçiniz(1,2,3....):");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Güncellenecek Sarkicinin ismini giriniz:");
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_güncelle(pozisyon-1, isim);
        
        
    }
    
    public static  void sarkici_sil(){
        System.out.println("Silinicek sarkicinin pozisyonunu seçiniz(1,2,3...):");
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    
    public static void sarkici_ara(){
        System.out.println("Aranacak Sarkicinin ismini giriniz:");
        String isim =scanner.nextLine();
        
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] args) {
        
        boolean cikis = false;
        
        islemleri_goruntule();
        
        
        while(!cikis){
            System.out.println("Bir adet seçim yapiniz:");
            int secim =scanner.nextInt();
            scanner.nextLine();
            
            switch(secim){
                case 0:
                    islemleri_goruntule();
                    break;
                    
                case 1:
                    sarkici_goruntule();
                    break;
                    
                case 2:
                    sarkici_ekle();
                    break;
                    
                case 3:
                    sarkici_guncelle();
                    break;
                    
                case 4:
                    sarkici_sil();
                    break;
                    
                case 5:
                    sarkici_ara();
                    break;
                    
                case 6:
                    System.out.println("Uygulamadan Çıkılıyor..");
                    cikis=true;
                    break;
            }
        }
    }
}
