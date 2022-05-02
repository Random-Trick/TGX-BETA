package be;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;
import gd.C4812v2;
import java.io.File;
import me.C7035t3;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import p039d.C3563j;
import p080fb.AbstractC4338d;
import p080fb.AbstractC4339e;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5155y0;
import p350yd.AbstractC10664f9;
import p350yd.C11052v1;
import td.AbstractC9323v4;
import td.C9270q1;

public class HandlerC1382k0 extends Handler {
    public HandlerC1382k0(Context context) {
        super(context.getMainLooper());
    }

    public void m37292a() {
        sendMessage(Message.obtain(this, 41, 0, 0));
    }

    public void m37291b(CharSequence charSequence, int i) {
        sendMessage(Message.obtain(this, 28, i, 0, charSequence));
    }

    public void m37290c(boolean z) {
        sendMessage(Message.obtain(this, 9, z ? 1 : 0, 0));
    }

    public void m37289d() {
        sendMessage(Message.obtain(this, 20));
    }

    public void m37288e(View view) {
        sendMessage(Message.obtain(this, 23, view));
    }

    public void m37287f(AbstractC9323v4<?> v4Var) {
        sendMessage(Message.obtain(this, 2, 0, 0, v4Var));
    }

    @Deprecated
    public void m37286g(Context context, long j, boolean z, boolean z2) {
        if (j <= 0) {
            sendMessage(Message.obtain(this, 15, z, z2, context));
        } else {
            sendMessageDelayed(Message.obtain(this, 15, z ? 1 : 0, z2 ? 1 : 0, context), j);
        }
    }

    public void m37285h(AbstractC10664f9 f9Var, String str, File file, String str2, int i) {
        sendMessage(Message.obtain(this, 7, i, 0, new Object[]{f9Var, str, file, str2}));
    }

    @Override
    public void handleMessage(Message message) {
        boolean z = true;
        switch (message.what) {
            case 1:
                Toast.makeText(C1379j0.m37312q(), (CharSequence) message.obj, message.arg1).show();
                return;
            case 2:
                AbstractC9323v4<?> v4Var = (AbstractC9323v4) message.obj;
                ((MainActivity) v4Var.mo4347s()).m14658d5(v4Var);
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
            case C3563j.f11955K3:
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
                C1408x.m37088f((View) message.obj);
                return;
            case 6:
                ((AbstractC5155y0) message.obj).mo23796O4();
                return;
            case 7:
                Object[] objArr = (Object[]) message.obj;
                C7389v0.m16607m2((AbstractC10664f9) objArr[0], (String) objArr[1], (File) objArr[2], (String) objArr[3], message.arg1);
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                objArr[3] = null;
                return;
            case 8:
                try {
                    AbstractC9323v4<?> v4Var2 = (AbstractC9323v4) message.obj;
                    C9270q1 x = C1379j0.m37298x();
                    if (x != null) {
                        int i = message.arg2;
                        boolean z2 = (i & 1) == 1;
                        if ((i & 2) != 2) {
                            z = false;
                        }
                        x.m9763E0(v4Var2, z2, z);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.m14710w("Cannot set controller", th, new Object[0]);
                    return;
                }
            case 9:
                C11052v1 b = C11052v1.m1768b();
                if (message.arg1 != 1) {
                    z = false;
                }
                b.m1767c(z);
                return;
            case 13:
                C1405v.m37100x((String) message.obj);
                return;
            case 14:
                if (message.arg1 != 1) {
                    z = false;
                }
                C1405v.m37104t(z);
                return;
            case 15:
                Context context = (Context) message.obj;
                boolean z3 = message.arg1 == 1;
                if (message.arg2 != 1) {
                    z = false;
                }
                C1405v.m37109o(context, z3, z);
                return;
            case 19:
                Object[] objArr2 = (Object[]) message.obj;
                AbstractView$OnTouchListenerC7889a E = C1379j0.m37369E();
                if (E != null) {
                    E.m14608C3((String) objArr2[0], (AbstractView$OnTouchListenerC7889a.AbstractC7901l) objArr2[1]);
                }
                objArr2[0] = null;
                objArr2[1] = null;
                return;
            case 20:
                AbstractView$OnTouchListenerC7889a E2 = C1379j0.m37369E();
                if (E2 != null) {
                    E2.m14469l1(false);
                    return;
                }
                return;
            case 21:
                C1405v.m37144B((String) message.obj);
                return;
            case 23:
                ((View) message.obj).invalidate();
                return;
            case 27:
                ((AbstractC4338d) message.obj).invalidate();
                return;
            case 28:
                try {
                    CharSequence charSequence = (CharSequence) message.obj;
                    if (Build.VERSION.SDK_INT >= 11) {
                        ClipboardManager clipboardManager = (ClipboardManager) C1379j0.m37312q().getSystemService("clipboard");
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Telegram X", charSequence));
                        }
                    } else {
                        android.text.ClipboardManager clipboardManager2 = (android.text.ClipboardManager) C1379j0.m37312q().getSystemService("clipboard");
                        if (clipboardManager2 != null) {
                            clipboardManager2.setText(charSequence);
                        }
                    }
                    int i2 = message.arg1;
                    if (i2 != 0) {
                        m37279n(i2, 0, 0);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.m14710w("Failed to copy text", th2, new Object[0]);
                    m37275r(R.string.CopyTextFailed, 0);
                    return;
                }
            case C3563j.f11980P3:
                ((View) message.obj).requestLayout();
                ((View) message.obj).invalidate();
                return;
            case 30:
                ((AbstractC4339e) message.obj).requestLayout();
                return;
            case Log.TAG_IMAGE_LOADER:
                C4812v2 v2Var = (C4812v2) message.obj;
                v2Var.m25204c().mo7394f(v2Var, v2Var.m25205b(), Float.intBitsToFloat(message.arg1));
                return;
            case 33:
                C4812v2 v2Var2 = (C4812v2) message.obj;
                if (message.arg1 != 1) {
                    z = false;
                }
                v2Var2.m25204c().mo7391i(v2Var2, v2Var2.m25205b(), z);
                return;
            case 34:
                C9270q1 x2 = C1379j0.m37298x();
                if (x2 != null) {
                    x2.m9720g0();
                    return;
                }
                return;
            case 36:
                C1405v.m37110n();
                return;
            case 38:
                Context q = C1379j0.m37312q();
                if (q != null) {
                    Toast toast = new Toast(q);
                    C7035t3 t3Var = new C7035t3(q);
                    t3Var.setText((CharSequence) message.obj);
                    toast.setGravity(17, 0, message.arg2);
                    toast.setView(t3Var);
                    toast.show();
                    return;
                }
                return;
            case 41:
                AbstractView$OnTouchListenerC7889a E3 = C1379j0.m37369E();
                if (E3 != null) {
                    E3.m14470l0();
                    return;
                }
                return;
        }
    }

    public void m37284i(long j, boolean z) {
        if (j <= 0) {
            sendMessage(Message.obtain(this, 14, z, 0));
        } else {
            sendMessageDelayed(Message.obtain(this, 14, z ? 1 : 0, 0), j);
        }
    }

    public void m37283j(String str) {
        sendMessage(Message.obtain(this, 13, str));
    }

    public void m37282k(String str) {
        sendMessage(Message.obtain(this, 21, str));
    }

    public void m37281l(C4812v2 v2Var, boolean z) {
        sendMessage(Message.obtain(this, 33, z ? 1 : 0, 0, v2Var));
    }

    public void m37280m(C4812v2 v2Var, float f) {
        sendMessage(Message.obtain(this, 32, Float.floatToIntBits(f), 0, v2Var));
    }

    public void m37279n(int i, int i2, int i3) {
        sendMessage(Message.obtain(this, 38, i2, i3, C4403w.m27871i1(i)));
    }

    public void m37278o(CharSequence charSequence, int i, int i2) {
        sendMessage(Message.obtain(this, 38, i, i2, charSequence));
    }

    public void m37277p(View view, boolean z) {
        sendMessageDelayed(Message.obtain(this, 5, z ? 1 : 0, 0, view), 120L);
    }

    public void m37276q(String str, AbstractView$OnTouchListenerC7889a.AbstractC7901l lVar) {
        sendMessage(Message.obtain(this, 19, new Object[]{str, lVar}));
    }

    public void m37275r(int i, int i2) {
        if (i != 0) {
            String i1 = C4403w.m27871i1(i);
            if (!C5070i.m24062i(i1)) {
                sendMessage(Message.obtain(this, 1, i2, 0, i1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void m37274s(CharSequence charSequence, int i) {
        if (charSequence == null) {
            throw new IllegalArgumentException();
        } else if (!C5070i.m24062i(charSequence)) {
            sendMessage(Message.obtain(this, 1, i, 0, charSequence));
        }
    }

    public void m37273t(AbstractC5155y0 y0Var) {
        sendMessage(Message.obtain(this, 6, y0Var));
    }

    public void m37272u(AbstractC5155y0 y0Var, long j) {
        if (j <= 0) {
            m37273t(y0Var);
        } else {
            sendMessageDelayed(Message.obtain(this, 6, y0Var), j);
        }
    }
}
