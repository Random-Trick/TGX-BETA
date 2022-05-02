package p126j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

public final class C5507r extends C5502m {
    private static final Unsafe f18036h;
    private static final long f18037i;
    C5508s f18038e;
    volatile C5508s f18039f;
    volatile Thread f18040g;
    volatile int lockState;

    static {
        try {
            Unsafe c = AbstractC5512w.m22506c();
            f18036h = c;
            f18037i = c.objectFieldOffset(C5507r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public C5507r(C5508s sVar) {
        super(-2, null, null, null);
        int j;
        int d;
        this.f18039f = sVar;
        C5508s sVar2 = null;
        while (sVar != null) {
            sVar = (C5508s) sVar.f18023d;
            sVar.f18043g = null;
            sVar.f18042f = null;
            if (sVar2 == null) {
                sVar.f18041e = null;
                sVar.f18045i = false;
            } else {
                Object obj = sVar.f18021b;
                int i = sVar.f18020a;
                C5508s sVar3 = sVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = sVar3.f18021b;
                    int i2 = sVar3.f18020a;
                    j = i2 > i ? -1 : i2 < i ? 1 : ((cls == null && (cls = ConcurrentHashMap.m22551c(obj)) == null) || (d = ConcurrentHashMap.m22550d(cls, obj, obj2)) == 0) ? m22513j(obj, obj2) : d;
                    C5508s sVar4 = j <= 0 ? sVar3.f18042f : sVar3.f18043g;
                    if (sVar4 == null) {
                        break;
                    }
                    sVar3 = sVar4;
                }
                sVar.f18041e = sVar3;
                if (j <= 0) {
                    sVar3.f18042f = sVar;
                } else {
                    sVar3.f18043g = sVar;
                }
                sVar = m22520c(sVar2, sVar);
            }
            sVar2 = sVar;
        }
        this.f18038e = sVar2;
    }

    static C5508s m22521b(C5508s sVar, C5508s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            C5508s sVar3 = sVar2.f18041e;
            if (sVar3 == null) {
                sVar2.f18045i = false;
                return sVar2;
            } else if (sVar2.f18045i) {
                sVar2.f18045i = false;
                return sVar;
            } else {
                C5508s sVar4 = sVar3.f18042f;
                C5508s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f18043g;
                    if (sVar4 != null && sVar4.f18045i) {
                        sVar4.f18045i = false;
                        sVar3.f18045i = true;
                        sVar = m22515h(sVar, sVar3);
                        sVar3 = sVar2.f18041e;
                        sVar4 = sVar3 == null ? null : sVar3.f18043g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        C5508s sVar6 = sVar4.f18042f;
                        C5508s sVar7 = sVar4.f18043g;
                        if ((sVar7 != null && sVar7.f18045i) || (sVar6 != null && sVar6.f18045i)) {
                            if (sVar7 == null || !sVar7.f18045i) {
                                if (sVar6 != null) {
                                    sVar6.f18045i = false;
                                }
                                sVar4.f18045i = true;
                                sVar = m22514i(sVar, sVar4);
                                sVar3 = sVar2.f18041e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f18043g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f18045i = sVar3 == null ? false : sVar3.f18045i;
                                C5508s sVar8 = sVar4.f18043g;
                                if (sVar8 != null) {
                                    sVar8.f18045i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f18045i = false;
                                sVar = m22515h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f18045i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f18045i) {
                        sVar4.f18045i = false;
                        sVar3.f18045i = true;
                        sVar = m22514i(sVar, sVar3);
                        sVar3 = sVar2.f18041e;
                        sVar4 = sVar3 == null ? null : sVar3.f18042f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        C5508s sVar9 = sVar4.f18042f;
                        C5508s sVar10 = sVar4.f18043g;
                        if ((sVar9 != null && sVar9.f18045i) || (sVar10 != null && sVar10.f18045i)) {
                            if (sVar9 == null || !sVar9.f18045i) {
                                if (sVar10 != null) {
                                    sVar10.f18045i = false;
                                }
                                sVar4.f18045i = true;
                                sVar = m22515h(sVar, sVar4);
                                sVar3 = sVar2.f18041e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f18042f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f18045i = sVar3 == null ? false : sVar3.f18045i;
                                C5508s sVar11 = sVar4.f18042f;
                                if (sVar11 != null) {
                                    sVar11.f18045i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f18045i = false;
                                sVar = m22514i(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f18045i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static C5508s m22520c(C5508s sVar, C5508s sVar2) {
        C5508s sVar3;
        sVar2.f18045i = true;
        while (true) {
            C5508s sVar4 = sVar2.f18041e;
            if (sVar4 == null) {
                sVar2.f18045i = false;
                return sVar2;
            } else if (!sVar4.f18045i || (sVar3 = sVar4.f18041e) == null) {
                break;
            } else {
                C5508s sVar5 = sVar3.f18042f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f18043g;
                    if (sVar5 == null || !sVar5.f18045i) {
                        if (sVar2 == sVar4.f18043g) {
                            sVar = m22515h(sVar, sVar4);
                            C5508s sVar6 = sVar4.f18041e;
                            sVar3 = sVar6 == null ? null : sVar6.f18041e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f18045i = false;
                            if (sVar3 != null) {
                                sVar3.f18045i = true;
                                sVar = m22514i(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f18045i = false;
                        sVar4.f18045i = false;
                        sVar3.f18045i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f18045i) {
                    if (sVar2 == sVar4.f18042f) {
                        sVar = m22514i(sVar, sVar4);
                        C5508s sVar7 = sVar4.f18041e;
                        sVar3 = sVar7 == null ? null : sVar7.f18041e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f18045i = false;
                        if (sVar3 != null) {
                            sVar3.f18045i = true;
                            sVar = m22515h(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f18045i = false;
                    sVar4.f18045i = false;
                    sVar3.f18045i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void m22519d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f18036h.compareAndSwapInt(this, f18037i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f18036h.compareAndSwapInt(this, f18037i, i, i | 2)) {
                    z = true;
                    this.f18040g = Thread.currentThread();
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f18040g = null;
        }
    }

    private final void m22518e() {
        if (!f18036h.compareAndSwapInt(this, f18037i, 0, 1)) {
            m22519d();
        }
    }

    static C5508s m22515h(C5508s sVar, C5508s sVar2) {
        C5508s sVar3 = sVar2.f18043g;
        if (sVar3 != null) {
            C5508s sVar4 = sVar3.f18042f;
            sVar2.f18043g = sVar4;
            if (sVar4 != null) {
                sVar4.f18041e = sVar2;
            }
            C5508s sVar5 = sVar2.f18041e;
            sVar3.f18041e = sVar5;
            if (sVar5 == null) {
                sVar3.f18045i = false;
                sVar = sVar3;
            } else if (sVar5.f18042f == sVar2) {
                sVar5.f18042f = sVar3;
            } else {
                sVar5.f18043g = sVar3;
            }
            sVar3.f18042f = sVar2;
            sVar2.f18041e = sVar3;
        }
        return sVar;
    }

    static C5508s m22514i(C5508s sVar, C5508s sVar2) {
        C5508s sVar3 = sVar2.f18042f;
        if (sVar3 != null) {
            C5508s sVar4 = sVar3.f18043g;
            sVar2.f18042f = sVar4;
            if (sVar4 != null) {
                sVar4.f18041e = sVar2;
            }
            C5508s sVar5 = sVar2.f18041e;
            sVar3.f18041e = sVar5;
            if (sVar5 == null) {
                sVar3.f18045i = false;
                sVar = sVar3;
            } else if (sVar5.f18043g == sVar2) {
                sVar5.f18043g = sVar3;
            } else {
                sVar5.f18042f = sVar3;
            }
            sVar3.f18043g = sVar2;
            sVar2.f18041e = sVar3;
        }
        return sVar;
    }

    static int m22513j(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    @Override
    public final C5502m mo22512a(int i, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C5502m mVar = this.f18039f;
        while (true) {
            C5508s sVar = null;
            if (mVar == null) {
                return null;
            }
            int i2 = this.lockState;
            if ((i2 & 3) == 0) {
                Unsafe unsafe = f18036h;
                long j = f18037i;
                if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                    try {
                        C5508s sVar2 = this.f18038e;
                        if (sVar2 != null) {
                            sVar = sVar2.m22511b(i, obj, null);
                        }
                        if (AbstractC5512w.m22508a(unsafe, this, j, -4) == 6 && (thread2 = this.f18040g) != null) {
                            LockSupport.unpark(thread2);
                        }
                        return sVar;
                    } catch (Throwable th) {
                        if (AbstractC5512w.m22508a(f18036h, this, f18037i, -4) == 6 && (thread = this.f18040g) != null) {
                            LockSupport.unpark(thread);
                        }
                        throw th;
                    }
                }
            } else if (mVar.f18020a != i || ((obj2 = mVar.f18021b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                mVar = mVar.f18023d;
            }
        }
        return mVar;
    }

    public final p126j$.util.concurrent.C5508s m22517f(int r16, java.lang.Object r17, java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.C5507r.m22517f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    public final boolean m22516g(p126j$.util.concurrent.C5508s r11) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.C5507r.m22516g(j$.util.concurrent.s):boolean");
    }
}
