
import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Produto meuProduto = new Produto(1, "Notebook Gamer", 4000.00, 5);
            meuProduto.exibirInfo();

            System.out.println("\n--- Atualização de Preço ---");
            System.out.print("Digite o novo preço do produto: ");

            try {
                double novoPreco = scanner.nextDouble();


                meuProduto.setPreco(novoPreco);

                System.out.println("Preço atualizado com sucesso!");
                meuProduto.exibirInfo();

            } catch (IllegalArgumentException e) {

                System.out.println("Erro ao atualizar: " + e.getMessage());
            } catch (InputMismatchException e) {

                System.out.println("Erro: Você deve digitar um número válido.");
            }

            scanner.close();
        }
}
