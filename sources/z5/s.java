package z5;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class s {
    public static final Logger f26997a = Logger.getLogger(s.class.getName());

    public static void a(@CheckForNull InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                try {
                    f26997a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e10);
                } catch (IOException e11) {
                    throw new AssertionError(e11);
                }
            }
        }
    }
}
