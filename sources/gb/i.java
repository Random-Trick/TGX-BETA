package gb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

public final class i extends Handler {
    public i() {
        super(Looper.getMainLooper());
    }

    public void a(View view) {
        removeMessages(0, view);
    }

    public void b(View view, long j10) {
        Message obtain = Message.obtain(this, 0, view);
        if (j10 > 0) {
            sendMessageDelayed(obtain, j10);
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
            } else if (obj instanceof j) {
                ((j) obj).invalidate();
            }
        }
    }
}
