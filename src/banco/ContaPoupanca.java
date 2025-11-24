package banco;

public class ContaPoupanca extends SistemaBancario {
    private Double renderJuros;

    public Double getRenderJuros() {
        return renderJuros;
    }

    public void setRenderJuros(Double renderJuros) {
        this.renderJuros = renderJuros;
    }

    public ContaPoupanca(String titular, String numeroConta, Double saldo, Double renderJuros){
        super(titular, numeroConta, saldo);
        this.renderJuros = renderJuros;
    }

    public void Rendimento(){
        saldo *= 1.005; 
    }
}

