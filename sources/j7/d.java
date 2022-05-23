package j7;

import h7.c;
import h7.e;
import h7.f;
import h7.g;
import h7.h;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class d implements i7.b<d> {
    public static final e<Object> f15110e = j7.a.f15107a;
    public static final g<String> f15111f = c.f15109a;
    public static final g<Boolean> f15112g = j7.b.f15108a;
    public static final b f15113h = new b(null);
    public final Map<Class<?>, e<?>> f15114a = new HashMap();
    public final Map<Class<?>, g<?>> f15115b = new HashMap();
    public e<Object> f15116c = f15110e;
    public boolean f15117d = false;

    public class a implements h7.a {
        public a() {
        }

        @Override
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f15114a, d.this.f15115b, d.this.f15116c, d.this.f15117d);
            eVar.h(obj, false);
            eVar.p();
        }

        @Override
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g<Date> {
        public static final DateFormat f15119a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f15119a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public b(a aVar) {
            this();
        }

        public void a(Date date, h hVar) {
            hVar.d(f15119a.format(date));
        }
    }

    public d() {
        p(String.class, f15111f);
        p(Boolean.class, f15112g);
        p(Date.class, f15113h);
    }

    public static void l(Object obj, f fVar) {
        throw new c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static void n(Boolean bool, h hVar) {
        hVar.e(bool.booleanValue());
    }

    public h7.a i() {
        return new a();
    }

    public d j(i7.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f15117d = z10;
        return this;
    }

    public <T> d a(Class<T> cls, e<? super T> eVar) {
        this.f15114a.put(cls, eVar);
        this.f15115b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, g<? super T> gVar) {
        this.f15115b.put(cls, gVar);
        this.f15114a.remove(cls);
        return this;
    }
}
