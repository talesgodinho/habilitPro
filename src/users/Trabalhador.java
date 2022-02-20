package users;

import classes.*;
import util.Format;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Trabalhador {


    private String nome;
    private String cpf;
    private int empresa_ID;
    private String setor_area;
    private String funcao;
    private LocalDateTime dataEdit;

    //TODO os itens abaixo deverão ser criado em DB, não em array. Inserido como array para elucidar aplicação.
    public static ArrayList<Trilha> trilhas = new ArrayList<>();
    public static ArrayList<Modulo> modulos = new ArrayList<>();
    public static ArrayList<String> avaliacoes = new ArrayList<>();
    public static ArrayList<String> anotacoes = new ArrayList<>();
    public static ArrayList<String> histórico = new ArrayList<>();

    public Trabalhador(String nome, int empresa_ID, String cpf, String setor_area, String funcao) throws ParseException {

        //Ao invés de utilizar um "trabalhador_ID", utilizarei o CPF como referência, facilitando ao realizar buscas futuras em caso de troca de empresa ou setor/área.

        this.nome = nome;
        this.cpf = Format.formatCPF(cpf);
        this.empresa_ID = empresa_ID;
        this.setor_area = setor_area;
        this.funcao = funcao;
        this.dataEdit = OffsetDateTime.now().toLocalDateTime();

        //TODO adiciona trabalhador em uma trilha ou mais, associar cpf à uma ou mais trilha_ID.

        //TODO adicionar trabalhador em um módulo ou mais, associar cpf à um módulo_ID que já esteja relacionado com uma trilha_ID também relacionada anteriormente ao trabalhador.

        //TODO adicionar data de criação e inserções no histórico do trabalhador no DB;
    }


        //TODO habilitar ao integrar com DB
/*    public void editaEmpresa(int novaEmpresa){
        if(UsuarioLogado.administrativo) { //Verificar usuario logado no DB e testa se administrativo = true
            this.empresa_ID = novaEmpresa;
            //TODO adiciona modificação da empresa no histórico do trabalhador
        } else System.out.println("Usuário não possui autorização para atualizar o cadastro");
    }

    public void editaSetorArea(String setor_area){
        if(UsuarioLogado.administrativo) { //Verificar usuario logado no DB e testa se administrativo = true
            this.setor_area = setor_area;
            //TODO adiciona modificação do setor/area no histórico do trabalhador
        } else System.out.println("Usuário não possui autorização para atualizar o cadastro");
    }*/

}
