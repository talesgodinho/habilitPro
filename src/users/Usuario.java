package users;

import classes.Modulo;
import com.sun.tools.javac.Main;
import util.Format;

import java.text.ParseException;

import static util.Valida.*;

public class Usuario {

    private String user_ID;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Boolean administrativo;
    private Boolean operacional;
    private Boolean RH;

    public Usuario(String nome, String cpf, String emailInsert, String senhaIn, Boolean administrativo, Boolean operacional, Boolean RH) throws ParseException {
        this.nome = nome;
        this.cpf = Format.formatCPF(cpf);

        while (!(validaEmail(emailInsert))){
            //TODO lançar no front mensagem de e-mail inválido, solicitar novo insert. Só sai do laço quando valida = true;
            //emailInsert = novo email capturado;
        }
        this.email = emailInsert;

        while (!(validaSenha(senhaIn))){
            //TODO lançar no front mensagem de padrão de senha inválido, solicitar novo insert. Só sai do laço quando valida = true;
            //senhaIn = nova senha capturada;
        }
        this.senha = senhaIn;

        //Recebe true or false from checkbox tipo de perfil no momento do cadastro.
        this.administrativo = administrativo;
        this.operacional = operacional;
        this.RH = RH;
    }
}
