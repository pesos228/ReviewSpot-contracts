package com.reviewSpot.models.viewmodel.form.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CommentFormModel(
    @NotNull(message = "Media ID cant be null")
    int mediaId,
    @NotBlank(message = "Text cant be blank")
    String text,
    @NotBlank(message = "Url cant be blank")
    String currentUrl
) {
}
