package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;

public record AdminViewModelEntityEdit(
        BaseViewModel currentClient,
        String entityType,
        int entityId
) {
}
