package p168ld;

import android.os.Message;
import p082fd.C4384m;

public class C6513p extends C4384m {
    public C6513p(int i) {
        super("GifThread#" + i);
    }

    @Override
    public void mo3052f(Message message) {
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            ((C6496e) objArr[0]).m20339P((String) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i == 1) {
            ((C6496e) message.obj).m20346I();
        } else if (i == 2) {
            ((C6496e) message.obj).m20345J();
        } else if (i == 3) {
            ((C6496e) message.obj).m20350E();
        }
    }

    public void m20192i(C6496e eVar) {
        m28052h(Message.obtain(m28055d(), 3, eVar), 0L);
    }

    public void m20191j(C6496e eVar) {
        m28052h(Message.obtain(m28055d(), 1, eVar), 0L);
    }

    public void m20190k(C6496e eVar) {
        m28052h(Message.obtain(m28055d(), 2, eVar), 0L);
    }

    public void m20189l(C6496e eVar, String str) {
        m28052h(Message.obtain(m28055d(), 0, new Object[]{eVar, str}), 0L);
    }
}
