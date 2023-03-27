public class Main {
    public static void main(String[] args) {
        Bambino bambino = new Bambino("ciro", 15);
        Bambino bambino2 = new Bambino("mari", 16);

        if(bambino.maggioreDi(bambino2)){
            System.out.println("il bambino con l'eta maggiore è " + bambino.toString());

        }else {
            System.out.println("il bambino con l'eta maggiore è  " + bambino2.toString());
        }


    }
}