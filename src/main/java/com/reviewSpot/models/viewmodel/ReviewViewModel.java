package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;

public record ReviewViewModel(
        BaseViewModel currentClient,
        int reviewId,
        String mediaName,
        String mediaPhotoUrl,
        int mediaId,
        String clientName,
        int clientId,
        String watchStatus,
        String text,
        int rating,
        int likeCount,
        int dislikeCount,
        boolean isLike,
        boolean isDislike
) {
}
