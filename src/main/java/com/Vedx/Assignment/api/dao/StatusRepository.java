package com.Vedx.Assignment.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vedx.Assignment.api.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
