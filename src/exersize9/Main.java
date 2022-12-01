package exersize9;



public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration(8, 256, "Intel i5", 16.5, "ha");



        Kompyuter noutbook1 = new Kompyuter(101, "Hp", "universal", configuration);

        Configuration configuration1 = noutbook1.getConfiguration();
        String name = noutbook1.getName();


        System.out.println(noutbook1.getConfiguration());
        System.out.println(noutbook1);

    }

}
