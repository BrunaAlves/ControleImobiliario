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
public class ImovelVenda extends Imovel {
    public float valorVenda;
    public boolean financia;
    public float valorParcela;
    public int quantidadeParcelas;

    public ImovelVenda(float valorVenda, boolean financia, float valorParcela, int quantidadeParcelas, int id, String logradouro, String complemento, String cidade, String bairro, String estado, int numero, String cep, String descricao, int quartos, int suites, int vagasGaragem, int banheiros, float areaUtil, float areaTotal, boolean particular, String Imobiliaria) {
        super(id, logradouro, complemento, cidade, bairro, estado, numero, cep, descricao, quartos, suites, vagasGaragem, banheiros, areaUtil, areaTotal, particular, Imobiliaria);
        this.valorVenda = valorVenda;
        this.financia = financia;
        this.valorParcela = valorParcela;
        this.quantidadeParcelas = quantidadeParcelas;
    }
         
    public ImovelVenda() {
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public boolean isFinancia() {
        return financia;
    }

    public void setFinancia(boolean financia) {
        this.financia = financia;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
}
