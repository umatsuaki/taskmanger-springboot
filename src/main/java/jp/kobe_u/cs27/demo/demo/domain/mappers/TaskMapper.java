package jp.kobe_u.cs27.demo.demo.domain.mappers;

import org.apache.ibatis.annotations.*;

import jp.kobe_u.cs27.demo.demo.domain.entity.Task;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM task WHERE id = #{id}")
    public Task getTaskById(int id);

    @Select("SELECT * FROM task")
    public List<Task> getAllTasks();

    @Insert("INSERT INTO task(name,description) VALUES (#{name}, #{description})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insertTask(Task task);

    @Update("UPDATE task SET name = #{name}, description = #{description} WHERE id = #{id}")
    public void updateTask(Task task);

    @Delete("DELETE FROM task WHERE id = #{id}")
    public void deleteTask(int id);


}
