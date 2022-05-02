package cc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2076e extends C2083h {
    public static final C2078b f7310i = new C2078b(null);
    public final Method f7311d;
    public final Method f7312e;
    public final Method f7313f;
    public final Class<?> f7314g;
    public final Class<?> f7315h;

    public static final class C2077a implements InvocationHandler {
        public boolean f7316a;
        public String f7317b;
        public final List<String> f7318c;

        public C2077a(List<String> list) {
            C8298k.m12933e(list, "protocols");
            this.f7318c = list;
        }

        public final String m35707a() {
            return this.f7317b;
        }

        public final boolean m35706b() {
            return this.f7316a;
        }

        @Override
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C8298k.m12933e(obj, "proxy");
            C8298k.m12933e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C8298k.m12936b(name, "supports") && C8298k.m12936b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C8298k.m12936b(name, "unsupported") || !C8298k.m12936b(Void.TYPE, returnType)) {
                if (C8298k.m12936b(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f7318c;
                    }
                }
                if ((C8298k.m12936b(name, "selectProtocol") || C8298k.m12936b(name, "select")) && C8298k.m12936b(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f7318c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f7317b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f7318c.get(0);
                    this.f7317b = str2;
                    return str2;
                } else if ((!C8298k.m12936b(name, "protocolSelected") && !C8298k.m12936b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f7317b = (String) obj4;
                    return null;
                }
            } else {
                this.f7316a = true;
                return null;
            }
        }
    }

    public static final class C2078b {
        public C2078b() {
        }

        public final C2083h m35705a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C8298k.m12934d(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                C8298k.m12934d(method, "putMethod");
                C8298k.m12934d(method2, "getMethod");
                C8298k.m12934d(method3, "removeMethod");
                C8298k.m12934d(cls3, "clientProviderClass");
                C8298k.m12934d(cls4, "serverProviderClass");
                return new C2076e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public C2078b(C8294g gVar) {
            this();
        }
    }

    public C2076e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C8298k.m12933e(method, "putMethod");
        C8298k.m12933e(method2, "getMethod");
        C8298k.m12933e(method3, "removeMethod");
        C8298k.m12933e(cls, "clientProviderClass");
        C8298k.m12933e(cls2, "serverProviderClass");
        this.f7311d = method;
        this.f7312e = method2;
        this.f7313f = method3;
        this.f7314g = cls;
        this.f7315h = cls2;
    }

    @Override
    public void mo35697b(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        try {
            this.f7313f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override
    public void mo35694e(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        C8298k.m12933e(list, "protocols");
        try {
            this.f7311d.invoke(null, sSLSocket, Proxy.newProxyInstance(C2083h.class.getClassLoader(), new Class[]{this.f7314g, this.f7315h}, new C2077a(C2083h.f7326c.m35682b(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override
    public String mo35692g(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f7312e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                C2077a aVar = (C2077a) invocationHandler;
                if (!aVar.m35706b() && aVar.m35707a() == null) {
                    C2083h.m35688k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.m35706b()) {
                    return null;
                } else {
                    return aVar.m35707a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
