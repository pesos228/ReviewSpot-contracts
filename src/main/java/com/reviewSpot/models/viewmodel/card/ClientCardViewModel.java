package com.reviewSpot.models.viewmodel.card;

public record ClientCardViewModel(
        int clientId,
        String clientName,
        String clientPhotoUrl,
        int commentCount,
        int reviewCount
) {
}
