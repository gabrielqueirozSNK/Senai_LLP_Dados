package senai_llp_dados;
import java.util.Scanner;
public class Senai_LLP_Dados {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeDeDados = 1; 
        System.out.println("Quantos dados você quer rolar? (Pressione Enter para rolar apenas 1)");
        String entrada = leitor.nextLine();
        if (!entrada.isEmpty()) {
            quantidadeDeDados = Integer.parseInt(entrada);
        }
        for (int i = 1; i <= quantidadeDeDados; i++) {
            int numeroSorteado = (int) (Math.random() * 6) + 1;
            System.out.println("\nDado " + i + ": Tirou " + numeroSorteado);
            System.out.println(" ------- ");
            switch (numeroSorteado) {
                case 1:
                    System.out.println("|       |");
                    System.out.println("|   o   |");
                    System.out.println("|       |");
                    break;
                case 2:
                    System.out.println("| o     |");
                    System.out.println("|       |");
                    System.out.println("|     o |");
                    break;
                case 3:
                    System.out.println("| o     |");
                    System.out.println("|   o   |");
                    System.out.println("|     o |");
                    break;
                case 4:
                    System.out.println("| o   o |");
                    System.out.println("|       |");
                    System.out.println("| o   o |");
                    break;
                case 5:
                    System.out.println("| o   o |");
                    System.out.println("|   o   |");
                    System.out.println("| o   o |");
                    break;
                case 6:
                    System.out.println("| o   o |");
                    System.out.println("| o   o |");
                    System.out.println("| o   o |");
                    break;
            }
            System.out.println(" ------- ");
        }
        leitor.close();
    }
}