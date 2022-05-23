package zd;

import ae.j;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import ce.j0;
import de.b;
import gd.w;
import hd.t2;
import he.i;
import ie.g0;
import ie.h0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import lb.d;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.VoIPServerConfig;
import org.thunderdog.challegram.voip.gui.CallSettings;
import ud.q1;
import ud.v4;

public class z implements t0 {
    public o6 f28769b;
    public TdApi.Call f28770c;
    public boolean f28771d;
    public final d<a> f28768a = new d<>();
    public final Queue<Runnable> f28772e = new ArrayDeque();

    public interface a {
        void F4(o6 o6Var, TdApi.Call call);
    }

    public z(ya yaVar) {
        yaVar.b1().b(this);
    }

    public static void F(o6 o6Var, final int i10, boolean z10) {
        Log.v(2, "#%d: DiscardCall requested, isVideo:%b", Integer.valueOf(i10), Boolean.valueOf(z10));
        o6Var.v4().o(new TdApi.DiscardCall(i10, false, 0, z10, 0L), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                z.W(i10, object);
            }
        });
    }

    public static void T(int i10, TdApi.Object object) {
        Log.v(2, "#%d: AcceptCall completed: %s", Integer.valueOf(i10), object);
    }

    public static void U(Context context, DialogInterface dialogInterface, int i10) {
        Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void V(v4 v4Var, long j10, TdApi.Call call, o6 o6Var, Context context, int i10, boolean z10) {
        TdApi.Call g02;
        if (!z10) {
            y0(false);
        } else if (v4Var != null) {
            k0(v4Var, j10, null, false);
        } else if (call != null && (g02 = o6Var.e2().g0(call.f19905id)) != null && g02.state.getConstructor() == 1073048620) {
            y(context, o6Var, call.f19905id);
        }
    }

    public static void W(int i10, TdApi.Object object) {
        Log.v(2, "#%d: DiscardCall completed: %s", Integer.valueOf(i10), object);
    }

    public static void X(int i10, TdApi.Object object) {
        Log.v(2, "#%d: DiscardCall completed: %s", Integer.valueOf(i10), object);
    }

    public static void Y(boolean[] zArr) {
        if (!zArr[0]) {
            zArr[0] = true;
            j0.y0(R.string.VoipFailed, 0);
        }
    }

    public void Z(o6 o6Var, TdApi.Call call, final v4 v4Var, final long j10, final TdApi.UserFullInfo userFullInfo, DialogInterface dialogInterface, int i10) {
        final boolean[] zArr = new boolean[1];
        O(o6Var, call.f19905id, new Runnable() {
            @Override
            public final void run() {
                z.this.j0(zArr, v4Var, j10, userFullInfo);
            }
        });
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                z.Y(zArr);
            }
        }, 1500L);
    }

    public void b0(TdApi.Call call, o6 o6Var, DialogInterface dialogInterface, int i10) {
        TdApi.Call J = J();
        if (J == null) {
            return;
        }
        if (J == call || (J.f19905id == call.f19905id && !t2.Z2(J))) {
            s0(o6Var, call);
        }
    }

    public static void c0(v4 v4Var, long j10, DialogInterface dialogInterface, int i10) {
        v4Var.c().hd().u7(v4Var, j10, null);
    }

    public void e0(v4 v4Var, long j10, boolean z10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor != -1308032111) {
            Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class);
        } else {
            k0(v4Var, j10, (TdApi.UserFullInfo) object, z10);
        }
    }

    public boolean f0(v4 v4Var, long j10, TdApi.UserFullInfo userFullInfo, View view, int i10) {
        if (i10 != R.id.btn_phone_call) {
            return true;
        }
        r0(v4Var, j10, userFullInfo, false);
        return true;
    }

    public static void g0(long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e(2, "Failed to create call: %s", t2.z5(object));
            j0.t0(object);
        } else if (constructor != 65717769) {
            Log.unexpectedTdlibResponse(object, TdApi.CreateCall.class, TdApi.CallId.class, TdApi.Error.class);
        } else {
            Log.v(2, "#%d: call created, user_id:%d", Integer.valueOf(((TdApi.CallId) object).f19906id), Long.valueOf(j10));
        }
    }

    public void j0(boolean[] zArr, v4 v4Var, long j10, TdApi.UserFullInfo userFullInfo) {
        if (!zArr[0]) {
            zArr[0] = true;
            k0(v4Var, j10, userFullInfo, false);
        }
    }

    public void l0(DialogInterface dialogInterface, int i10) {
        R();
    }

    public static void o0(Context context, DialogInterface dialogInterface, int i10) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public void A(int i10) {
        TdApi.Call call;
        if (!this.f28771d && (call = this.f28770c) != null && call.f19905id == i10) {
            this.f28771d = true;
            t0();
        }
    }

    public void B(a aVar) {
        this.f28768a.add(aVar);
    }

    public final boolean C(final Context context, o6 o6Var) {
        AlertDialog.Builder builder;
        if (o6Var.T6()) {
            builder = null;
        } else if (v0.d1()) {
            builder = new AlertDialog.Builder(context, j.t());
            builder.setTitle(w.i1(R.string.VoipOfflineAirplaneTitle));
            builder.setMessage(w.i1(R.string.VoipOfflineAirplane));
            builder.setNeutralButton(w.i1(R.string.Settings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    z.U(context, dialogInterface, i10);
                }
            });
        } else {
            builder = new AlertDialog.Builder(context, j.t());
            builder.setTitle(w.i1(R.string.VoipOfflineTitle));
            builder.setMessage(w.i1(R.string.VoipOffline));
        }
        if (builder == null) {
            return true;
        }
        try {
            org.thunderdog.challegram.a.P1(context, builder.show(), null);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean D(final Context context, final o6 o6Var, final TdApi.Call call, final long j10, final v4<?> v4Var) {
        if (Build.VERSION.SDK_INT < 23 || j0.n().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        org.thunderdog.challegram.a E = j0.E();
        if (E == null) {
            return false;
        }
        E.O2(new ie.a() {
            @Override
            public final void l1(int i10, boolean z10) {
                z.this.V(v4Var, j10, call, o6Var, context, i10, z10);
            }
        });
        return false;
    }

    public void E(o6 o6Var, int i10, boolean z10) {
        F(o6Var, i10, z10);
    }

    public int G(o6 o6Var, int i10) {
        TGCallService w10 = TGCallService.w();
        if (w10 == null || !w10.u(o6Var, i10)) {
            return -1;
        }
        return w10.y();
    }

    public int H(o6 o6Var, int i10) {
        long I = I(o6Var, i10);
        if (I != -1) {
            return (int) (I / 1000);
        }
        return -1;
    }

    public final long I(o6 o6Var, int i10) {
        TGCallService w10 = TGCallService.w();
        if (w10 == null || !w10.u(o6Var, i10)) {
            return -1L;
        }
        return w10.z();
    }

    public TdApi.Call J() {
        if (!this.f28771d || t2.Z2(this.f28770c)) {
            return null;
        }
        return this.f28770c;
    }

    public int K() {
        TdApi.Call call = this.f28770c;
        if (call == null || t2.Z2(call)) {
            return 0;
        }
        return this.f28770c.f19905id;
    }

    public o6 L() {
        TdApi.Call call = this.f28770c;
        if (call == null || t2.Z2(call)) {
            return null;
        }
        return this.f28769b;
    }

    public long M(o6 o6Var, int i10) {
        long I = I(o6Var, i10);
        if (I != -1) {
            return 1000 - (I % 1000);
        }
        return 1000L;
    }

    public void N(o6 o6Var, int i10) {
        O(o6Var, i10, null);
    }

    public void O(o6 o6Var, int i10, Runnable runnable) {
        TGCallService w10 = TGCallService.w();
        Q(o6Var, i10, false, w10 != null ? w10.B() : 0L, runnable);
    }

    public void P(o6 o6Var, int i10, boolean z10, long j10) {
        Q(o6Var, i10, z10, j10, null);
    }

    public void Q(o6 o6Var, final int i10, boolean z10, long j10, Runnable runnable) {
        TdApi.Call g02 = o6Var.e2().g0(i10);
        if (g02 != null) {
            if (runnable != null) {
                if (t2.Z2(g02)) {
                    runnable.run();
                } else {
                    this.f28772e.offer(runnable);
                    int H = H(o6Var, i10);
                    Log.v(2, "#%d: DiscardCall, isDisconnect: %b, connectionId: %d, duration: %d", Integer.valueOf(i10), Boolean.valueOf(z10), Long.valueOf(j10), Integer.valueOf(H));
                    o6Var.v4().o(new TdApi.DiscardCall(i10, z10, Math.max(0, H), false, j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            z.X(i10, object);
                        }
                    });
                }
            }
            int H2 = H(o6Var, i10);
            Log.v(2, "#%d: DiscardCall, isDisconnect: %b, connectionId: %d, duration: %d", Integer.valueOf(i10), Boolean.valueOf(z10), Long.valueOf(j10), Integer.valueOf(H2));
            o6Var.v4().o(new TdApi.DiscardCall(i10, z10, Math.max(0, H2), false, j10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    z.X(i10, object);
                }
            });
        }
    }

    public void R() {
        int K = K();
        if (K != 0) {
            N(this.f28769b, K);
        }
    }

    public boolean S() {
        return J() != null;
    }

    @Override
    public void a(o6 o6Var, int i10, CallSettings callSettings) {
    }

    @Override
    public void b(o6 o6Var, TdApi.Call call) {
        TdApi.Call call2 = this.f28770c;
        if (call2 != null && t2.G2(call2)) {
            if (this.f28769b.A6() == o6Var.A6()) {
                if (this.f28770c.f19905id != call.f19905id) {
                    if (!call.isOutgoing && call.state.getConstructor() == 1073048620) {
                        o6Var.v4().o(new TdApi.DiscardCall(call.f19905id, false, 0, call.isVideo, 0L), o6Var.na());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (Log.isEnabled(2)) {
            Log.v(2, "#%d: updateCall, userId:%s isOutgoing:%b state:%s", Integer.valueOf(call.f19905id), Long.valueOf(call.userId), Boolean.valueOf(call.isOutgoing), call.state);
        }
        if (call.state.getConstructor() == -2000107571) {
            VoIPServerConfig.setConfig(((TdApi.CallStateReady) call.state).config);
        }
        if (t2.Z2(call)) {
            x0(null, null);
            while (true) {
                Runnable poll = this.f28772e.poll();
                if (poll != null) {
                    poll.run();
                } else {
                    return;
                }
            }
        } else {
            x0(o6Var, call);
        }
    }

    public void p0(v4<?> v4Var, long j10, TdApi.UserFullInfo userFullInfo) {
        k0(v4Var, j10, userFullInfo, i.c2().L2());
    }

    public void k0(final v4<?> v4Var, final long j10, final TdApi.UserFullInfo userFullInfo, final boolean z10) {
        AlertDialog.Builder builder;
        if (j10 != 0) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        z.this.h0(v4Var, j10, userFullInfo, z10);
                    }
                });
                return;
            }
            final TdApi.UserFullInfo D2 = userFullInfo == null ? v4Var.c().e2().D2(j10) : userFullInfo;
            if (!v0.X(j0.n())) {
                y0(true);
                return;
            }
            final TdApi.Call J = J();
            final o6 o6Var = J != null ? this.f28769b : null;
            if (J != null || ((D2 != null && !D2.canBeCalled) || !v4Var.c().T6())) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(v4Var.t(), j.t());
                builder2.setPositiveButton(w.P0(), w.f28597a);
                if (J == null) {
                    builder = builder2;
                    if (D2 != null && !D2.canBeCalled) {
                        builder.setTitle(w.i1(R.string.AppName));
                        builder.setMessage(w.m1(R.string.NoRightToCall, v4Var.c().e2().J2(j10)));
                        builder.setNeutralButton(w.i1(R.string.OpenChat), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                z.c0(v4.this, j10, dialogInterface, i10);
                            }
                        });
                    } else if (v0.d1()) {
                        builder.setTitle(w.i1(R.string.VoipOfflineAirplaneTitle));
                        builder.setMessage(w.i1(R.string.VoipOfflineAirplane));
                        builder.setNeutralButton(w.i1(R.string.Settings), x.f28660a);
                    } else {
                        builder.setTitle(w.i1(R.string.VoipOfflineTitle));
                        builder.setMessage(w.i1(R.string.VoipOffline));
                    }
                } else if (J.userId == j10) {
                    u0();
                    return;
                } else {
                    builder2.setTitle(w.i1(R.string.VoipOngoingAlertTitle));
                    TdApi.User u22 = o6Var.e2().u2(J.userId);
                    TdApi.User u23 = v4Var.c().e2().u2(j10);
                    final o6 o6Var2 = o6Var;
                    builder = builder2;
                    builder.setPositiveButton(w.i1(R.string.HangUp), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            z.this.Z(o6Var2, J, v4Var, j10, D2, dialogInterface, i10);
                        }
                    });
                    builder.setMessage(w.m1(R.string.CallInProgressDesc, t2.r2(u22), t2.u1(u23)));
                    builder.setNegativeButton(w.i1(R.string.Cancel), v.f28552a);
                    builder.setNeutralButton(w.i1(R.string.ShowCall), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            z.this.b0(J, o6Var, dialogInterface, i10);
                        }
                    });
                }
                org.thunderdog.challegram.a.P1(v4Var.t(), builder.show(), null);
            } else if (D2 == null) {
                v4Var.c().v4().o(new TdApi.GetUserFullInfo(j10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        z.this.e0(v4Var, j10, z10, object);
                    }
                });
            } else if (z10) {
                final TdApi.UserFullInfo userFullInfo2 = D2;
                v4Var.ee(w.m1(R.string.CallX, v4Var.c().e2().J2(j10)), new int[]{R.id.btn_phone_call, R.id.btn_cancel}, new String[]{w.i1(R.string.Call), w.i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_call_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean f02;
                        f02 = z.this.f0(v4Var, j10, userFullInfo2, view, i10);
                        return f02;
                    }
                });
            } else if (D(v4Var.t(), v4Var.c(), null, j10, null)) {
                v4Var.t().s0(false);
                v4Var.c().v4().o(new TdApi.CreateCall(j10, new TdApi.CallProtocol(true, true, 65, VoIPController.getConnectionMaxLayer(), new String[]{VoIPController.getVersion()}), false), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        z.g0(j10, object);
                    }
                });
            }
        }
    }

    public void r0(final v4<?> v4Var, final long j10, final TdApi.UserFullInfo userFullInfo, final boolean z10) {
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                z.this.k0(v4Var, j10, userFullInfo, z10);
            }
        }, 180L);
    }

    public final boolean s0(o6 o6Var, TdApi.Call call) {
        q1 x10;
        org.thunderdog.challegram.a E = j0.E();
        if (E == null || E.L0() != 0 || (x10 = j0.x()) == null) {
            return false;
        }
        v4<?> F = !x10.S() ? x10.F() : null;
        if ((F instanceof b) && F.c() == o6Var) {
            b bVar = (b) F;
            if (bVar.Ye(call.userId)) {
                bVar.af(call);
                return true;
            }
        }
        if (E.x1()) {
            return true;
        }
        b bVar2 = new b(E, o6Var);
        bVar2.bf(new b.e(call));
        x10.h0(bVar2);
        return true;
    }

    public final void t0() {
        Iterator<a> it = this.f28768a.iterator();
        while (it.hasNext()) {
            it.next().F4(this.f28769b, this.f28770c);
        }
    }

    public void u0() {
        TdApi.Call J = J();
        if (J != null) {
            s0(this.f28769b, J);
        }
    }

    public boolean v0() {
        if (!S()) {
            return false;
        }
        org.thunderdog.challegram.a E = j0.E();
        if (E == null) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(E, j.t());
        builder.setMessage(w.i1(R.string.SomeCallInProgressDesc));
        builder.setNeutralButton(w.i1(R.string.HangUp), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                z.this.l0(dialogInterface, i10);
            }
        });
        builder.setPositiveButton(w.P0(), y.f28697a);
        org.thunderdog.challegram.a.P1(E, builder.show(), null);
        return true;
    }

    public void w0(a aVar) {
        this.f28768a.remove(aVar);
    }

    public final void x0(o6 o6Var, TdApi.Call call) {
        TdApi.Call call2 = this.f28770c;
        if (call2 != null || call != null) {
            if (call2 == null || call == null) {
                this.f28769b = o6Var;
                this.f28770c = call;
                boolean z10 = false;
                boolean z11 = call == null || j0.F() != 0 || j0.P();
                this.f28771d = z11;
                if (z11) {
                    t0();
                }
                if (call != null) {
                    Intent intent = new Intent(j0.n(), TGCallService.class);
                    intent.putExtra("account_id", o6Var.A6());
                    intent.putExtra("call_id", call.f19905id);
                    if (j0.F() != 0) {
                        z10 = true;
                    }
                    j0.D0(intent, z10, true);
                    s0(this.f28769b, this.f28770c);
                }
            } else if (this.f28769b.A6() == o6Var.A6() && this.f28770c.f19905id == call.f19905id) {
                this.f28769b = o6Var;
                this.f28770c = call;
            } else {
                F(o6Var, call.f19905id, call.isVideo);
            }
        }
    }

    public void y(Context context, o6 o6Var, final int i10) {
        if (C(context, o6Var) && D(context, o6Var, o6Var.e2().g0(i10), 0L, null)) {
            Log.v(2, "#%d: AcceptCall requested", Integer.valueOf(i10));
            o6Var.v4().o(new TdApi.AcceptCall(i10, new TdApi.CallProtocol(true, true, 65, VoIPController.getConnectionMaxLayer(), new String[]{VoIPController.getVersion()})), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    z.T(i10, object);
                }
            });
        }
    }

    public final void y0(boolean z10) {
        final Context q10 = j0.q();
        AlertDialog.Builder builder = new AlertDialog.Builder(q10, j.t());
        builder.setTitle(w.i1(R.string.MicrophonePermission));
        if (z10) {
            builder.setMessage(w.i1(R.string.MicrophoneMissing));
        } else {
            builder.setMessage(w.i1(R.string.MicrophonePermissionDesc));
        }
        builder.setPositiveButton(w.P0(), e.f27419a);
        builder.setNeutralButton(w.i1(R.string.Settings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                z.o0(q10, dialogInterface, i10);
            }
        });
        org.thunderdog.challegram.a.P1(q10, builder.show(), null);
    }

    public void z(o6 o6Var, int i10) {
        y(j0.n(), o6Var, i10);
    }
}
