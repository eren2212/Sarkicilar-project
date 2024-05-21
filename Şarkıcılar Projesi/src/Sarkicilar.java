
import java.util.ArrayList;
    

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkicilari_bastir(){
        System.out.println("Sarkicilar listesinde"+ sarkici_listesi.size()+" kişi vardır");
        for(int i =0 ; i<sarkici_listesi.size();i++){
            System.out.println((i+1)+".sarkici:"+sarkici_listesi.get(i));
        }
        
    }
    
    public  void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);
        System.out.println(isim +" adlı kullanıcı listeye eklendi.");
    }
    
    public void sarkici_güncelle(int pozisyon ,String isim){
        sarkici_listesi.set(pozisyon, isim);
        System.out.println(pozisyon+"daki sarkici güncellenmiştir");
    }
    
    public void sarkici_sil(int pozisyon){
        
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim+" sarkici listesinden silindi.");
    }
    
    public void sarkici_ara(String isim){
         
        int pozisyon = sarkici_listesi.indexOf(isim);// burada yoksa -1 döner
        
        if(pozisyon>=0){
            System.out.println(isim+" adlı sarkici listede bulunuyor.");
        }
        else{
            System.out.println(isim+" adlı sarkici listede bulunmuyor.");
        }
        
    }
}
