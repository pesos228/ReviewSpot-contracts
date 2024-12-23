package com.reviewSpot.models.viewmodel.form.client;

import jakarta.validation.constraints.NotBlank;

public record ClientEditForm(
        @NotBlank(message = "Name cant be blank")
        String name,
        @NotBlank(message = "Url cant be blank")
        String photoUrl,
        @NotBlank(message = "Role cant be blank")
        String role
) {
}
