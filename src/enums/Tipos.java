package enums;

public enum Tipos {
    MATRIZ("Matriz"),
    FILIAL("Filial");

    private String nomeTipo;

    Tipos(String nomeTipo){
        this.nomeTipo = nomeTipo;
    }

    public String getNomeTipo() {
        return this.nomeTipo;
    }
}
