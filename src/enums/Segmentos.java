package enums;

public enum Segmentos {

    ALIMENTOS_BEBIDAS("Alimentos e Bebidas"),
    CELULOSE_PAPEL("Celulose e Papel"),
    CONSTRUCAO("Construção"),
    EQUP_ELETRICOS("Equipamentos elétricos"),
    FARMACO_EQUIP("Fármacos e equipamentos de Saúde"),
    FUMO("Fumo"),
    IND_AUTOM("Indústria Automotiva"),
    IND_CERAM("Indústria Cerâmica"),
    IND_DIVER("Indústria Diversa"),
    IND_EXTRAT("Indústria Extrativa"),
    IND_GRAF("Indústria Gráfica"),
    MAD_MOVEIS("Madeira e móveis"),
    MAQ_EQUIP("Máquinas e equipamentos"),
    METALMEC_METALUR("Metalmecânica e Metalurgia"),
    OLEO_GAS_ELETRI("Óleo, gás e Eletricidade"),
    PROD_QUIM_PLAST("Produtos químicos e plásticos"),
    SANEA_BASIC("Saneamento Básico"),
    TIC("TIC"),
    TEXTIL_CONFEC_COURO_CALC("Têxtil, confecção, couro e calçados");


    private String nome;

    Segmentos(String nomeSegmento){
        this.nome = nomeSegmento;
    }

    public String getSegmento() {
        return this.nome;
    }
}
