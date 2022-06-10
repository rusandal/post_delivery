package ru.minikhanov.post.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.minikhanov.post.domain.PType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostalPackageDto {
    private String IdPostalPackage;
    private PType name;
    private Integer postalIndex;
    private String address;
    private String recipientName;
}
