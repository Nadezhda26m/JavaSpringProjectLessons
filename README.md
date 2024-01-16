# Spring lessons

## Settings
Maven project

JDK: Amazon Corretto 17 (corretto-17)

Language level: 17 (SDK default)

## Projects

### L1FirstSpringProject

**План лекции:**
1. Создание нового проекта ([spring initializr](https://start.spring.io/))
2. Добавление зависимостей (spring web)
3. Аннотации Component, Service, Repository, Controller
4. Добавление зависимостей в классе (конструктор, @Autowired, ~~setter~~)
5. Примитивный класс-контроллер (@RestController, @GetMapping)
6. Варианты реализации контейнера (BeanFactory, **_ApplicationContext_**)
7. Типы (области видимости) бинов (@Scope): Singleton, Prototype, Request / Session / Application, WebSocket
8. Как работает контейнер (этапы)
9. Файлы конфигураций (application.properties или application.yml)
10. Использование конфигураций в коде (@ConfigurationProperties)
11. Профили Spring (@Profile)

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
