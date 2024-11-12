package springbootbuildpackbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
final class Application {

    public static void main(final String... arguments) {
        SpringApplication.run(Application.class, arguments);
    }
}
