package com.reviewSpot.models.viewmodel.form.review;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReviewFormModel(
        @NotNull(message = "Media ID cant be null")
        int mediaId,
        @NotNull(message = "Rating cant be null")
        @Min(value = 0)
        @Max(value = 10)
        int rating,
        @NotBlank(message = "Watch status cant be blank")
        String watchStatus,
        String text,
        @NotBlank(message = "Url cant be blank")
        String currentUrl
) {
}
