public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario allan = new Funcionario();
        allan.setNome("allan mateus ");
        allan.setCpf("111.111.111-11");
        allan.setSalario(1400);
        System.out.println(allan.getBificaçao());
        System.out.println(allan.getNome());
    }
    
}
