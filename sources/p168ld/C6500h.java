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
            ((C6496e) message.obj).m20347H(true);
        }
    }

    public C6500h() {
        super("GifThread");
    }

    @Override
    public Handler mo20314b() {
        return new HandlerC6501a();
    }

    @Override
    public void mo3052f(Message message) {
        int i = message.what;
        if (i == 1) {
            Object[] objArr = (Object[]) message.obj;
            GifBridge.m14340f().m14330p((C6503j) objArr[0], (C6516s) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i == 2) {
            GifBridge.m14340f().m14331o((C6516s) message.obj);
        } else if (i == 3) {
            Object[] objArr2 = (Object[]) message.obj;
            ((C6496e) objArr2[0]).m20348G((TdApi.File) objArr2[1]);
            objArr2[0] = null;
            objArr2[1] = null;
        } else if (i == 4) {
            Object[] objArr3 = (Object[]) message.obj;
            GifBridge.m14340f().m14334l((C6503j) objArr3[0], (C6509o) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        } else if (i == 6) {
            ((C6496e) message.obj).m20351D();
        }
    }

    public boolean m20313i(C6496e eVar, int i) {
        return !m28056c().hasMessages(i, eVar);
    }

    public void m20312j(C6496e eVar) {
        eVar.m20351D();
    }

    public void m20311k(C6503j jVar, C6509o oVar) {
        m28052h(Message.obtain(m28055d(), 4, new Object[]{jVar, oVar}), 0L);
    }

    public void m20310l(C6496e eVar, TdApi.File file) {
        m28052h(Message.obtain(m28055d(), 3, new Object[]{eVar, file}), 0L);
    }

    public void m20309m(C6516s sVar) {
        m28052h(Message.obtain(m28055d(), 2, sVar), 0L);
    }

    public void m20308n(C6503j jVar, C6516s sVar) {
        m28052h(Message.obtain(m28055d(), 1, new Object[]{jVar, sVar}), 0L);
    }

    public boolean m20307o(C6496e eVar, int i, int i2, boolean z) {
        Handler c = m28056c();
        if (z) {
            c.removeMessages(i, eVar);
        } else if (c.hasMessages(i, eVar)) {
            return false;
        }
        c.sendMessageDelayed(Message.obtain(c, i, 0, 0, eVar), i2);
        return true;
    }
}
