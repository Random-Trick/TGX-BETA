package j7;

import android.util.Base64;
import android.util.JsonWriter;
import h7.c;
import h7.d;
import h7.f;
import h7.g;
import h7.h;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public final class e implements f, h {
    public e f15120a = null;
    public boolean f15121b = true;
    public final JsonWriter f15122c;
    public final Map<Class<?>, h7.e<?>> f15123d;
    public final Map<Class<?>, g<?>> f15124e;
    public final h7.e<Object> f15125f;
    public final boolean f15126g;

    public e(Writer writer, Map<Class<?>, h7.e<?>> map, Map<Class<?>, g<?>> map2, h7.e<Object> eVar, boolean z10) {
        this.f15122c = new JsonWriter(writer);
        this.f15123d = map;
        this.f15124e = map2;
        this.f15125f = eVar;
        this.f15126g = z10;
    }

    @Override
    public f a(d dVar, Object obj) {
        return l(dVar.b(), obj);
    }

    @Override
    public f b(d dVar, long j10) {
        return k(dVar.b(), j10);
    }

    @Override
    public f c(d dVar, int i10) {
        return j(dVar.b(), i10);
    }

    public e f(int i10) {
        t();
        this.f15122c.value(i10);
        return this;
    }

    public e g(long j10) {
        t();
        this.f15122c.value(j10);
        return this;
    }

    public e h(Object obj, boolean z10) {
        int[] iArr;
        int i10 = 0;
        if (z10 && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new c(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f15122c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f15122c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return n((byte[]) obj);
            }
            this.f15122c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f15122c.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    g(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f15122c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f15122c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    h(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    h(obj2, false);
                }
            }
            this.f15122c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f15122c.beginArray();
            for (Object obj3 : (Collection) obj) {
                h(obj3, false);
            }
            this.f15122c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f15122c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    l((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f15122c.endObject();
            return this;
        } else {
            h7.e<?> eVar = this.f15123d.get(obj.getClass());
            if (eVar != null) {
                return q(eVar, obj, z10);
            }
            g<?> gVar = this.f15124e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return q(this.f15125f, obj, z10);
            } else {
                d(((Enum) obj).name());
                return this;
            }
        }
    }

    public e d(String str) {
        t();
        this.f15122c.value(str);
        return this;
    }

    public e j(String str, int i10) {
        t();
        this.f15122c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) {
        t();
        this.f15122c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        if (this.f15126g) {
            return s(str, obj);
        }
        return r(str, obj);
    }

    public e e(boolean z10) {
        t();
        this.f15122c.value(z10);
        return this;
    }

    public e n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.f15122c.nullValue();
        } else {
            this.f15122c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void p() {
        t();
        this.f15122c.flush();
    }

    public e q(h7.e<Object> eVar, Object obj, boolean z10) {
        if (!z10) {
            this.f15122c.beginObject();
        }
        eVar.a(obj, this);
        if (!z10) {
            this.f15122c.endObject();
        }
        return this;
    }

    public final e r(String str, Object obj) {
        t();
        this.f15122c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f15122c.nullValue();
        return this;
    }

    public final e s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.f15122c.name(str);
        return h(obj, false);
    }

    public final void t() {
        if (this.f15121b) {
            e eVar = this.f15120a;
            if (eVar != null) {
                eVar.t();
                this.f15120a.f15121b = false;
                this.f15120a = null;
                this.f15122c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
