# 🍃 Kumpulan Project Belajar Spring Boot

Repositori ini berisi kumpulan project latihan untuk mempelajari berbagai modul, fitur, dan ekosistem di dalam Spring Boot. Setiap folder mewakili topik spesifik yang dipelajari secara bertahap, mulai dari konsep dasar hingga pengembangan RESTful API dan integrasi third-party tools.

---

## 📁 Daftar Project & Materi

Berikut adalah rincian dari setiap folder project yang ada di dalam repositori ini:

| Nama Folder | Deskripsi Materi |
| :--- | :--- |
| **`belajar-spring-dasar`** | Mempelajari konsep dasar Spring Framework seperti Inversion of Control (IoC), Dependency Injection (DI), dan manajemen Bean. |
| **`belajar-spring-aop`** | Implementasi Aspect-Oriented Programming (AOP) untuk memisahkan cross-cutting concerns seperti logging atau security. |
| **`belajar-spring-logging`** | Pengaturan dan manajemen log menggunakan Logback / SLF4J di Spring Boot. |
| **`belajar-spring-validation`** | Validasi data input menggunakan Jakarta Bean Validation (Hibernate Validator) seperti @NotNull, @Size, dll. |
| **`belajar-spring-config-properties`** | Manajemen konfigurasi aplikasi menggunakan @ConfigurationProperties dan file application.properties / application.yml. |
| **`belajar-spring-data-jpa`** | Integrasi dengan database relasional menggunakan Spring Data JPA dan Hibernate (Repository, Query Method, @Entity). |
| **`belajar-spring-webmvc`** | Pengembangan aplikasi web berbasis MVC (Model-View-Controller) menggunakan Spring Web. |
| **`belajar-spring-restful-api`** | Pembuatan RESTful API standar industri (Controller, Request/Response Body, Exception Handling). |
| **`belajar-spring-async`** | Implementasi proses asinkronus menggunakan anotasi @EnableAsync dan @Async. |
| **`belajar-spring-redis`** | Integrasi dengan Redis untuk kebutuhan data caching atau session management. |
| **`belajar-spring-monitoring`** | Memantau metrik dan kesehatan aplikasi menggunakan Spring Boot Actuator. |

---

## 🛠️ Prasyarat (Prerequisites)

Sebelum menjalankan project-project di atas, pastikan Anda sudah menginstal tools berikut di komputer Anda:

* Java Development Kit (JDK) minimal versi 17 (atau versi yang Anda gunakan)
* Apache Maven atau Gradle (tergantung build tool yang digunakan di dalam project)
* Database Management System (DBMS) (seperti MySQL, PostgreSQL, atau H2 untuk keperluan testing)
* Redis Server (khusus untuk modul belajar-spring-redis)
* IDE pilihan Anda (IntelliJ IDEA, Eclipse, atau VS Code)