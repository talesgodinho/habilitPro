package classes;

import enums.*;
import util.*;

import java.text.ParseException;

public class Empresa {

    private int empresa_ID;
    private String nome;
    private String cnpj;
    private Tipos tipoEmpresa; //matriz ou filial
    private String nomeFilial;
    private Segmentos segmento;
    private String cidade;
    private String estado;
    private String regional;

    public Empresa(String nome, String cnpj, Tipos tipoEmpresa, Segmentos segmento, String cidade, String estado, String regional) throws ParseException {

        //this.empresa_ID = TODO buscar no DB empresa_id e incrementar '1' em relação anterior, se == 0, setar 1.

        this.nome = nome;
        this.cnpj = Format.formatCNPJ(cnpj);
        this.tipoEmpresa = tipoEmpresa;

        if (tipoEmpresa.equals(Tipos.FILIAL)){
            String nomeFilial = null;
            //TODO habilitar "scanner" nome da filial no front;
            this.nomeFilial = nomeFilial;
        }

        this.segmento = segmento; //TODO listar antes na tela de cadastro o enum SEGMENTOS;
        this.cidade = cidade;
        this.estado = estado;
        this.regional = regional; //TODO Listar antes na tela cadastro o enum REGIONAIS;

        //TODO verificar no front se o usuario deseja cadastrar alguma trilha (0 ou mais)
        //TODO - Instanciar novas trilhas relacionando com o atributo empresa_ID;
        //"DB.add"(new Trilha(empresa_ID,"ocupação",nome)); - Criação de novo objeto trilha no banco de dados
    }
}
