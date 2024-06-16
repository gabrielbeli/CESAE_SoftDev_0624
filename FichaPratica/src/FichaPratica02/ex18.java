package FichaPratica02;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Definição das constantes conforme especificado
        final double VENCIMENTO_BASE_E = 40.0;
        final double VENCIMENTO_BASE_C = 60.0;
        final double VENCIMENTO_BASE_A = 80.0;

        final double SUBSIDIO_ALIMENTACAO_E = 5.0;
        final double SUBSIDIO_ALIMENTACAO_C = 7.5;
        final double SUBSIDIO_ALIMENTACAO_A = 7.5;

        final double RETENCAO_IRS_ATE_1000 = 0.10;
        final double RETENCAO_IRS_SUPERIOR_1000 = 0.20;

        final double SEG_SOCIAL_FUNC_ADMIN = 0.09;
        final double SEG_SOCIAL_PATR_ADMIN = 0.21;

        final double SEG_SOCIAL_FUNC_OUTROS = 0.11;
        final double SEG_SOCIAL_PATR_OUTROS = 0.2375;

        // Leitura dos dados do funcionário
        System.out.print("Digite o código do funcionário: ");
        String codigoFuncionario = input.nextLine();

        System.out.print("Digite o cargo (E - Empregado, C - Chefe, A - Administrador): ");
        char cargo = input.next().charAt(0);

        System.out.print("Digite o número de dias trabalhados no mês: ");
        double diasTrabalhados = input.nextDouble();

        // Variáveis para armazenar os cálculos
        double vencimentoBruto = 0.0;
        double subsidioAlimentacao = 0.0;
        double retencaoIRS = 0.0;
        double segSocialFuncionario = 0.0;
        double segSocialPatronal = 0.0;
        double vencimentoLiquido = 0.0;
        double totalSegSocial = 0.0;

        // Cálculo do vencimento bruto e subsídio de alimentação
        switch (cargo) {
            case 'E':
                vencimentoBruto = diasTrabalhados * VENCIMENTO_BASE_E;
                subsidioAlimentacao = diasTrabalhados * SUBSIDIO_ALIMENTACAO_E;
                break;
            case 'C':
                vencimentoBruto = diasTrabalhados * VENCIMENTO_BASE_C;
                subsidioAlimentacao = diasTrabalhados * SUBSIDIO_ALIMENTACAO_C;
                break;
            case 'A':
                vencimentoBruto = diasTrabalhados * VENCIMENTO_BASE_A;
                subsidioAlimentacao = diasTrabalhados * SUBSIDIO_ALIMENTACAO_A;
                break;
            default:
                System.out.println("Cargo inválido.");
                return;
        }

        // Cálculo da retenção de IRS
        if (vencimentoBruto <= 1000) {
            retencaoIRS = vencimentoBruto * RETENCAO_IRS_ATE_1000;
        } else {
            retencaoIRS = vencimentoBruto * RETENCAO_IRS_SUPERIOR_1000;
        }

        // Cálculo dos encargos da Segurança Social
        if (cargo == 'A') {
            segSocialFuncionario = vencimentoBruto * SEG_SOCIAL_FUNC_ADMIN;
            segSocialPatronal = vencimentoBruto * SEG_SOCIAL_PATR_ADMIN;
        } else {
            segSocialFuncionario = vencimentoBruto * SEG_SOCIAL_FUNC_OUTROS;
            segSocialPatronal = vencimentoBruto * SEG_SOCIAL_PATR_OUTROS;
        }

        // Cálculo do vencimento líquido e total da Segurança Social
        vencimentoLiquido = vencimentoBruto - retencaoIRS - segSocialFuncionario;
        totalSegSocial = segSocialFuncionario + segSocialPatronal;

        // Exibição dos resultados
        System.out.println("\nFuncionário(a): " + codigoFuncionario);
        System.out.println("Valor ilíquido a receber fruto do vencimento: " + vencimentoLiquido + " euros");
        System.out.println("Total subsídio de alimentação: " + subsidioAlimentacao + " euros");
        System.out.println("Valor da retenção de IRS a entregar ao estado: " + retencaoIRS + " euros");
        System.out.println("Valor total a entregar à Segurança Social (ambos os encargos): " + totalSegSocial + " euros");
        System.out.println("Valor líquido a receber pelo funcionário: " + (vencimentoLiquido + subsidioAlimentacao) + " euros");
    }
}
