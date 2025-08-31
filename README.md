SQL to JSON Mapper

A Spring Boot project that executes SQL queries, maps the result set to a **custom JSON structure** using templates, and returns the response through REST APIs.

This project is useful when:
- You want **flexible JSON output** different from raw database column names.
- You want to **reuse SQL + JSON mapping templates** without hardcoding transformations.
- You need to **decouple SQL queries from response structure**.

---

## 🚀 Features
- Execute SQL queries stored as external `.sql` files from `classpath:/sql/`.
- Load JSON templates from `classpath:/templates/`.
- Map database column values into nested JSON structures using **placeholders**.
- Uses **Jackson ObjectMapper** to handle JSON parsing and transformation.
- Clean separation of concerns with **Service + Controller + Util classes**.

Dependencies 
spring-boot-starter-web → for building REST APIs
spring-boot-starter-jdbc → for JDBC database access
jackson-databind → for JSON parsing and mapping
spring-boot-starter-test (optional, for testing)
