package Pessoas;

public class Main {

public static void main(String[] args) {
    
    Funcionario funcionario = new Funcionario();

    Funcionario gerente = new Gerente(); //UpCast de gerente para funcionario, implicito
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    Vendedor vendedor1 = (Vendedor) new Funcionario(); //DownCast explicito de vendedor. Mas o vendedor tem dados, então temos que informar o que deve ser feito com o código.
// NÃO SE DEVE TRABALHAR COM DOWNCAST EM ORIENTACAO A OBJ. Costuma dar erro, então deve ser evitado.


}


    
}
