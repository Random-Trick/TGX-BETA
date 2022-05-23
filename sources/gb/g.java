package gb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import lb.d;

public class g implements j {
    public a f12189b;
    public final d<View> f12190c = new d<>(false, false, null);
    public final Handler f12188a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        @Override
        public final boolean handleMessage(Message message) {
            boolean q10;
            q10 = g.this.q(message);
            return q10;
        }
    });

    public interface a {
        void a();
    }

    public boolean q(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            invalidate();
        } else if (i10 == 1) {
            ((View) message.obj).requestLayout();
        }
        return true;
    }

    @Override
    public boolean a() {
        a aVar = this.f12189b;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    @Override
    public void b(Rect rect) {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            it.next().invalidate(rect);
        }
    }

    @Override
    public boolean c(View view) {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            if (it.next() == view) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(int i10, int i11, int i12, int i13) {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            it.next().invalidate(i10, i11, i12, i13);
        }
    }

    @Override
    public void e() {
        View f10 = f();
        if (f10 != null) {
            db.g.c(f10);
        }
    }

    @Override
    public View f() {
        Iterator<View> it = this.f12190c.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Override
    public boolean g() {
        return !this.f12190c.isEmpty();
    }

    @Override
    public void h() {
        Handler handler = this.f12188a;
        handler.sendMessage(handler.obtainMessage(0));
    }

    @Override
    public void invalidate() {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            it.next().invalidate();
        }
    }

    public final boolean j(View view) {
        return view != null && this.f12190c.add(view);
    }

    public final void k() {
        this.f12190c.clear();
    }

    public final boolean l(View view) {
        return view != null && this.f12190c.remove(view);
    }

    public int m() {
        View f10 = f();
        if (f10 != null) {
            return f10.getMeasuredWidth();
        }
        return 0;
    }

    public d<View> n() {
        return this.f12190c;
    }

    public void o() {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            ViewParent parent = it.next().getParent();
            if (parent != null) {
                ((View) parent).invalidate();
            }
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            ViewParent parent = it.next().getParent();
            if (parent != null) {
                ((View) parent).invalidate(i10, i11, i12, i13);
            }
        }
    }

    public g r(a aVar) {
        this.f12189b = aVar;
        return this;
    }

    @Override
    public void requestLayout() {
        boolean z10 = Looper.myLooper() != Looper.getMainLooper();
        Iterator<View> it = this.f12190c.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (z10) {
                Handler handler = this.f12188a;
                handler.sendMessage(handler.obtainMessage(1, next));
            } else {
                next.requestLayout();
            }
        }
    }
}
