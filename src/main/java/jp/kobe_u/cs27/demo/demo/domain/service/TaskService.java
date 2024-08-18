package jp.kobe_u.cs27.demo.demo.domain.service;

import jp.kobe_u.cs27.demo.demo.domain.entity.Task;
import jp.kobe_u.cs27.demo.demo.domain.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskMapper taskMapper;

    public Task getTaskById(int id) {
        return taskMapper.getTaskById(id);
    }

    public List<Task> getAllTasks() {
        return taskMapper.getAllTasks();
    }

    public void insertTask(Task task) {
        taskMapper.insertTask(task);
    }

    public void updateTask(Task task) {
        taskMapper.updateTask(task);
    }

    public void deleteTask(int id) {
        taskMapper.deleteTask(id);
    }
}
