package encapsulamento;
public class Encapsulamento {
    public static void main(String[] args) throws Exception {
        // Cachorro
        Cachorro tobias = new Cachorro();
        tobias.setNome("Tobias");
        System.out.println("O nome do cachorro é "+tobias.getNome());
        System.out.println(tobias.getNome()+ " faz: ");
        tobias.emitirSom();

        //Golfinho
        Golfinho jonas = new Golfinho();
        System.out.println("O golfinho se chama "+jonas.getNome());
        jonas.emitirSom();

    }
}
