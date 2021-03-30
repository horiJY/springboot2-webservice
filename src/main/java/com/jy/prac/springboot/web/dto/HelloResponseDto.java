package com.jy.prac.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter  // 선언된 모든 필드의 get메소드를 생성해준다.
@RequiredArgsConstructor //final이 없는 필드는 생성자에 포함되지 않는다.
public class HelloResponseDto {

    private final String name;
    private final int amount;

}