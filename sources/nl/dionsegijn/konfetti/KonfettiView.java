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
    public final List<C7815b> f24051a = new ArrayList();
    public C7520a f24052b = new C7520a();
    public AbstractC8311a f24053c;

    public static final class C7520a {
        public long f24054a = -1;

        public final float m15739a() {
            if (this.f24054a == -1) {
                this.f24054a = System.nanoTime();
            }
            long nanoTime = System.nanoTime();
            this.f24054a = nanoTime;
            return (((float) (nanoTime - this.f24054a)) / 1000000.0f) / 1000;
        }

        public final long m15738b(long j) {
            return System.currentTimeMillis() - j;
        }

        public final void m15737c() {
            this.f24054a = -1L;
        }
    }

    public KonfettiView(Context context) {
        super(context);
    }

    public final C7815b m15741a() {
        return new C7815b(this);
    }

    public final void m15740b(C7815b bVar) {
        C8298k.m12934e(bVar, "particleSystem");
        this.f24051a.add(bVar);
        AbstractC8311a aVar = this.f24053c;
        if (aVar != null) {
            aVar.m12904a(this, bVar, this.f24051a.size());
        }
        invalidate();
    }

    public final List<C7815b> getActiveSystems() {
        return this.f24051a;
    }

    public final AbstractC8311a getOnParticleSystemUpdateListener() {
        return this.f24053c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        C8298k.m12934e(canvas, "canvas");
        super.onDraw(canvas);
        float a = this.f24052b.m15739a();
        for (int size = this.f24051a.size() - 1; size >= 0; size--) {
            C7815b bVar = this.f24051a.get(size);
            if (this.f24052b.m15738b(bVar.m14970g().m13599c()) >= bVar.m14971f()) {
                bVar.m14970g().m13596f(canvas, a);
            }
            if (bVar.m14972e()) {
                this.f24051a.remove(size);
                AbstractC8311a aVar = this.f24053c;
                if (aVar != null) {
                    aVar.m12903b(this, bVar, this.f24051a.size());
                }
            }
        }
        if (this.f24051a.size() != 0) {
            invalidate();
        } else {
            this.f24052b.m15737c();
        }
    }

    public final void setOnParticleSystemUpdateListener(AbstractC8311a aVar) {
        this.f24053c = aVar;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
