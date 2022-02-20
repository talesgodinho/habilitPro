package classes;

import java.util.Calendar;

public class Trilha {

    private int empresa_ID;
    private int trilha_ID;
    private String ocupacao;
    private String nome;
    private String apelido;
    private int num;
    private int satisfacao;
    private String anotacoes;

    public Trilha(int empresa_ID, String ocupacao, String nomeEmpresa) {

        this.empresa_ID = empresa_ID;

        //this.trilha_ID = TODO buscar no DB trilha_id relacionada à empresa_ID e incrementar '1' em relação anterior, se == 0, setar 1.

        this.ocupacao = ocupacao;

        String ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        int num = 0; //TODO buscar no DB último "num" relacionado à empresa_ID e mesma ocupação, incrementar valor. Se == 0, setar 1.

        this.nome = ocupacao+nomeEmpresa+num+ano;
        this.apelido= ocupacao+num;

        //TODO verificar no front se o usuario deseja cadastrar algum MÓDULO (0 ou mais)
        //TODO - Instanciar novos módulos relacionando com o atributo trilha_ID;
        //"DB.add"(new Modulo(trilha_ID,nome, habilidades, tarefa validacao, prazolimite, status));  TODO implementar com form no front;
        // - Criação de novo objeto trilha no banco de dados

    }

    public void setSatisfacao(int satisfacao) {
        while(satisfacao < 1 || satisfacao > 5){
            System.out.println("Valor inválido, insira uma nova nota entre 1 e 5");
            //TODO "scanner" no front para capturar novo valor
        }
        this.satisfacao = satisfacao;
    }

        //TODO habilitar ao integrar com DB
/*    public void setAnotacoes(String novaAnotacao){
        //TODO if -> Buscar no DB se todos os modulos_ID da referida trilha estão com o status AVALIACAO_FINALIZADA.
        if(UsuarioLogado.operacional) { //Verificar usuario logado no DB e testa se operacional = true
            this.anotacoes = novaAnotacao;
            //TODO adiciona modificação da empresa no histórico do trabalhador
        } else System.out.println("Usuário não possui autorização para atualizar o cadastro");
    }*/

}
