package classes;

import enums.Status;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Modulo {

    private int trilha_ID;
    private int modulo_ID;
    private String nome;
    private String habilidades;
    private String tarefaValidacao;
    private int prazolimite = 10; //numero inteiro de dias
    private Status status;
    private LocalDateTime dateTimeStart;
    private LocalDateTime dateTimeEnd;
    private static LocalDateTime prazoEncerrado;

    public Modulo(int trilha_ID, String nome, String habilidades, String tarefaValidacao, int prazolimite, Status status) {

        this.trilha_ID = trilha_ID;
        
        //this.modulo_ID = TODO buscar no DB modulo_id relacionado à trilha_ID incrementar '1' em relação anterior, se == 0, setar 1.
        
        this.nome = nome;
        this.habilidades = habilidades;
        this.tarefaValidacao = tarefaValidacao;
        this.prazolimite = prazolimite;
        this.status = status;
    }

/*
    // TODO habilitar ao integrar com DB
    public void iniciaModulo(){
        if(UsuarioLogado.administrativo) { //Verificar usuario logado no DB e testa se administrativo = true
            this.status = Status.EM_ANDAMENTO;
            dateTimeStart = OffsetDateTime.now().toLocalDateTime();
        } else System.out.println("Usuário não possui autorização para iniciar o módulo");
    }

    public void encerraModulo(){
        if(UsuarioLogado.administrativo) { //Verificar usuario logado no DB e testa se administrativo = true
            this.status = Status.FASE_AVALIACAO;
            dateTimeEnd = OffsetDateTime.now().toLocalDateTime();
            calculaEncerramento(dateTimeEnd, prazolimite);
        } else System.out.println("Usuário não possui autorização para iniciar o módulo");
    }
*/

    public void calculaEncerramento(LocalDateTime diaIn, int diasUteis){
        while(diasUteis>0){
            diaIn = diaIn.plusDays(1);
            if(diaIn.getDayOfWeek().equals(DayOfWeek.SATURDAY) || diaIn.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                diasUteis++;
            }
            diasUteis--;
        }
        this.prazoEncerrado = diaIn;
    }

    public void encerraAvaliacao(){
        if(prazoEncerrado.equals(OffsetDateTime.now().toLocalDateTime())){
            this.status = Status.AVALIACAO_FINALIZADA;
        }
    }

}
