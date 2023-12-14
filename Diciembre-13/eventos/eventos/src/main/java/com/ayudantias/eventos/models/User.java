package com.ayudantias.eventos.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public enum States {
        CA, NY, PE, FL, WA
    };

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI autoincrement
    private Long id;

    @Size(min = 2, max = 50)
    private String firstName;

    @Size(min = 2, max = 50)
    private String lastName;

    @Size(min = 2, max = 50)
    @Email
    private String email;

    @Size(min = 2, max = 50)
    private String location;

    @Enumerated(EnumType.STRING)
    private States states;

    @Size(min = 2, max = 50)
    private String password;

    @Transient
    @Size(min = 2, max = 50)
    private String confirmPassword;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created_at;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updated_at;

    /* DEFAULT NOW() */
    @PrePersist
    protected void onCreate() {
        this.created_at = new Date();
        this.updated_at = new Date();
    }

    /* NOW() ON UPDATE NOW() */
    @PreUpdate
    protected void onUpdate() {
        this.updated_at = new Date();
    }

}
