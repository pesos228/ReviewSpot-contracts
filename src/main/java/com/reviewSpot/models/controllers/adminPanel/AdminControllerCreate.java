package com.reviewSpot.models.controllers.adminPanel;

import com.reviewSpot.models.controllers.BaseController;
import com.reviewSpot.models.viewmodel.form.client.ClientFormModel;
import com.reviewSpot.models.viewmodel.form.genre.GenreFormModel;
import com.reviewSpot.models.viewmodel.form.media.MediaFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/create")
public interface AdminControllerCreate extends BaseController {

    @GetMapping("/client")
    String createClient(Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/genre")
    String createGenre(Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/media")
    String createMedia(Model model, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/client")
    String createClient(@Valid @ModelAttribute("clientForm") ClientFormModel clientFormModel,
                        BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/genre")
    String createGenre(@Valid @ModelAttribute("genreForm") GenreFormModel genreFormModel,
                       BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/media")
    String createMedia(@Valid @ModelAttribute("mediaForm") MediaFormModel mediaFormModel,
                       BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
