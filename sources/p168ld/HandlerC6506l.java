package p168ld;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.thunderdog.challegram.loader.gif.GifBridge;

public class HandlerC6506l extends Handler {
    public HandlerC6506l() {
        super(Looper.getMainLooper());
    }

    public void m20264a(C6503j jVar, C6509o oVar) {
        sendMessage(Message.obtain(this, 3, new Object[]{jVar, oVar}));
    }

    public void m20263b(RunnableC6507m mVar, C6503j jVar, C6509o oVar) {
        sendMessage(Message.obtain(this, 2, new Object[]{mVar, jVar, oVar}));
    }

    public void m20262c(RunnableC6507m mVar, C6503j jVar, float f) {
        sendMessage(Message.obtain(this, 1, Float.floatToIntBits(f), 0, new Object[]{mVar, jVar}));
    }

    @Override
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Object[] objArr = (Object[]) message.obj;
            ((RunnableC6507m) objArr[0]).m20235o((C6503j) objArr[1], Float.intBitsToFloat(message.arg1));
            objArr[0] = null;
            objArr[1] = null;
        } else if (i == 2) {
            Object[] objArr2 = (Object[]) message.obj;
            ((RunnableC6507m) objArr2[0]).m20236n((C6503j) objArr2[1], (C6509o) objArr2[2]);
            objArr2[0] = null;
            objArr2[1] = null;
            objArr2[2] = null;
        } else if (i == 3) {
            Object[] objArr3 = (Object[]) message.obj;
            GifBridge.m14340f().m14335k((C6503j) objArr3[0], (C6509o) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }
}
