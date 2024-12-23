package com.reviewSpot.models.viewmodel.form.comment;

import jakarta.validation.constraints.Min;

public record CommentPageFormModel(
        @Min(value = 0, message = "Page cannot be less than 0")
        Integer commentPage,

        @Min(value = 1, message = "Page size must be greater than 0")
        Integer commentSize
) {
}

