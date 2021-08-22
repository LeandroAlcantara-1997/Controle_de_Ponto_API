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
public class NivelAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToMany(mappedBy = "nivelAcesso", cascade = CascadeType.ALL)
    private List<Localidade> localidade;

    @OneToMany(mappedBy = "nivelAcesso", cascade = CascadeType.ALL)
    private List<Usuario> usuario;
}
