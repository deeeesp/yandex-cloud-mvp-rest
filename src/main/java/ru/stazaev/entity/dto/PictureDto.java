package ru.stazaev.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import ru.stazaev.entity.enums.PictureType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PictureDto {
    private PictureType pictureType;
    private MultipartFile picture;
}
