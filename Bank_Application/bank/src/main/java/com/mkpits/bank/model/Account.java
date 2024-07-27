package com.mkpits.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "account_number")
    private String accountNo;

    @Column(name = "account_type")
    private String account_type;

    @Column(name = "balance")
    private double balance;

    @Column(name= "rate_of_interest")
    private  double roi;

    @Column(name = "branch_id")
    private Integer branch;

    @Column(name = "opening_date")
    private LocalDate opening;

    @Column(name = "closing_date")
    private LocalDate closing;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;


    public Account orElse(Object o) {
        return null;
    }
}
