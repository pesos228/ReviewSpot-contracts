package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;
import com.reviewSpot.models.viewmodel.card.CommentCardViewModel;
import com.reviewSpot.models.viewmodel.card.MediaCardViewModel;
import com.reviewSpot.models.viewmodel.card.ReviewCardViewModel;

import java.util.List;

public record MediaViewModel(
        BaseViewModel currentClient,
        MediaCardViewModel mediaInfo,
        List<ReviewCardViewModel> lastReviews,
        List<CommentCardViewModel> lastComments,
        int commentTotalPages,
        int reviewTotalPages

) {
}
