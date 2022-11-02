public class Main {
    public static void main(String[] args) {
        dog dog = new dog("Zmora", "Kundel");
        System.out.println("Nazwa psa: " + dog.getNazwa() + "\nRasa psa: " + dog.getRasa());
        dog.setNazwa("Kozula");
        System.out.println("Nowa nazwa psa: " + dog.getNazwa() );
        System.out.println(dog.toString());
    }
}