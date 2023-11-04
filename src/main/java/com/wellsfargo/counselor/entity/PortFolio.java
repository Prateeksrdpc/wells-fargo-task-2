package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
@Entity
public class PortFolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int portfolio;
    @OneToOne(cascade = CascadeType.ALL)
    private Client cilentId;

    public int getPortfolio() {
        return portfolio;
    }



    public Client getCilentId() {
        return cilentId;
    }

    public void setCilentId(Client cilentId) {
        this.cilentId = cilentId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @CreatedDate
    private LocalDate creationDate;

}
