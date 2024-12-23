package com.reviewSpot.models.viewmodel.form.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClientLoginFormModel(
    @NotBlank(message = "Email cant be blank")
    @Email(message = "Should be valid")
    String username,

    @NotBlank(message = "Password cant be blank")
    String password
){

}
