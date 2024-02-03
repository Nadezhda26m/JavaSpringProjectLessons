# Spring lessons

## Settings

Maven project

JDK: Amazon Corretto 17 (corretto-17)

Language level: 17 (SDK default)

## Projects

### Лекция 1. Основы Spring. Spring Boot

#### - _L1FirstSpringProject_ -

**План лекции:**

1. Принципы Spring: Dependency Injection (DI), Inversion of Control (IoC)
2. Создание нового проекта ([spring initializr](https://start.spring.io/))
3. Добавление зависимостей (spring web)
4. Аннотации Component, Service, Repository, Controller
5. Добавление зависимостей в классе (конструктор, @Autowired, ~~setter~~)
6. Примитивный класс-контроллер (@RestController, @GetMapping)
7. Варианты реализации контейнера (BeanFactory, **_ApplicationContext_**)
8. Типы (области видимости) бинов (@Scope): Singleton, Prototype, Request / Session / Application, WebSocket
9. Как работает контейнер (этапы)
10. Файлы конфигураций (application.properties или application.yml)
11. Использование конфигураций в коде (@ConfigurationProperties)
12. Профили Spring (@Profile)

**Аннотации:**

* `@SpringBootApplication`
* `@Component `
* `@Service `
* `@Repository `
* `@Controller `
* `@Configuration `
* `@Bean`
* `@Autowired`
* `@RestController`
* `@GetMapping("/car")`
* `@Scope("prototype")`
* `@ConfigurationProperties(prefix = "app")`
* `@Profile("development")`
* `@Primary`

**Описание проекта:**

Объект класса Car использует для работы двигатель (Engine). Для запуска
машины с двигателем используется простой контроллер (CarController).

Отдельно представлен вариант с профилями, добавлен интерфейс Engine
и две реализации, настройки в yaml-файле.

---

### Лекция 2. Использование Spring для разработки серверного приложения

#### - _L2SpringController_ -

**План лекции:**

1. Введение в клиент-серверное взаимодействие
2. REST API. Архитектурный стиль, используемый для обмена данными в вебе
3. HTTP-методы: GET, POST, PUT, DELETE
4. HTTP-коды ответов
5. Структура запроса
6. Контроллеры в Spring
    * Аннотация @Controller
    * Аннотация @RequestMapping
    * Принимаем параметры запроса
    * Возвращаем ответ
    * Работаем с параметрами запроса
    * Обрабатываем исключения
    * Обрабатываем JSON
    * Класс ResponseEntity<>
7. Приложение Postman для тестирования API, позволяет отправлять HTTP-запросы к серверу
   и просматривать ответы
8. Преимущества ручного тестирования
9. Кратко о Swagger
10. Кратко о Curl запросах
11. Кратко об использовании Docker

**Аннотации:**

* `@RequestMapping("/path")`
* `@RequestMapping(value = "/path", method = RequestMethod.GET)`
* `@PathVariable("name")`
* `@RequestParam(value = "size", defaultValue = "1")`
* `@ExceptionHandler(Exception.class)`
* `@RequestBody`
* `@PostMapping()`
* `@PutMapping("/{id}")`
* `@DeleteMapping("/{id}")`

**Описание проекта:**

_Зависимости:_ Spring Web

Простое приложение для управления списком задач. Компоненты:

* Модель Task для представления задач.
* Сервис TaskService для управления задачами.
* Контроллер TaskController для обработки HTTP-запросов.

_Запросы в Postman_

(GET) http://localhost:9090/task - получить список задач

(POST) http://localhost:9090/task - создать задачу

      {
       "name": "сходить в магазин",
       "description": "до 20:00"
      }
      {
       "name": "сходить в кино",
       "description": "до 21:00"
      }
      {
       "name": "лечь спать",
       "description": "до 23:00"
      }

(PUT) http://localhost:9090/task/{id} + json - обновить задачу по ее ID

(DELETE) http://localhost:9090/task/{id} - удалить задачу по ее ID

---

### Лекция 3. Spring MVC. Использование шаблонизатора Thymeleaf

#### - _L3SpringThymeleaf_ -

**План лекции:**

1. Бэкенд и возврат готовых страниц
2. Разница между @Controller и @RestController
3. HTML - язык разметки, основные теги
4. Использование ресурсов в проекте: resources/static и resources/templates
5. Создание простого контроллера с возвратом статичной страницы
6. Создание Spring приложения с использованием шаблонизатора Thymeleaf
    * Атрибуты: `th:text`, `th:each`, `th:href`
    * Переменные: `th:type="${variable}"`
    * Ссылка на страницу: `th:href="@{/path}"` / `th:href="@{/users/{id}(id=${user.id})}"`

**Описание проекта:**

_Зависимости:_ Spring Web и Thymeleaf

Простое приложение, в котором можно посмотреть список пользователей и информацию о каждом пользователе.

* Создание таблицы со списком пользователей
* Создание ссылки на страницу с данными о пользователе
* http://localhost:8080/users - получение списка всех пользователей
* http://localhost:8080/users/{id} - перенаправление на страницу с информацией о пользователе
* http://localhost:8080/ - получение главной страницы
* http://localhost:8080/greeting - вывод сообщения из контроллера
* http://localhost:8080/greetingJS - вывод сообщения с использованием переменной и JavaScript кода

---
