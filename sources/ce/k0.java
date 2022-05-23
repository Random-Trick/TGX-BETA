package ce;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;
import d.j;
import gb.d;
import gb.e;
import gd.w;
import hd.v2;
import ib.i;
import ie.y0;
import java.io.File;
import ne.s3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.q1;
import ud.v4;
import zd.d9;
import zd.t1;

public class k0 extends Handler {
    public k0(Context context) {
        super(context.getMainLooper());
    }

    public void a() {
        sendMessage(Message.obtain(this, 41, 0, 0));
    }

    public void b(CharSequence charSequence, int i10) {
        sendMessage(Message.obtain(this, 28, i10, 0, charSequence));
    }

    public void c(boolean z10) {
        sendMessage(Message.obtain(this, 9, z10 ? 1 : 0, 0));
    }

    public void d() {
        sendMessage(Message.obtain(this, 20));
    }

    public void e(View view) {
        sendMessage(Message.obtain(this, 23, view));
    }

    public void f(v4<?> v4Var) {
        sendMessage(Message.obtain(this, 2, 0, 0, v4Var));
    }

    @Deprecated
    public void g(Context context, long j10, boolean z10, boolean z11) {
        if (j10 <= 0) {
            sendMessage(Message.obtain(this, 15, z10, z11, context));
        } else {
            sendMessageDelayed(Message.obtain(this, 15, z10 ? 1 : 0, z11 ? 1 : 0, context), j10);
        }
    }

    public void h(d9 d9Var, String str, File file, String str2, int i10) {
        sendMessage(Message.obtain(this, 7, i10, 0, new Object[]{d9Var, str, file, str2}));
    }

    @Override
    public void handleMessage(Message message) {
        boolean z10 = true;
        switch (message.what) {
            case 1:
                Toast.makeText(j0.q(), (CharSequence) message.obj, message.arg1).show();
                return;
            case 2:
                v4<?> v4Var = (v4) message.obj;
                ((MainActivity) v4Var.t()).f5(v4Var);
                return;
            case 3:
            case 4:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            case 18:
            case 22:
            case j.K3:
            case 25:
            case 26:
            case 31:
            case 35:
            case 37:
            case 39:
            case 40:
            default:
                return;
            case 5:
                x.f((View) message.obj);
                return;
            case 6:
                ((y0) message.obj).H4();
                return;
            case 7:
                Object[] objArr = (Object[]) message.obj;
                v0.m2((d9) objArr[0], (String) objArr[1], (File) objArr[2], (String) objArr[3], message.arg1);
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                objArr[3] = null;
                return;
            case 8:
                try {
                    v4<?> v4Var2 = (v4) message.obj;
                    q1 x10 = j0.x();
                    if (x10 != null) {
                        int i10 = message.arg2;
                        boolean z11 = (i10 & 1) == 1;
                        if ((i10 & 2) != 2) {
                            z10 = false;
                        }
                        x10.E0(v4Var2, z11, z10);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.w("Cannot set controller", th, new Object[0]);
                    return;
                }
            case 9:
                t1 b10 = t1.b();
                if (message.arg1 != 1) {
                    z10 = false;
                }
                b10.c(z10);
                return;
            case 13:
                v.x((String) message.obj);
                return;
            case 14:
                if (message.arg1 != 1) {
                    z10 = false;
                }
                v.t(z10);
                return;
            case 15:
                Context context = (Context) message.obj;
                boolean z12 = message.arg1 == 1;
                if (message.arg2 != 1) {
                    z10 = false;
                }
                v.o(context, z12, z10);
                return;
            case 19:
                Object[] objArr2 = (Object[]) message.obj;
                a E = j0.E();
                if (E != null) {
                    E.D3((String) objArr2[0], (a.l) objArr2[1]);
                }
                objArr2[0] = null;
                objArr2[1] = null;
                return;
            case 20:
                a E2 = j0.E();
                if (E2 != null) {
                    E2.m1(false);
                    return;
                }
                return;
            case 21:
                v.B((String) message.obj);
                return;
            case 23:
                ((View) message.obj).invalidate();
                return;
            case 27:
                ((d) message.obj).invalidate();
                return;
            case 28:
                try {
                    CharSequence charSequence = (CharSequence) message.obj;
                    ClipboardManager clipboardManager = (ClipboardManager) j0.q().getSystemService("clipboard");
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("Telegram X", charSequence));
                    }
                    int i11 = message.arg1;
                    if (i11 != 0) {
                        n(i11, 0, 0);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.w("Failed to copy text", th2, new Object[0]);
                    r(R.string.CopyTextFailed, 0);
                    return;
                }
            case j.P3:
                ((View) message.obj).requestLayout();
                ((View) message.obj).invalidate();
                return;
            case 30:
                ((e) message.obj).requestLayout();
                return;
            case Log.TAG_IMAGE_LOADER:
                v2 v2Var = (v2) message.obj;
                v2Var.c().C(v2Var, v2Var.b(), Float.intBitsToFloat(message.arg1));
                return;
            case 33:
                v2 v2Var2 = (v2) message.obj;
                if (message.arg1 != 1) {
                    z10 = false;
                }
                v2Var2.c().A(v2Var2, v2Var2.b(), z10);
                return;
            case 34:
                q1 x11 = j0.x();
                if (x11 != null) {
                    x11.g0();
                    return;
                }
                return;
            case 36:
                v.n();
                return;
            case 38:
                Context q10 = j0.q();
                if (q10 != null) {
                    Toast toast = new Toast(q10);
                    s3 s3Var = new s3(q10);
                    s3Var.setText((CharSequence) message.obj);
                    toast.setGravity(17, 0, message.arg2);
                    toast.setView(s3Var);
                    toast.show();
                    return;
                }
                return;
            case 41:
                a E3 = j0.E();
                if (E3 != null) {
                    E3.m0();
                    return;
                }
                return;
        }
    }

    public void i(long j10, boolean z10) {
        if (j10 <= 0) {
            sendMessage(Message.obtain(this, 14, z10, 0));
        } else {
            sendMessageDelayed(Message.obtain(this, 14, z10 ? 1 : 0, 0), j10);
        }
    }

    public void j(String str) {
        sendMessage(Message.obtain(this, 13, str));
    }

    public void k(String str) {
        sendMessage(Message.obtain(this, 21, str));
    }

    public void l(v2 v2Var, boolean z10) {
        sendMessage(Message.obtain(this, 33, z10 ? 1 : 0, 0, v2Var));
    }

    public void m(v2 v2Var, float f10) {
        sendMessage(Message.obtain(this, 32, Float.floatToIntBits(f10), 0, v2Var));
    }

    public void n(int i10, int i11, int i12) {
        sendMessage(Message.obtain(this, 38, i11, i12, w.i1(i10)));
    }

    public void o(CharSequence charSequence, int i10, int i11) {
        sendMessage(Message.obtain(this, 38, i10, i11, charSequence));
    }

    public void p(View view, boolean z10) {
        sendMessageDelayed(Message.obtain(this, 5, z10 ? 1 : 0, 0, view), 120L);
    }

    public void q(String str, a.l lVar) {
        sendMessage(Message.obtain(this, 19, new Object[]{str, lVar}));
    }

    public void r(int i10, int i11) {
        if (i10 != 0) {
            String i12 = w.i1(i10);
            if (!i.i(i12)) {
                sendMessage(Message.obtain(this, 1, i11, 0, i12));
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void s(CharSequence charSequence, int i10) {
        if (charSequence == null) {
            throw new IllegalArgumentException();
        } else if (!i.i(charSequence)) {
            sendMessage(Message.obtain(this, 1, i10, 0, charSequence));
        }
    }

    public void t(y0 y0Var) {
        sendMessage(Message.obtain(this, 6, y0Var));
    }

    public void u(y0 y0Var, long j10) {
        if (j10 <= 0) {
            t(y0Var);
        } else {
            sendMessageDelayed(Message.obtain(this, 6, y0Var), j10);
        }
    }
}
