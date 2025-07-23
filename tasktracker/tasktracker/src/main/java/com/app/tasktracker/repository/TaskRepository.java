package com.app.tasktracker.repository;

import com.app.tasktracker.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
