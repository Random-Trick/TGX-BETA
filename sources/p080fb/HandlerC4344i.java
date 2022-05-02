package p080fb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

public final class HandlerC4344i extends Handler {
    public HandlerC4344i() {
        super(Looper.getMainLooper());
    }

    public void m28232a(View view) {
        removeMessages(0, view);
    }

    public void m28231b(View view, long j) {
        Message obtain = Message.obtain(this, 0, view);
        if (j > 0) {
            sendMessageDelayed(obtain, j);
        } else {
            sendMessage(obtain);
        }
    }

    @Override
    public void handleMessage(Message message) {
        if (message.what == 0) {
            Object obj = message.obj;
            if (obj instanceof View) {
                ((View) obj).invalidate();
            } else if (obj instanceof AbstractC4345j) {
                ((AbstractC4345j) obj).invalidate();
            }
        }
    }
}
