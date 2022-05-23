package nl.dionsegijn.konfetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import pb.b;
import ra.k;

public class KonfettiView extends View {
    public final List<b> f18518a = new ArrayList();
    public a f18519b = new a();
    public rb.a f18520c;

    public static final class a {
        public long f18521a = -1;

        public final float a() {
            if (this.f18521a == -1) {
                this.f18521a = System.nanoTime();
            }
            long nanoTime = System.nanoTime();
            this.f18521a = nanoTime;
            return (((float) (nanoTime - this.f18521a)) / 1000000.0f) / 1000;
        }

        public final long b(long j10) {
            return System.currentTimeMillis() - j10;
        }

        public final void c() {
            this.f18521a = -1L;
        }
    }

    public KonfettiView(Context context) {
        super(context);
    }

    public final b a() {
        return new b(this);
    }

    public final void b(b bVar) {
        k.e(bVar, "particleSystem");
        this.f18518a.add(bVar);
        rb.a aVar = this.f18520c;
        if (aVar != null) {
            aVar.b(this, bVar, this.f18518a.size());
        }
        invalidate();
    }

    public final List<b> getActiveSystems() {
        return this.f18518a;
    }

    public final rb.a getOnParticleSystemUpdateListener() {
        return this.f18520c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        super.onDraw(canvas);
        float a10 = this.f18519b.a();
        for (int size = this.f18518a.size() - 1; size >= 0; size--) {
            b bVar = this.f18518a.get(size);
            if (this.f18519b.b(bVar.g().c()) >= bVar.f()) {
                bVar.g().f(canvas, a10);
            }
            if (bVar.e()) {
                this.f18518a.remove(size);
                rb.a aVar = this.f18520c;
                if (aVar != null) {
                    aVar.a(this, bVar, this.f18518a.size());
                }
            }
        }
        if (this.f18518a.size() != 0) {
            invalidate();
        } else {
            this.f18519b.c();
        }
    }

    public final void setOnParticleSystemUpdateListener(rb.a aVar) {
        this.f18520c = aVar;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
