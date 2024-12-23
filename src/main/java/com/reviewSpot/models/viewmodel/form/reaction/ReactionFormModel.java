package com.reviewSpot.models.viewmodel.form.reaction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReactionFormModel(
        @NotNull(message = "Target ID cant be null")
        int targetId,
        @NotBlank(message = "TargetType cant be blank")
        String targetType,
        @NotNull(message = "Reaction cant be null")
        boolean like,
        @NotBlank(message = "Url cant be blank")
        String currentUrl
){}
