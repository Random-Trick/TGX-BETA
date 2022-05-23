package p6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import r6.d;
import t6.a;

public final class u2 {
    public static final a f20817d = new a("PackMetadataManager");
    public final f0 f20818a;
    public final w2 f20819b;
    public final d f20820c;

    public u2(f0 f0Var, w2 w2Var, d dVar) {
        this.f20818a = f0Var;
        this.f20819b = w2Var;
        this.f20820c = dVar;
    }

    public final String a(String str) {
        if (this.f20820c.a("assetOnlyUpdates") && this.f20818a.f(str)) {
            int a10 = this.f20819b.a();
            f0 f0Var = this.f20818a;
            File x10 = f0Var.x(str, a10, f0Var.r(str));
            try {
                if (!x10.exists()) {
                    return String.valueOf(a10);
                }
                FileInputStream fileInputStream = new FileInputStream(x10);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(a10) : property;
            } catch (IOException unused) {
                f20817d.b("Failed to read pack version tag for pack %s", str);
            }
        }
        return "";
    }

    public final void b(String str, int i10, long j10, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File x10 = this.f20818a.x(str, i10, j10);
        x10.getParentFile().mkdirs();
        x10.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(x10);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
