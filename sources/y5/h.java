package y5;

import android.os.Handler;
import android.os.Looper;

public class h extends Handler {
    public h(Looper looper) {
        super(looper);
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
