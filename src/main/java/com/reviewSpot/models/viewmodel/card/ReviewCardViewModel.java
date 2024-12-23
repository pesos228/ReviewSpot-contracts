package com.reviewSpot.models.viewmodel.card;

import java.time.LocalDateTime;

public record ReviewCardViewModel(
        int reviewId,
        String clientName,
        String clientPhotoUrl,
        int clientId,
        String mediaName,
        int mediaId,
        String mediaPhotoUrl,
        int rating,
        String watchStatus,
        String text,
        LocalDateTime dateTime,
        int likeCount,
        int dislikeCount,
        boolean isLike,
        boolean isDislike
) {}
