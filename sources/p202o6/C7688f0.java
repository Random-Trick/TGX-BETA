package p202o6;

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
import p262s6.C8646a;

public final class C7688f0 {
    public static final C8646a f24625c = new C8646a("AssetPackStorage");
    public static final long f24626d;
    public static final long f24627e;
    public final Context f24628a;
    public final C7775w2 f24629b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f24626d = timeUnit.toMillis(14L);
        f24627e = timeUnit.toMillis(28L);
    }

    public C7688f0(Context context, C7775w2 w2Var) {
        this.f24628a = context;
        this.f24629b = w2Var;
    }

    public static long m15245g(File file, boolean z) {
        File[] listFiles;
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f24625c.m11814e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f24625c.m11816c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void m15238n(File file) {
        File[] listFiles;
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long g = m15245g(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(g)) && !file2.getName().equals("stale.tmp")) {
                    m15237o(file2);
                }
            }
        }
    }

    public static boolean m15237o(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m15237o(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    public final File m15261A(String str, int i, long j, String str2) {
        return new File(m15260B(str, i, j, str2), "checkpoint.dat");
    }

    public final File m15260B(String str, int i, long j, String str2) {
        return new File(m15227y(str, i, j), str2);
    }

    public final File m15259C(String str, int i, long j, String str2) {
        return new File(new File(new File(m15242j(str, i, j), "_slices"), "_unverified"), str2);
    }

    public final File m15258D(String str, int i, long j, String str2) {
        return new File(new File(new File(m15242j(str, i, j), "_slices"), "_verified"), str2);
    }

    public final String m15257E(String str) {
        int length;
        File file = new File(m15241k(), str);
        if (!file.exists()) {
            f24625c.m11818a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f24629b.m15109a()));
        if (!file2.exists()) {
            f24625c.m11818a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f24629b.m15109a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f24625c.m11818a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f24629b.m15109a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f24625c.m11817b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f24629b.m15109a()));
            return null;
        }
    }

    public final Map m15256F() {
        HashMap hashMap = new HashMap();
        for (File file : m15239m()) {
            String name = file.getName();
            int g = (int) m15245g(m15244h(name), true);
            long g2 = m15245g(m15232t(name, g), true);
            if (m15231u(name, g, g2).exists()) {
                hashMap.put(name, Long.valueOf(g2));
            }
        }
        return hashMap;
    }

    public final Map m15255G() {
        HashMap hashMap = new HashMap();
        for (String str : m15254H().keySet()) {
            hashMap.put(str, Long.valueOf(m15234r(str)));
        }
        return hashMap;
    }

    public final Map m15254H() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m15239m()) {
                AbstractC7663b s = m15233s(file.getName());
                if (s != null) {
                    hashMap.put(file.getName(), s);
                }
            }
        } catch (IOException e) {
            f24625c.m11817b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    public final void m15253I() {
        for (File file : m15239m()) {
            if (file.listFiles() != null) {
                m15238n(file);
                long g = m15245g(file, false);
                if (this.f24629b.m15109a() != g) {
                    try {
                        new File(new File(file, String.valueOf(g)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f24625c.m11817b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m15238n(file2);
                }
            }
        }
    }

    public final void m15252J() {
        m15237o(m15241k());
    }

    public final void m15251a(String str, int i, long j, int i2) {
        File i3 = m15243i(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        i3.getParentFile().mkdirs();
        i3.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(i3);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void m15250b(String str, int i, long j) {
        File[] listFiles;
        File[] listFiles2;
        File h = m15244h(str);
        if (h.exists()) {
            for (File file : h.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m15237o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m15237o(file2);
                        }
                    }
                }
            }
        }
    }

    public final void m15249c(List list) {
        int a = this.f24629b.m15109a();
        for (File file : m15239m()) {
            if (!list.contains(file.getName()) && m15245g(file, true) != a) {
                m15237o(file);
            }
        }
    }

    public final boolean m15248d(String str, int i, long j) {
        if (!m15242j(str, i, j).exists()) {
            return true;
        }
        return m15237o(m15242j(str, i, j));
    }

    public final boolean m15247e(String str, int i, long j) {
        if (!m15231u(str, i, j).exists()) {
            return true;
        }
        return m15237o(m15231u(str, i, j));
    }

    public final boolean m15246f(String str) {
        return m15257E(str) != null;
    }

    public final File m15244h(String str) {
        return new File(m15241k(), str);
    }

    public final File m15243i(String str, int i, long j) {
        return new File(m15229w(str, i, j), "merge.tmp");
    }

    public final File m15242j(String str, int i, long j) {
        return new File(new File(new File(m15240l(), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File m15241k() {
        return new File(this.f24628a.getFilesDir(), "assetpacks");
    }

    public final File m15240l() {
        return new File(m15241k(), "_tmp");
    }

    public final List m15239m() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            f24625c.m11817b("Could not process directory while scanning installed packs. %s", e);
        }
        if (m15241k().exists() && m15241k().listFiles() != null) {
            for (File file : m15241k().listFiles()) {
                if (!file.getCanonicalPath().equals(m15240l().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int m15236p(String str) {
        return (int) m15245g(m15244h(str), true);
    }

    public final int m15235q(String str, int i, long j) {
        File i2 = m15243i(str, i, j);
        if (!i2.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(i2);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C7694g1("Merge checkpoint file corrupt.", e);
                }
            } else {
                throw new C7694g1("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final long m15234r(String str) {
        return m15245g(m15232t(str, (int) m15245g(m15244h(str), true)), true);
    }

    public final AbstractC7663b m15233s(String str) {
        String E = m15257E(str);
        if (E == null) {
            return null;
        }
        File file = new File(E, "assets");
        if (file.isDirectory()) {
            return new C7708j0(0, E, file.getCanonicalPath());
        }
        f24625c.m11817b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File m15232t(String str, int i) {
        return new File(m15244h(str), String.valueOf(i));
    }

    public final File m15231u(String str, int i, long j) {
        return new File(m15232t(str, i), String.valueOf(j));
    }

    public final File m15230v(String str, int i, long j) {
        return new File(m15231u(str, i, j), "_metadata");
    }

    public final File m15229w(String str, int i, long j) {
        return new File(m15242j(str, i, j), "_packs");
    }

    public final File m15228x(String str, int i, long j) {
        return new File(m15230v(str, i, j), "properties.dat");
    }

    public final File m15227y(String str, int i, long j) {
        return new File(new File(m15242j(str, i, j), "_slices"), "_metadata");
    }

    public final File m15226z(String str, int i, long j, String str2) {
        return new File(m15260B(str, i, j, str2), "checkpoint_ext.dat");
    }
}
