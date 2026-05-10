package com.project.grading_system.controller; 
import com.project.grading_system.dto.*; //importing classes
import com.project.grading_system.service.AuthService;
import jakarta.validation.valid; 
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
Public class AuthController{
    Private final AuthService authservice;
    @PostMapping("/register")
    Public ResponseEntity<ApiResponse<AuthResponse>>register(@Valid @Requestbody RegisterRequest request){ // Response entity = http response api response = custom wrapper auth response = actual auth data
        AuthResponse response=authService.register(request);
        return ResponseEntity.ok(
            ApiResponse.success(
                "User registered successfully",
                response
            )
        );
    }
@PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(
            @Valid @RequestBody LoginRequest request) {

        AuthResponse response = authService.login(request);

        return ResponseEntity.ok(
                ApiResponse.success(
                        "Login successful",
                        response
                )
        );
    }
}
// data transfer 