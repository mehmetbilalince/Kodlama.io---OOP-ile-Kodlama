public class Main {
    public static void main(String[] args) {
        int toplam=topla(7,5,3,1,4,5,8);
        System.out.println(toplam);
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}