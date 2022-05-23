package ld;

import android.graphics.Bitmap;
import android.os.Message;
import gd.m;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.a;

public class r extends m {
    public r() {
        super("ImageThread");
    }

    @Override
    public void f(Message message) {
        int i10 = message.what;
        boolean z10 = false;
        if (i10 == 0) {
            Object[] objArr = (Object[]) message.obj;
            ImageLoader.e().l((h) objArr[0], (y) objArr[1]);
            objArr[0] = null;
            objArr[1] = null;
        } else if (i10 == 1) {
            ImageLoader.e().k((y) message.obj);
        } else if (i10 == 2) {
            Object[] objArr2 = (Object[]) message.obj;
            ((a) objArr2[0]).i((TdApi.File) objArr2[1]);
            objArr2[0] = null;
            objArr2[1] = null;
        } else if (i10 == 3) {
            Object[] objArr3 = (Object[]) message.obj;
            ImageLoader.e().j((h) objArr3[0], message.arg1 == 1, (Bitmap) objArr3[1]);
            objArr3[0] = null;
            objArr3[1] = null;
        } else if (i10 == 4) {
            ImageLoader e10 = ImageLoader.e();
            int i11 = message.arg1;
            if (message.arg2 == 1) {
                z10 = true;
            }
            e10.c(i11, z10);
        } else if (i10 == 5) {
            Object[] objArr4 = (Object[]) message.obj;
            ImageLoader.e().d((j) objArr4[0], (TdApi.File) objArr4[1]);
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    public void i(int i10, boolean z10) {
        h(Message.obtain(d(), 4, i10, z10 ? 1 : 0), 0L);
    }

    public void j(j jVar, TdApi.File file) {
        h(Message.obtain(d(), 5, new Object[]{jVar, file}), 0L);
    }

    public void k(a aVar, TdApi.File file) {
        h(Message.obtain(d(), 2, new Object[]{aVar, file}), 0L);
    }

    public void l(h hVar, boolean z10, Bitmap bitmap) {
        h(Message.obtain(d(), 3, z10 ? 1 : 0, 0, new Object[]{hVar, bitmap}), 0L);
    }

    public void m(y yVar) {
        h(Message.obtain(d(), 1, yVar), 0L);
    }

    public void n(h hVar, y yVar) {
        h(Message.obtain(d(), 0, new Object[]{hVar, yVar}), 0L);
    }
}
