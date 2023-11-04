package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int securityid;

    @ManyToOne(cascade = CascadeType.ALL)
    private PortFolio portfolioid;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private String category;

    public Security(int securityid, String name, String category, double purchasePrice, int quantity) {
        this.securityid = securityid;
        Name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    @Column(nullable = false)
    private double purchasePrice;
    @CreatedDate
    private LocalDate purchaseDate;

    public PortFolio getPortfolioid() {
        return portfolioid;
    }

    public void setPortfolioid(PortFolio portfolioid) {
        this.portfolioid = portfolioid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Column(nullable = false)
    private int quantity;



}
