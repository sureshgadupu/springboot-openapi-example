package dev.fullstackcode.eis.openapi.repository;


import dev.fullstackcode.eis.openapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
