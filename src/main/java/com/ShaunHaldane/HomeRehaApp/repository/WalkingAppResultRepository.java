package com.ShaunHaldane.HomeRehaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResult;

@Repository
public interface WalkingAppResultRepository extends JpaRepository<WalkingAppResult, Integer> {
}

