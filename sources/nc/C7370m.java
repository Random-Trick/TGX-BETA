package nc;

import java.io.File;
import java.util.Comparator;
import org.thunderdog.challegram.Log;

public final class C7370m implements Comparator {
    public static final C7370m f23299a = new C7370m();

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getLogFilesImpl$0;
        lambda$getLogFilesImpl$0 = Log.lambda$getLogFilesImpl$0((File) obj, (File) obj2);
        return lambda$getLogFilesImpl$0;
    }
}
