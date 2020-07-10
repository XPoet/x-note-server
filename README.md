# XNote 服务端

## 技术栈

- SpringBoot
- mybatis plus
- shiro
- lombok
- redis
- hibernate validatior
- jwt

## 整合 mybatis plus

- 导入 jar 包

  pom 中导入 mybatis plus 的 jar 包，因为后面会涉及到代码生成，所以我们还需要导入页面模板引擎，这里我们用的是 freemarker。

  ```xml
  <!-- mybatis-plus-boot-starter -->
  <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-boot-starter</artifactId>
      <version>3.2.0</version>
  </dependency>
  
  <!-- spring-boot-starter-freemarker -->
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-freemarker</artifactId>
  </dependency>
  
  <!-- mybatis-plus-generator 代码生成器 -->
  <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-generator</artifactId>
      <version>3.2.0</version>
  </dependency>
  ```      

- `application.yml` 配置相关信息。

    ```yml
    mybatis-plus:
      mapper-locations: classpath*:/mapper/**Mapper.xml
    ```

- 在 config 包下面添加 `MybatisPlusConfig` 文件。
  
  ```java
  @Configuration
  @EnableTransactionManagement
  @MapperScan("cn.xpoet.mapper")
  public class MybatisPlusConfig {
      @Bean
      public PaginationInterceptor paginationInterceptor() {
          PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
          return paginationInterceptor;
      }
  }
  ```

- 运行 `CodeGenerator` 代码生成器，生成相关文件。
