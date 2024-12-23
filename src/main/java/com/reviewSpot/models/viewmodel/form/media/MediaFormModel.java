package com.reviewSpot.models.viewmodel.form.media;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record MediaFormModel(
    @NotBlank(message = "Name cant be blank")
    String name,
    String photoUrl,
    String description,
    @NotNull(message = "Genre list cant be null")
    List<String> genres
) {

}
