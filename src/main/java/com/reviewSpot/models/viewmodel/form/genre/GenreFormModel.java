package com.reviewSpot.models.viewmodel.form.genre;

import jakarta.validation.constraints.NotBlank;

public record GenreFormModel(
        @NotBlank(message = "Genre cant be blank")
        String name
) {
}
