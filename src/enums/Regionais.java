package enums;

public enum Regionais {
    Norte_Nordeste("Norte - Nordeste"),
    Oeste("Oeste"),
    Sudeste("Sudeste"),
    Centro_Norte("Centro - Norte"),
    Vale_Itajai("Vale do Itajaí"),
    Vale_Itapocu("Vale do Itapocu"),
    Litoral_Sul("Litoral Sul"),
    Alto_Uruguai_Catarinense("Alto Uruguai Catarinense"),
    Vale_Itajai_Mirim("Vale do Itajaí Mirim"),
    Centro_Oeste("Centro - Oeste"),
    Planalto_Norte("Planalto Norte"),
    Foz_Rio_Itajai("Foz do Rio Itajaí"),
    Sul("Sul"),
    Serra_Catarinense("Serra Catarinense"),
    Extremo_Oeste("Extremo Oeste"),
    Alto_Vale_Itajai("Alto vale do Itajaí");

    private String nome;

    Regionais(String nome){
        this.nome = nome;
    }

    public String getRegional() {
        return this.nome;
    }
}
