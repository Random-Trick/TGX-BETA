package rc;

import ae.j;
import android.graphics.Paint;
import ce.a0;
import org.thunderdog.challegram.Log;
import qc.a;

public class h extends g {
    public final Paint f21867p;
    public int f21868q = 0;

    public h(a.C0200a aVar) {
        super(aVar);
        Paint paint = new Paint();
        this.f21867p = paint;
        this.f21854c.setStrokeWidth(a0.k(1.0f));
        this.f21854c.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.f21854c.setAntiAlias(false);
    }

    @Override
    public void a() {
        super.a();
        this.f21868q = t0.a.d(j.u(), this.f21864m, 0.3f);
    }

    public boolean b() {
        if (this.f21868q == 0) {
            a();
            if (this.f21868q == 0) {
                Log.e("blendColor is empty", Log.generateException(), new Object[0]);
            }
        }
        return this.f21868q != 0;
    }
}
