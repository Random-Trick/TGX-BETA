package md;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.thunderdog.challegram.loader.gif.GifBridge;

public class l extends Handler {
    public l() {
        super(Looper.getMainLooper());
    }

    public void a(j jVar, o oVar) {
        sendMessage(Message.obtain(this, 3, new Object[]{jVar, oVar}));
    }

    public void b(m mVar, j jVar, o oVar) {
        sendMessage(Message.obtain(this, 2, new Object[]{mVar, jVar, oVar}));
    }

    public void c(m mVar, j jVar, float f10) {
        sendMessage(Message.obtain(this, 1, Float.floatToIntBits(f10), 0, new Object[]{mVar, jVar}));
    }

    @Override
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Object[] objArr = (Object[]) message.obj;
            ((m) objArr[0]).o((j) objArr[1], Float.intBitsToFloat(message.arg1));
            objArr[0] = null;
            objArr[1] = null;
        } else if (i10 == 2) {
            Object[] objArr2 = (Object[]) message.obj;
            ((m) objArr2[0]).n((j) objArr2[1], (o) objArr2[2]);
            objArr2[0] = null;
            objArr2[1] = null;
            objArr2[2] = null;
        } else if (i10 == 3) {
            Object[] objArr3 = (Object[]) message.obj;
            GifBridge.f().k((j) objArr3[0], (o) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }
}
