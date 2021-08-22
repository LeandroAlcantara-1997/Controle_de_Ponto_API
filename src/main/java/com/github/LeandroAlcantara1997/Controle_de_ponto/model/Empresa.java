package com.github.LeandroAlcantara1997.Controle_de_ponto.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Usuario> usuario;
}
