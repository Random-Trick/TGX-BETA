package org.thunderdog.challegram.loader;

import android.os.Message;
import org.thunderdog.challegram.loader.C7907b;
import p082fd.C4384m;
import p156kd.C6246h;

public class C7911c extends C4384m {
    public C7911c() {
        super("ImageReaderThread");
    }

    @Override
    public void mo3052f(Message message) {
        if (message.what == 0) {
            Object[] objArr = (Object[]) message.obj;
            C7907b.m14361k().m14355q((C7906a) objArr[0], (C6246h) objArr[1], (String) objArr[2], (C7907b.AbstractC7910c) objArr[3]);
            objArr[0] = null;
            objArr[1] = null;
            objArr[2] = null;
            objArr[3] = null;
        }
    }

    public void m14346i(C7906a aVar, C6246h hVar, String str, C7907b.AbstractC7910c cVar) {
        m28052h(Message.obtain(m28055d(), 0, new Object[]{aVar, hVar, str, cVar}), 0L);
    }
}
