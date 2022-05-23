package ec;

import ab.n;
import dc.b;
import dc.h;
import ec.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ra.g;
import ra.k;
import ub.a0;

public class f implements k {
    public static final j.a f11505f;
    public static final a f11506g;
    public final Method f11507a;
    public final Method f11508b;
    public final Method f11509c;
    public final Method f11510d;
    public final Class<? super SSLSocket> f11511e;

    public static final class a {

        public static final class C0097a implements j.a {
            public final String f11512a;

            public C0097a(String str) {
                this.f11512a = str;
            }

            @Override
            public boolean a(SSLSocket sSLSocket) {
                k.e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                k.d(name, "sslSocket.javaClass.name");
                return n.x(name, this.f11512a + '.', false, 2, null);
            }

            @Override
            public k b(SSLSocket sSLSocket) {
                k.e(sSLSocket, "sslSocket");
                return f.f11506g.b(sSLSocket.getClass());
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!k.b(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            k.c(cls2);
            return new f(cls2);
        }

        public final j.a c(String str) {
            k.e(str, "packageName");
            return new C0097a(str);
        }

        public final j.a d() {
            return f.f11505f;
        }
    }

    static {
        a aVar = new a(null);
        f11506g = aVar;
        f11505f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) {
        k.e(cls, "sslSocketClass");
        this.f11511e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        k.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f11507a = declaredMethod;
        this.f11508b = cls.getMethod("setHostname", String.class);
        this.f11509c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f11510d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override
    public boolean a(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return this.f11511e.isInstance(sSLSocket);
    }

    @Override
    public boolean b() {
        return b.f7305g.b();
    }

    @Override
    public String c(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f11509c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            k.d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (k.b(e11.getMessage(), "ssl == null")) {
                return null;
            }
            throw e11;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f11507a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f11508b.invoke(sSLSocket, str);
                }
                this.f11510d.invoke(sSLSocket, h.f7333c.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
