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
    public boolean f26308a;
    public final Random f26309b;
    public final List<C7814a> f26310c;
    public final C8711a f26311d;
    public final C8712b f26312e;
    public final C8423d f26313f;
    public final C8422c[] f26314g;
    public final AbstractC8418b[] f26315h;
    public final int[] f26316i;
    public final C8417a f26317j;
    public final AbstractC8101b f26318k;
    public final long f26319l;

    public static final class C8103a extends C8297j implements AbstractC8077a<C5060q> {
        public C8103a(C8102c cVar) {
            super(0, cVar, C8102c.class, "addConfetti", "addConfetti()V", 0);
        }

        @Override
        public C5060q mo4925b() {
            m13595m();
            return C5060q.f17066a;
        }

        public final void m13595m() {
            ((C8102c) this.f26771b).m13600b();
        }
    }

    public static final class C8104b extends AbstractC8299l implements AbstractC8088l<C7814a, Boolean> {
        public static final C8104b f26320b = new C8104b();

        public C8104b() {
            super(1);
        }

        @Override
        public Boolean mo568a(C7814a aVar) {
            return Boolean.valueOf(m13594f(aVar));
        }

        public final boolean m13594f(C7814a aVar) {
            C8298k.m12934e(aVar, "it");
            return aVar.m14980d();
        }
    }

    public C8102c(C8711a aVar, C8712b bVar, C8423d dVar, C8422c[] cVarArr, AbstractC8418b[] bVarArr, int[] iArr, C8417a aVar2, AbstractC8101b bVar2, long j) {
        C8298k.m12934e(aVar, "location");
        C8298k.m12934e(bVar, "velocity");
        C8298k.m12934e(dVar, "gravity");
        C8298k.m12934e(cVarArr, "sizes");
        C8298k.m12934e(bVarArr, "shapes");
        C8298k.m12934e(iArr, "colors");
        C8298k.m12934e(aVar2, "config");
        C8298k.m12934e(bVar2, "emitter");
        this.f26311d = aVar;
        this.f26312e = bVar;
        this.f26313f = dVar;
        this.f26314g = cVarArr;
        this.f26315h = bVarArr;
        this.f26316i = iArr;
        this.f26317j = aVar2;
        this.f26318k = bVar2;
        this.f26319l = j;
        this.f26308a = true;
        this.f26309b = new Random();
        this.f26310c = new ArrayList();
        bVar2.m13602d(new C8103a(this));
    }

    public final void m13600b() {
        List<C7814a> list = this.f26310c;
        C8423d dVar = new C8423d(this.f26311d.m11702a(), this.f26311d.m11701b());
        C8422c[] cVarArr = this.f26314g;
        C8422c cVar = cVarArr[this.f26309b.nextInt(cVarArr.length)];
        AbstractC8418b d = m13598d();
        int[] iArr = this.f26316i;
        list.add(new C7814a(dVar, iArr[this.f26309b.nextInt(iArr.length)], cVar, d, this.f26317j.m12538e(), this.f26317j.m12540c(), null, this.f26312e.m11694e(), this.f26317j.m12539d(), this.f26317j.m12542a(), this.f26312e.m11698a(), this.f26312e.m11696c(), 64, null));
    }

    public final long m13599c() {
        return this.f26319l;
    }

    public final AbstractC8418b m13598d() {
        Drawable drawable;
        Drawable newDrawable;
        AbstractC8418b[] bVarArr = this.f26315h;
        AbstractC8418b bVar = bVarArr[this.f26309b.nextInt(bVarArr.length)];
        if (!(bVar instanceof AbstractC8418b.C8420b)) {
            return bVar;
        }
        AbstractC8418b.C8420b bVar2 = (AbstractC8418b.C8420b) bVar;
        Drawable.ConstantState constantState = bVar2.m12533d().getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null || (drawable = newDrawable.mutate()) == null) {
            drawable = bVar2.m12533d();
        }
        C8298k.m12935d(drawable, "shape.drawable.constantS…utate() ?: shape.drawable");
        return AbstractC8418b.C8420b.m12534c(bVar2, drawable, false, 2, null);
    }

    public final boolean m13597e() {
        return (this.f26318k.mo13603c() && this.f26310c.size() == 0) || (!this.f26308a && this.f26310c.size() == 0);
    }

    public final void m13596f(Canvas canvas, float f) {
        C8298k.m12934e(canvas, "canvas");
        if (this.f26308a) {
            this.f26318k.mo13605a(f);
        }
        for (int size = this.f26310c.size() - 1; size >= 0; size--) {
            C7814a aVar = this.f26310c.get(size);
            aVar.m14983a(this.f26313f);
            aVar.m14979e(canvas, f);
        }
        C5309s.m23350v(this.f26310c, C8104b.f26320b);
    }

    public C8102c(C8711a aVar, C8712b bVar, C8423d dVar, C8422c[] cVarArr, AbstractC8418b[] bVarArr, int[] iArr, C8417a aVar2, AbstractC8101b bVar2, long j, int i, C8294g gVar) {
        this(aVar, bVar, dVar, cVarArr, bVarArr, iArr, aVar2, bVar2, (i & Log.TAG_CRASH) != 0 ? System.currentTimeMillis() : j);
    }
}
