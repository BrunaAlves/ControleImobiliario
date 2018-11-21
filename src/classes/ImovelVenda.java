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
    public float valorParcela;
    public int quantidadeParcelas;

    public ImovelVenda(float valorVenda, float valorParcela, int quantidadeParcelas, String logradouro, String complemento, String cidade, String bairro, String estado, int numero, String cep, float area, int quartos, int suites, int vagasGaragem, int banheiros, String tipo, boolean disponivel, Cliente cliente) {
        super(logradouro, complemento, cidade, bairro, estado, numero, cep, area, quartos, suites, vagasGaragem, banheiros, tipo, disponivel, cliente);
        this.valorVenda = valorVenda;
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
