package com.rkt.dms.dto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectFilesDto {
    private Long id;
    private String name;
    private String description;
    private String fileType;
    private Double size;
    private List<Long> documentIds; // Store document IDs only

    // Constructors, Getters, Setters
}
