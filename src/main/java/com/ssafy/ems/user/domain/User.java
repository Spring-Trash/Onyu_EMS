package com.ssafy.ems.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int id;
	private String empId; //사원번호
	private String userId;
	private String userPass;
	private String name;
	private String nickname;
	private String message;
}
