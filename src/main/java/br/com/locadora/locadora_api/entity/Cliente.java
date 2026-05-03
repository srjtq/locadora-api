package br.com.locadora.locadora_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;

    // getters e setters


    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getCpf() {

        return cpf;

    }

    public void setCpf(String cpf) {

        this.cpf = cpf;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getEndereco() {

        return endereco;

    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;

    }

    public String getCidade() {

        return cidade;

    }

    public void setCidade(String cidade) {

        this.cidade = cidade;

    }
}

