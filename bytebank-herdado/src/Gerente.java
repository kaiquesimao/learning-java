public class Gerente extends Funcionario implements Autenticacao {
	private int senha;

	@Override
	public double getBonificacao() {
	    return super.getSalario() * 0.1;
	}

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}