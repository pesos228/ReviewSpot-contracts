package com.reviewSpot.models.viewmodel.form.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClientFormModel(
    @NotBlank(message = "Name cant be blank")
    String name,
    @NotBlank(message = "Email cant be blank")
    @Email(message = "Should be valid")
    String email,
    @NotBlank(message = "Password cant be blank")
    String password,
    String photoUrl
) {
}
