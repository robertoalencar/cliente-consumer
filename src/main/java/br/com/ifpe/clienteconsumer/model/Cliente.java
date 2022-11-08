package br.com.ifpe.clienteconsumer.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente implements Serializable {

    private static final long serialVersionUID = -4493501206547535071L;

    private Long id;
    private String nome;
    private String cpf;

}