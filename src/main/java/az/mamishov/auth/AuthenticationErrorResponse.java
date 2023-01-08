package az.mamishov.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
public class AuthenticationErrorResponse {

    private String message;
    private int httpStatusCode;
}
