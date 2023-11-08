package com.example.apicrudsecond.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        Integer id,
        @NotBlank
        String name,
        @NotNull
        Float price,
        Boolean active
) {

}
