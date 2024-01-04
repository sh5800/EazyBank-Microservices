package com.eazybytes.accounts.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass  //indicates spring data jpa that this class is going to act as a superclass for all my entities
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false, name="created_by")
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false, name="updated_at")
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false, name="updated_by")
    private String updatedBy;
}
