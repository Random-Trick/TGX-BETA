package p189n6;

import android.content.Context;
import java.io.File;

public final class C7275w {
    public final Context f23124a;

    public C7275w(Context context) {
        this.f23124a = context;
    }

    public static long m17167b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m17167b(file2);
            }
        }
        return j;
    }

    public final long m17168a() {
        return m17167b(new File(this.f23124a.getFilesDir(), "assetpacks"));
    }
}
