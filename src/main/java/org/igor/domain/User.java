package org.igor.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by igorhara on 02/06/2018.
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(unique = true,nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String role;
}
