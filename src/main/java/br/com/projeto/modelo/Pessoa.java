package br.com.projeto.modelo;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Component
public class Pessoa {
    
    // ***** ATRIBUTOS
    private int codigo;
    @NotEmpty
    @Size(min = 3, max = 20)
    private String nome;
    @NotEmpty
    @Size(min = 0,max = 120)
    private int idade;
    
    // ***** GET e SET
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
