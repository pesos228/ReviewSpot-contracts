package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;
import com.reviewSpot.models.viewmodel.card.MediaCardViewModel;
import com.reviewSpot.models.viewmodel.form.media.MediaSearchFormModel;

import java.util.List;

public record SearchViewModel(
        BaseViewModel currentClient,
        MediaSearchFormModel filter,
        List<MediaCardViewModel> searchResults,
        Integer totalPages

) {
}
