package d6;

import h7.c;
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

public final class g2 implements f {
    public static final d f6511g;
    public static final d f6512h;
    public OutputStream f6514a;
    public final Map<Class<?>, e<?>> f6515b;
    public final Map<Class<?>, g<?>> f6516c;
    public final e<Object> f6517d;
    public final k2 f6518e = new k2(this);
    public static final Charset f6510f = Charset.forName("UTF-8");
    public static final e<Map.Entry<Object, Object>> f6513i = f2.f6487a;

    static {
        d.b a10 = d.a("key");
        z1 z1Var = new z1();
        z1Var.a(1);
        f6511g = a10.b(z1Var.b()).a();
        d.b a11 = d.a("value");
        z1 z1Var2 = new z1();
        z1Var2.a(2);
        f6512h = a11.b(z1Var2.b()).a();
    }

    public g2(OutputStream outputStream, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f6514a = outputStream;
        this.f6515b = map;
        this.f6516c = map2;
        this.f6517d = eVar;
    }

    public static void j(Map.Entry entry, f fVar) {
        fVar.a(f6511g, entry.getKey());
        fVar.a(f6512h, entry.getValue());
    }

    public static int k(d dVar) {
        e2 e2Var = (e2) dVar.c(e2.class);
        if (e2Var != null) {
            return e2Var.zza();
        }
        throw new c("Field has no @Protobuf config");
    }

    public static e2 m(d dVar) {
        e2 e2Var = (e2) dVar.c(e2.class);
        if (e2Var != null) {
            return e2Var;
        }
        throw new c("Field has no @Protobuf config");
    }

    public static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public final f a(d dVar, Object obj) {
        f(dVar, obj, true);
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

    public final f d(d dVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((k(dVar) << 3) | 1);
        this.f6514a.write(p(8).putDouble(d10).array());
        return this;
    }

    public final f e(d dVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(dVar) << 3) | 5);
        this.f6514a.write(p(4).putFloat(f10).array());
        return this;
    }

    public final f f(d dVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            q((k(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6510f);
            q(bytes.length);
            this.f6514a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                f(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                n(f6513i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            d(dVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            e(dVar, ((Float) obj).floatValue(), z10);
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
            q((k(dVar) << 3) | 2);
            q(bArr.length);
            this.f6514a.write(bArr);
            return this;
        } else {
            e<?> eVar = this.f6515b.get(obj.getClass());
            if (eVar != null) {
                n(eVar, dVar, obj, z10);
                return this;
            }
            g<?> gVar = this.f6516c.get(obj.getClass());
            if (gVar != null) {
                o(gVar, dVar, obj, z10);
                return this;
            } else if (obj instanceof b2) {
                g(dVar, ((b2) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                n(this.f6517d, dVar, obj, z10);
                return this;
            }
        }
    }

    public final g2 g(d dVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        e2 m10 = m(dVar);
        d2 d2Var = d2.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            q(i10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            q((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 5);
            this.f6514a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    public final g2 h(d dVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        e2 m10 = m(dVar);
        d2 d2Var = d2.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            r(j10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            r((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 1);
            this.f6514a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    public final g2 i(Object obj) {
        if (obj == null) {
            return this;
        }
        e<?> eVar = this.f6515b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new c(sb2.toString());
    }

    public final <T> long l(e<T> eVar, T t10) {
        a2 a2Var = new a2();
        try {
            OutputStream outputStream = this.f6514a;
            this.f6514a = a2Var;
            eVar.a(t10, this);
            this.f6514a = outputStream;
            long m10 = a2Var.m();
            a2Var.close();
            return m10;
        } catch (Throwable th) {
            try {
                a2Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final <T> g2 n(e<T> eVar, d dVar, T t10, boolean z10) {
        long l10 = l(eVar, t10);
        if (z10 && l10 == 0) {
            return this;
        }
        q((k(dVar) << 3) | 2);
        r(l10);
        eVar.a(t10, this);
        return this;
    }

    public final <T> g2 o(g<T> gVar, d dVar, T t10, boolean z10) {
        this.f6518e.a(dVar, z10);
        gVar.a(t10, this.f6518e);
        return this;
    }

    public final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f6514a.write((i10 & 127) | Log.TAG_YOUTUBE);
            i10 >>>= 7;
        }
        this.f6514a.write(i10 & 127);
    }

    public final void r(long j10) {
        while (((-128) & j10) != 0) {
            this.f6514a.write((((int) j10) & 127) | Log.TAG_YOUTUBE);
            j10 >>>= 7;
        }
        this.f6514a.write(((int) j10) & 127);
    }
}
