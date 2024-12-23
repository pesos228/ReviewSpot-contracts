package com.reviewSpot.models.viewmodel;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;

import java.util.List;

public record AdminViewModelEntityList<T, P>(
        BaseViewModel currentClient,
        List<T> currentList,
        P pagination,
        String entityType,
        int totalPages
) {
}
