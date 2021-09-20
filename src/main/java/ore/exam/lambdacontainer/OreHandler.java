package ore.exam.lambdacontainer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;

public class OreHandler implements RequestHandler<Map<String,String>, String> {
    private static final Logger log = LoggerFactory.getLogger(OreHandler.class);

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        // LambdaLogger logger = context.getLogger();
        log.info("AWS REQUEST ID: " + context.getAwsRequestId());
        log.info("ENVIRONMENT VARIABLES: " + System.getenv());
        log.info("CONTEXT: " + context);
        log.info("EVENT: " + event);
        log.info("EVENT TYPE: " + event.getClass().toString());
        log.info("LOCALE: " + Locale.getDefault());
        log.info("TIME: " + DateTimeFormatter.ofPattern("yyyy/MM/dd (E) HH:mm:ss").format(LocalDateTime.now()));
        return "200 OK";
    }
}
