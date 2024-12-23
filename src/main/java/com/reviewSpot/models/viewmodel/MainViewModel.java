package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;
import com.reviewSpot.models.viewmodel.card.ClientCardViewModel;
import com.reviewSpot.models.viewmodel.card.MediaCardViewModel;

import java.util.List;

public record MainViewModel(
        BaseViewModel currentClient,
        List<MediaCardViewModel> lastMedia,
        List<ClientCardViewModel> mostActiveClient

) {
}
