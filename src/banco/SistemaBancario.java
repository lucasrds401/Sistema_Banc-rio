    package banco;
    import javax.swing.JOptionPane;

    public class SistemaBancario{
        protected String titular, numeroConta;
        protected Double saldo;

        public SistemaBancario(String titular, String numeroConta, Double saldo){
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = saldo;
        }

        public void depositar(Double valor){
            while(valor <= 0){
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, digite um valor maior que 0: "));
            }
            this.saldo += valor;
        }
        
        public void sacar(Double valor){
            while(valor > saldo){
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, digite um valor menor ou igual o saldo: "));
            }
            this.saldo -= valor;
        }

        public void exibirMensagem(){
            JOptionPane.showMessageDialog(null,"Titular: " + this.titular + "Número da conta: " + this.numeroConta + "Saldo atual: " + this.saldo);
        }

        }
