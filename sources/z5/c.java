package z5;

import h7.d;
import h7.e;
import h7.f;
import h7.g;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import org.thunderdog.challegram.Log;

public final class c implements f {
    public static final d f26961g;
    public static final d f26962h;
    public OutputStream f26964a;
    public final Map<Class<?>, e<?>> f26965b;
    public final Map<Class<?>, g<?>> f26966c;
    public final e<Object> f26967d;
    public final g f26968e = new g(this);
    public static final Charset f26960f = Charset.forName("UTF-8");
    public static final e<Map.Entry<Object, Object>> f26963i = b.f26957a;

    static {
        d.b a10 = d.a("key");
        b0 b0Var = new b0();
        b0Var.a(1);
        f26961g = a10.b(b0Var.b()).a();
        d.b a11 = d.a("value");
        b0 b0Var2 = new b0();
        b0Var2.a(2);
        f26962h = a11.b(b0Var2.b()).a();
    }

    public c(OutputStream outputStream, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f26964a = outputStream;
        this.f26965b = map;
        this.f26966c = map2;
        this.f26967d = eVar;
    }

    public static final void j(Map.Entry entry, f fVar) {
        fVar.a(f26961g, entry.getKey());
        fVar.a(f26962h, entry.getValue());
    }

    public static ByteBuffer n(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int o(d dVar) {
        f0 f0Var = (f0) dVar.c(f0.class);
        if (f0Var != null) {
            return f0Var.zza();
        }
        throw new h7.c("Field has no @Protobuf config");
    }

    public static f0 p(d dVar) {
        f0 f0Var = (f0) dVar.c(f0.class);
        if (f0Var != null) {
            return f0Var;
        }
        throw new h7.c("Field has no @Protobuf config");
    }

    @Override
    public final f a(d dVar, Object obj) {
        d(dVar, obj, true);
        return this;
    }

    @Override
    public final f b(d dVar, long j10) {
        h(dVar, j10, true);
        return this;
    }

    @Override
    public final f c(d dVar, int i10) {
        g(dVar, i10, true);
        return this;
    }

    public final f d(d dVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            q((o(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f26960f);
            q(bytes.length);
            this.f26964a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                d(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                k(f26963i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            e(dVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            f(dVar, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            h(dVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            g(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            q((o(dVar) << 3) | 2);
            q(bArr.length);
            this.f26964a.write(bArr);
            return this;
        } else {
            e<?> eVar = this.f26965b.get(obj.getClass());
            if (eVar != null) {
                k(eVar, dVar, obj, z10);
                return this;
            }
            g<?> gVar = this.f26966c.get(obj.getClass());
            if (gVar != null) {
                m(gVar, dVar, obj, z10);
                return this;
            } else if (obj instanceof d0) {
                g(dVar, ((d0) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                k(this.f26967d, dVar, obj, z10);
                return this;
            }
        }
    }

    public final f e(d dVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((o(dVar) << 3) | 1);
        this.f26964a.write(n(8).putDouble(d10).array());
        return this;
    }

    public final f f(d dVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((o(dVar) << 3) | 5);
        this.f26964a.write(n(4).putFloat(f10).array());
        return this;
    }

    public final c g(d dVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        f0 p10 = p(dVar);
        e0 e0Var = e0.DEFAULT;
        int ordinal = p10.zzb().ordinal();
        if (ordinal == 0) {
            q(p10.zza() << 3);
            q(i10);
        } else if (ordinal == 1) {
            q(p10.zza() << 3);
            q((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            q((p10.zza() << 3) | 5);
            this.f26964a.write(n(4).putInt(i10).array());
        }
        return this;
    }

    public final c h(d dVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        f0 p10 = p(dVar);
        e0 e0Var = e0.DEFAULT;
        int ordinal = p10.zzb().ordinal();
        if (ordinal == 0) {
            q(p10.zza() << 3);
            r(j10);
        } else if (ordinal == 1) {
            q(p10.zza() << 3);
            r((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            q((p10.zza() << 3) | 1);
            this.f26964a.write(n(8).putLong(j10).array());
        }
        return this;
    }

    public final c i(Object obj) {
        if (obj == null) {
            return this;
        }
        e<?> eVar = this.f26965b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new h7.c(sb2.toString());
    }

    public final <T> c k(e<T> eVar, d dVar, T t10, boolean z10) {
        long l10 = l(eVar, t10);
        if (z10 && l10 == 0) {
            return this;
        }
        q((o(dVar) << 3) | 2);
        r(l10);
        eVar.a(t10, this);
        return this;
    }

    public final <T> long l(e<T> eVar, T t10) {
        c0 c0Var = new c0();
        try {
            OutputStream outputStream = this.f26964a;
            this.f26964a = c0Var;
            eVar.a(t10, this);
            this.f26964a = outputStream;
            long m10 = c0Var.m();
            c0Var.close();
            return m10;
        } catch (Throwable th) {
            try {
                c0Var.close();
            } catch (Throwable th2) {
                z.a(th, th2);
            }
            throw th;
        }
    }

    public final <T> c m(g<T> gVar, d dVar, T t10, boolean z10) {
        this.f26968e.a(dVar, z10);
        gVar.a(t10, this.f26968e);
        return this;
    }

    public final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f26964a.write((i10 & 127) | Log.TAG_YOUTUBE);
            i10 >>>= 7;
        }
        this.f26964a.write(i10 & 127);
    }

    public final void r(long j10) {
        while (((-128) & j10) != 0) {
            this.f26964a.write((((int) j10) & 127) | Log.TAG_YOUTUBE);
            j10 >>>= 7;
        }
        this.f26964a.write(((int) j10) & 127);
    }
}
