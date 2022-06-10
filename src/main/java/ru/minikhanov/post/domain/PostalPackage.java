package ru.minikhanov.post.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class PostalPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @Column(unique = true)
    private String idPostalPackage;
    @Enumerated(EnumType.STRING)
    private PType name;
    private Integer postalIndex;
    private String address;
    private String recipientName;
}
