package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.card.BaseViewModel;
import org.springframework.security.core.userdetails.UserDetails;

public interface BaseController {
    BaseViewModel createBaseViewModel(String title, UserDetails userDetails);
}
