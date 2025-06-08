package com.shubham.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shubham.ToDoList.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	

}
