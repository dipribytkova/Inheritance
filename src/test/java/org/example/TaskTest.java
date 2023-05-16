package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("огород");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForEpicWhenTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Яйца");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForEpicWhenFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Колбаса");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForMeetingWhenTrueTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForMeetingWhenTrueProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForMeetingWhenFalseTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 56й версии приложения");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForMeetingWhenFalseProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Альфабанк");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        simpleTask.getTitle();
    }

    @Test
    public void testGetForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        epic.getSubtasks();
    }

    @Test
    public void testGetForMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.getProject();
    }

    @Test
    public void testGetForMeetingStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.getStart();
    }

    @Test
    public void testGetForForMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.getTopic();
    }
}