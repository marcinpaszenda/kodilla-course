package com.kodilla.hibernate.taskList.dao;


import com.kodilla.hibernate.taskList.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    private static final String LISTNAME = "abc";
    private static final String DESCRIPTION = "xyz";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTaskList.size());
        assertEquals("abc", listName);

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
