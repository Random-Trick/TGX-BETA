package p087g2;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p071f2.AbstractC4234j;

public class C4457h {
    public static final String f14744a = AbstractC4234j.m28360f("WrkDbPathHelper");
    public static final String[] f14745b = {"-journal", "-shm", "-wal"};

    public static File m27610a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return m27609b(context);
        }
        return m27608c(context, "androidx.work.workdb");
    }

    public static File m27609b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static File m27608c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String m27607d() {
        return "androidx.work.workdb";
    }

    public static void m27606e(Context context) {
        String str;
        File b = m27609b(context);
        if (Build.VERSION.SDK_INT >= 23 && b.exists()) {
            AbstractC4234j.m28362c().mo28359a(f14744a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m27605f(context);
            for (File file : f.keySet()) {
                File file2 = f.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        AbstractC4234j.m28362c().mo28355h(f14744a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    if (file.renameTo(file2)) {
                        str = String.format("Migrated %s to %s", file, file2);
                    } else {
                        str = String.format("Renaming %s to %s failed", file, file2);
                    }
                    AbstractC4234j.m28362c().mo28359a(f14744a, str, new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> m27605f(Context context) {
        File b;
        File a;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(m27609b(context), m27610a(context));
            for (String str : f14745b) {
                hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
            }
        }
        return hashMap;
    }
}
