package ru.minikhanov.post.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class DeliveryStatusBetweenOffices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private PostOffice postOffice;
    private LocalDateTime time;
    @ManyToOne(fetch = FetchType.LAZY)
    private DeliveryStatus deliveryStatus;
}
