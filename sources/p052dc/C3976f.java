package p052dc;

import cc.C2068b;
import cc.C2083h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p052dc.C3987j;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public class C3976f implements AbstractC3989k {
    public static final C3987j.AbstractC3988a f13348f;
    public static final C3977a f13349g;
    public final Method f13350a;
    public final Method f13351b;
    public final Method f13352c;
    public final Method f13353d;
    public final Class<? super SSLSocket> f13354e;

    public static final class C3977a {

        public static final class C3978a implements C3987j.AbstractC3988a {
            public final String f13355a;

            public C3978a(String str) {
                this.f13355a = str;
            }

            @Override
            public boolean mo29423a(SSLSocket sSLSocket) {
                C8298k.m12933e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C8298k.m12934d(name, "sslSocket.javaClass.name");
                return C11451n.m621x(name, this.f13355a + '.', false, 2, null);
            }

            @Override
            public AbstractC3989k mo29422b(SSLSocket sSLSocket) {
                C8298k.m12933e(sSLSocket, "sslSocket");
                return C3976f.f13349g.m29434b(sSLSocket.getClass());
            }
        }

        public C3977a() {
        }

        public final C3976f m29434b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!C8298k.m12936b(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C8298k.m12935c(cls2);
            return new C3976f(cls2);
        }

        public final C3987j.AbstractC3988a m29433c(String str) {
            C8298k.m12933e(str, "packageName");
            return new C3978a(str);
        }

        public final C3987j.AbstractC3988a m29432d() {
            return C3976f.f13348f;
        }

        public C3977a(C8294g gVar) {
            this();
        }
    }

    static {
        C3977a aVar = new C3977a(null);
        f13349g = aVar;
        f13348f = aVar.m29433c("com.google.android.gms.org.conscrypt");
    }

    public C3976f(Class<? super SSLSocket> cls) {
        C8298k.m12933e(cls, "sslSocketClass");
        this.f13354e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C8298k.m12934d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f13350a = declaredMethod;
        this.f13351b = cls.getMethod("setHostname", String.class);
        this.f13352c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f13353d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override
    public boolean mo29421a(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        return this.f13354e.isInstance(sSLSocket);
    }

    @Override
    public boolean mo29420b() {
        return C2068b.f7298g.m35715b();
    }

    @Override
    public String mo29419c(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        if (!mo29421a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f13352c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C8298k.m12934d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (C8298k.m12936b(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override
    public void mo29418d(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        C8298k.m12933e(list, "protocols");
        if (mo29421a(sSLSocket)) {
            try {
                this.f13350a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f13351b.invoke(sSLSocket, str);
                }
                this.f13353d.invoke(sSLSocket, C2083h.f7326c.m35681c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
