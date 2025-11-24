package banco;
import javax.swing.JOptionPane;

public class MainBanco{
    public static void main(String[] args) {
        String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
        String numeroConta = JOptionPane.showInputDialog("Digite o número da conta: ");
        Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo: "));
        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        
        while(true){
        JOptionPane.showMessageDialog(null, "[1] Conta Corrente \n [2] Conta Poupança");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] Conta Corrente\n[2] Conta Poupança \nDigite um das opções: "));
        
        if(opcao == 1){
            Double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da Conta: "));
            cc = new ContaCorrente(titular, numeroConta, saldo, limite);
            JOptionPane.showMessageDialog(null, "Conta Corrente escolhida! "); 
            break;         
        }
        if(opcao == 2){
            Double renderJuros = 1.005;
            cp = new ContaPoupanca(titular, numeroConta, saldo, renderJuros);
            JOptionPane.showMessageDialog(null, "Conta Poupança escolhida!"); 
            break;
        }
            JOptionPane.showInputDialog("Opção inválida, digite algo de acordo com o menu: ");
    }

        int opcao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Saque \n[2] Depósito \n[3] Sair \nDigite uma das opções: "));

        switch (opcao1) {
            case 1:
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                if(cc != null){
                    cc.sacar(saque);
                }
                else if(cp != null){
                    cp.sacar(saque);
                }
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                break;

            case 2: 
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                if(cc != null){
                    cc.depositar(deposito);
                }
                else if(cp != null){
                    cp.depositar(deposito);
                }
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Encerrando o Processo...");
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
