package com.web.liift.ts_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.liift.ts_models.TrackSheet;

@Repository
public interface TrackSheetRepository extends JpaRepository<TrackSheet, Long> {

}
