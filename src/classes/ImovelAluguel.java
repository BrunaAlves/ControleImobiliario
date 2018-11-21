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
public class ImovelAluguel extends Imovel {
    public int prazoContrato;
    public float valorAluguel;

    public ImovelAluguel(int prazoContrato, float valorAluguel, String logradouro, String complemento, String cidade, String bairro, String estado, int numero, String cep, float area, int quartos, int suites, int vagasGaragem, int banheiros, String tipo, boolean disponivel, Cliente cliente) {
        super(logradouro, complemento, cidade, bairro, estado, numero, cep, area, quartos, suites, vagasGaragem, banheiros, tipo, disponivel, cliente);
        this.prazoContrato = prazoContrato;
        this.valorAluguel = valorAluguel;
    }

    public ImovelAluguel() {
    }

    public int getPrazoContrato() {
        return prazoContrato;
    }

    public void setPrazoContrato(int prazoContrato) {
        this.prazoContrato = prazoContrato;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
