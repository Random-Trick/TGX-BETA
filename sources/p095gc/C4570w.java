package p095gc;

import java.util.concurrent.atomic.AtomicReference;
import org.thunderdog.challegram.Log;
import qa.C8298k;

public final class C4570w {
    public static final int f15013c;
    public static final AtomicReference<C4568v>[] f15014d;
    public static final C4570w f15015e = new C4570w();
    public static final int f15011a = Log.TAG_COMPRESS;
    public static final C4568v f15012b = new C4568v(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15013c = highestOneBit;
        AtomicReference<C4568v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f15014d = atomicReferenceArr;
    }

    public static final void m27317b(C4568v vVar) {
        AtomicReference<C4568v> a;
        C4568v vVar2;
        C8298k.m12934e(vVar, "segment");
        if (!(vVar.f15009f == null && vVar.f15010g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f15007d && (vVar2 = (a = f15015e.m27318a()).get()) != f15012b) {
            int i = vVar2 != null ? vVar2.f15006c : 0;
            if (i < f15011a) {
                vVar.f15009f = vVar2;
                vVar.f15005b = 0;
                vVar.f15006c = i + Log.TAG_LUX;
                if (!a.compareAndSet(vVar2, vVar)) {
                    vVar.f15009f = null;
                }
            }
        }
    }

    public static final C4568v m27316c() {
        AtomicReference<C4568v> a = f15015e.m27318a();
        C4568v vVar = f15012b;
        C4568v andSet = a.getAndSet(vVar);
        if (andSet == vVar) {
            return new C4568v();
        }
        if (andSet == null) {
            a.set(null);
            return new C4568v();
        }
        a.set(andSet.f15009f);
        andSet.f15009f = null;
        andSet.f15006c = 0;
        return andSet;
    }

    public final AtomicReference<C4568v> m27318a() {
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        return f15014d[(int) (currentThread.getId() & (f15013c - 1))];
    }
}
