package ru.minikhanov.post.сontroller;

import org.springframework.web.bind.annotation.*;
import ru.minikhanov.post.domain.PostalPackage;
import ru.minikhanov.post.dto.PostOfficeDto;
import ru.minikhanov.post.dto.PostalPackageDto;
import ru.minikhanov.post.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/package")
    public void newPP(@RequestBody PostalPackage postalPackage){
        postService.registrationPP(postalPackage);
    }

    @PutMapping("/package")
    public void updateInfo(@RequestParam(value = "post_info") Boolean postInfo, @RequestBody PostalPackage postalPackage, )
}
