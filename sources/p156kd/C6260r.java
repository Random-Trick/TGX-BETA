package p156kd;

import android.graphics.Bitmap;
import android.os.Message;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.C7906a;
import org.thunderdog.challegram.loader.ImageLoader;
import p082fd.C4384m;

public class C6260r extends C4384m {
    public C6260r() {
        super("ImageThread");
    }

    @Override
    public void mo3052f(Message message) {
        int i = message.what;
        boolean z = false;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            ImageLoader.m14392e().m14385l((C6246h) objArr[0], (C6267y) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i == 1) {
            ImageLoader.m14392e().m14386k((C6267y) message.obj);
        } else if (i == 2) {
            Object[] objArr2 = (Object[]) message.obj;
            ((C7906a) objArr2[0]).m14376i((TdApi.File) objArr2[1]);
            objArr2[0] = null;
            objArr2[1] = null;
        } else if (i == 3) {
            Object[] objArr3 = (Object[]) message.obj;
            ImageLoader.m14392e().m14387j((C6246h) objArr3[0], message.arg1 == 1, (Bitmap) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        } else if (i == 4) {
            ImageLoader e = ImageLoader.m14392e();
            int i2 = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            }
            e.m14394c(i2, z);
        } else if (i == 5) {
            Object[] objArr4 = (Object[]) message.obj;
            ImageLoader.m14392e().m14393d((C6251j) objArr4[0], (TdApi.File) objArr4[1]);
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    public void m20783i(int i, boolean z) {
        m28050h(Message.obtain(m28053d(), 4, i, z ? 1 : 0), 0L);
    }

    public void m20782j(C6251j jVar, TdApi.File file) {
        m28050h(Message.obtain(m28053d(), 5, new Object[]{jVar, file}), 0L);
    }

    public void m20781k(C7906a aVar, TdApi.File file) {
        m28050h(Message.obtain(m28053d(), 2, new Object[]{aVar, file}), 0L);
    }

    public void m20780l(C6246h hVar, boolean z, Bitmap bitmap) {
        m28050h(Message.obtain(m28053d(), 3, z ? 1 : 0, 0, new Object[]{hVar, bitmap}), 0L);
    }

    public void m20779m(C6267y yVar) {
        m28050h(Message.obtain(m28053d(), 1, yVar), 0L);
    }

    public void m20778n(C6246h hVar, C6267y yVar) {
        m28050h(Message.obtain(m28053d(), 0, new Object[]{hVar, yVar}), 0L);
    }
}
