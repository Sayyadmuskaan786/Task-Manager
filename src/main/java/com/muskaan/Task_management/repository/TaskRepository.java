package com.muskaan.Task_management.repository;


import com.muskaan.Task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
