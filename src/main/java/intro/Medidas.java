// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos - Caracteríticas

    // 3.2 - Métodos e Funções

    public static void main(String[] args) {

        calcularAreaModoCurto();

        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto(){

        System.out.println("Cálculo de Areas Modo Curto");

        // Calculo de áera reduzida
        int largura =4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + " m²");

    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");
            // Calculo de área - Exemplo: O tamanho do tapete ou do piso
            int largura;
            int comprimento;
            int resultado;

            largura = 5; //largura recebe 4
            comprimento = 6;

            resultado = largura * comprimento;
            System.out.println("Para a largura de " + largura + "m e o comprimento de "
                    + comprimento + "m a área é de " + resultado + " m²");
    }
  }
