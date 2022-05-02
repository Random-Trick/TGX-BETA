package p156kd;

import android.os.Build;
import android.os.Message;
import org.thunderdog.challegram.C7888N;

public class C6241d {
    public static HandlerC6242e f19676e;
    public static final long f19677f;
    public C6257p f19678a;
    public int f19679b;
    public long f19680c;
    public boolean f19681d;

    static {
        f19677f = Build.VERSION.SDK_INT > 20 ? 14L : 17L;
    }

    public C6241d(C6257p pVar) {
        if (f19676e == null) {
            f19676e = new HandlerC6242e();
        }
        this.f19678a = pVar;
    }

    public void m20977a() {
        this.f19679b++;
    }

    public void m20976b(int i) {
        float f;
        float f2;
        if (this.f19679b == i) {
            if (this.f19681d) {
                f2 = (float) (System.currentTimeMillis() - this.f19680c);
                f = 100.0f;
            } else {
                f2 = (float) (System.currentTimeMillis() - this.f19680c);
                f = 120.0f;
            }
            float f3 = f2 / f;
            if (f3 <= 0.0f) {
                this.f19678a.setAlpha(0.0f);
                if (this.f19681d) {
                    HandlerC6242e eVar = f19676e;
                    eVar.sendMessageDelayed(Message.obtain(eVar, i, this), f19677f);
                    return;
                }
                HandlerC6242e eVar2 = f19676e;
                eVar2.sendMessageDelayed(Message.obtain(eVar2, i, this), 12L);
            } else if (f3 >= 1.0f) {
                this.f19678a.setAlpha(1.0f);
            } else {
                this.f19678a.setAlpha(C7888N.iimg(f3));
                if (this.f19681d) {
                    HandlerC6242e eVar3 = f19676e;
                    eVar3.sendMessageDelayed(Message.obtain(eVar3, i, this), f19677f);
                    return;
                }
                HandlerC6242e eVar4 = f19676e;
                eVar4.sendMessageDelayed(Message.obtain(eVar4, i, this), 12L);
            }
        }
    }

    public void m20975c() {
        this.f19679b++;
        this.f19680c = System.currentTimeMillis();
        HandlerC6242e eVar = f19676e;
        eVar.sendMessage(Message.obtain(eVar, this.f19679b, this));
    }

    public C6241d(C6257p pVar, boolean z) {
        if (f19676e == null) {
            f19676e = new HandlerC6242e();
        }
        this.f19678a = pVar;
        this.f19681d = z;
    }
}
