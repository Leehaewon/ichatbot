package com.kakao.ichatbot.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillResponse {

    //version이 없다면 구 버전의 응답으로 간주하기 때문에, 항상 version을 포함해야 합니다.
    private static final String version = "2.0";


    private SkillTemplate template;
    private SkillContextControl context;

    // Any type U Want to send then use this data
    private Object data;
}
