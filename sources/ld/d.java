package ld;

import android.os.Message;
import org.thunderdog.challegram.N;

public class d {
    public static e f16347e;
    public static final long f16348f = 14;
    public p f16349a;
    public int f16350b;
    public long f16351c;
    public boolean f16352d;

    public d(p pVar) {
        if (f16347e == null) {
            f16347e = new e();
        }
        this.f16349a = pVar;
    }

    public void a() {
        this.f16350b++;
    }

    public void b(int i10) {
        float f10;
        float f11;
        if (this.f16350b == i10) {
            if (this.f16352d) {
                f11 = (float) (System.currentTimeMillis() - this.f16351c);
                f10 = 100.0f;
            } else {
                f11 = (float) (System.currentTimeMillis() - this.f16351c);
                f10 = 120.0f;
            }
            float f12 = f11 / f10;
            if (f12 <= 0.0f) {
                this.f16349a.setAlpha(0.0f);
                if (this.f16352d) {
                    e eVar = f16347e;
                    eVar.sendMessageDelayed(Message.obtain(eVar, i10, this), f16348f);
                    return;
                }
                e eVar2 = f16347e;
                eVar2.sendMessageDelayed(Message.obtain(eVar2, i10, this), 12L);
            } else if (f12 >= 1.0f) {
                this.f16349a.setAlpha(1.0f);
            } else {
                this.f16349a.setAlpha(N.iimg(f12));
                if (this.f16352d) {
                    e eVar3 = f16347e;
                    eVar3.sendMessageDelayed(Message.obtain(eVar3, i10, this), f16348f);
                    return;
                }
                e eVar4 = f16347e;
                eVar4.sendMessageDelayed(Message.obtain(eVar4, i10, this), 12L);
            }
        }
    }

    public void c() {
        this.f16350b++;
        this.f16351c = System.currentTimeMillis();
        e eVar = f16347e;
        eVar.sendMessage(Message.obtain(eVar, this.f16350b, this));
    }

    public d(p pVar, boolean z10) {
        if (f16347e == null) {
            f16347e = new e();
        }
        this.f16349a = pVar;
        this.f16352d = z10;
    }
}
