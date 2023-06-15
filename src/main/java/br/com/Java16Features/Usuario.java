package br.com.Java16Features;

import java.io.Serializable;
import java.math.BigDecimal;

public record Usuario(
                Long id, 
                String nome, 
                Double valor,
                Boolean status) implements Serializable {

    public static boolean INATIVO = Boolean.FALSE;
    public static boolean ATIVO = Boolean.TRUE;

    public Usuario(Long id, String nome, BigDecimal valor, Boolean status)  {
         this(id, nome, Double.valueOf(valor.toString()), status);
    }

    public String statusLabel() {
        if(status) {
            return "Ativo";
        }
        return "Inativo";
    }
}
