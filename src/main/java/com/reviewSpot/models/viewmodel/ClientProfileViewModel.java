package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;
import com.reviewSpot.models.viewmodel.card.ClientCardViewModel;
import com.reviewSpot.models.viewmodel.card.CommentCardViewModel;
import com.reviewSpot.models.viewmodel.card.ReviewCardViewModel;

import java.util.List;

public record ClientProfileViewModel(
        BaseViewModel currentClient,
        ClientCardViewModel clientCard,
        List<CommentCardViewModel> lastComments,
        List<ReviewCardViewModel> lastReviews,
        int commentTotalPages,
        int reviewTotalPages
) {
}
