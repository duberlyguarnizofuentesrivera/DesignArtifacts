package com.duberlyguarnizo.designartifacts.repository;

import com.duberlyguarnizo.designartifacts.model.GraphContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<GraphContent, Long> {
    List<GraphContent> findByCreationDateBetween(LocalDateTime start, LocalDateTime end);
}
