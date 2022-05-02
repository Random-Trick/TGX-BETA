package p120i7;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p092g7.AbstractC4508a;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.AbstractC4516g;
import p092g7.AbstractC4517h;
import p092g7.C4510c;
import p104h7.AbstractC5020a;
import p104h7.AbstractC5021b;
import p126j$.util.DesugarTimeZone;

public final class C5258d implements AbstractC5021b<C5258d> {
    public static final AbstractC4514e<Object> f17419e = C5255a.f17416a;
    public static final AbstractC4516g<String> f17420f = C5257c.f17418a;
    public static final AbstractC4516g<Boolean> f17421g = C5256b.f17417a;
    public static final C5260b f17422h = new C5260b(null);
    public final Map<Class<?>, AbstractC4514e<?>> f17423a = new HashMap();
    public final Map<Class<?>, AbstractC4516g<?>> f17424b = new HashMap();
    public AbstractC4514e<Object> f17425c = f17419e;
    public boolean f17426d = false;

    public class C5259a implements AbstractC4508a {
        public C5259a() {
        }

        @Override
        public void mo23512a(Object obj, Writer writer) {
            C5261e eVar = new C5261e(writer, C5258d.this.f17423a, C5258d.this.f17424b, C5258d.this.f17425c, C5258d.this.f17426d);
            eVar.m23507h(obj, false);
            eVar.m23499p();
        }

        @Override
        public String mo23511b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo23512a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class C5260b implements AbstractC4516g<Date> {
        public static final DateFormat f17428a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f17428a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public C5260b() {
        }

        public void mo5165a(Date date, AbstractC4517h hVar) {
            hVar.mo5167d(f17428a.format(date));
        }

        public C5260b(C5259a aVar) {
            this();
        }
    }

    public C5258d() {
        m23513p(String.class, f17420f);
        m23513p(Boolean.class, f17421g);
        m23513p(Date.class, f17422h);
    }

    public static void m23517l(Object obj, AbstractC4515f fVar) {
        throw new C4510c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static void m23515n(Boolean bool, AbstractC4517h hVar) {
        hVar.mo5166e(bool.booleanValue());
    }

    public AbstractC4508a m23520i() {
        return new C5259a();
    }

    public C5258d m23519j(AbstractC5020a aVar) {
        aVar.mo5164a(this);
        return this;
    }

    public C5258d m23518k(boolean z) {
        this.f17426d = z;
        return this;
    }

    public <T> C5258d mo5172a(Class<T> cls, AbstractC4514e<? super T> eVar) {
        this.f17423a.put(cls, eVar);
        this.f17424b.remove(cls);
        return this;
    }

    public <T> C5258d m23513p(Class<T> cls, AbstractC4516g<? super T> gVar) {
        this.f17424b.put(cls, gVar);
        this.f17423a.remove(cls);
        return this;
    }
}
