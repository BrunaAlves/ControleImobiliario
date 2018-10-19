/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mazio
 */
public class Imovel {
    private int id;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private int numero;
    private String cep;
    private String descricao;
    private int quartos;
    private int suites;
    private int vagasGaragem;
    private int banheiros;
    private float areaUtil;
    private float areaTotal;
    public boolean particular;
    public String Imobiliaria;

    public Imovel(int id, String logradouro, String complemento, String cidade, String bairro, String estado, int numero, String cep, String descricao, int quartos, int suites, int vagasGaragem, int banheiros, float areaUtil, float areaTotal, boolean particular, String Imobiliaria) {
        this.id = id;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
        this.descricao = descricao;
        this.quartos = quartos;
        this.suites = suites;
        this.vagasGaragem = vagasGaragem;
        this.banheiros = banheiros;
        this.areaUtil = areaUtil;
        this.areaTotal = areaTotal;
        this.particular = particular;
        this.Imobiliaria = Imobiliaria;
    }

    public Imovel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public float getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(float areaUtil) {
        this.areaUtil = areaUtil;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public String getImobiliaria() {
        return Imobiliaria;
    }

    public void setImobiliaria(String Imobiliaria) {
        this.Imobiliaria = Imobiliaria;
    }
}
