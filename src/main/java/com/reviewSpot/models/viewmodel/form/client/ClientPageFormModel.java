package com.reviewSpot.models.viewmodel.form.client;

import jakarta.validation.constraints.Min;

public record ClientPageFormModel(
    @Min(value = 0, message = "Page cannot be less than 0")
    Integer clientPage,
    @Min(value = 1, message = "Page size must be greater than 0")
    Integer clientSize
) {
}
