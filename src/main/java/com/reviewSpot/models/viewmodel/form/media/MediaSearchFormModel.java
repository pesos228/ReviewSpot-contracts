package com.reviewSpot.models.viewmodel.form.media;

import jakarta.validation.constraints.Min;

import java.util.List;

public record MediaSearchFormModel(
    String searchQuery,
    List<String> genres,
    @Min(value = 0, message = "Page cannot be less than 0")
    Integer page,
    @Min(value = 1, message = "Page size must be greater than 0")
    Integer size
) {
}
