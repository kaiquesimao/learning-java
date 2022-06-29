public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Funcionario f) {
        boolean autenticou = f.autentica(this.senha); //significa o gerente chamado g recebeu a mesma senha (do testesistema) que esta nesta classe aqui?
        if (autenticou) {
            System.out.println("autenticou, senha correta.");
        } else {
            System.out.println("autenticou não, senha incorreta.");
        }
    }
}
