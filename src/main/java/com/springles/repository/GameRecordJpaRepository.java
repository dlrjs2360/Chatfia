package com.springles.repository;

import com.springles.domain.entity.GameRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GameRecordJpaRepository extends JpaRepository<GameRecord, Long> {

    @Query("SELECT gr FROM GameRecord gr WHERE gr.memberId = :memberId ORDER BY gr.id DESC LIMIT 1")
    GameRecord findTOP1ByMemberIdOrderByIdDesc(@Param("memberId") Long memberId);
}
