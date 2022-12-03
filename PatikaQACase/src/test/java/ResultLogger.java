import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class ResultLogger implements TestWatcher {

    LogClass logClass = new LogClass();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String method = context.getDisplayName();
        logClass.info(method + " SUCCESSFUL");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String method = context.getDisplayName();
        String failCasue = cause.getMessage();
        logClass.error(method + " TEST FAILED Because of: " +failCasue);


    }

}
