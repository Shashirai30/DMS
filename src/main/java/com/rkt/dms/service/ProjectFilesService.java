package com.rkt.dms.service;

import java.util.List;

import com.rkt.dms.dto.ProjectFilesDto;

public interface ProjectFilesService {
    ProjectFilesDto createProjectFile(ProjectFilesDto dto);
    List<ProjectFilesDto> getProjectFiles(Long id);
    ProjectFilesDto updateProjectFile(Long id, ProjectFilesDto dto);
    void deleteProjectFile(Long id);
}
