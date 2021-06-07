package io.velog.youmakemesmile.queryhint.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class User {
    @Id
    private String id;
    private String name;
    private int age;
}
