package com.periodic.server.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "periodic_table")
public class Periodic {
    @Id
    @Column
    private String atomNum;

    @Column
    private String atomName;

    @Column
    private String atomFullName;

    @Column
    private String atomInfo;
}
