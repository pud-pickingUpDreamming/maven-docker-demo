package com.devops.demo.controller;

import com.devops.demo.annotations.IgnoreAuth;
import com.devops.demo.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author john
 */
@RestController
@RequestMapping("/check")
@IgnoreAuth
public class HealthCheckController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/heart")
    public ResponseResult<?> heart() {
        return ResponseResult.SUCCESS;
    }

    @GetMapping("/profile")
    public ResponseResult<String> profile() {
        return ResponseResult.success(profile);
    }
}
