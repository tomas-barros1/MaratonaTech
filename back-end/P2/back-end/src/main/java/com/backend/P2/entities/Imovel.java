package com.backend.P2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private int quantidadeDeQuartos;
    private int quantidadeDeBanheiros;
    private int visualizacoes;
    private int quantidadeDeVagas;
    private String imagemUrl;
    private float valor;

    @JsonIgnore // Evita que 'estado' seja serializado para JSON
    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @JsonIgnore // Evita que 'cidade' seja serializado para JSON
    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    @JsonIgnore // Evita que 'bairro' seja serializado para JSON
    @OneToOne
    @JoinColumn(name = "bairro_id")
    private Bairro bairro;

    @JsonIgnore // Evita que 'tipoDeOferta' seja serializado para JSON
    @OneToOne
    @JoinColumn(name = "tipo_oferta_id")
    private TipoDeOferta tipoDeOferta;

    @JsonIgnore // Evita que 'tipoImovel' seja serializado para JSON
    @OneToOne
    @JoinColumn(name = "tipo_imovel_id")
    private TipoImovel tipoImovel;
}
