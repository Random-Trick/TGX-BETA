package y0;

import android.os.Environment;
import java.io.File;

public final class d {
    public static String a(File file) {
        return Environment.getExternalStorageState(file);
    }
}
