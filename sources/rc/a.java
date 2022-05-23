package rc;

import ae.j;
import android.graphics.Paint;
import org.thunderdog.challegram.Log;
import qc.a;

public class a extends g {
    public final Paint f21822p;
    public int f21823q = 0;

    public a(a.C0200a aVar) {
        super(aVar);
        Paint paint = new Paint();
        this.f21822p = paint;
        this.f21854c.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.f21854c.setAntiAlias(false);
    }

    @Override
    public void a() {
        super.a();
        this.f21823q = t0.a.d(j.u(), this.f21864m, 0.3f);
    }

    public boolean b() {
        if (this.f21823q == 0) {
            a();
            if (this.f21823q == 0) {
                Log.e("blendColor is empty", Log.generateException(), new Object[0]);
            }
        }
        return this.f21823q != 0;
    }
}
