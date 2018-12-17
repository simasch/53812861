package com.example.so53812861;

import org.springframework.stereotype.Service;

@Service
public class TokenEncryptor {
    public String encryptToken(byte[] bytes) {
        return bytes.toString();
    }
}
