package com.crossover.techtrial.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.crossover.techtrial.model.HourlyElectricity;
import com.crossover.techtrial.model.Panel;

/**
 * HourlyElectricity Repository is for all operations for HourlyElectricity.
 * @author Crossover
 */
@RestResource(exported = false)
public interface HourlyElectricityRepository 
    extends PagingAndSortingRepository<HourlyElectricity,Long> {
  Page<HourlyElectricity> findAllByPanelIdOrderByReadingAtDesc(Long panelId,Pageable pageable);
  
  Optional<HourlyElectricity> findByReadingAt(LocalDateTime readingAt);
  List<HourlyElectricity> findByGeneratedElectricity(Long generatedElectricity);
  
  List<HourlyElectricity> findByPanelAndReadingAtBetween(Panel panel, LocalDateTime start, LocalDateTime end);
  
}
