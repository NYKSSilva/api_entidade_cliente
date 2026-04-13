package br.com.senai.entidade_cliente.cliente;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroCliente(
        @NotBlank
        @Size(min= 3, max= 100)
        @Column(unique = true)
        String nome,

        @NotBlank
        @Column(unique = true)
        @Email
        String email,

        @NotBlank
        @Column(unique = true)
        @Size(min= 11, max=11)
        String cpf,

        @Size(max=20)
        String telefone

) {


}
