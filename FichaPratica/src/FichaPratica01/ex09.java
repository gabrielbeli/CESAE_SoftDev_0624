package FichaPratica01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double VENCIMENTO_BASE_DIARIO = 40.0,
                     SUBSIDIO_ALIMENTACAO_DIARIO = 5.0,
                     RETENCAO_IRS = 0.10,
                     SEGURANCA_SOCIAL_FUNCIONARIO = 0.11,
                     SEGURANCA_SOCIAL_PATRONAL = 0.2375;

        System.out.print("Digite o código do funcionário: ");
        String codigoFuncionario = input.nextLine();

        System.out.print("Digite o número de dias trabalhados: ");
        int diasTrabalhados = input.nextInt();

        double vencimentoBruto = diasTrabalhados * VENCIMENTO_BASE_DIARIO;
        double totalSubsidioAlimentacao = diasTrabalhados * SUBSIDIO_ALIMENTACAO_DIARIO;
        double retencaoIRS = vencimentoBruto * RETENCAO_IRS;
        double segurancaSocialFuncionario = vencimentoBruto * SEGURANCA_SOCIAL_FUNCIONARIO;
        double segurancaSocialPatronal = vencimentoBruto * SEGURANCA_SOCIAL_PATRONAL;
        double vencimentoLiquido = vencimentoBruto - retencaoIRS - segurancaSocialFuncionario;
        double totalSegurancaSocial = segurancaSocialFuncionario + segurancaSocialPatronal;

        System.out.println("Funcionário(a): " + codigoFuncionario);
        System.out.println("Valor líquido a receber fruto do vencimento: " + vencimentoLiquido);
        System.out.println("Total subsídio de alimentação: " + totalSubsidioAlimentacao);
        System.out.println("Valor da retenção de IRS a entregar ao estado: " + retencaoIRS);
        System.out.println("Valor total a entregar à Segurança Social (funcionário e entidade patronal): " + totalSegurancaSocial);
        System.out.println("Valor líquido a receber pelo funcionário: " + (vencimentoLiquido + totalSubsidioAlimentacao));

    }
}
