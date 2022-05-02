package p156kd;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

public class HandlerC6254m extends Handler {
    public void m20830a(C6257p pVar) {
        sendMessage(Message.obtain(this, 1, pVar));
    }

    public void m20829b(C6257p pVar, C6246h hVar, Bitmap bitmap) {
        sendMessage(Message.obtain(this, 2, new Object[]{pVar, hVar, bitmap}));
    }

    public void m20828c(C6257p pVar) {
        sendMessage(Message.obtain(this, 0, pVar));
    }

    @Override
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((C6257p) message.obj).invalidate();
        } else if (i == 1) {
            ((C6257p) message.obj).m20812c();
        } else if (i == 2) {
            Object[] objArr = (Object[]) message.obj;
            ((C6257p) objArr[0]).m20816K((C6246h) objArr[1], (Bitmap) objArr[2]);
            objArr[0] = null;
            objArr[1] = null;
            objArr[2] = null;
        }
    }
}
