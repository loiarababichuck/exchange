package com.example.exchange.dtos;


import com.example.exchange.entity.Corretor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CorretorRequestDTO {

    @Size(min = 2,max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @Email(message = "O email deve ser válido")
    private String email;

    @Size(min = 6,message = "A senha deve ter pelo menos 6 caracteres")
    private String senha;

    @Min(value = 0,message = "A idade deve ser um valor positivo")
    private Integer idade;

    public static Corretor dtoToEntity(CorretorRequestDTO corretorRequestDTO){
        return Corretor.builder()
                .nome(corretorRequestDTO.getNome())
                .email(corretorRequestDTO.getEmail())
                .senha(corretorRequestDTO.getSenha())
                .idade(corretorRequestDTO.getIdade())
                .codigoInterno(java.util.UUID.randomUUID().toString())
                .build();
    }
}
