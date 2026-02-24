package sn.isi.l3gl.api.taskapi.controller;

import org.springframework.web.bind.annotation.*;
import sn.isi.l3gl.core.taskcore.entity.Task;
import sn.isi.l3gl.core.taskcore.entity.Status;
import sn.isi.l3gl.core.taskcore.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> listTasks() {
        return taskService.listTasks();
    }

    @PutMapping("/{id}/status")
    public Task updateStatus(@PathVariable Long id, @RequestParam Status status) {
        return taskService.updateStatus(id, status);
    }

    @GetMapping("/done/count")
    public long countCompletedTasks() {
        return taskService.countCompletedTasks();
    }
}
