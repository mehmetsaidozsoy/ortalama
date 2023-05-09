import java.util.Scanner;
public class deneme_2 {
    public static void main(String[] args) {
        int mat,fiz,kim,biy,tur,tar,muz;
        Scanner input=new Scanner(System.in);

        System.out.println("MAT noyunuzu giriniz  :");
        mat=input.nextInt();        
        System.out.println(mat);     
        System.out.println("FİZİK noyunuzu giriniz  :");
        fiz=input.nextInt();        
        System.out.println(fiz);     
        System.out.println("Kimya noyunuzu giriniz  :");
        kim=input.nextInt();        
        System.out.println(kim);     
        System.out.println("Biyoloji noyunuzu giriniz  :");
        biy=input.nextInt();        
        System.out.println(biy);  
        System.out.println("Türkçe noyunuzu giriniz  :");
        tur=input.nextInt();        
        System.out.println(tur);     
        System.out.println("Tarih noyunuzu giriniz  :");
        tar=input.nextInt();        
        System.out.println(tar);     
        System.out.println("Müzik noyunuzu giriniz  :");
        muz=input.nextInt();        
        System.out.println(muz);  
        
        double ortalama=(fiz+kim+biy+mat+muz+tar+tur)/7;
        System.out.println(ortalama);
        String message= ortalama >60 ?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(message);
    }
}
