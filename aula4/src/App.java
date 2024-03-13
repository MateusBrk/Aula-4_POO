public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Aluno yelton = new Aluno("yelton", "123.456", 2921234, "13/03/2005", "masculino");
        yelton.setNome("yelton");
        System.out.println(yelton.getNome());
        System.out.println(yelton.getRa());

        Aluno alberto = new Aluno();
        alberto.setNome("alberto");
        alberto.setRa(292135);
        System.out.println(alberto.getNome());


    }
}
