package md;

import android.os.Message;
import gd.m;

public class p extends m {
    public p(int i10) {
        super("GifThread#" + i10);
    }

    @Override
    public void f(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            Object[] objArr = (Object[]) message.obj;
            ((e) objArr[0]).P((String) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i10 == 1) {
            ((e) message.obj).I();
        } else if (i10 == 2) {
            ((e) message.obj).J();
        } else if (i10 == 3) {
            ((e) message.obj).E();
        }
    }

    public void i(e eVar) {
        h(Message.obtain(d(), 3, eVar), 0L);
    }

    public void j(e eVar) {
        h(Message.obtain(d(), 1, eVar), 0L);
    }

    public void k(e eVar) {
        h(Message.obtain(d(), 2, eVar), 0L);
    }

    public void l(e eVar, String str) {
        h(Message.obtain(d(), 0, new Object[]{eVar, str}), 0L);
    }
}
