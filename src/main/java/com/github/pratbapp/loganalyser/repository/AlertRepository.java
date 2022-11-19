package com.github.pratbapp.loganalyser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.pratbapp.loganalyser.model.persistence.Alert;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
