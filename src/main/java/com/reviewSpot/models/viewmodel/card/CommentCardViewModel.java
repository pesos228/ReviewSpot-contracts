package com.reviewSpot.models.viewmodel.card;

import java.time.LocalDateTime;

public record CommentCardViewModel(
        int commentId,
        String clientName,
        String clientPhotoUrl,
        int clientId,
        String mediaName,
        int mediaId,
        String text,
        LocalDateTime dateTime,
        int likeCount,
        int dislikeCount,
        boolean isLike,
        boolean isDislike
) {}
