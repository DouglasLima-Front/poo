public class Main {
    public static void main(String[]args){
        Pessoa p = new Pessoa();
        p.nome = "Firmino";
        p.idade = 65;
        p.cpf = "077.077.074-63";

        System.out.println(p.nome);
        System.out.println(p.idade);
        System.out.println(p.cpf);

        Pessoa p1 = new Pessoa();
        p1.nome = "Maria Joaquina";
        p1.idade = 9;
        p1.cpf = "077.072.073-62";

    }
}
