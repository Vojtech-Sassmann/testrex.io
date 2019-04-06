package io.testrex.repository;

import io.testrex.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasAnyAuthority('ROLE_USER')")
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
