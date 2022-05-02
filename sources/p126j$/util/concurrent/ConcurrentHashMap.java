package p126j$.util.concurrent;

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
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.Function;
import sun.misc.Unsafe;

public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, AbstractC5511v {
    private static final int f17984g = (1 << (32 - 16)) - 1;
    private static final int f17985h = 32 - 16;
    static final int f17986i = Runtime.getRuntime().availableProcessors();
    private static final Unsafe f17987j;
    private static final long f17988k;
    private static final long f17989l;
    private static final long f17990m;
    private static final long f17991n;
    private static final long f17992o;
    private static final long f17993p;
    private static final int f17994q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient C5502m[] f17995a;
    private volatile transient C5502m[] f17996b;
    private volatile transient long baseCount;
    private volatile transient C5493d[] f17997c;
    private volatile transient int cellsBusy;
    private transient C5499j f17998d;
    private transient C5509t f17999e;
    private transient C5495f f18000f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C5504o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c = AbstractC5512w.m22506c();
            f17987j = c;
            f17988k = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f17989l = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f17990m = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            f17991n = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f17992o = c.objectFieldOffset(C5493d.class.getDeclaredField("value"));
            f17993p = c.arrayBaseOffset(C5502m[].class);
            int arrayIndexScale = c.arrayIndexScale(C5502m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f17994q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i >= 0) {
            this.sizeCtl = i >= 536870912 ? Log.TAG_TDLIB_OPTIONS : m22539o(i + (i >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((i < i2 ? i2 : i) / f) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? Log.TAG_TDLIB_OPTIONS : m22539o((int) j);
    }

    private final void m22553a(long r12, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.ConcurrentHashMap.m22553a(long, int):void");
    }

    static final boolean m22552b(C5502m[] mVarArr, int i, C5502m mVar, C5502m mVar2) {
        return AbstractC5490a.m22524b(f17987j, mVarArr, (i << f17994q) + f17993p, null, mVar2);
    }

    public static Class m22551c(Object obj) {
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

    public static int m22550d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    private final void m22549e(long r25, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.ConcurrentHashMap.m22549e(long, boolean):void");
    }

    private final C5502m[] m22547g() {
        while (true) {
            C5502m[] mVarArr = this.f17995a;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f17987j.compareAndSwapInt(this, f17988k, i, -1)) {
                try {
                    C5502m[] mVarArr2 = this.f17995a;
                    if (mVarArr2 == null || mVarArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C5502m[] mVarArr3 = new C5502m[i2];
                        this.f17995a = mVarArr3;
                        i = i2 - (i2 >>> 2);
                        mVarArr2 = mVarArr3;
                    }
                    this.sizeCtl = i;
                    return mVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i;
                    throw th;
                }
            }
        }
    }

    static final int m22544j(int i) {
        return Integer.numberOfLeadingZeros(i) | Log.TAG_ROUND;
    }

    static final void m22543k(C5502m[] mVarArr, int i, C5502m mVar) {
        f17987j.putObjectVolatile(mVarArr, (i << f17994q) + f17993p, mVar);
    }

    static final int m22542l(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    public static final C5502m m22540n(C5502m[] mVarArr, int i) {
        return (C5502m) f17987j.getObjectVolatile(mVarArr, (i << f17994q) + f17993p);
    }

    private static final int m22539o(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        return i7 >= 1073741824 ? Log.TAG_TDLIB_OPTIONS : 1 + i7;
    }

    private final void m22538p(C5502m[] mVarArr, C5502m[] mVarArr2) {
        C5502m[] mVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        C5502m[] mVarArr4;
        int i;
        int i2;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        C5497h hVar;
        int i3;
        C5508s sVar;
        C5508s sVar2;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = mVarArr.length;
        int i4 = f17986i;
        int i5 = i4 > 1 ? (length >>> 3) / i4 : length;
        int i6 = i5 < 16 ? 16 : i5;
        if (mVarArr2 == null) {
            try {
                C5502m[] mVarArr5 = new C5502m[length << 1];
                concurrentHashMap3.f17996b = mVarArr5;
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
        C5497h hVar2 = new C5497h(mVarArr3);
        C5502m[] mVarArr6 = mVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i7 = 0;
        int i8 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i9 = i7 - 1;
                if (i9 >= i8 || z2) {
                    concurrentHashMap = concurrentHashMap4;
                    mVarArr4 = mVarArr6;
                    i8 = i8;
                    i7 = i9;
                } else {
                    int i10 = concurrentHashMap4.transferIndex;
                    if (i10 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i7 = -1;
                    } else {
                        Unsafe unsafe = f17987j;
                        long j = f17989l;
                        int i11 = i10 > i6 ? i10 - i6 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i8 = i8;
                        if (unsafe.compareAndSwapInt(this, j, i10, i11)) {
                            i7 = i10 - 1;
                            i8 = i11;
                        } else {
                            mVarArr6 = mVarArr4;
                            i7 = i9;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                mVarArr6 = mVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                C5502m[] mVarArr7 = mVarArr6;
                i8 = i8;
                C5508s sVar3 = null;
                if (i7 < 0 || i7 >= length || (i3 = i7 + length) >= length2) {
                    i2 = i6;
                    i = length2;
                    hVar = hVar2;
                    if (z2) {
                        this.f17996b = null;
                        this.f17995a = mVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f17987j;
                    long j2 = f17988k;
                    int i12 = concurrentHashMap2.sizeCtl;
                    i7 = i7;
                    if (!unsafe2.compareAndSwapInt(this, j2, i12, i12 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                    } else if (i12 - 2 == (m22544j(length) << f17985h)) {
                        i7 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                        z = true;
                        z2 = true;
                    } else {
                        return;
                    }
                } else {
                    C5502m n = m22540n(mVarArr7, i7);
                    if (n == null) {
                        z = m22552b(mVarArr7, i7, null, hVar2);
                        i2 = i6;
                        i = length2;
                        hVar = hVar2;
                        mVarArr6 = mVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                    } else {
                        int i13 = n.f18020a;
                        if (i13 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i2 = i6;
                            i = length2;
                            hVar = hVar2;
                            mVarArr6 = mVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            z = true;
                        } else {
                            synchronized (n) {
                                if (m22540n(mVarArr7, i7) == n) {
                                    if (i13 >= 0) {
                                        int i14 = i13 & length;
                                        C5508s sVar4 = n;
                                        for (?? r6 = n.f18023d; r6 != null; r6 = r6.f18023d) {
                                            int i15 = r6.f18020a & length;
                                            if (i15 != i14) {
                                                sVar4 = r6;
                                                i14 = i15;
                                            }
                                        }
                                        if (i14 == 0) {
                                            sVar = sVar4;
                                        } else {
                                            sVar = null;
                                            sVar3 = sVar4;
                                        }
                                        C5502m mVar = n;
                                        C5502m mVar2 = sVar3;
                                        while (mVar != sVar4) {
                                            int i16 = mVar.f18020a;
                                            i6 = i6;
                                            Object obj = mVar.f18021b;
                                            length2 = length2;
                                            Object obj2 = mVar.f18022c;
                                            if ((i16 & length) == 0) {
                                                sVar2 = sVar4;
                                                sVar = new C5502m(i16, obj, obj2, sVar);
                                            } else {
                                                sVar2 = sVar4;
                                                mVar2 = new C5502m(i16, obj, obj2, mVar2);
                                            }
                                            mVar = mVar.f18023d;
                                            sVar4 = sVar2;
                                            mVar2 = mVar2;
                                        }
                                        i2 = i6;
                                        i = length2;
                                        m22543k(mVarArr3, i7, sVar);
                                        m22543k(mVarArr3, i3, mVar2);
                                        m22543k(mVarArr7, i7, hVar2);
                                        hVar = hVar2;
                                    } else {
                                        i2 = i6;
                                        i = length2;
                                        if (n instanceof C5507r) {
                                            C5507r rVar = (C5507r) n;
                                            C5508s sVar5 = null;
                                            C5508s sVar6 = null;
                                            int i17 = 0;
                                            int i18 = 0;
                                            C5508s sVar7 = null;
                                            for (C5502m mVar3 = rVar.f18039f; mVar3 != null; mVar3 = mVar3.f18023d) {
                                                rVar = rVar;
                                                int i19 = mVar3.f18020a;
                                                hVar2 = hVar2;
                                                C5508s sVar8 = new C5508s(i19, mVar3.f18021b, mVar3.f18022c, null, null);
                                                if ((i19 & length) == 0) {
                                                    sVar8.f18044h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar3 = sVar8;
                                                    } else {
                                                        sVar6.f18023d = sVar8;
                                                    }
                                                    i17++;
                                                    sVar6 = sVar8;
                                                } else {
                                                    sVar8.f18044h = sVar5;
                                                    if (sVar5 == null) {
                                                        sVar7 = sVar8;
                                                    } else {
                                                        sVar5.f18023d = sVar8;
                                                    }
                                                    i18++;
                                                    sVar5 = sVar8;
                                                }
                                            }
                                            C5507r rVar2 = rVar;
                                            hVar = hVar2;
                                            C5502m s = i17 <= 6 ? m22535s(sVar3) : i18 != 0 ? new C5507r(sVar3) : rVar2;
                                            C5502m s2 = i18 <= 6 ? m22535s(sVar7) : i17 != 0 ? new C5507r(sVar7) : rVar2;
                                            m22543k(mVarArr3, i7, s);
                                            m22543k(mVarArr3, i3, s2);
                                            m22543k(mVarArr, i7, hVar);
                                            mVarArr7 = mVarArr;
                                        }
                                    }
                                    z = true;
                                } else {
                                    i2 = i6;
                                    i = length2;
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
                i6 = i2;
                length2 = i;
            }
        }
    }

    private final void m22537q(C5502m[] mVarArr, int i) {
        int length = mVarArr.length;
        if (length < 64) {
            m22536r(length << 1);
            return;
        }
        C5502m n = m22540n(mVarArr, i);
        if (n != null && n.f18020a >= 0) {
            synchronized (n) {
                if (m22540n(mVarArr, i) == n) {
                    C5508s sVar = null;
                    C5502m mVar = n;
                    C5508s sVar2 = null;
                    while (mVar != null) {
                        C5508s sVar3 = new C5508s(mVar.f18020a, mVar.f18021b, mVar.f18022c, null, null);
                        sVar3.f18044h = sVar2;
                        if (sVar2 == null) {
                            sVar = sVar3;
                        } else {
                            sVar2.f18023d = sVar3;
                        }
                        mVar = mVar.f18023d;
                        sVar2 = sVar3;
                    }
                    m22543k(mVarArr, i, new C5507r(sVar));
                }
            }
        }
    }

    private final void m22536r(int i) {
        int length;
        C5502m[] mVarArr;
        int o = i >= 536870912 ? Log.TAG_TDLIB_OPTIONS : m22539o(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 >= 0) {
                C5502m[] mVarArr2 = this.f17995a;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i3 = i2 > o ? i2 : o;
                    if (f17987j.compareAndSwapInt(this, f17988k, i2, -1)) {
                        try {
                            if (this.f17995a == mVarArr2) {
                                this.f17995a = new C5502m[i3];
                                i2 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i2;
                        }
                    } else {
                        continue;
                    }
                } else if (o > i2 && length < 1073741824) {
                    if (mVarArr2 == this.f17995a) {
                        int j = m22544j(length);
                        if (i2 < 0) {
                            if ((i2 >>> f17985h) == j && i2 != j + 1 && i2 != j + f17984g && (mVarArr = this.f17996b) != null && this.transferIndex > 0) {
                                if (f17987j.compareAndSwapInt(this, f17988k, i2, i2 + 1)) {
                                    m22538p(mVarArr2, mVarArr);
                                }
                            } else {
                                return;
                            }
                        } else if (f17987j.compareAndSwapInt(this, f17988k, i2, (j << f17985h) + 2)) {
                            m22538p(mVarArr2, null);
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
        long j;
        int i;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C5502m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            mVar = new C5502m(m22542l(readObject.hashCode()), readObject, readObject2, mVar);
            j3++;
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j3 >= 536870912) {
            i = Log.TAG_TDLIB_OPTIONS;
        } else {
            int i2 = (int) j3;
            i = m22539o(i2 + (i2 >>> 1) + 1);
        }
        C5502m[] mVarArr = new C5502m[i];
        int i3 = i - 1;
        while (mVar != null) {
            mVar = mVar.f18023d;
            int i4 = mVar.f18020a;
            int i5 = i4 & i3;
            C5502m n = m22540n(mVarArr, i5);
            if (n == null) {
                z = true;
            } else {
                Object obj2 = mVar.f18021b;
                if (n.f18020a >= 0) {
                    int i6 = 0;
                    for (C5502m mVar2 = n; mVar2 != null; mVar2 = mVar2.f18023d) {
                        if (mVar2.f18020a == i4 && ((obj = mVar2.f18021b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i6++;
                        }
                    }
                    z = true;
                    if (z && i6 >= 8) {
                        j2++;
                        mVar.f18023d = n;
                        C5502m mVar3 = mVar;
                        C5508s sVar = null;
                        C5508s sVar2 = null;
                        while (mVar3 != null) {
                            j2 = j2;
                            C5508s sVar3 = new C5508s(mVar3.f18020a, mVar3.f18021b, mVar3.f18022c, null, null);
                            sVar3.f18044h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f18023d = sVar3;
                            }
                            mVar3 = mVar3.f18023d;
                            sVar2 = sVar3;
                        }
                        m22543k(mVarArr, i5, new C5507r(sVar));
                    }
                } else if (((C5507r) n).m22517f(i4, obj2, mVar.f18022c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                mVar.f18023d = n;
                m22543k(mVarArr, i5, mVar);
            }
            j = 1;
        }
        this.f17995a = mVarArr;
        this.sizeCtl = i - (i >>> 2);
        this.baseCount = j2;
    }

    static C5502m m22535s(C5502m mVar) {
        C5502m mVar2 = null;
        C5502m mVar3 = null;
        while (mVar != null) {
            C5502m mVar4 = new C5502m(mVar.f18020a, mVar.f18021b, mVar.f18022c, null);
            if (mVar3 == null) {
                mVar2 = mVar4;
            } else {
                mVar3.f18023d = mVar4;
            }
            mVar = mVar.f18023d;
            mVar3 = mVar4;
        }
        return mVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        C5504o[] oVarArr = new C5504o[16];
        for (int i5 = 0; i5 < 16; i5++) {
            oVarArr[i5] = new C5504o(0.75f);
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C5502m[] mVarArr = this.f17995a;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22522b();
                if (b == null) {
                    break;
                }
                objectOutputStream.writeObject(b.f18021b);
                objectOutputStream.writeObject(b.f18022c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override
    public void clear() {
        C5502m n;
        C5502m[] mVarArr = this.f17995a;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (mVarArr != null && i < mVarArr.length) {
                n = m22540n(mVarArr, i);
                if (n == null) {
                    i++;
                } else {
                    int i2 = n.f18020a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (n) {
                        if (m22540n(mVarArr, i) == n) {
                            for (C5502m mVar = i2 >= 0 ? n : n instanceof C5507r ? ((C5507r) n).f18039f : null; mVar != null; mVar = mVar.f18023d) {
                                j--;
                            }
                            i++;
                            m22543k(mVarArr, i, null);
                        }
                    }
                }
            }
            mVarArr = m22548f(mVarArr, n);
        }
        if (j != 0) {
            m22553a(j, -1);
        }
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        int i;
        C5502m mVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int l = m22542l(obj.hashCode());
        C5502m[] mVarArr = this.f17995a;
        int i2 = 0;
        Object obj4 = null;
        int i3 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & l;
                    C5502m n = m22540n(mVarArr, i4);
                    if (n == null) {
                        C5503n nVar = new C5503n();
                        synchronized (nVar) {
                            if (m22552b(mVarArr, i4, null, nVar)) {
                                Object u = biFunction.mo22173u(obj, null);
                                if (u != null) {
                                    mVar = new C5502m(l, obj, u, null);
                                    i = 1;
                                } else {
                                    i = i2;
                                    mVar = null;
                                }
                                m22543k(mVarArr, i4, mVar);
                                i2 = i;
                                obj4 = u;
                                i3 = 1;
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = n.f18020a;
                        if (i5 == -1) {
                            mVarArr = m22548f(mVarArr, n);
                        } else {
                            synchronized (n) {
                                if (m22540n(mVarArr, i4) == n) {
                                    if (i5 >= 0) {
                                        C5502m mVar2 = null;
                                        C5502m mVar3 = n;
                                        int i6 = 1;
                                        while (true) {
                                            if (mVar3.f18020a != l || ((obj3 = mVar3.f18021b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                C5502m mVar4 = mVar3.f18023d;
                                                if (mVar4 == null) {
                                                    Object u2 = biFunction.mo22173u(obj, null);
                                                    if (u2 != null) {
                                                        mVar3.f18023d = new C5502m(l, obj, u2, null);
                                                        obj2 = u2;
                                                        i2 = 1;
                                                    } else {
                                                        obj2 = u2;
                                                    }
                                                } else {
                                                    i6++;
                                                    mVar2 = mVar3;
                                                    mVar3 = mVar4;
                                                }
                                            }
                                        }
                                        obj2 = biFunction.mo22173u(obj, mVar3.f18022c);
                                        if (obj2 != null) {
                                            mVar3.f18022c = obj2;
                                        } else {
                                            C5502m mVar5 = mVar3.f18023d;
                                            if (mVar2 != null) {
                                                mVar2.f18023d = mVar5;
                                            } else {
                                                m22543k(mVarArr, i4, mVar5);
                                            }
                                            i2 = -1;
                                        }
                                        i3 = i6;
                                        obj4 = obj2;
                                    } else if (n instanceof C5507r) {
                                        C5507r rVar = (C5507r) n;
                                        C5508s sVar = rVar.f18038e;
                                        C5508s b = sVar != null ? sVar.m22511b(l, obj, null) : null;
                                        Object u3 = biFunction.mo22173u(obj, b == null ? null : b.f18022c);
                                        if (u3 == null) {
                                            if (b != null) {
                                                if (rVar.m22516g(b)) {
                                                    m22543k(mVarArr, i4, m22535s(rVar.f18039f));
                                                }
                                                obj4 = u3;
                                                i2 = -1;
                                                i3 = 1;
                                            }
                                            obj4 = u3;
                                            i3 = 1;
                                        } else if (b != null) {
                                            b.f18022c = u3;
                                            obj4 = u3;
                                            i3 = 1;
                                        } else {
                                            rVar.m22517f(l, obj, u3);
                                            obj4 = u3;
                                            i2 = 1;
                                            i3 = 1;
                                        }
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    m22537q(mVarArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = m22547g();
        }
        if (i2 != 0) {
            m22553a(i2, i3);
        }
        return obj4;
    }

    @Override
    public Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        C5508s b;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int l = m22542l(obj.hashCode());
        C5502m[] mVarArr = this.f17995a;
        Object obj5 = null;
        int i = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i2 = (length - 1) & l;
                    C5502m n = m22540n(mVarArr, i2);
                    boolean z = true;
                    if (n == null) {
                        C5503n nVar = new C5503n();
                        synchronized (nVar) {
                            if (m22552b(mVarArr, i2, null, nVar)) {
                                Object a = function.mo22503a(obj);
                                m22543k(mVarArr, i2, a != null ? new C5502m(l, obj, a, null) : null);
                                obj5 = a;
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i3 = n.f18020a;
                        if (i3 == -1) {
                            mVarArr = m22548f(mVarArr, n);
                        } else {
                            synchronized (n) {
                                if (m22540n(mVarArr, i2) == n) {
                                    if (i3 >= 0) {
                                        C5502m mVar = n;
                                        int i4 = 1;
                                        while (true) {
                                            if (mVar.f18020a != l || ((obj4 = mVar.f18021b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                C5502m mVar2 = mVar.f18023d;
                                                if (mVar2 == null) {
                                                    obj2 = function.mo22503a(obj);
                                                    if (obj2 != null) {
                                                        mVar.f18023d = new C5502m(l, obj, obj2, null);
                                                    } else {
                                                        obj3 = obj2;
                                                    }
                                                } else {
                                                    i4++;
                                                    mVar = mVar2;
                                                }
                                            }
                                        }
                                        obj3 = mVar.f18022c;
                                        obj2 = obj3;
                                        z = false;
                                        i = i4;
                                    } else if (n instanceof C5507r) {
                                        i = 2;
                                        C5507r rVar = (C5507r) n;
                                        C5508s sVar = rVar.f18038e;
                                        if (sVar == null || (b = sVar.m22511b(l, obj, null)) == null) {
                                            obj2 = function.mo22503a(obj);
                                            if (obj2 != null) {
                                                rVar.m22517f(l, obj, obj2);
                                            } else {
                                                obj5 = obj2;
                                            }
                                        } else {
                                            obj5 = b.f18022c;
                                        }
                                    }
                                    obj5 = obj2;
                                }
                                z = false;
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    m22537q(mVarArr, i2);
                                }
                                if (!z) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = m22547g();
        }
        if (obj5 != null) {
            m22553a(1L, i);
        }
        return obj5;
    }

    @Override
    public Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override
    public java.lang.Object computeIfPresent(java.lang.Object r14, p126j$.util.function.BiFunction r15) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override
    public Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        C5502m[] mVarArr = this.f17995a;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22522b();
                if (b == null) {
                    break;
                }
                Object obj2 = b.f18022c;
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
    public Set entrySet() {
        C5495f fVar = this.f18000f;
        if (fVar != null) {
            return fVar;
        }
        C5495f fVar2 = new C5495f(this);
        this.f18000f = fVar2;
        return fVar2;
    }

    @Override
    public boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C5502m[] mVarArr = this.f17995a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C5506q qVar = new C5506q(mVarArr, length, 0, length);
        while (true) {
            C5502m b = qVar.m22522b();
            if (b != null) {
                Object obj2 = b.f18022c;
                Object obj3 = map.get(b.f18021b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    final C5502m[] m22548f(C5502m[] mVarArr, C5502m mVar) {
        C5502m[] mVarArr2;
        int i;
        if (!(mVar instanceof C5497h) || (mVarArr2 = ((C5497h) mVar).f18013e) == null) {
            return this.f17995a;
        }
        int j = m22544j(mVarArr.length);
        while (true) {
            if (mVarArr2 == this.f17996b && this.f17995a == mVarArr && (i = this.sizeCtl) < 0 && (i >>> f17985h) == j && i != j + 1 && i != f17984g + j && this.transferIndex > 0) {
                if (f17987j.compareAndSwapInt(this, f17988k, i, i + 1)) {
                    m22538p(mVarArr, mVarArr2);
                    break;
                }
            } else {
                break;
            }
        }
        return mVarArr2;
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5502m[] mVarArr = this.f17995a;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22522b();
                if (b != null) {
                    biConsumer.mo22180p(b.f18021b, b.f18022c);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public V get(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    public final java.lang.Object m22546h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.ConcurrentHashMap.m22546h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public int hashCode() {
        C5502m[] mVarArr = this.f17995a;
        int i = 0;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22522b();
                if (b == null) {
                    break;
                }
                i += b.f18022c.hashCode() ^ b.f18021b.hashCode();
            }
        }
        return i;
    }

    public final Object m22545i(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C5502m n;
        Object obj4;
        C5508s b;
        C5502m s;
        Object obj5;
        int l = m22542l(obj.hashCode());
        C5502m[] mVarArr = this.f17995a;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (n = m22540n(mVarArr, (i = (length - 1) & l))) == null) {
                break;
            }
            int i2 = n.f18020a;
            if (i2 == -1) {
                mVarArr = m22548f(mVarArr, n);
            } else {
                boolean z = false;
                synchronized (n) {
                    if (m22540n(mVarArr, i) == n) {
                        if (i2 >= 0) {
                            C5502m mVar = null;
                            C5502m mVar2 = n;
                            while (true) {
                                if (mVar2.f18020a != l || ((obj5 = mVar2.f18021b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    C5502m mVar3 = mVar2.f18023d;
                                    if (mVar3 == null) {
                                        break;
                                    }
                                    mVar = mVar2;
                                    mVar2 = mVar3;
                                }
                            }
                            obj4 = mVar2.f18022c;
                            if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                if (obj2 != null) {
                                    mVar2.f18022c = obj2;
                                } else if (mVar != null) {
                                    mVar.f18023d = mVar2.f18023d;
                                } else {
                                    s = mVar2.f18023d;
                                    m22543k(mVarArr, i, s);
                                }
                                z = true;
                            }
                            obj4 = null;
                            z = true;
                        } else if (n instanceof C5507r) {
                            C5507r rVar = (C5507r) n;
                            C5508s sVar = rVar.f18038e;
                            if (sVar != null && (b = sVar.m22511b(l, obj, null)) != null) {
                                obj4 = b.f18022c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        b.f18022c = obj2;
                                    } else if (rVar.m22516g(b)) {
                                        s = m22535s(rVar.f18039f);
                                        m22543k(mVarArr, i, s);
                                    }
                                    z = true;
                                }
                            }
                            obj4 = null;
                            z = true;
                        }
                    }
                    obj4 = null;
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            m22553a(-1L, -1);
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
        return m22541m() <= 0;
    }

    @Override
    public Set<K> keySet() {
        C5499j jVar = this.f17998d;
        if (jVar != null) {
            return jVar;
        }
        C5499j jVar2 = new C5499j(this, null);
        this.f17998d = jVar2;
        return jVar2;
    }

    public final long m22541m() {
        C5493d[] dVarArr = this.f17997c;
        long j = this.baseCount;
        if (dVarArr != null) {
            for (C5493d dVar : dVarArr) {
                if (dVar != null) {
                    j += dVar.value;
                }
            }
        }
        return j;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int l = m22542l(obj.hashCode());
        C5502m[] mVarArr = this.f17995a;
        int i2 = 0;
        Object obj6 = null;
        int i3 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & l;
                    C5502m n = m22540n(mVarArr, i4);
                    i = 1;
                    if (n != null) {
                        int i5 = n.f18020a;
                        if (i5 == -1) {
                            mVarArr = m22548f(mVarArr, n);
                        } else {
                            synchronized (n) {
                                if (m22540n(mVarArr, i4) == n) {
                                    if (i5 >= 0) {
                                        C5502m mVar = null;
                                        C5502m mVar2 = n;
                                        int i6 = 1;
                                        while (true) {
                                            if (mVar2.f18020a != l || ((obj4 = mVar2.f18021b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                C5502m mVar3 = mVar2.f18023d;
                                                if (mVar3 == null) {
                                                    mVar2.f18023d = new C5502m(l, obj, obj5, null);
                                                    obj3 = obj5;
                                                    i3 = 1;
                                                    break;
                                                }
                                                i6++;
                                                mVar = mVar2;
                                                mVar2 = mVar3;
                                            }
                                        }
                                        obj3 = biFunction.mo22173u(mVar2.f18022c, obj5);
                                        if (obj3 != null) {
                                            mVar2.f18022c = obj3;
                                        } else {
                                            C5502m mVar4 = mVar2.f18023d;
                                            if (mVar != null) {
                                                mVar.f18023d = mVar4;
                                            } else {
                                                m22543k(mVarArr, i4, mVar4);
                                            }
                                            i3 = -1;
                                        }
                                        i2 = i6;
                                        obj6 = obj3;
                                    } else if (n instanceof C5507r) {
                                        i2 = 2;
                                        C5507r rVar = (C5507r) n;
                                        C5508s sVar = rVar.f18038e;
                                        C5508s b = sVar == null ? null : sVar.m22511b(l, obj, null);
                                        Object u = b == null ? obj5 : biFunction.mo22173u(b.f18022c, obj5);
                                        if (u == null) {
                                            if (b != null) {
                                                if (rVar.m22516g(b)) {
                                                    m22543k(mVarArr, i4, m22535s(rVar.f18039f));
                                                }
                                                obj6 = u;
                                                i3 = -1;
                                            }
                                            obj6 = u;
                                        } else if (b != null) {
                                            b.f18022c = u;
                                            obj6 = u;
                                        } else {
                                            rVar.m22517f(l, obj, u);
                                            obj6 = u;
                                            i3 = 1;
                                        }
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m22537q(mVarArr, i4);
                                }
                                i = i3;
                                obj5 = obj6;
                            }
                        }
                    } else if (m22552b(mVarArr, i4, null, new C5502m(l, obj, obj5, null))) {
                        break;
                    }
                }
            }
            mVarArr = m22547g();
        }
        if (i != 0) {
            m22553a(i, i2);
        }
        return obj5;
    }

    @Override
    public Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public V put(K k, V v) {
        return (V) m22546h(k, v, false);
    }

    @Override
    public void putAll(Map map) {
        m22536r(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            m22546h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override
    public V putIfAbsent(K k, V v) {
        return (V) m22546h(k, v, true);
    }

    @Override
    public V remove(Object obj) {
        return (V) m22545i(obj, null, null);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        return (obj2 == null || m22545i(obj, null, obj2) == null) ? false : true;
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return m22545i(obj, obj2, null);
        }
        throw null;
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj != null && obj2 != null && obj3 != null) {
            return m22545i(obj, obj3, obj2) != null;
        }
        throw null;
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        C5502m[] mVarArr = this.f17995a;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22522b();
                if (b != null) {
                    Object obj = b.f18022c;
                    Object obj2 = b.f18021b;
                    do {
                        Object u = biFunction.mo22173u(obj2, obj);
                        Objects.requireNonNull(u);
                        if (m22545i(obj2, u, obj) == null) {
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
    public void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override
    public int size() {
        long m = m22541m();
        if (m < 0) {
            return 0;
        }
        if (m > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) m;
    }

    @Override
    public String toString() {
        C5502m[] mVarArr = this.f17995a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C5506q qVar = new C5506q(mVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        C5502m b = qVar.m22522b();
        if (b != null) {
            while (true) {
                Object obj = b.f18021b;
                Object obj2 = b.f18022c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                b = qVar.m22522b();
                if (b == null) {
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
    public Collection values() {
        C5509t tVar = this.f17999e;
        if (tVar != null) {
            return tVar;
        }
        C5509t tVar2 = new C5509t(this);
        this.f17999e = tVar2;
        return tVar2;
    }
}
