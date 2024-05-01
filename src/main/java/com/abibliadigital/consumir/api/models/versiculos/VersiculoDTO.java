package com.abibliadigital.consumir.api.models.versiculos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VersiculoDTO(
        int chapter,
        int number,
        String text
) {
    @Override
    public String toString() {
        return "VersiculoDTO{" +
                "\n  chapter=" + chapter +
                ",\n  number=" + number +
                ",\n  text='" + text + '\'' +
                "\n}";
    }
}
