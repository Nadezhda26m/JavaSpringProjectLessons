# Spring lessons

## Settings
Maven project

JDK: Amazon Corretto 17 (corretto-17)

Language level: 17 (SDK default)

## Projects

### L1FirstSpringProject

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
* @SpringBootApplication
* @Component 
* @Service 
* @Repository 
* @Controller 
* @Configuration 
* @Bean
* @Autowired
* @RestController
* @GetMapping("/car")
* @Scope("prototype")
* @ConfigurationProperties(prefix = "app")
* @Profile("development")
* @Primary

**Описание проекта:** 

Объект класса Car использует для работы двигатель (Engine). Для запуска 
машины с двигателем используется простой контроллер (CarController).

Отдельно представлен вариант с профилями, добавлен интерфейс Engine 
и две реализации, настройки в yaml-файле.

### L2
