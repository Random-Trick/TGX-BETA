package md;

import android.os.Handler;
import android.os.Message;
import gd.m;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.gif.GifBridge;

public class h extends m {

    public static class a extends Handler {
        public a() {
        }

        @Override
        public void handleMessage(Message message) {
            ((e) message.obj).H(true);
        }
    }

    public h() {
        super("GifThread");
    }

    @Override
    public Handler b() {
        return new a();
    }

    @Override
    public void f(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Object[] objArr = (Object[]) message.obj;
            GifBridge.f().p((j) objArr[0], (s) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i10 == 2) {
            GifBridge.f().o((s) message.obj);
        } else if (i10 == 3) {
            Object[] objArr2 = (Object[]) message.obj;
            ((e) objArr2[0]).G((TdApi.File) objArr2[1]);
            objArr2[0] = null;
            objArr2[1] = null;
        } else if (i10 == 4) {
            Object[] objArr3 = (Object[]) message.obj;
            GifBridge.f().l((j) objArr3[0], (o) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        } else if (i10 == 6) {
            ((e) message.obj).D();
        }
    }

    public boolean i(e eVar, int i10) {
        return !c().hasMessages(i10, eVar);
    }

    public void j(e eVar) {
        eVar.D();
    }

    public void k(j jVar, o oVar) {
        h(Message.obtain(d(), 4, new Object[]{jVar, oVar}), 0L);
    }

    public void l(e eVar, TdApi.File file) {
        h(Message.obtain(d(), 3, new Object[]{eVar, file}), 0L);
    }

    public void m(s sVar) {
        h(Message.obtain(d(), 2, sVar), 0L);
    }

    public void n(j jVar, s sVar) {
        h(Message.obtain(d(), 1, new Object[]{jVar, sVar}), 0L);
    }

    public boolean o(e eVar, int i10, int i11, boolean z10) {
        Handler c10 = c();
        if (z10) {
            c10.removeMessages(i10, eVar);
        } else if (c10.hasMessages(i10, eVar)) {
            return false;
        }
        c10.sendMessageDelayed(Message.obtain(c10, i10, 0, 0, eVar), i11);
        return true;
    }
}
