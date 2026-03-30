package siniflar.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter ali= new Fighter("Ali", 15, 100, 90, 0.1);
        Fighter veli= new Fighter("Veli", 10, 105, 100, 0.3);
        Ring r=new Ring(ali, veli, 90, 100);
        r.run();
        
    }

}
