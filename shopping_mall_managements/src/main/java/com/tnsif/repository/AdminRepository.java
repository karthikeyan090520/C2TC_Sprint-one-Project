
package com.tnsif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
