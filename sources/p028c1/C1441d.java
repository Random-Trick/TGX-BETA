package p028c1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class C1441d {
    public final AbstractC1442a f5265a;

    public interface AbstractC1442a {
        boolean mo36906a(MotionEvent motionEvent);
    }

    public static class C1443b implements AbstractC1442a {
        public static final int f5266v = ViewConfiguration.getTapTimeout();
        public static final int f5267w = ViewConfiguration.getDoubleTapTimeout();
        public int f5268a;
        public int f5269b;
        public int f5270c;
        public int f5271d;
        public final Handler f5272e;
        public final GestureDetector.OnGestureListener f5273f;
        public GestureDetector.OnDoubleTapListener f5274g;
        public boolean f5275h;
        public boolean f5276i;
        public boolean f5277j;
        public boolean f5278k;
        public boolean f5279l;
        public MotionEvent f5280m;
        public MotionEvent f5281n;
        public boolean f5282o;
        public float f5283p;
        public float f5284q;
        public float f5285r;
        public float f5286s;
        public boolean f5287t;
        public VelocityTracker f5288u;

        public C1443b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f5272e = new HandlerC1444a(handler);
            } else {
                this.f5272e = new HandlerC1444a();
            }
            this.f5273f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                m36907g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m36909e(context);
        }

        @Override
        public boolean mo36906a(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: p028c1.C1441d.C1443b.mo36906a(android.view.MotionEvent):boolean");
        }

        public final void m36912b() {
            this.f5272e.removeMessages(1);
            this.f5272e.removeMessages(2);
            this.f5272e.removeMessages(3);
            this.f5288u.recycle();
            this.f5288u = null;
            this.f5282o = false;
            this.f5275h = false;
            this.f5278k = false;
            this.f5279l = false;
            this.f5276i = false;
            if (this.f5277j) {
                this.f5277j = false;
            }
        }

        public final void m36911c() {
            this.f5272e.removeMessages(1);
            this.f5272e.removeMessages(2);
            this.f5272e.removeMessages(3);
            this.f5282o = false;
            this.f5278k = false;
            this.f5279l = false;
            this.f5276i = false;
            if (this.f5277j) {
                this.f5277j = false;
            }
        }

        public void m36910d() {
            this.f5272e.removeMessages(3);
            this.f5276i = false;
            this.f5277j = true;
            this.f5273f.onLongPress(this.f5280m);
        }

        public final void m36909e(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f5273f != null) {
                this.f5287t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f5270c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f5271d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f5268a = scaledTouchSlop * scaledTouchSlop;
                this.f5269b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public final boolean m36908f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f5279l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f5267w) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f5269b;
        }

        public void m36907g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f5274g = onDoubleTapListener;
        }

        public class HandlerC1444a extends Handler {
            public HandlerC1444a() {
            }

            @Override
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C1443b bVar = C1443b.this;
                    bVar.f5273f.onShowPress(bVar.f5280m);
                } else if (i == 2) {
                    C1443b.this.m36910d();
                } else if (i == 3) {
                    C1443b bVar2 = C1443b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f5274g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f5275h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f5280m);
                    } else {
                        bVar2.f5276i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            public HandlerC1444a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    public static class C1445c implements AbstractC1442a {
        public final GestureDetector f5290a;

        public C1445c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f5290a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override
        public boolean mo36906a(MotionEvent motionEvent) {
            return this.f5290a.onTouchEvent(motionEvent);
        }
    }

    public C1441d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean m36913a(MotionEvent motionEvent) {
        return this.f5265a.mo36906a(motionEvent);
    }

    public C1441d(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f5265a = new C1445c(context, onGestureListener, handler);
        } else {
            this.f5265a = new C1443b(context, onGestureListener, handler);
        }
    }
}
