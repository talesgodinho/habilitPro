package enums;

public enum Status {
    NAO_INICIADO("Curso não iniciado - Avaliação não disponível"),
    EM_ANDAMENTO("Curso em andamento - Avaliação não disponível"),
    FASE_AVALIACAO("Em fase de avaliação - Avaliação liberada para execução dentro do prazo"),
    AVALIACAO_FINALIZADA("Avaliação finalizada - bloqueada para edição");

    private String nome;

    Status(String nome) {
        this.nome = nome;
    }
}
