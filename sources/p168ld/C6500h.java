package p168ld;

import android.os.Handler;
import android.os.Message;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.gif.GifBridge;
import p082fd.C4384m;

public class C6500h extends C4384m {

    public static class HandlerC6501a extends Handler {
        public HandlerC6501a() {
        }

        @Override
        public void handleMessage(Message message) {
            ((C6496e) message.obj).m20346H(true);
        }
    }

    public C6500h() {
        super("GifThread");
    }

    @Override
    public Handler mo20313b() {
        return new HandlerC6501a();
    }

    @Override
    public void mo3052f(Message message) {
        int i = message.what;
        if (i == 1) {
            Object[] objArr = (Object[]) message.obj;
            GifBridge.m14341f().m14331p((C6503j) objArr[0], (C6516s) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i == 2) {
            GifBridge.m14341f().m14332o((C6516s) message.obj);
        } else if (i == 3) {
            Object[] objArr2 = (Object[]) message.obj;
            ((C6496e) objArr2[0]).m20347G((TdApi.File) objArr2[1]);
            objArr2[0] = null;
            objArr2[1] = null;
        } else if (i == 4) {
            Object[] objArr3 = (Object[]) message.obj;
            GifBridge.m14341f().m14335l((C6503j) objArr3[0], (C6509o) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        } else if (i == 6) {
            ((C6496e) message.obj).m20350D();
        }
    }

    public boolean m20312i(C6496e eVar, int i) {
        return !m28054c().hasMessages(i, eVar);
    }

    public void m20311j(C6496e eVar) {
        eVar.m20350D();
    }

    public void m20310k(C6503j jVar, C6509o oVar) {
        m28050h(Message.obtain(m28053d(), 4, new Object[]{jVar, oVar}), 0L);
    }

    public void m20309l(C6496e eVar, TdApi.File file) {
        m28050h(Message.obtain(m28053d(), 3, new Object[]{eVar, file}), 0L);
    }

    public void m20308m(C6516s sVar) {
        m28050h(Message.obtain(m28053d(), 2, sVar), 0L);
    }

    public void m20307n(C6503j jVar, C6516s sVar) {
        m28050h(Message.obtain(m28053d(), 1, new Object[]{jVar, sVar}), 0L);
    }

    public boolean m20306o(C6496e eVar, int i, int i2, boolean z) {
        Handler c = m28054c();
        if (z) {
            c.removeMessages(i, eVar);
        } else if (c.hasMessages(i, eVar)) {
            return false;
        }
        c.sendMessageDelayed(Message.obtain(c, i, 0, 0, eVar), i2);
        return true;
    }
}
