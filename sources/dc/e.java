package dc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import ra.g;
import ra.k;
import ub.a0;

public final class e extends h {
    public static final b f7317i = new b(null);
    public final Method f7318d;
    public final Method f7319e;
    public final Method f7320f;
    public final Class<?> f7321g;
    public final Class<?> f7322h;

    public static final class a implements InvocationHandler {
        public boolean f7323a;
        public String f7324b;
        public final List<String> f7325c;

        public a(List<String> list) {
            k.e(list, "protocols");
            this.f7325c = list;
        }

        public final String a() {
            return this.f7324b;
        }

        public final boolean b() {
            return this.f7323a;
        }

        @Override
        public Object invoke(Object obj, Method method, Object[] objArr) {
            k.e(obj, "proxy");
            k.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.b(name, "supports") && k.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!k.b(name, "unsupported") || !k.b(Void.TYPE, returnType)) {
                if (k.b(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f7325c;
                    }
                }
                if ((k.b(name, "selectProtocol") || k.b(name, "select")) && k.b(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj3 = list.get(i10);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f7325c.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f7324b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f7325c.get(0);
                    this.f7324b = str2;
                    return str2;
                } else if ((!k.b(name, "protocolSelected") && !k.b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f7324b = (String) obj4;
                    return null;
                }
            } else {
                this.f7323a = true;
                return null;
            }
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                k.d(property, "jvmVersion");
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
                k.d(method, "putMethod");
                k.d(method2, "getMethod");
                k.d(method3, "removeMethod");
                k.d(cls3, "clientProviderClass");
                k.d(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        k.e(method, "putMethod");
        k.e(method2, "getMethod");
        k.e(method3, "removeMethod");
        k.e(cls, "clientProviderClass");
        k.e(cls2, "serverProviderClass");
        this.f7318d = method;
        this.f7319e = method2;
        this.f7320f = method3;
        this.f7321g = cls;
        this.f7322h = cls2;
    }

    @Override
    public void b(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        try {
            this.f7320f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        try {
            this.f7318d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f7321g, this.f7322h}, new a(h.f7333c.b(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f7319e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    h.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
