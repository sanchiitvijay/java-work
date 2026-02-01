package com.library.catalog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book_copies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long bookId;
    
    @Column(nullable = false)
    private String rackNo;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CopyStatus status;
}
