package hc;

import java.util.concurrent.atomic.AtomicReference;
import org.thunderdog.challegram.Log;
import ra.k;

public final class w {
    public static final int f12681c;
    public static final AtomicReference<v>[] f12682d;
    public static final w f12683e = new w();
    public static final int f12679a = Log.TAG_COMPRESS;
    public static final v f12680b = new v(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f12681c = highestOneBit;
        AtomicReference<v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f12682d = atomicReferenceArr;
    }

    public static final void b(v vVar) {
        AtomicReference<v> a10;
        v vVar2;
        k.e(vVar, "segment");
        if (!(vVar.f12677f == null && vVar.f12678g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f12675d && (vVar2 = (a10 = f12683e.a()).get()) != f12680b) {
            int i10 = vVar2 != null ? vVar2.f12674c : 0;
            if (i10 < f12679a) {
                vVar.f12677f = vVar2;
                vVar.f12673b = 0;
                vVar.f12674c = i10 + Log.TAG_LUX;
                if (!a10.compareAndSet(vVar2, vVar)) {
                    vVar.f12677f = null;
                }
            }
        }
    }

    public static final v c() {
        AtomicReference<v> a10 = f12683e.a();
        v vVar = f12680b;
        v andSet = a10.getAndSet(vVar);
        if (andSet == vVar) {
            return new v();
        }
        if (andSet == null) {
            a10.set(null);
            return new v();
        }
        a10.set(andSet.f12677f);
        andSet.f12677f = null;
        andSet.f12674c = 0;
        return andSet;
    }

    public final AtomicReference<v> a() {
        Thread currentThread = Thread.currentThread();
        k.d(currentThread, "Thread.currentThread()");
        return f12682d[(int) (currentThread.getId() & (f12681c - 1))];
    }
}
