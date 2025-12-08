package utils;

import io.restassured.response.Response;
import java.util.function.Supplier;

public class RetryUtils {

    public static Response executeWithRetry(Supplier<Response> action, int maxAttempts) {
        int attempt = 1;
        while (true) {
            Response response = action.get();
            if (response.getStatusCode() != 429 || attempt >= maxAttempts) {
                return response;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            attempt++;
        }
    }
}
