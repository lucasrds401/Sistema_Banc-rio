package banco;
import javax.swing.JOptionPane;

public class ContaCorrente extends SistemaBancario{
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public ContaCorrente(String titular, String numeroConta, Double saldo, Double limite){
        super(titular, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor){
        while (valor > saldo + limite){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Saque inválido, valor maior que seu saldo + limite: "));
        }
        if (valor <= saldo){
            this.saldo -= valor;
        }
        else{
            double valorLimite = valor - saldo;
            this.limite -= valorLimite;
            this.saldo = 0.0;
        }
    }
}
