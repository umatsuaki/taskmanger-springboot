package jp.kobe_u.cs27.demo.demo;

import jp.kobe_u.cs27.demo.demo.domain.entity.Task;
import jp.kobe_u.cs27.demo.demo.domain.mappers.TaskMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import static org.mockito.Mockito.when;

@SpringBootTest
public class TaskServiceTest {

    @Mock
    private TaskMapper taskMapper;

    @Test
    void testGetTaskById(){
        Task task = new Task();
        task.setId(1);
        task.setName("Sample Task");
        task.setDescription("Sample Task Description");
        when(taskMapper.getTaskById(1)).thenReturn(task);

    }
}
