package qb;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ia.q;
import ja.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.j;
import ra.k;
import ra.l;
import sb.b;
import sb.d;

public final class c {
    public boolean f21494a;
    public final Random f21495b;
    public final List<pb.a> f21496c;
    public final tb.a f21497d;
    public final tb.b f21498e;
    public final d f21499f;
    public final sb.c[] f21500g;
    public final sb.b[] f21501h;
    public final int[] f21502i;
    public final sb.a f21503j;
    public final qb.b f21504k;
    public final long f21505l;

    public static final class a extends j implements qa.a<q> {
        public a(c cVar) {
            super(0, cVar, c.class, "addConfetti", "addConfetti()V", 0);
        }

        @Override
        public q b() {
            m();
            return q.f14159a;
        }

        public final void m() {
            ((c) this.f21803b).b();
        }
    }

    public static final class b extends l implements qa.l<pb.a, Boolean> {
        public static final b f21506b = new b();

        public b() {
            super(1);
        }

        @Override
        public Boolean a(pb.a aVar) {
            return Boolean.valueOf(f(aVar));
        }

        public final boolean f(pb.a aVar) {
            k.e(aVar, "it");
            return aVar.d();
        }
    }

    public c(tb.a aVar, tb.b bVar, d dVar, sb.c[] cVarArr, sb.b[] bVarArr, int[] iArr, sb.a aVar2, qb.b bVar2, long j10) {
        k.e(aVar, "location");
        k.e(bVar, "velocity");
        k.e(dVar, "gravity");
        k.e(cVarArr, "sizes");
        k.e(bVarArr, "shapes");
        k.e(iArr, "colors");
        k.e(aVar2, "config");
        k.e(bVar2, "emitter");
        this.f21497d = aVar;
        this.f21498e = bVar;
        this.f21499f = dVar;
        this.f21500g = cVarArr;
        this.f21501h = bVarArr;
        this.f21502i = iArr;
        this.f21503j = aVar2;
        this.f21504k = bVar2;
        this.f21505l = j10;
        this.f21494a = true;
        this.f21495b = new Random();
        this.f21496c = new ArrayList();
        bVar2.d(new a(this));
    }

    public final void b() {
        List<pb.a> list = this.f21496c;
        d dVar = new d(this.f21497d.a(), this.f21497d.b());
        sb.c[] cVarArr = this.f21500g;
        sb.c cVar = cVarArr[this.f21495b.nextInt(cVarArr.length)];
        sb.b d10 = d();
        int[] iArr = this.f21502i;
        list.add(new pb.a(dVar, iArr[this.f21495b.nextInt(iArr.length)], cVar, d10, this.f21503j.e(), this.f21503j.c(), null, this.f21498e.e(), this.f21503j.d(), this.f21503j.a(), this.f21498e.a(), this.f21498e.c(), 64, null));
    }

    public final long c() {
        return this.f21505l;
    }

    public final sb.b d() {
        Drawable drawable;
        Drawable newDrawable;
        sb.b[] bVarArr = this.f21501h;
        sb.b bVar = bVarArr[this.f21495b.nextInt(bVarArr.length)];
        if (!(bVar instanceof b.C0214b)) {
            return bVar;
        }
        b.C0214b bVar2 = (b.C0214b) bVar;
        Drawable.ConstantState constantState = bVar2.d().getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null || (drawable = newDrawable.mutate()) == null) {
            drawable = bVar2.d();
        }
        k.d(drawable, "shape.drawable.constantS…utate() ?: shape.drawable");
        return b.C0214b.c(bVar2, drawable, false, 2, null);
    }

    public final boolean e() {
        return (this.f21504k.c() && this.f21496c.size() == 0) || (!this.f21494a && this.f21496c.size() == 0);
    }

    public final void f(Canvas canvas, float f10) {
        k.e(canvas, "canvas");
        if (this.f21494a) {
            this.f21504k.a(f10);
        }
        for (int size = this.f21496c.size() - 1; size >= 0; size--) {
            pb.a aVar = this.f21496c.get(size);
            aVar.a(this.f21499f);
            aVar.e(canvas, f10);
        }
        s.v(this.f21496c, b.f21506b);
    }

    public c(tb.a aVar, tb.b bVar, d dVar, sb.c[] cVarArr, sb.b[] bVarArr, int[] iArr, sb.a aVar2, qb.b bVar2, long j10, int i10, g gVar) {
        this(aVar, bVar, dVar, cVarArr, bVarArr, iArr, aVar2, bVar2, (i10 & Log.TAG_CRASH) != 0 ? System.currentTimeMillis() : j10);
    }
}
