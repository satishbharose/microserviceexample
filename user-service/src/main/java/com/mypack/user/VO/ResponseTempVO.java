package com.mypack.user.VO;

import com.mypack.user.domain.User;
import lombok.Data;

@Data
public class ResponseTempVO {
    private User user;
    private Department department;
}
