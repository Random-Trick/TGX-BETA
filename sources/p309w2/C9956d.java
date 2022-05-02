package p309w2;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p309w2.C9951c;
import p324x2.C10083i;

public class C9956d {
    public final Set<String> f32348a;
    public final C9951c.AbstractC9953b f32349b;
    public final C9951c.AbstractC9952a f32350c;
    public boolean f32351d;
    public boolean f32352e;
    public C9951c.AbstractC9955d f32353f;

    public class RunnableC9957a implements Runnable {
        public final C9951c.AbstractC9954c f32354M;
        public final Context f32356a;
        public final String f32357b;
        public final String f32358c;

        public RunnableC9957a(Context context, String str, String str2, C9951c.AbstractC9954c cVar) {
            this.f32356a = context;
            this.f32357b = str;
            this.f32358c = str2;
            this.f32354M = cVar;
        }

        @Override
        public void run() {
            try {
                C9956d.this.m6423h(this.f32356a, this.f32357b, this.f32358c);
                this.f32354M.m6433a();
            } catch (UnsatisfiedLinkError e) {
                this.f32354M.m6432b(e);
            } catch (C9950b e2) {
                this.f32354M.m6432b(e2);
            }
        }
    }

    public class C9958b implements FilenameFilter {
        public final String f32359a;

        public C9958b(String str) {
            this.f32359a = str;
        }

        @Override
        public boolean accept(File file, String str) {
            return str.startsWith(this.f32359a);
        }
    }

    public C9956d() {
        this(new C9959e(), new C9948a());
    }

    public void m6429b(Context context, String str, String str2) {
        File c = m6428c(context);
        File d = m6427d(context, str, str2);
        File[] listFiles = c.listFiles(new C9958b(this.f32349b.mo6418a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f32351d || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public File m6428c(Context context) {
        return context.getDir("lib", 0);
    }

    public File m6427d(Context context, String str, String str2) {
        String a = this.f32349b.mo6418a(str);
        if (C9960f.m6413a(str2)) {
            return new File(m6428c(context), a);
        }
        File c = m6428c(context);
        return new File(c, a + "." + str2);
    }

    public void m6426e(Context context, String str) {
        m6424g(context, str, null, null);
    }

    public void m6425f(Context context, String str, String str2) {
        m6424g(context, str, str2, null);
    }

    public void m6424g(Context context, String str, String str2, C9951c.AbstractC9954c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C9960f.m6413a(str)) {
            m6420k("Beginning load of %s...", str);
            if (cVar == null) {
                m6423h(context, str, str2);
            } else {
                new Thread(new RunnableC9957a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    public final void m6423h(Context context, String str, String str2) {
        Throwable th;
        if (!this.f32348a.contains(str) || this.f32351d) {
            try {
                this.f32349b.mo6417b(str);
                this.f32348a.add(str);
                m6420k("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                m6420k("Loading the library normally failed: %s", Log.getStackTraceString(e));
                m6420k("%s (%s) was not loaded normally, re-linking...", str, str2);
                File d = m6427d(context, str, str2);
                if (!d.exists() || this.f32351d) {
                    if (this.f32351d) {
                        m6420k("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    m6429b(context, str, str2);
                    this.f32350c.mo6434a(context, this.f32349b.mo6415d(), this.f32349b.mo6418a(str), d, this);
                }
                try {
                    if (this.f32352e) {
                        C10083i iVar = null;
                        try {
                            C10083i iVar2 = new C10083i(d);
                            try {
                                List<String> y0 = iVar2.m6059y0();
                                iVar2.close();
                                for (String str3 : y0) {
                                    m6426e(context, this.f32349b.mo6416c(str3));
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
                this.f32349b.mo6414e(d.getAbsolutePath());
                this.f32348a.add(str);
                m6420k("%s (%s) was re-linked!", str, str2);
            }
        } else {
            m6420k("%s already loaded previously!", str);
        }
    }

    public C9956d m6422i(C9951c.AbstractC9955d dVar) {
        this.f32353f = dVar;
        return this;
    }

    public void m6421j(String str) {
        C9951c.AbstractC9955d dVar = this.f32353f;
        if (dVar != null) {
            dVar.mo6431a(str);
        }
    }

    public void m6420k(String str, Object... objArr) {
        m6421j(String.format(Locale.US, str, objArr));
    }

    public C9956d m6419l() {
        this.f32352e = true;
        return this;
    }

    public C9956d(C9951c.AbstractC9953b bVar, C9951c.AbstractC9952a aVar) {
        this.f32348a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f32349b = bVar;
            this.f32350c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }
}
