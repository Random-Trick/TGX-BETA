package ld;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

public class m extends Handler {
    public void a(p pVar) {
        sendMessage(Message.obtain(this, 1, pVar));
    }

    public void b(p pVar, h hVar, Bitmap bitmap) {
        sendMessage(Message.obtain(this, 2, new Object[]{pVar, hVar, bitmap}));
    }

    public void c(p pVar) {
        sendMessage(Message.obtain(this, 0, pVar));
    }

    @Override
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            ((p) message.obj).invalidate();
        } else if (i10 == 1) {
            ((p) message.obj).c();
        } else if (i10 == 2) {
            Object[] objArr = (Object[]) message.obj;
            ((p) objArr[0]).K((h) objArr[1], (Bitmap) objArr[2]);
            objArr[0] = null;
            objArr[1] = null;
            objArr[2] = null;
        }
    }
}
