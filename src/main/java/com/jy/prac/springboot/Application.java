package com.jy.prac.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication  // 스프링 부트의 자동 설정, 스프링 Bean 일기와 생성을 모두 자동으로 설정됩니다.
public class Application {
    public static void main(String[] args) {
        // 내장 WAS를 실행하며, 톰캣을 설치할 필요가 없습니다. 스프링 부트로 만들어진 Jar 파일로 실행하면 됩니다.
        SpringApplication.run(Application.class,args);
    }
}
