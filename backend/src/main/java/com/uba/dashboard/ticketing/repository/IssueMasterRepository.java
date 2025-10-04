package com.uba.dashboard.ticketing.repository;

import com.uba.dashboard.ticketing.model.IssueMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueMasterRepository extends JpaRepository<IssueMaster, String> {
    // Spring Data JPA will automatically create implementations for standard methods
    // like findAll(), findById(), save(), etc.
    // We can also define custom query methods here later.
}