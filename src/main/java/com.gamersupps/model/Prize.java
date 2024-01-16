package com.gamersupps.model;

public class Prize {
    private Long id;
    private String name;
    private String description;
    private String redemptionCode;
    private String backgroundColor;

    public Prize() {
        // Default constructor
    }

    public Prize(Long id, String name, String description, String redemptionCode, String backgroundColor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.redemptionCode = redemptionCode;
        this.backgroundColor = backgroundColor;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Prize{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", redemptionCode='" + redemptionCode + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                '}';
    }
}
