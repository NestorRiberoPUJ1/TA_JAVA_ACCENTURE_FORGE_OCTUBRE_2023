package com.ayudantias.eventos.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    public enum States {
        CA, NY, PE, FL, WA
    };

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI autoincrement
    private Long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @NotBlank
    @Size(min = 2, max = 50)
    private String location;

    @Enumerated(EnumType.STRING)
    private States states;

    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created_at;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updated_at;

    /* Relationships */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
        name = "event_invitees", 
        joinColumns = @JoinColumn(name = "event_id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id")
        )
    private List<User> invitees;

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
