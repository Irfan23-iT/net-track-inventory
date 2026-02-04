package com.irfandanish.nettrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String serialNumber;
    private String ipAddress; 
    private String type; 
    private String status; 

    // --- CONSTRUCTORS ---
    public Asset() {
    }

    public Asset(String name, String serialNumber, String type, String status) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.type = type;
        this.status = status;
    }

    // --- GETTERS AND SETTERS ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getIpAddress() { 
        return ipAddress; }
        
    public void setIpAddress(String ipAddress) { 
        this.ipAddress = ipAddress; }
}