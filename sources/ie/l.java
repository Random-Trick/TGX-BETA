package ie;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import hd.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.b;
import jb.c;
import nb.f;

public class l {
    public static f<c> f14256g;
    public static f<int[]> f14257h;
    public static f<b> f14258i;
    public final ArrayList<a> f14259a;
    public int f14260b;
    public int f14261c;
    public final int f14262d;
    public int f14263e;
    public int f14264f;

    public static class a {
        public f0 f14265a;
        public int f14266b;
        public int f14267c;
        public int f14268d;

        public a(f0 f0Var) {
            this.f14265a = f0Var;
        }
    }

    public l(List<f0> list, int i10) {
        this.f14259a = new ArrayList<>(list.size());
        for (f0 f0Var : list) {
            this.f14259a.add(new a(f0Var));
        }
        this.f14262d = i10;
    }

    public static int c(float[] fArr, int i10, int i11) {
        return d(fArr, 0, fArr.length, i10, i11);
    }

    public static int d(float[] fArr, int i10, int i11, int i12, int i13) {
        float f10 = 0.0f;
        for (int i14 = i10; i14 < i11; i14++) {
            f10 += fArr[i14];
        }
        return (int) ((i12 - (((i11 - i10) - 1) * i13)) / f10);
    }

    public final void a() {
        Iterator<a> it = this.f14259a.iterator();
        while (it.hasNext()) {
            it.next().f14265a.G().k();
        }
    }

    public final void b(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: ie.l.b(int, int):void");
    }

    public final <T extends View & t> void e(T t10, Canvas canvas, int i10, int i11, ld.b bVar) {
        Iterator<a> it = this.f14259a.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            a next = it.next();
            next.f14265a.s(t10, canvas, i10 + next.f14267c, i11 + next.f14268d, bVar.l(i12), bVar.m(i12, next.f14265a.h0()), 1.0f);
            i12++;
        }
    }

    public final int f() {
        return this.f14264f;
    }

    public final int g(int i10, int i11) {
        if (i10 > 0 && i11 > 0 && !(this.f14260b == i10 && this.f14261c == i11)) {
            this.f14260b = i10;
            this.f14261c = i11;
            b(i10, i11);
        }
        return this.f14264f;
    }

    public int h() {
        return this.f14263e;
    }

    public final boolean i(View view, MotionEvent motionEvent, int i10, int i11) {
        Iterator<a> it = this.f14259a.iterator();
        while (it.hasNext()) {
            if (it.next().f14265a.i0(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        a aVar = this.f14259a.get(i10);
        aVar.f14266b = i13;
        aVar.f14265a.j(i11, i12);
        aVar.f14267c = i14;
        aVar.f14268d = i15;
    }

    public final void k(ld.b bVar, boolean z10) {
        bVar.g(this.f14259a.size());
        Iterator<a> it = this.f14259a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a next = it.next();
            if (!z10) {
                next.f14265a.n0(bVar.l(i10));
            }
            if (next.f14265a.h0()) {
                next.f14265a.l0(bVar.j(i10));
            } else {
                next.f14265a.m0(bVar.k(i10));
            }
            i10++;
        }
    }
}
