package com.reviewSpot.models.viewmodel.card;

import java.util.List;

public record MediaCardViewModel(
        int mediaId,
        String mediaName,
        String mediaPhotoUrl,
        String description,
        List<String> genres,
        float rating
) {}
