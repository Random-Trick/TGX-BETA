package p111he;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import gd.C4630f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124ib.C5319b;
import p124ib.C5320c;
import p156kd.C6238b;
import p181mb.C6815f;

public class C5125l {
    public static C6815f<C5320c> f17186g;
    public static C6815f<int[]> f17187h;
    public static C6815f<C5319b> f17188i;
    public final ArrayList<C5126a> f17189a;
    public int f17190b;
    public int f17191c;
    public final int f17192d;
    public int f17193e;
    public int f17194f;

    public static class C5126a {
        public C4630f0 f17195a;
        public int f17196b;
        public int f17197c;
        public int f17198d;

        public C5126a(C4630f0 f0Var) {
            this.f17195a = f0Var;
        }
    }

    public C5125l(List<C4630f0> list, int i) {
        this.f17189a = new ArrayList<>(list.size());
        for (C4630f0 f0Var : list) {
            this.f17189a.add(new C5126a(f0Var));
        }
        this.f17192d = i;
    }

    public static int m23879c(float[] fArr, int i, int i2) {
        return m23878d(fArr, 0, fArr.length, i, i2);
    }

    public static int m23878d(float[] fArr, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        for (int i5 = i; i5 < i2; i5++) {
            f += fArr[i5];
        }
        return (int) ((i3 - (((i2 - i) - 1) * i4)) / f);
    }

    public final void m23881a() {
        Iterator<C5126a> it = this.f17189a.iterator();
        while (it.hasNext()) {
            it.next().f17195a.m26781G().m18623j();
        }
    }

    public final void m23880b(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: p111he.C5125l.m23880b(int, int):void");
    }

    public final <T extends View & AbstractC5143t> void m23877e(T t, Canvas canvas, int i, int i2, C6238b bVar) {
        Iterator<C5126a> it = this.f17189a.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C5126a next = it.next();
            next.f17195a.m26725s(t, canvas, i + next.f17197c, i2 + next.f17198d, bVar.m20992l(i3), bVar.m20991m(i3, next.f17195a.m26746h0()), 1.0f);
            i3++;
        }
    }

    public final int m23876f() {
        return this.f17194f;
    }

    public final int m23875g(int i, int i2) {
        if (i > 0 && i2 > 0 && !(this.f17190b == i && this.f17191c == i2)) {
            this.f17190b = i;
            this.f17191c = i2;
            m23880b(i, i2);
        }
        return this.f17194f;
    }

    public int m23874h() {
        return this.f17193e;
    }

    public final boolean m23873i(View view, MotionEvent motionEvent, int i, int i2) {
        Iterator<C5126a> it = this.f17189a.iterator();
        while (it.hasNext()) {
            if (it.next().f17195a.m26744i0(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void m23872j(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        C5126a aVar = this.f17189a.get(i);
        aVar.f17196b = i4;
        aVar.f17195a.m26741k(i2, i3);
        aVar.f17197c = i5;
        aVar.f17198d = i6;
    }

    public final void m23871k(C6238b bVar, boolean z) {
        bVar.m20997g(this.f17189a.size());
        Iterator<C5126a> it = this.f17189a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C5126a next = it.next();
            if (!z) {
                next.f17195a.m26734n0(bVar.m20992l(i));
            }
            if (next.f17195a.m26746h0()) {
                next.f17195a.m26738l0(bVar.m20994j(i));
            } else {
                next.f17195a.m26736m0(bVar.m20993k(i));
            }
            i++;
        }
    }
}
