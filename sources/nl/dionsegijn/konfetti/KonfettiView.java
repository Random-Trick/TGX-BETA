package nl.dionsegijn.konfetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p207ob.C7815b;
import p237qb.AbstractC8311a;
import qa.C8298k;

public class KonfettiView extends View {
    public final List<C7815b> f24054a = new ArrayList();
    public C7520a f24055b = new C7520a();
    public AbstractC8311a f24056c;

    public static final class C7520a {
        public long f24057a = -1;

        public final float m15739a() {
            if (this.f24057a == -1) {
                this.f24057a = System.nanoTime();
            }
            long nanoTime = System.nanoTime();
            this.f24057a = nanoTime;
            return (((float) (nanoTime - this.f24057a)) / 1000000.0f) / 1000;
        }

        public final long m15738b(long j) {
            return System.currentTimeMillis() - j;
        }

        public final void m15737c() {
            this.f24057a = -1L;
        }
    }

    public KonfettiView(Context context) {
        super(context);
    }

    public final C7815b m15741a() {
        return new C7815b(this);
    }

    public final void m15740b(C7815b bVar) {
        C8298k.m12933e(bVar, "particleSystem");
        this.f24054a.add(bVar);
        AbstractC8311a aVar = this.f24056c;
        if (aVar != null) {
            aVar.m12903a(this, bVar, this.f24054a.size());
        }
        invalidate();
    }

    public final List<C7815b> getActiveSystems() {
        return this.f24054a;
    }

    public final AbstractC8311a getOnParticleSystemUpdateListener() {
        return this.f24056c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        C8298k.m12933e(canvas, "canvas");
        super.onDraw(canvas);
        float a = this.f24055b.m15739a();
        for (int size = this.f24054a.size() - 1; size >= 0; size--) {
            C7815b bVar = this.f24054a.get(size);
            if (this.f24055b.m15738b(bVar.m14970g().m13598c()) >= bVar.m14971f()) {
                bVar.m14970g().m13595f(canvas, a);
            }
            if (bVar.m14972e()) {
                this.f24054a.remove(size);
                AbstractC8311a aVar = this.f24056c;
                if (aVar != null) {
                    aVar.m12902b(this, bVar, this.f24054a.size());
                }
            }
        }
        if (this.f24054a.size() != 0) {
            invalidate();
        } else {
            this.f24055b.m15737c();
        }
    }

    public final void setOnParticleSystemUpdateListener(AbstractC8311a aVar) {
        this.f24056c = aVar;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
