package p6;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import t6.a;

public final class f0 {
    public static final a f20598c = new a("AssetPackStorage");
    public static final long f20599d;
    public static final long f20600e;
    public final Context f20601a;
    public final w2 f20602b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f20599d = timeUnit.toMillis(14L);
        f20600e = timeUnit.toMillis(28L);
    }

    public f0(Context context, w2 w2Var) {
        this.f20601a = context;
        this.f20602b = w2Var;
    }

    public static long g(File file, boolean z10) {
        File[] listFiles;
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z10 && file.listFiles().length > 1) {
            f20598c.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            f20598c.c(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void n(File file) {
        File[] listFiles;
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long g10 = g(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(g10)) && !file2.getName().equals("stale.tmp")) {
                    o(file2);
                }
            }
        }
    }

    public static boolean o(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z10 &= o(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z10;
    }

    public final File A(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint.dat");
    }

    public final File B(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10), str2);
    }

    public final File C(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    public final File D(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_verified"), str2);
    }

    public final String E(String str) {
        int length;
        File file = new File(k(), str);
        if (!file.exists()) {
            f20598c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f20602b.a()));
        if (!file2.exists()) {
            f20598c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f20602b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f20598c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f20602b.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f20598c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f20602b.a()));
            return null;
        }
    }

    public final Map F() {
        HashMap hashMap = new HashMap();
        for (File file : m()) {
            String name = file.getName();
            int g10 = (int) g(h(name), true);
            long g11 = g(t(name, g10), true);
            if (u(name, g10, g11).exists()) {
                hashMap.put(name, Long.valueOf(g11));
            }
        }
        return hashMap;
    }

    public final Map G() {
        HashMap hashMap = new HashMap();
        for (String str : H().keySet()) {
            hashMap.put(str, Long.valueOf(r(str)));
        }
        return hashMap;
    }

    public final Map H() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m()) {
                b s10 = s(file.getName());
                if (s10 != null) {
                    hashMap.put(file.getName(), s10);
                }
            }
        } catch (IOException e10) {
            f20598c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        return hashMap;
    }

    public final void I() {
        for (File file : m()) {
            if (file.listFiles() != null) {
                n(file);
                long g10 = g(file, false);
                if (this.f20602b.a() != g10) {
                    try {
                        new File(new File(file, String.valueOf(g10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f20598c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    n(file2);
                }
            }
        }
    }

    public final void J() {
        o(k());
    }

    public final void a(String str, int i10, long j10, int i11) {
        File i12 = i(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        i12.getParentFile().mkdirs();
        i12.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(i12);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i10, long j10) {
        File[] listFiles;
        File[] listFiles2;
        File h10 = h(str);
        if (h10.exists()) {
            for (File file : h10.listFiles()) {
                if (!file.getName().equals(String.valueOf(i10)) && !file.getName().equals("stale.tmp")) {
                    o(file);
                } else if (file.getName().equals(String.valueOf(i10))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            o(file2);
                        }
                    }
                }
            }
        }
    }

    public final void c(List list) {
        int a10 = this.f20602b.a();
        for (File file : m()) {
            if (!list.contains(file.getName()) && g(file, true) != a10) {
                o(file);
            }
        }
    }

    public final boolean d(String str, int i10, long j10) {
        if (!j(str, i10, j10).exists()) {
            return true;
        }
        return o(j(str, i10, j10));
    }

    public final boolean e(String str, int i10, long j10) {
        if (!u(str, i10, j10).exists()) {
            return true;
        }
        return o(u(str, i10, j10));
    }

    public final boolean f(String str) {
        return E(str) != null;
    }

    public final File h(String str) {
        return new File(k(), str);
    }

    public final File i(String str, int i10, long j10) {
        return new File(w(str, i10, j10), "merge.tmp");
    }

    public final File j(String str, int i10, long j10) {
        return new File(new File(new File(l(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    public final File k() {
        return new File(this.f20601a.getFilesDir(), "assetpacks");
    }

    public final File l() {
        return new File(k(), "_tmp");
    }

    public final List m() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e10) {
            f20598c.b("Could not process directory while scanning installed packs. %s", e10);
        }
        if (k().exists() && k().listFiles() != null) {
            for (File file : k().listFiles()) {
                if (!file.getCanonicalPath().equals(l().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int p(String str) {
        return (int) g(h(str), true);
    }

    public final int q(String str, int i10, long j10) {
        File i11 = i(str, i10, j10);
        if (!i11.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(i11);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e10) {
                    throw new g1("Merge checkpoint file corrupt.", e10);
                }
            } else {
                throw new g1("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final long r(String str) {
        return g(t(str, (int) g(h(str), true)), true);
    }

    public final b s(String str) {
        String E = E(str);
        if (E == null) {
            return null;
        }
        File file = new File(E, "assets");
        if (file.isDirectory()) {
            return new j0(0, E, file.getCanonicalPath());
        }
        f20598c.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File t(String str, int i10) {
        return new File(h(str), String.valueOf(i10));
    }

    public final File u(String str, int i10, long j10) {
        return new File(t(str, i10), String.valueOf(j10));
    }

    public final File v(String str, int i10, long j10) {
        return new File(u(str, i10, j10), "_metadata");
    }

    public final File w(String str, int i10, long j10) {
        return new File(j(str, i10, j10), "_packs");
    }

    public final File x(String str, int i10, long j10) {
        return new File(v(str, i10, j10), "properties.dat");
    }

    public final File y(String str, int i10, long j10) {
        return new File(new File(j(str, i10, j10), "_slices"), "_metadata");
    }

    public final File z(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint_ext.dat");
    }
}
