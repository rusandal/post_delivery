package ru.minikhanov.post.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class DeliveryStatus {
    @Id
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private PostalPackage postalPackage;
    private LocalDateTime regTime;
    @OneToMany
    private List<DeliveryStatusBetweenOffices> betweenOffices;
    //private LocalDateTime sendToPostTime;
    private LocalDateTime deliveredToPostTime;
    private LocalDateTime sendToUserTime;
    private LocalDateTime deliveredToClient;

    public DeliveryStatusBetweenOffices get(){

    }
}
