package p080fb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p037cb.C2065g;
import p154kb.C6235i;

public class C4341g implements AbstractC4345j {
    public final Handler f14419a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        @Override
        public final boolean handleMessage(Message message) {
            boolean q;
            q = C4341g.this.m28234q(message);
            return q;
        }
    });
    public AbstractC4342a f14420b;
    public List<Reference<View>> f14421c;

    public interface AbstractC4342a {
        void mo13519a();
    }

    public boolean m28234q(Message message) {
        int i = message.what;
        if (i == 0) {
            invalidate();
        } else if (i == 1) {
            ((View) message.obj).requestLayout();
        }
        return true;
    }

    @Override
    public boolean mo18573a() {
        AbstractC4342a aVar = this.f14420b;
        if (aVar == null) {
            return false;
        }
        aVar.mo13519a();
        return true;
    }

    @Override
    public void mo28230b(Rect rect) {
        List<Reference<View>> list = this.f14421c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view != null) {
                    view.invalidate(rect);
                } else {
                    this.f14421c.remove(size);
                }
            }
        }
    }

    @Override
    public boolean mo28229c(View view) {
        List<Reference<View>> list = this.f14421c;
        if (list == null) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            View view2 = this.f14421c.get(size).get();
            if (view2 == null) {
                this.f14421c.remove(size);
            } else if (view2 == view) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo28228d(int i, int i2, int i3, int i4) {
        List<Reference<View>> list = this.f14421c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view != null) {
                    view.invalidate(i, i2, i3, i4);
                } else {
                    this.f14421c.remove(size);
                }
            }
        }
    }

    @Override
    public void mo28227e() {
        View f = mo28226f();
        if (f != null) {
            C2065g.m35719c(f);
        }
    }

    @Override
    public View mo28226f() {
        List<Reference<View>> list = this.f14421c;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = this.f14421c.get(size).get();
            if (view != null) {
                return view;
            }
            this.f14421c.remove(size);
        }
        return null;
    }

    @Override
    public boolean mo28225g() {
        List<Reference<View>> list = this.f14421c;
        return list != null && !list.isEmpty();
    }

    @Override
    public void mo28224h() {
        Handler handler = this.f14419a;
        handler.sendMessage(handler.obtainMessage(0));
    }

    @Override
    public void invalidate() {
        List<Reference<View>> list = this.f14421c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view != null) {
                    view.invalidate();
                } else {
                    this.f14421c.remove(size);
                }
            }
        }
    }

    public final boolean m28241j(View view) {
        if (view != null) {
            if (this.f14421c == null) {
                this.f14421c = new ArrayList(2);
            }
            if (this.f14421c.isEmpty()) {
                this.f14421c.add(new WeakReference(view));
                return true;
            }
            boolean z = false;
            for (int size = this.f14421c.size() - 1; size >= 0; size--) {
                View view2 = this.f14421c.get(size).get();
                if (view2 == null) {
                    this.f14421c.remove(size);
                } else if (view2.equals(view)) {
                    z = true;
                }
            }
            if (!z) {
                this.f14421c.add(new WeakReference(view));
                return true;
            }
        } else {
            C6235i.m21012d(this.f14421c);
        }
        return false;
    }

    public final int m28240k() {
        List<Reference<View>> list = this.f14421c;
        int i = 0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                this.f14421c.remove(size);
                if (view != null) {
                    i++;
                }
            }
        }
        return i;
    }

    public final boolean m28239l(View view) {
        List<Reference<View>> list = this.f14421c;
        boolean z = false;
        if (list != null) {
            if (view != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    View view2 = this.f14421c.get(size).get();
                    if (view2 == null) {
                        this.f14421c.remove(size);
                    } else if (view2.equals(view)) {
                        this.f14421c.remove(size);
                        z = true;
                    }
                }
                return z;
            }
            C6235i.m21012d(list);
        }
        return false;
    }

    public int m28238m() {
        View f = mo28226f();
        if (f != null) {
            return f.getMeasuredWidth();
        }
        return 0;
    }

    public List<Reference<View>> m28237n() {
        return this.f14421c;
    }

    public void m28236o() {
        List<Reference<View>> list = this.f14421c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((View) parent).invalidate();
                    }
                } else {
                    this.f14421c.remove(size);
                }
            }
        }
    }

    public void m28235p(int i, int i2, int i3, int i4) {
        List<Reference<View>> list = this.f14421c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((View) parent).invalidate(i, i2, i3, i4);
                    }
                } else {
                    this.f14421c.remove(size);
                }
            }
        }
    }

    public C4341g m28233r(AbstractC4342a aVar) {
        this.f14420b = aVar;
        return this;
    }

    @Override
    public void requestLayout() {
        if (this.f14421c != null) {
            boolean z = Looper.myLooper() != Looper.getMainLooper();
            for (int size = this.f14421c.size() - 1; size >= 0; size--) {
                View view = this.f14421c.get(size).get();
                if (view == null) {
                    this.f14421c.remove(size);
                } else if (z) {
                    Handler handler = this.f14419a;
                    handler.sendMessage(handler.obtainMessage(1, view));
                } else {
                    view.requestLayout();
                }
            }
        }
    }
}
