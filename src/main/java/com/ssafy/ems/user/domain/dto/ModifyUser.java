package com.ssafy.ems.user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyUser {
    private String userPass;
    private String email;
    private String nickname;
    private String message;
}
