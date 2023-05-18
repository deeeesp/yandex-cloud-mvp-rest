package ru.stazaev.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.stazaev.entity.dto.PictureDto;
import ru.stazaev.service.PictureStorageService;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final PictureStorageService pictureStorageService;

    @GetMapping("/get")
    public void getImage() throws Exception {
        pictureStorageService.getPicture("1.png");
    }

    //@RequestParam - тоже можно, но делается через MultipartFile, как в saveImage

    @PostMapping("/save")
    public void saveImage(@RequestBody MultipartFile file) throws Exception{
        pictureStorageService.savePicture("3.png", file);
    }


    //тут нужно именно @ModelAttribute, а не @RequestBody (с ним не работает)
    @PostMapping("/save-dto")
    public void saveImage2(@ModelAttribute PictureDto pictureDto) throws Exception{
        pictureStorageService.savePicture("3.png", pictureDto.getPicture());

    }

}
