package org.thunderdog.challegram.loader;

import android.os.Message;
import gd.m;
import ld.h;
import org.thunderdog.challegram.loader.b;

public class c extends m {
    public c() {
        super("ImageReaderThread");
    }

    @Override
    public void f(Message message) {
        if (message.what == 0) {
            Object[] objArr = (Object[]) message.obj;
            b.k().q((a) objArr[0], (h) objArr[1], (String) objArr[2], (b.c) objArr[3]);
            objArr[0] = null;
            objArr[1] = null;
            objArr[2] = null;
            objArr[3] = null;
        }
    }

    public void i(a aVar, h hVar, String str, b.c cVar) {
        h(Message.obtain(d(), 0, new Object[]{aVar, hVar, str, cVar}), 0L);
    }
}
