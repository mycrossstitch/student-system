package ru.system.student.database;

import ru.system.student.model.Faculty;
import ru.system.student.model.Passport;
import ru.system.student.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    public final static  Map<Passport, Student> STUDENTS = new HashMap<>();

    public final static List<Faculty> FACULTIES =
            List.of(new Faculty("Математический", "+79991111111", "math@ya.ru"),
                    new Faculty("Физический", "+79992222222", "phis@ya.ru"),
                    new Faculty("Экономический", "+79993333333", "econom@ya.ru")
    );
}
