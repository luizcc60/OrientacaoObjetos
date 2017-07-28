package megasena;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
 
public class Pronto {
 
    static int NUMERO_DEZENAS = 6;
 
    // inicializei a vari�vel que vai receber os resultados
    static String sorteioComputador = "";
    static String apostaUsuario = "";
 
    public static void main(String[] args) {
 
        // Scanner teclado = new Scanner(System.in);
 
        int[] sorteio = sorteaSena();
        int[] aposta = new int[NUMERO_DEZENAS];
 
        // trecho processa a aposta
        // System.out.println("Fa�a sua aposta: ");
        JOptionPane.showMessageDialog(null,
                "Simulador da mega-sena",
                "Simulador Da Mega-Sena", JOptionPane.INFORMATION_MESSAGE);
 
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
 
            int nroAposta;
            boolean repetido = false;
 
            do {
                // System.out.print("Informe a dezena " + (i + 1) + ": ");
                // JOptionPane.showInputDialog(null, "Informe a dezena " + (i +
                // 1)
                // + ": ", "Simulador Da Mega Sena",
                // JOptionPane.PLAIN_MESSAGE);
 
                // nroAposta = teclado.nextInt();
                nroAposta = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe a dezena " + (i + 1) + ": ",
                        "Simulador Da Mega Sena", JOptionPane.PLAIN_MESSAGE));
 
                // Se o numero digitado for igual ou menor que zero
                // retorna nada.
                if (nroAposta <= 0) {
 
                    // System.out.println("N�mero inv�lido, aposta cancelada!");
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane
                            .showMessageDialog(null,
                                    "N�mero inv�lido, aposta cancelada!",
                                    "Simulador Da Mega Sena",
                                    JOptionPane.ERROR_MESSAGE);
                    return;
 
                    // Se o n�mero digitado for maior que 60
                    // retorna nada
                } else if (nroAposta > 60) {
 
                    // System.out.println("N�mero inv�lido, aposta cancelada!");
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane
                            .showMessageDialog(null,
                                    "N�mero inv�lido, aposta cancelada!",
                                    "Simulador Da Mega Sena",
                                    JOptionPane.ERROR_MESSAGE);
                    return;
 
                }
 
                repetido = existeNumero(aposta, nroAposta);
 
                if (repetido) {
 
                    // System.out.println("Ops, n�mero repetido!");
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null,
                            "Ops, n�mero repetido!", "Simulador Da Mega Sena",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (repetido); // evita repeti��o de n�mero
            aposta[i] = nroAposta;
        }
 
        for (int i = 0; i < aposta.length; i++) {
 
            // System.out.print(aposta[i] + " ");
            // JOptionPane.showMessageDialog(null, "Sua aposta foi: " +
            // aposta[i]
            // + "\n ", "Simulador Da Mega Sena",
            // JOptionPane.INFORMATION_MESSAGE);
 
            apostaUsuario = "Aposta do usu�rio: " + " \n" + aposta[0] + " \n"
                    + aposta[1] + " \n" + aposta[2] + " \n" + aposta[3] + " \n"
                    + aposta[4] + " \n" + aposta[5];
        }
 
        for (int i = 0; i < sorteio.length; i++) {
 
            // System.out.print(sorteio[i] + " ");
            // JOptionPane.showMessageDialog(null,
            // "Os n�meros sorteados foram: "
            // + sorteio[i] + " \n", "Simulador Da Mega Sena",
            // JOptionPane.INFORMATION_MESSAGE);
 
            sorteioComputador = "N�meros sorteados: " + " \n" + sorteio[0]
                    + " \n" + sorteio[1] + " \n" + sorteio[2] + " \n"
                    + sorteio[3] + " \n" + sorteio[4] + " \n" + sorteio[5];
        }
 
        int nroAcertos = contaAcertos(sorteio, aposta);
 
        JOptionPane.showMessageDialog(null, apostaUsuario + "\n"
                + sorteioComputador + " \n N�meros de acertos: \n "
                + nroAcertos, "Simulador Da Mega Sena",
                JOptionPane.INFORMATION_MESSAGE);
 
        switch (nroAcertos) {
 
        case 4:
            // System.out.println("Parab�ns. Voc� acertou a quadra!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� acertou a quadra!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 5:
            // System.out.println("Parab�ns. Voc� acertou a quina!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� acertou a quina!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 6:
            // System.out.println("Parab�ns. Voc� � campe�o da MegaSena!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� � campe�o da MegaSena!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        default:
            // System.out.println("N�o foi dessa vez. Tente novamente!");
            JOptionPane.showMessageDialog(null, "Tente novamente!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }// Fim do main
 
    //Fun��o retorna uma array com 6 n�meros gerados randomicamente (API do
     // Java), sem duplicidade, representando o sorteio da megasena.
    static int[] sorteaSena() {
 
        int[] resultado = new int[NUMERO_DEZENAS];
 
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
 
            int sorteado;
            boolean repetido = false;
 
            do {
                // n�mero aleat�rio de 1 a 60
                sorteado = (int) (Math.random() * 60) + 1;
                repetido = existeNumero(resultado, sorteado);
            } while (repetido); // evita repeti��o de n�mero
            resultado[i] = sorteado;
        }
        return resultado;
    }
 
    //Fun��o compara cada n�mero apostado, com os n�meros sorteados. Por fim
     // retorna a quantidade de acertos.
    static int contaAcertos(int[] sorteio, int[] aposta) {
 
        int acertos = 0;
 
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
 
            int nroAposta = aposta[i];
 
            // compara cada n�mero apostado com os sorteados
            if (existeNumero(sorteio, nroAposta)) {
                acertos++;
            }
        }
        return acertos;
    }
 
    //Fun��o indica se o n existe no array numeros. �til para validar
     // duplicadade de dados.
    static boolean existeNumero(int[] numeros, int n) {
 
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                return true;
            }
        }
        return false;
    }
}
