package ru.stazaev.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.stazaev.service.PictureStorageService;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final PictureStorageService pictureStorageService;

    @GetMapping("/get")
    public void getImage() throws Exception {
        pictureStorageService.getPicture("1.png");
    }

    @PostMapping("/save")
    public void saveImage(@RequestBody MultipartFile file) throws Exception{
        pictureStorageService.savePicture("3.png", file);
    }
}
