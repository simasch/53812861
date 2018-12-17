package com.example.so53812861;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/encryptor")
public class EncryptionController {

    @Autowired
    private TokenEncryptor tokenEncryptor;


    @GetMapping("/checkAutorization")
    public GeneralResponse checkAutorization() throws Throwable {
        try {
//          byte[] byteToken = token.getBytes(StandardCharsets.UTF_8);
            return new GeneralResponse(tokenEncryptor.encryptToken(new byte[]
                    {}));
        } catch (Exception AccessDeniedException) {
            return new GeneralResponse(AccessDeniedException);
        }
    }


}