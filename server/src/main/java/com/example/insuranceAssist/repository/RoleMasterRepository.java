package com.example.insuranceAssist.repository;

import com.example.insuranceAssist.entity.RoleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMasterRepository extends JpaRepository<RoleMaster, Long> {
}
