package ltc_project_2_by_hugo;

import java.util.Arrays;

public class LTC_Project_2_by_Hugo {

    public static void main(String[] args) {

        //criação de 2 pilhas derivadas à inversa e à divisão da expressão
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        //String expressao_aritmetica = ("num1 / (num2 + num3) * 100");
        String expressao_aritmetica = ("2 * x + y");
        //String expressao_aritmetica = ("a - 2.5 * b + 3.6 / c");
        // dividida após um espaço
        String[] inversa = expressao_aritmetica.split("[\\s]");
        //espaço é substituído por um espaço em branco
        String sem_espacos = expressao_aritmetica.replaceAll("\\s", "");
        //parenteses são substituídos por um espaço em branco
        String sem_parenteses= sem_espacos.replaceAll("[()]", "");
        //expressão dividida pelos operadores
        String[] resultado_final = sem_parenteses.split("[-+*/]");
        //mostra os operandos
        System.out.println(Arrays.toString(resultado_final));
        //os elementos são adicionados à pilha
        for(int i = 0 ; i< resultado_final.length; i++){
            pilha1.push(resultado_final[i]);
        }
        System.out.println("\nOs elementos presentes na pilha são: ");
        pilha1.MostraPilha();
        System.out.println("\n");
        //os elementos são removidos da pilha
        for(int i = 0; i<resultado_final.length; i++){
            pilha1.pop();
        }
        //a expressão que contém os operadores e os operandos é adicionada a outra pilha
        for(int i = 0 ; i< inversa.length; i++){
            pilha2.push(inversa[i]);
        }
        //através do pop é possível a realização da inversa, derivado à regra LIFO 
        System.out.printf("A inversa da expressão é: ");
        for(int i = 0; i<inversa.length; i++){
            pilha2.popInversa();
        }
        
}
}