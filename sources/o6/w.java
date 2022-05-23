package o6;

import android.content.Context;
import java.io.File;

public final class w {
    public final Context f19262a;

    public w(Context context) {
        this.f19262a = context;
    }

    public static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += b(file2);
            }
        }
        return j10;
    }

    public final long a() {
        return b(new File(this.f19262a.getFilesDir(), "assetpacks"));
    }
}
