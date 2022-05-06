package com.example.webservices.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{
    private RoleNameEnum name;

    public RoleEntity() {
    }

    public RoleEntity(RoleNameEnum name) {
        this.name = name;
    }

    @Column(name="name")
    @Enumerated(EnumType.STRING)
    public RoleNameEnum getRole() {
        return name;
    }

    public void setRole(RoleNameEnum name) {
        this.name = name;
    }
}
