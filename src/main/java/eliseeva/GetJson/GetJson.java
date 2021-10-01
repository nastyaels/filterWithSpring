package eliseeva.GetJson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class GetJson implements GetJsonInterface {
    @Value("${eliseeva.GetJson.path}")
    private String path;
    @Override
    public String get() throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
