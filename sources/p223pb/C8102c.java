package p223pb;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.thunderdog.challegram.Log;
import p107ha.C5060q;
import p123ia.C5309s;
import p207ob.C7814a;
import p252rb.AbstractC8418b;
import p252rb.C8417a;
import p252rb.C8422c;
import p252rb.C8423d;
import pa.AbstractC8077a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8297j;
import qa.C8298k;
import sb.C8711a;
import sb.C8712b;

public final class C8102c {
    public boolean f26311a;
    public final Random f26312b;
    public final List<C7814a> f26313c;
    public final C8711a f26314d;
    public final C8712b f26315e;
    public final C8423d f26316f;
    public final C8422c[] f26317g;
    public final AbstractC8418b[] f26318h;
    public final int[] f26319i;
    public final C8417a f26320j;
    public final AbstractC8101b f26321k;
    public final long f26322l;

    public static final class C8103a extends C8297j implements AbstractC8077a<C5060q> {
        public C8103a(C8102c cVar) {
            super(0, cVar, C8102c.class, "addConfetti", "addConfetti()V", 0);
        }

        @Override
        public C5060q mo4925b() {
            m13594m();
            return C5060q.f17066a;
        }

        public final void m13594m() {
            ((C8102c) this.f26774b).m13599b();
        }
    }

    public static final class C8104b extends AbstractC8299l implements AbstractC8088l<C7814a, Boolean> {
        public static final C8104b f26323b = new C8104b();

        public C8104b() {
            super(1);
        }

        @Override
        public Boolean mo568a(C7814a aVar) {
            return Boolean.valueOf(m13593f(aVar));
        }

        public final boolean m13593f(C7814a aVar) {
            C8298k.m12933e(aVar, "it");
            return aVar.m14980d();
        }
    }

    public C8102c(C8711a aVar, C8712b bVar, C8423d dVar, C8422c[] cVarArr, AbstractC8418b[] bVarArr, int[] iArr, C8417a aVar2, AbstractC8101b bVar2, long j) {
        C8298k.m12933e(aVar, "location");
        C8298k.m12933e(bVar, "velocity");
        C8298k.m12933e(dVar, "gravity");
        C8298k.m12933e(cVarArr, "sizes");
        C8298k.m12933e(bVarArr, "shapes");
        C8298k.m12933e(iArr, "colors");
        C8298k.m12933e(aVar2, "config");
        C8298k.m12933e(bVar2, "emitter");
        this.f26314d = aVar;
        this.f26315e = bVar;
        this.f26316f = dVar;
        this.f26317g = cVarArr;
        this.f26318h = bVarArr;
        this.f26319i = iArr;
        this.f26320j = aVar2;
        this.f26321k = bVar2;
        this.f26322l = j;
        this.f26311a = true;
        this.f26312b = new Random();
        this.f26313c = new ArrayList();
        bVar2.m13601d(new C8103a(this));
    }

    public final void m13599b() {
        List<C7814a> list = this.f26313c;
        C8423d dVar = new C8423d(this.f26314d.m11701a(), this.f26314d.m11700b());
        C8422c[] cVarArr = this.f26317g;
        C8422c cVar = cVarArr[this.f26312b.nextInt(cVarArr.length)];
        AbstractC8418b d = m13597d();
        int[] iArr = this.f26319i;
        list.add(new C7814a(dVar, iArr[this.f26312b.nextInt(iArr.length)], cVar, d, this.f26320j.m12537e(), this.f26320j.m12539c(), null, this.f26315e.m11693e(), this.f26320j.m12538d(), this.f26320j.m12541a(), this.f26315e.m11697a(), this.f26315e.m11695c(), 64, null));
    }

    public final long m13598c() {
        return this.f26322l;
    }

    public final AbstractC8418b m13597d() {
        Drawable drawable;
        Drawable newDrawable;
        AbstractC8418b[] bVarArr = this.f26318h;
        AbstractC8418b bVar = bVarArr[this.f26312b.nextInt(bVarArr.length)];
        if (!(bVar instanceof AbstractC8418b.C8420b)) {
            return bVar;
        }
        AbstractC8418b.C8420b bVar2 = (AbstractC8418b.C8420b) bVar;
        Drawable.ConstantState constantState = bVar2.m12532d().getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null || (drawable = newDrawable.mutate()) == null) {
            drawable = bVar2.m12532d();
        }
        C8298k.m12934d(drawable, "shape.drawable.constantS…utate() ?: shape.drawable");
        return AbstractC8418b.C8420b.m12533c(bVar2, drawable, false, 2, null);
    }

    public final boolean m13596e() {
        return (this.f26321k.mo13602c() && this.f26313c.size() == 0) || (!this.f26311a && this.f26313c.size() == 0);
    }

    public final void m13595f(Canvas canvas, float f) {
        C8298k.m12933e(canvas, "canvas");
        if (this.f26311a) {
            this.f26321k.mo13604a(f);
        }
        for (int size = this.f26313c.size() - 1; size >= 0; size--) {
            C7814a aVar = this.f26313c.get(size);
            aVar.m14983a(this.f26316f);
            aVar.m14979e(canvas, f);
        }
        C5309s.m23351v(this.f26313c, C8104b.f26323b);
    }

    public C8102c(C8711a aVar, C8712b bVar, C8423d dVar, C8422c[] cVarArr, AbstractC8418b[] bVarArr, int[] iArr, C8417a aVar2, AbstractC8101b bVar2, long j, int i, C8294g gVar) {
        this(aVar, bVar, dVar, cVarArr, bVarArr, iArr, aVar2, bVar2, (i & Log.TAG_CRASH) != 0 ? System.currentTimeMillis() : j);
    }
}
