# 🧑‍🎓 Student System (Учебный проект на Java)

Простая консольная программа для управления списком студентов.  
Данные хранятся **в оперативной памяти** — без базы данных или файлов.  
Сборка и запуск выполняются через **Gradle**.
---

## 🚀 Возможности

Пользователь взаимодействует с программой через консольное меню:

1. 🔍 Найти студента
2. ❌ Удалить студента
3. ➕ Добавить студента

---

## 🛠️ Технические детали

- Язык: **Java 17+**
- Сборщик: **Gradle 8+**
- Хранение данных: **в памяти (ArrayList / HashMap)**
- Ввод данных: **через `Scanner`**
- Архитектура: **простая MVC / процедурная логика для обучения**

## Структура проекта

```
student-system/
├── build.gradle
├── README.md
│
└── src
  └── main
    └── java
      └── ru
        └── system
            └── student   
                ├── controller
                │   └── StudentController.java
                │
                ├── database
                │   └── Database.java
                │
                ├── dto
                │   ├── DeleteStudentDTO.java
                │   ├── GetStudentDTO.java
                │   └── SaveStudentDTO.java
                │
                ├── model
                │   ├── Faculty.java
                │   ├── Passport.java
                │   └── Student.java
                │
                ├── service
                │   ├── StudentService.java
                │   └── impl
                │       └── StudentServiceImpl.java
                │
                ├── util
                │   └── DateUtils.java
                │
                ├── validation
                │   └── StudentValidation.java
                │
                ├── view
                │   └── StudentView.java
                └──Main.java
```