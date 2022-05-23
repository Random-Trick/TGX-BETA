package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.thunderdog.challegram.Log;
import sun.misc.Unsafe;

public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, w {
    private static final int f14376g = (1 << (32 - 16)) - 1;
    private static final int f14377h = 32 - 16;
    static final int f14378i = Runtime.getRuntime().availableProcessors();
    private static final Unsafe f14379j;
    private static final long f14380k;
    private static final long f14381l;
    private static final long f14382m;
    private static final long f14383n;
    private static final long f14384o;
    private static final long f14385p;
    private static final int f14386q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient m[] f14387a;
    private volatile transient m[] f14388b;
    private volatile transient long baseCount;
    private volatile transient d[] f14389c;
    private volatile transient int cellsBusy;
    private transient j f14390d;
    private transient t f14391e;
    private transient f f14392f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c10 = x.c();
            f14379j = c10;
            f14380k = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f14381l = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f14382m = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            f14383n = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f14384o = c10.objectFieldOffset(d.class.getDeclaredField("value"));
            f14385p = c10.arrayBaseOffset(m[].class);
            int arrayIndexScale = c10.arrayIndexScale(m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f14386q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        if (i10 >= 0) {
            this.sizeCtl = i10 >= 536870912 ? Log.TAG_TDLIB_OPTIONS : o(i10 + (i10 >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i10 < i11 ? i11 : i10) / f10) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? Log.TAG_TDLIB_OPTIONS : o((int) j10);
    }

    private final void a(long r12, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(m[] mVarArr, int i10, m mVar) {
        return AbstractC0267a.a(f14379j, mVarArr, (i10 << f14386q) + f14385p, mVar);
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    public static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    private final void e(long r25, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.e(long, boolean):void");
    }

    private final m[] g() {
        while (true) {
            m[] mVarArr = this.f14387a;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f14379j.compareAndSwapInt(this, f14380k, i10, -1)) {
                try {
                    m[] mVarArr2 = this.f14387a;
                    if (mVarArr2 == null || mVarArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        m[] mVarArr3 = new m[i11];
                        this.f14387a = mVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        mVarArr2 = mVarArr3;
                    }
                    this.sizeCtl = i10;
                    return mVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i10;
                    throw th;
                }
            }
        }
    }

    static final int j(int i10) {
        return Integer.numberOfLeadingZeros(i10) | Log.TAG_ROUND;
    }

    static final void k(m[] mVarArr, int i10, m mVar) {
        f14379j.putObjectVolatile(mVarArr, (i10 << f14386q) + f14385p, mVar);
    }

    static final int l(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    public static final m n(m[] mVarArr, int i10) {
        return (m) f14379j.getObjectVolatile(mVarArr, (i10 << f14386q) + f14385p);
    }

    private static final int o(int i10) {
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        if (i16 < 0) {
            return 1;
        }
        return i16 >= 1073741824 ? Log.TAG_TDLIB_OPTIONS : 1 + i16;
    }

    private final void p(m[] mVarArr, m[] mVarArr2) {
        m[] mVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        m[] mVarArr4;
        int i10;
        int i11;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        h hVar;
        int i12;
        s sVar;
        s sVar2;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = mVarArr.length;
        int i13 = f14378i;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        int i15 = i14 < 16 ? 16 : i14;
        if (mVarArr2 == null) {
            try {
                m[] mVarArr5 = new m[length << 1];
                concurrentHashMap3.f14388b = mVarArr5;
                concurrentHashMap3.transferIndex = length;
                mVarArr3 = mVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            mVarArr3 = mVarArr2;
        }
        int length2 = mVarArr3.length;
        h hVar2 = new h(mVarArr3);
        m[] mVarArr6 = mVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i18 = i16 - 1;
                if (i18 >= i17 || z11) {
                    concurrentHashMap = concurrentHashMap4;
                    mVarArr4 = mVarArr6;
                    i17 = i17;
                    i16 = i18;
                } else {
                    int i19 = concurrentHashMap4.transferIndex;
                    if (i19 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i16 = -1;
                    } else {
                        Unsafe unsafe = f14379j;
                        long j10 = f14381l;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i17 = i17;
                        if (unsafe.compareAndSwapInt(this, j10, i19, i20)) {
                            i16 = i19 - 1;
                            i17 = i20;
                        } else {
                            mVarArr6 = mVarArr4;
                            i16 = i18;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                mVarArr6 = mVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z10 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                m[] mVarArr7 = mVarArr6;
                i17 = i17;
                s sVar3 = null;
                if (i16 < 0 || i16 >= length || (i12 = i16 + length) >= length2) {
                    i11 = i15;
                    i10 = length2;
                    hVar = hVar2;
                    if (z11) {
                        this.f14388b = null;
                        this.f14387a = mVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f14379j;
                    long j11 = f14380k;
                    int i21 = concurrentHashMap2.sizeCtl;
                    i16 = i16;
                    if (!unsafe2.compareAndSwapInt(this, j11, i21, i21 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                    } else if (i21 - 2 == (j(length) << f14377h)) {
                        i16 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                        z10 = true;
                        z11 = true;
                    } else {
                        return;
                    }
                } else {
                    m n10 = n(mVarArr7, i16);
                    if (n10 == null) {
                        z10 = b(mVarArr7, i16, hVar2);
                        i11 = i15;
                        i10 = length2;
                        hVar = hVar2;
                        mVarArr6 = mVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                    } else {
                        int i22 = n10.f14412a;
                        if (i22 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i11 = i15;
                            i10 = length2;
                            hVar = hVar2;
                            mVarArr6 = mVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            z10 = true;
                        } else {
                            synchronized (n10) {
                                if (n(mVarArr7, i16) == n10) {
                                    if (i22 >= 0) {
                                        int i23 = i22 & length;
                                        s sVar4 = n10;
                                        for (?? r62 = n10.f14415d; r62 != null; r62 = r62.f14415d) {
                                            int i24 = r62.f14412a & length;
                                            if (i24 != i23) {
                                                sVar4 = r62;
                                                i23 = i24;
                                            }
                                        }
                                        if (i23 == 0) {
                                            sVar = sVar4;
                                        } else {
                                            sVar = null;
                                            sVar3 = sVar4;
                                        }
                                        m mVar = n10;
                                        m mVar2 = sVar3;
                                        while (mVar != sVar4) {
                                            int i25 = mVar.f14412a;
                                            i15 = i15;
                                            Object obj = mVar.f14413b;
                                            length2 = length2;
                                            Object obj2 = mVar.f14414c;
                                            if ((i25 & length) == 0) {
                                                sVar2 = sVar4;
                                                sVar = new m(i25, obj, obj2, sVar);
                                            } else {
                                                sVar2 = sVar4;
                                                mVar2 = new m(i25, obj, obj2, mVar2);
                                            }
                                            mVar = mVar.f14415d;
                                            sVar4 = sVar2;
                                            mVar2 = mVar2;
                                        }
                                        i11 = i15;
                                        i10 = length2;
                                        k(mVarArr3, i16, sVar);
                                        k(mVarArr3, i12, mVar2);
                                        k(mVarArr7, i16, hVar2);
                                        hVar = hVar2;
                                    } else {
                                        i11 = i15;
                                        i10 = length2;
                                        if (n10 instanceof r) {
                                            r rVar = (r) n10;
                                            s sVar5 = null;
                                            s sVar6 = null;
                                            int i26 = 0;
                                            int i27 = 0;
                                            s sVar7 = null;
                                            for (m mVar3 = rVar.f14431f; mVar3 != null; mVar3 = mVar3.f14415d) {
                                                rVar = rVar;
                                                int i28 = mVar3.f14412a;
                                                hVar2 = hVar2;
                                                s sVar8 = new s(i28, mVar3.f14413b, mVar3.f14414c, null, null);
                                                if ((i28 & length) == 0) {
                                                    sVar8.f14436h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar3 = sVar8;
                                                    } else {
                                                        sVar6.f14415d = sVar8;
                                                    }
                                                    i26++;
                                                    sVar6 = sVar8;
                                                } else {
                                                    sVar8.f14436h = sVar5;
                                                    if (sVar5 == null) {
                                                        sVar7 = sVar8;
                                                    } else {
                                                        sVar5.f14415d = sVar8;
                                                    }
                                                    i27++;
                                                    sVar5 = sVar8;
                                                }
                                            }
                                            r rVar2 = rVar;
                                            hVar = hVar2;
                                            m s10 = i26 <= 6 ? s(sVar3) : i27 != 0 ? new r(sVar3) : rVar2;
                                            m s11 = i27 <= 6 ? s(sVar7) : i26 != 0 ? new r(sVar7) : rVar2;
                                            k(mVarArr3, i16, s10);
                                            k(mVarArr3, i12, s11);
                                            k(mVarArr, i16, hVar);
                                            mVarArr7 = mVarArr;
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    i11 = i15;
                                    i10 = length2;
                                }
                                hVar = hVar2;
                            }
                            concurrentHashMap4 = this;
                            mVarArr6 = mVarArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                }
                hVar2 = hVar;
                concurrentHashMap3 = concurrentHashMap2;
                i15 = i11;
                length2 = i10;
            }
        }
    }

    private final void q(m[] mVarArr, int i10) {
        int length = mVarArr.length;
        if (length < 64) {
            r(length << 1);
            return;
        }
        m n10 = n(mVarArr, i10);
        if (n10 != null && n10.f14412a >= 0) {
            synchronized (n10) {
                if (n(mVarArr, i10) == n10) {
                    s sVar = null;
                    m mVar = n10;
                    s sVar2 = null;
                    while (mVar != null) {
                        s sVar3 = new s(mVar.f14412a, mVar.f14413b, mVar.f14414c, null, null);
                        sVar3.f14436h = sVar2;
                        if (sVar2 == null) {
                            sVar = sVar3;
                        } else {
                            sVar2.f14415d = sVar3;
                        }
                        mVar = mVar.f14415d;
                        sVar2 = sVar3;
                    }
                    k(mVarArr, i10, new r(sVar));
                }
            }
        }
    }

    private final void r(int i10) {
        int length;
        m[] mVarArr;
        int o10 = i10 >= 536870912 ? Log.TAG_TDLIB_OPTIONS : o(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 >= 0) {
                m[] mVarArr2 = this.f14387a;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i12 = i11 > o10 ? i11 : o10;
                    if (f14379j.compareAndSwapInt(this, f14380k, i11, -1)) {
                        try {
                            if (this.f14387a == mVarArr2) {
                                this.f14387a = new m[i12];
                                i11 = i12 - (i12 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i11;
                        }
                    } else {
                        continue;
                    }
                } else if (o10 > i11 && length < 1073741824) {
                    if (mVarArr2 == this.f14387a) {
                        int j10 = j(length);
                        if (i11 < 0) {
                            if ((i11 >>> f14377h) == j10 && i11 != j10 + 1 && i11 != j10 + f14376g && (mVarArr = this.f14388b) != null && this.transferIndex > 0) {
                                if (f14379j.compareAndSwapInt(this, f14380k, i11, i11 + 1)) {
                                    p(mVarArr2, mVarArr);
                                }
                            } else {
                                return;
                            }
                        } else if (f14379j.compareAndSwapInt(this, f14380k, i11, (j10 << f14377h) + 2)) {
                            p(mVarArr2, null);
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        int i10;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            mVar = new m(l(readObject.hashCode()), readObject, readObject2, mVar);
            j12++;
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j12 >= 536870912) {
            i10 = Log.TAG_TDLIB_OPTIONS;
        } else {
            int i11 = (int) j12;
            i10 = o(i11 + (i11 >>> 1) + 1);
        }
        m[] mVarArr = new m[i10];
        int i12 = i10 - 1;
        while (mVar != null) {
            mVar = mVar.f14415d;
            int i13 = mVar.f14412a;
            int i14 = i13 & i12;
            m n10 = n(mVarArr, i14);
            if (n10 == null) {
                z10 = true;
            } else {
                Object obj2 = mVar.f14413b;
                if (n10.f14412a >= 0) {
                    int i15 = 0;
                    for (m mVar2 = n10; mVar2 != null; mVar2 = mVar2.f14415d) {
                        if (mVar2.f14412a == i13 && ((obj = mVar2.f14413b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    z10 = true;
                    if (z10 && i15 >= 8) {
                        j11++;
                        mVar.f14415d = n10;
                        m mVar3 = mVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (mVar3 != null) {
                            j11 = j11;
                            s sVar3 = new s(mVar3.f14412a, mVar3.f14413b, mVar3.f14414c, null, null);
                            sVar3.f14436h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f14415d = sVar3;
                            }
                            mVar3 = mVar3.f14415d;
                            sVar2 = sVar3;
                        }
                        k(mVarArr, i14, new r(sVar));
                    }
                } else if (((r) n10).f(i13, obj2, mVar.f14414c) == null) {
                    j11 += j10;
                }
                z10 = false;
            }
            if (z10) {
                j11++;
                mVar.f14415d = n10;
                k(mVarArr, i14, mVar);
            }
            j10 = 1;
        }
        this.f14387a = mVarArr;
        this.sizeCtl = i10 - (i10 >>> 2);
        this.baseCount = j11;
    }

    static m s(m mVar) {
        m mVar2 = null;
        m mVar3 = null;
        while (mVar != null) {
            m mVar4 = new m(mVar.f14412a, mVar.f14413b, mVar.f14414c, null);
            if (mVar3 == null) {
                mVar2 = mVar4;
            } else {
                mVar3.f14415d = mVar4;
            }
            mVar = mVar.f14415d;
            mVar3 = mVar4;
        }
        return mVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 1;
        int i11 = 0;
        while (i10 < 16) {
            i11++;
            i10 <<= 1;
        }
        int i12 = 32 - i11;
        int i13 = i10 - 1;
        o[] oVarArr = new o[16];
        for (int i14 = 0; i14 < 16; i14++) {
            oVarArr[i14] = new o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i12);
        objectOutputStream.putFields().put("segmentMask", i13);
        objectOutputStream.writeFields();
        m[] mVarArr = this.f14387a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 == null) {
                    break;
                }
                objectOutputStream.writeObject(b10.f14413b);
                objectOutputStream.writeObject(b10.f14414c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override
    public void clear() {
        m n10;
        m[] mVarArr = this.f14387a;
        long j10 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (mVarArr != null && i10 < mVarArr.length) {
                n10 = n(mVarArr, i10);
                if (n10 == null) {
                    i10++;
                } else {
                    int i11 = n10.f14412a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (n10) {
                        if (n(mVarArr, i10) == n10) {
                            for (m mVar = i11 >= 0 ? n10 : n10 instanceof r ? ((r) n10).f14431f : null; mVar != null; mVar = mVar.f14415d) {
                                j10--;
                            }
                            i10++;
                            k(mVarArr, i10, null);
                        }
                    }
                }
            }
            mVarArr = f(mVarArr, n10);
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    @Override
    public final Object compute(Object obj, BiFunction biFunction) {
        int i10;
        m mVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        m[] mVarArr = this.f14387a;
        int i11 = 0;
        Object obj4 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & l10;
                    m n10 = n(mVarArr, i13);
                    if (n10 == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (b(mVarArr, i13, nVar)) {
                                Object v10 = biFunction.v(obj, null);
                                if (v10 != null) {
                                    mVar = new m(l10, obj, v10, null);
                                    i10 = 1;
                                } else {
                                    i10 = i11;
                                    mVar = null;
                                }
                                k(mVarArr, i13, mVar);
                                i11 = i10;
                                obj4 = v10;
                                i12 = 1;
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                    } else {
                        int i14 = n10.f14412a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(mVarArr, i13) == n10) {
                                    if (i14 >= 0) {
                                        m mVar2 = null;
                                        m mVar3 = n10;
                                        int i15 = 1;
                                        while (true) {
                                            if (mVar3.f14412a != l10 || ((obj3 = mVar3.f14413b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                m mVar4 = mVar3.f14415d;
                                                if (mVar4 == null) {
                                                    Object v11 = biFunction.v(obj, null);
                                                    if (v11 != null) {
                                                        mVar3.f14415d = new m(l10, obj, v11, null);
                                                        obj2 = v11;
                                                        i11 = 1;
                                                    } else {
                                                        obj2 = v11;
                                                    }
                                                } else {
                                                    i15++;
                                                    mVar2 = mVar3;
                                                    mVar3 = mVar4;
                                                }
                                            }
                                        }
                                        obj2 = biFunction.v(obj, mVar3.f14414c);
                                        if (obj2 != null) {
                                            mVar3.f14414c = obj2;
                                        } else {
                                            m mVar5 = mVar3.f14415d;
                                            if (mVar2 != null) {
                                                mVar2.f14415d = mVar5;
                                            } else {
                                                k(mVarArr, i13, mVar5);
                                            }
                                            i11 = -1;
                                        }
                                        i12 = i15;
                                        obj4 = obj2;
                                    } else if (n10 instanceof r) {
                                        r rVar = (r) n10;
                                        s sVar = rVar.f14430e;
                                        s b10 = sVar != null ? sVar.b(l10, obj, null) : null;
                                        Object v12 = biFunction.v(obj, b10 == null ? null : b10.f14414c);
                                        if (v12 == null) {
                                            if (b10 != null) {
                                                if (rVar.g(b10)) {
                                                    k(mVarArr, i13, s(rVar.f14431f));
                                                }
                                                obj4 = v12;
                                                i11 = -1;
                                                i12 = 1;
                                            }
                                            obj4 = v12;
                                            i12 = 1;
                                        } else if (b10 != null) {
                                            b10.f14414c = v12;
                                            obj4 = v12;
                                            i12 = 1;
                                        } else {
                                            rVar.f(l10, obj, v12);
                                            obj4 = v12;
                                            i11 = 1;
                                            i12 = 1;
                                        }
                                    }
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    q(mVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (i11 != 0) {
            a(i11, i12);
        }
        return obj4;
    }

    @Override
    public final Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        s b10;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        m[] mVarArr = this.f14387a;
        Object obj5 = null;
        int i10 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & l10;
                    m n10 = n(mVarArr, i11);
                    boolean z10 = true;
                    if (n10 == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (b(mVarArr, i11, nVar)) {
                                Object a10 = function.a(obj);
                                k(mVarArr, i11, a10 != null ? new m(l10, obj, a10, null) : null);
                                obj5 = a10;
                                i10 = 1;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i12 = n10.f14412a;
                        if (i12 == -1) {
                            mVarArr = f(mVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(mVarArr, i11) == n10) {
                                    if (i12 >= 0) {
                                        m mVar = n10;
                                        int i13 = 1;
                                        while (true) {
                                            if (mVar.f14412a != l10 || ((obj4 = mVar.f14413b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                m mVar2 = mVar.f14415d;
                                                if (mVar2 == null) {
                                                    obj2 = function.a(obj);
                                                    if (obj2 != null) {
                                                        mVar.f14415d = new m(l10, obj, obj2, null);
                                                    } else {
                                                        obj3 = obj2;
                                                    }
                                                } else {
                                                    i13++;
                                                    mVar = mVar2;
                                                }
                                            }
                                        }
                                        obj3 = mVar.f14414c;
                                        obj2 = obj3;
                                        z10 = false;
                                        i10 = i13;
                                    } else if (n10 instanceof r) {
                                        i10 = 2;
                                        r rVar = (r) n10;
                                        s sVar = rVar.f14430e;
                                        if (sVar == null || (b10 = sVar.b(l10, obj, null)) == null) {
                                            obj2 = function.a(obj);
                                            if (obj2 != null) {
                                                rVar.f(l10, obj, obj2);
                                            } else {
                                                obj5 = obj2;
                                            }
                                        } else {
                                            obj5 = b10.f14414c;
                                        }
                                    }
                                    obj5 = obj2;
                                }
                                z10 = false;
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    q(mVarArr, i11);
                                }
                                if (!z10) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (obj5 != null) {
            a(1L, i10);
        }
        return obj5;
    }

    @Override
    public final Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override
    public final java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override
    public final Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        m[] mVarArr = this.f14387a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 == null) {
                    break;
                }
                Object obj2 = b10.f14414c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        f fVar = this.f14392f;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f14392f = fVar2;
        return fVar2;
    }

    @Override
    public final boolean equals(Object obj) {
        V value;
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        m[] mVarArr = this.f14387a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        while (true) {
            m b10 = qVar.b();
            if (b10 != null) {
                Object obj2 = b10.f14414c;
                Object obj3 = map.get(b10.f14413b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    final m[] f(m[] mVarArr, m mVar) {
        m[] mVarArr2;
        int i10;
        if (!(mVar instanceof h) || (mVarArr2 = ((h) mVar).f14405e) == null) {
            return this.f14387a;
        }
        int j10 = j(mVarArr.length);
        while (true) {
            if (mVarArr2 == this.f14388b && this.f14387a == mVarArr && (i10 = this.sizeCtl) < 0 && (i10 >>> f14377h) == j10 && i10 != j10 + 1 && i10 != f14376g + j10 && this.transferIndex > 0) {
                if (f14379j.compareAndSwapInt(this, f14380k, i10, i10 + 1)) {
                    p(mVarArr, mVarArr2);
                    break;
                }
            } else {
                break;
            }
        }
        return mVarArr2;
    }

    @Override
    public final void forEach(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        m[] mVarArr = this.f14387a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 != null) {
                    biConsumer.q(b10.f14413b, b10.f14414c);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public V get(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    public final java.lang.Object h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final int hashCode() {
        m[] mVarArr = this.f14387a;
        int i10 = 0;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 == null) {
                    break;
                }
                i10 += b10.f14414c.hashCode() ^ b10.f14413b.hashCode();
            }
        }
        return i10;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        m n10;
        Object obj4;
        s b10;
        m s10;
        Object obj5;
        int l10 = l(obj.hashCode());
        m[] mVarArr = this.f14387a;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (n10 = n(mVarArr, (i10 = (length - 1) & l10))) == null) {
                break;
            }
            int i11 = n10.f14412a;
            if (i11 == -1) {
                mVarArr = f(mVarArr, n10);
            } else {
                boolean z10 = false;
                synchronized (n10) {
                    if (n(mVarArr, i10) == n10) {
                        if (i11 >= 0) {
                            m mVar = null;
                            m mVar2 = n10;
                            while (true) {
                                if (mVar2.f14412a != l10 || ((obj5 = mVar2.f14413b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    m mVar3 = mVar2.f14415d;
                                    if (mVar3 == null) {
                                        break;
                                    }
                                    mVar = mVar2;
                                    mVar2 = mVar3;
                                }
                            }
                            obj4 = mVar2.f14414c;
                            if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                if (obj2 != null) {
                                    mVar2.f14414c = obj2;
                                } else if (mVar != null) {
                                    mVar.f14415d = mVar2.f14415d;
                                } else {
                                    s10 = mVar2.f14415d;
                                    k(mVarArr, i10, s10);
                                }
                                z10 = true;
                            }
                            obj4 = null;
                            z10 = true;
                        } else if (n10 instanceof r) {
                            r rVar = (r) n10;
                            s sVar = rVar.f14430e;
                            if (sVar != null && (b10 = sVar.b(l10, obj, null)) != null) {
                                obj4 = b10.f14414c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        b10.f14414c = obj2;
                                    } else if (rVar.g(b10)) {
                                        s10 = s(rVar.f14431f);
                                        k(mVarArr, i10, s10);
                                    }
                                    z10 = true;
                                }
                            }
                            obj4 = null;
                            z10 = true;
                        }
                    }
                    obj4 = null;
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override
    public Set<K> keySet() {
        j jVar = this.f14390d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f14390d = jVar2;
        return jVar2;
    }

    public final long m() {
        d[] dVarArr = this.f14389c;
        long j10 = this.baseCount;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j10 += dVar.value;
                }
            }
        }
        return j10;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        m[] mVarArr = this.f14387a;
        int i11 = 0;
        Object obj6 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & l10;
                    m n10 = n(mVarArr, i13);
                    i10 = 1;
                    if (n10 != null) {
                        int i14 = n10.f14412a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(mVarArr, i13) == n10) {
                                    if (i14 >= 0) {
                                        m mVar = null;
                                        m mVar2 = n10;
                                        int i15 = 1;
                                        while (true) {
                                            if (mVar2.f14412a != l10 || ((obj4 = mVar2.f14413b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                m mVar3 = mVar2.f14415d;
                                                if (mVar3 == null) {
                                                    mVar2.f14415d = new m(l10, obj, obj5, null);
                                                    obj3 = obj5;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i15++;
                                                mVar = mVar2;
                                                mVar2 = mVar3;
                                            }
                                        }
                                        obj3 = biFunction.v(mVar2.f14414c, obj5);
                                        if (obj3 != null) {
                                            mVar2.f14414c = obj3;
                                        } else {
                                            m mVar4 = mVar2.f14415d;
                                            if (mVar != null) {
                                                mVar.f14415d = mVar4;
                                            } else {
                                                k(mVarArr, i13, mVar4);
                                            }
                                            i12 = -1;
                                        }
                                        i11 = i15;
                                        obj6 = obj3;
                                    } else if (n10 instanceof r) {
                                        i11 = 2;
                                        r rVar = (r) n10;
                                        s sVar = rVar.f14430e;
                                        s b10 = sVar == null ? null : sVar.b(l10, obj, null);
                                        Object v10 = b10 == null ? obj5 : biFunction.v(b10.f14414c, obj5);
                                        if (v10 == null) {
                                            if (b10 != null) {
                                                if (rVar.g(b10)) {
                                                    k(mVarArr, i13, s(rVar.f14431f));
                                                }
                                                obj6 = v10;
                                                i12 = -1;
                                            }
                                            obj6 = v10;
                                        } else if (b10 != null) {
                                            b10.f14414c = v10;
                                            obj6 = v10;
                                        } else {
                                            rVar.f(l10, obj, v10);
                                            obj6 = v10;
                                            i12 = 1;
                                        }
                                    }
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    q(mVarArr, i13);
                                }
                                i10 = i12;
                                obj5 = obj6;
                            }
                        }
                    } else if (b(mVarArr, i13, new m(l10, obj, obj5, null))) {
                        break;
                    }
                }
            }
            mVarArr = g();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj5;
    }

    @Override
    public final Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public V put(K k10, V v10) {
        return (V) h(k10, v10, false);
    }

    @Override
    public final void putAll(Map map) {
        r(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override
    public V putIfAbsent(K k10, V v10) {
        return (V) h(k10, v10, true);
    }

    @Override
    public V remove(Object obj) {
        return (V) i(obj, null, null);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        return (obj2 == null || i(obj, null, obj2) == null) ? false : true;
    }

    @Override
    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return i(obj, obj2, null);
        }
        throw null;
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj != null && obj2 != null && obj3 != null) {
            return i(obj, obj3, obj2) != null;
        }
        throw null;
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        m[] mVarArr = this.f14387a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 != null) {
                    Object obj = b10.f14414c;
                    Object obj2 = b10.f14413b;
                    do {
                        Object v10 = biFunction.v(obj2, obj);
                        Objects.requireNonNull(v10);
                        if (i(obj2, v10, obj) == null) {
                            obj = get(obj2);
                        }
                    } while (obj != null);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public int size() {
        long m10 = m();
        if (m10 < 0) {
            return 0;
        }
        if (m10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) m10;
    }

    @Override
    public final String toString() {
        m[] mVarArr = this.f14387a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        m b10 = qVar.b();
        if (b10 != null) {
            while (true) {
                Object obj = b10.f14413b;
                Object obj2 = b10.f14414c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                b10 = qVar.b();
                if (b10 == null) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override
    public final Collection values() {
        t tVar = this.f14391e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f14391e = tVar2;
        return tVar2;
    }
}
