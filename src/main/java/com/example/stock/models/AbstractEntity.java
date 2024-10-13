package com.example.stock.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;


import jakarta.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Data

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)


public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name= "creationDate", nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate" )
    @JsonIgnore
    private Instant lastModifiedDate;

}
