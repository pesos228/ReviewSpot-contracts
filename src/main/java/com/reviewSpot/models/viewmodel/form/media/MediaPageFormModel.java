package com.reviewSpot.models.viewmodel.form.media;

import jakarta.validation.constraints.Min;

public record MediaPageFormModel (
    @Min(value = 0, message = "Page cannot be less than 0")
    Integer mediaPage,
    @Min(value = 1, message = "Page size must be greater than 0")
    Integer mediaSize
) {
}
