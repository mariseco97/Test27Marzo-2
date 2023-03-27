public class Main {
    public static void main(String[] args) {
    T orario = new T();

    orario.setOrario(23,0,0);
    System.out.println(orario.toString());
    orario.addOra(3, 50, 30);
    System.out.println(orario.toString());
    orario.subOra(3,50,0);
    System.out.println(orario.toString());
    }


}