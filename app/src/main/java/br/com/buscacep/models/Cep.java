package br.com.buscacep.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cep {

    @SerializedName("cep")
    @Expose
    private String cep;

    @SerializedName("logradouro")
    @Expose
    private String logradouro;

    /**
     * Definir a serialização dos campos (conversão entre os tipos
     * E expor os valores para acesso
     */
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    /**
     * Definir os Getters e Setters dos atributos da classe
     * @return
     */

    /**
     * Definição do método ToString para ler os dados da API em Json e
     * converter para texto
     */

}