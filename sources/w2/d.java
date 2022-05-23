package w2;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import w2.c;
import x2.i;

public class d {
    public final Set<String> f25719a;
    public final c.b f25720b;
    public final c.a f25721c;
    public boolean f25722d;
    public boolean f25723e;
    public c.d f25724f;

    public class a implements Runnable {
        public final c.AbstractC0236c M;
        public final Context f25725a;
        public final String f25726b;
        public final String f25727c;

        public a(Context context, String str, String str2, c.AbstractC0236c cVar) {
            this.f25725a = context;
            this.f25726b = str;
            this.f25727c = str2;
            this.M = cVar;
        }

        @Override
        public void run() {
            try {
                d.this.h(this.f25725a, this.f25726b, this.f25727c);
                this.M.a();
            } catch (UnsatisfiedLinkError e10) {
                this.M.b(e10);
            } catch (w2.b e11) {
                this.M.b(e11);
            }
        }
    }

    public class b implements FilenameFilter {
        public final String f25728a;

        public b(String str) {
            this.f25728a = str;
        }

        @Override
        public boolean accept(File file, String str) {
            return str.startsWith(this.f25728a);
        }
    }

    public d() {
        this(new e(), new w2.a());
    }

    public void b(Context context, String str, String str2) {
        File c10 = c(context);
        File d10 = d(context, str, str2);
        File[] listFiles = c10.listFiles(new b(this.f25720b.a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f25722d || !file.getAbsolutePath().equals(d10.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String a10 = this.f25720b.a(str);
        if (f.a(str2)) {
            return new File(c(context), a10);
        }
        File c10 = c(context);
        return new File(c10, a10 + "." + str2);
    }

    public void e(Context context, String str) {
        g(context, str, null, null);
    }

    public void f(Context context, String str, String str2) {
        g(context, str, str2, null);
    }

    public void g(Context context, String str, String str2, c.AbstractC0236c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!f.a(str)) {
            k("Beginning load of %s...", str);
            if (cVar == null) {
                h(context, str, str2);
            } else {
                new Thread(new a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    public final void h(Context context, String str, String str2) {
        Throwable th;
        if (!this.f25719a.contains(str) || this.f25722d) {
            try {
                this.f25720b.b(str);
                this.f25719a.add(str);
                k("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e10) {
                k("Loading the library normally failed: %s", Log.getStackTraceString(e10));
                k("%s (%s) was not loaded normally, re-linking...", str, str2);
                File d10 = d(context, str, str2);
                if (!d10.exists() || this.f25722d) {
                    if (this.f25722d) {
                        k("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    b(context, str, str2);
                    this.f25721c.a(context, this.f25720b.d(), this.f25720b.a(str), d10, this);
                }
                try {
                    if (this.f25723e) {
                        i iVar = null;
                        try {
                            i iVar2 = new i(d10);
                            try {
                                List<String> y02 = iVar2.y0();
                                iVar2.close();
                                for (String str3 : y02) {
                                    e(context, this.f25720b.c(str3));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                iVar = iVar2;
                                iVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (IOException unused) {
                }
                this.f25720b.e(d10.getAbsolutePath());
                this.f25719a.add(str);
                k("%s (%s) was re-linked!", str, str2);
            }
        } else {
            k("%s already loaded previously!", str);
        }
    }

    public d i(c.d dVar) {
        this.f25724f = dVar;
        return this;
    }

    public void j(String str) {
        c.d dVar = this.f25724f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void k(String str, Object... objArr) {
        j(String.format(Locale.US, str, objArr));
    }

    public d l() {
        this.f25723e = true;
        return this;
    }

    public d(c.b bVar, c.a aVar) {
        this.f25719a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f25720b = bVar;
            this.f25721c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }
}
