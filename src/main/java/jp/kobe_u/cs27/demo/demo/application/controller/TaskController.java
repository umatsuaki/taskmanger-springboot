package jp.kobe_u.cs27.demo.demo.application.controller;

import jp.kobe_u.cs27.demo.demo.domain.entity.Task;
import jp.kobe_u.cs27.demo.demo.domain.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return taskService.getTaskById(id);
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public void createTask(@RequestBody Task task) {
        taskService.insertTask(task);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable int id, @RequestBody Task task) {
        task.setId(id);
        taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
    }
}
