package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

public final class r extends m {
    private static final Unsafe f14428h;
    private static final long f14429i;
    s f14430e;
    volatile s f14431f;
    volatile Thread f14432g;
    volatile int lockState;

    static {
        try {
            Unsafe c10 = x.c();
            f14428h = c10;
            f14429i = c10.objectFieldOffset(r.class.getDeclaredField("lockState"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public r(s sVar) {
        super(-2, null, null, null);
        int j10;
        int d10;
        this.f14431f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            sVar = (s) sVar.f14415d;
            sVar.f14435g = null;
            sVar.f14434f = null;
            if (sVar2 == null) {
                sVar.f14433e = null;
                sVar.f14437i = false;
            } else {
                Object obj = sVar.f14413b;
                int i10 = sVar.f14412a;
                s sVar3 = sVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = sVar3.f14413b;
                    int i11 = sVar3.f14412a;
                    j10 = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) ? j(obj, obj2) : d10;
                    s sVar4 = j10 <= 0 ? sVar3.f14434f : sVar3.f14435g;
                    if (sVar4 == null) {
                        break;
                    }
                    sVar3 = sVar4;
                }
                sVar.f14433e = sVar3;
                if (j10 <= 0) {
                    sVar3.f14434f = sVar;
                } else {
                    sVar3.f14435g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
        }
        this.f14430e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.f14433e;
            if (sVar3 == null) {
                sVar2.f14437i = false;
                return sVar2;
            } else if (sVar2.f14437i) {
                sVar2.f14437i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f14434f;
                s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f14435g;
                    if (sVar4 != null && sVar4.f14437i) {
                        sVar4.f14437i = false;
                        sVar3.f14437i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.f14433e;
                        sVar4 = sVar3 == null ? null : sVar3.f14435g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar6 = sVar4.f14434f;
                        s sVar7 = sVar4.f14435g;
                        if ((sVar7 != null && sVar7.f14437i) || (sVar6 != null && sVar6.f14437i)) {
                            if (sVar7 == null || !sVar7.f14437i) {
                                if (sVar6 != null) {
                                    sVar6.f14437i = false;
                                }
                                sVar4.f14437i = true;
                                sVar = i(sVar, sVar4);
                                sVar3 = sVar2.f14433e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f14435g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f14437i = sVar3 == null ? false : sVar3.f14437i;
                                s sVar8 = sVar4.f14435g;
                                if (sVar8 != null) {
                                    sVar8.f14437i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f14437i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f14437i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f14437i) {
                        sVar4.f14437i = false;
                        sVar3.f14437i = true;
                        sVar = i(sVar, sVar3);
                        sVar3 = sVar2.f14433e;
                        sVar4 = sVar3 == null ? null : sVar3.f14434f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar9 = sVar4.f14434f;
                        s sVar10 = sVar4.f14435g;
                        if ((sVar9 != null && sVar9.f14437i) || (sVar10 != null && sVar10.f14437i)) {
                            if (sVar9 == null || !sVar9.f14437i) {
                                if (sVar10 != null) {
                                    sVar10.f14437i = false;
                                }
                                sVar4.f14437i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.f14433e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f14434f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f14437i = sVar3 == null ? false : sVar3.f14437i;
                                s sVar11 = sVar4.f14434f;
                                if (sVar11 != null) {
                                    sVar11.f14437i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f14437i = false;
                                sVar = i(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f14437i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f14437i = true;
        while (true) {
            s sVar4 = sVar2.f14433e;
            if (sVar4 == null) {
                sVar2.f14437i = false;
                return sVar2;
            } else if (!sVar4.f14437i || (sVar3 = sVar4.f14433e) == null) {
                break;
            } else {
                s sVar5 = sVar3.f14434f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f14435g;
                    if (sVar5 == null || !sVar5.f14437i) {
                        if (sVar2 == sVar4.f14435g) {
                            sVar = h(sVar, sVar4);
                            s sVar6 = sVar4.f14433e;
                            sVar3 = sVar6 == null ? null : sVar6.f14433e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f14437i = false;
                            if (sVar3 != null) {
                                sVar3.f14437i = true;
                                sVar = i(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f14437i = false;
                        sVar4.f14437i = false;
                        sVar3.f14437i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f14437i) {
                    if (sVar2 == sVar4.f14434f) {
                        sVar = i(sVar, sVar4);
                        s sVar7 = sVar4.f14433e;
                        sVar3 = sVar7 == null ? null : sVar7.f14433e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f14437i = false;
                        if (sVar3 != null) {
                            sVar3.f14437i = true;
                            sVar = h(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f14437i = false;
                    sVar4.f14437i = false;
                    sVar3.f14437i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void d() {
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f14428h.compareAndSwapInt(this, f14429i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f14428h.compareAndSwapInt(this, f14429i, i10, i10 | 2)) {
                    z10 = true;
                    this.f14432g = Thread.currentThread();
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f14432g = null;
        }
    }

    private final void e() {
        if (!f14428h.compareAndSwapInt(this, f14429i, 0, 1)) {
            d();
        }
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f14435g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f14434f;
            sVar2.f14435g = sVar4;
            if (sVar4 != null) {
                sVar4.f14433e = sVar2;
            }
            s sVar5 = sVar2.f14433e;
            sVar3.f14433e = sVar5;
            if (sVar5 == null) {
                sVar3.f14437i = false;
                sVar = sVar3;
            } else if (sVar5.f14434f == sVar2) {
                sVar5.f14434f = sVar3;
            } else {
                sVar5.f14435g = sVar3;
            }
            sVar3.f14434f = sVar2;
            sVar2.f14433e = sVar3;
        }
        return sVar;
    }

    static s i(s sVar, s sVar2) {
        s sVar3 = sVar2.f14434f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f14435g;
            sVar2.f14434f = sVar4;
            if (sVar4 != null) {
                sVar4.f14433e = sVar2;
            }
            s sVar5 = sVar2.f14433e;
            sVar3.f14433e = sVar5;
            if (sVar5 == null) {
                sVar3.f14437i = false;
                sVar = sVar3;
            } else if (sVar5.f14435g == sVar2) {
                sVar5.f14435g = sVar3;
            } else {
                sVar5.f14434f = sVar3;
            }
            sVar3.f14435g = sVar2;
            sVar2.f14433e = sVar3;
        }
        return sVar;
    }

    static int j(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    @Override
    public final m a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            m mVar = this.f14431f;
            while (mVar != null) {
                int i11 = this.lockState;
                if ((i11 & 3) == 0) {
                    Unsafe unsafe = f14428h;
                    long j10 = f14429i;
                    if (unsafe.compareAndSwapInt(this, j10, i11, i11 + 4)) {
                        try {
                            s sVar2 = this.f14430e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i10, obj, null);
                            }
                            if (x.a(unsafe, this, j10) == 6 && (thread2 = this.f14432g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th) {
                            if (x.a(f14428h, this, f14429i) == 6 && (thread = this.f14432g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (mVar.f14412a == i10 && ((obj2 = mVar.f14413b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f14415d;
                }
            }
        }
        return null;
    }

    public final j$.util.concurrent.s f(int r16, java.lang.Object r17, java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    public final boolean g(j$.util.concurrent.s r11) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.g(j$.util.concurrent.s):boolean");
    }
}
