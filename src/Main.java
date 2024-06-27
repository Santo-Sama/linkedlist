import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit mela = new Fruit("mela");
        Fruit banana = new Fruit("banana");
        Fruit cocco = new Fruit("cocco");
        Fruit pera = new Fruit("pera");
        Fruit melone = new Fruit("melone");

        LinkedList<Fruit> frutti = new LinkedList<>();
        frutti.add(mela);
        frutti.add(banana);
        frutti.add(cocco);

        frutti.addFirst(pera);
        frutti.addLast(melone);

        for (Fruit frutta : frutti){
            System.out.println(frutta.getName());
        }

    }
}