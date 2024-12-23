package com.reviewSpot.models.viewmodel.form.genre;

import jakarta.validation.constraints.Min;

public record GenrePageFormModel(
    @Min(value = 0, message = "Page cannot be less than 0")
    Integer genrePage,
    @Min(value = 1, message = "Page size must be greater than 0")
    Integer genreSize
) {
}
