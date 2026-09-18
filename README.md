# OTUS Scala Developer Homework

[English](#english) | [Русский](#русский)

---

## English

Educational project for the OTUS Scala Developer course. Demonstrates working with databases in Scala using Slick, Flyway migrations, ScalikeJDBC, and property-based testing with ScalaCheck.

### Requirements

- **JDK 17+** (tested with JDK 21)
- **sbt** (project uses sbt 1.13.0, downloaded automatically)
- **Docker** (required for integration tests with PostgreSQL via testcontainers)

### Build & Test

```bash
# Compile the project
sbt compile

# Run tests (requires Docker for testcontainers)
sbt test
```

### Project Structure

```
src/
├── main/
│   ├── scala/ru/otus/jdbc/
│   │   ├── dao/slick/       # Slick DAO implementation
│   │   └── model/           # Domain models (User, Role)
│   └── resources/
│       └── db/migration/    # Flyway SQL migrations
└── test/
    └── scala/ru/otus/jdbc/
        ├── overview/        # JDBC, ScalikeJDBC, Slick examples
        └── homework/        # Homework tests (UserDaoSlickImplTest)
```

### Technologies

| Component | Version |
|-----------|---------|
| Scala | 2.13.18 |
| sbt | 1.13.0 |
| Slick | 3.6.1 |
| Flyway | 13.5.0 |
| ScalikeJDBC | 4.3.5 |
| ScalaTest | 3.2.20 |
| ScalaCheck | 1.19.0 |
| testcontainers-scala | 0.44.1 |
| PostgreSQL JDBC | 42.7.13 |

### Tests Without Docker

Tests require Docker to run PostgreSQL via testcontainers. If Docker is not available, tests will fail with a connection error. In CI environments without Docker, you can skip tests:

```bash
sbt compile  # Build only, skip tests
```

---

## Русский

Учебный проект для курса OTUS Scala Developer. Демонстрирует работу с базами данных в Scala с использованием Slick, миграций Flyway, ScalikeJDBC и property-based тестирования с ScalaCheck.

### Требования

- **JDK 17+** (протестировано с JDK 21)
- **sbt** (проект использует sbt 1.13.0, скачивается автоматически)
- **Docker** (необходим для интеграционных тестов с PostgreSQL через testcontainers)

### Сборка и тестирование

```bash
# Компиляция проекта
sbt compile

# Запуск тестов (требуется Docker для testcontainers)
sbt test
```

### Структура проекта

```
src/
├── main/
│   ├── scala/ru/otus/jdbc/
│   │   ├── dao/slick/       # Реализация DAO на Slick
│   │   └── model/           # Доменные модели (User, Role)
│   └── resources/
│       └── db/migration/    # SQL-миграции Flyway
└── test/
    └── scala/ru/otus/jdbc/
        ├── overview/        # Примеры JDBC, ScalikeJDBC, Slick
        └── homework/        # Домашние тесты (UserDaoSlickImplTest)
```

### Технологии

| Компонент | Версия |
|-----------|--------|
| Scala | 2.13.18 |
| sbt | 1.13.0 |
| Slick | 3.6.1 |
| Flyway | 13.5.0 |
| ScalikeJDBC | 4.3.5 |
| ScalaTest | 3.2.20 |
| ScalaCheck | 1.19.0 |
| testcontainers-scala | 0.44.1 |
| PostgreSQL JDBC | 42.7.13 |

### Тесты без Docker

Тесты требуют Docker для запуска PostgreSQL через testcontainers. Если Docker недоступен, тесты завершатся с ошибкой соединения. В CI-окружениях без Docker можно пропустить тесты:

```bash
sbt compile  # Только сборка, без тестов
```

---

## License

Educational project. See course materials for licensing terms.
