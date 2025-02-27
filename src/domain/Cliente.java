package domain;

import java.util.Objects;

public class Cliente {

    private String nome;
    private Long cpf;
    private Long tel;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String[] dados) {
        this.nome = (dados.length > 0) ? tratarValor(dados[0]) : null;
        this.cpf = (dados.length > 1 && tratarValor(dados[1]) != null) ? Long.valueOf(tratarValor(dados[1])) : null;
        this.tel = (dados.length > 2 && tratarValor(dados[2]) != null) ? Long.valueOf(tratarValor(dados[2])) : null;
        this.endereco = (dados.length > 3) ? tratarValor(dados[3]) : null;
        this.numero = (dados.length > 4 && tratarValor(dados[4]) != null) ? Integer.valueOf(tratarValor(dados[4])) : null;
        this.cidade = (dados.length > 5) ? tratarValor(dados[5]) : null;
        this.estado = (dados.length > 6) ? tratarValor(dados[6]) : null;
    }

    private String tratarValor(String valor) {
        return (valor == null || "null".equals(valor)) ? null : valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "domain.Cliente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                '}';
    }
}
