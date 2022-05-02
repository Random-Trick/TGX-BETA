package p350yd;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import be.C1379j0;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.VoIPServerConfig;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p038ce.View$OnClickListenerC2162b;
import p082fd.C4403w;
import p111he.AbstractC5096a;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p154kb.C6227d;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9270q1;

public class C10552b0 implements AbstractC11051v0 {
    public C10930q6 f33846b;
    public TdApi.Call f33847c;
    public boolean f33848d;
    public final C6227d<AbstractC10553a> f33845a = new C6227d<>();
    public final Queue<Runnable> f33849e = new ArrayDeque();

    public interface AbstractC10553a {
        void mo4536y2(C10930q6 q6Var, TdApi.Call call);
    }

    public C10552b0(C10536ab abVar) {
        abVar.m4716b1().m1553b(this);
    }

    public static void m4605H(C10930q6 q6Var, final int i, boolean z) {
        Log.m14716v(2, "#%d: DiscardCall requested, isVideo:%b", Integer.valueOf(i), Boolean.valueOf(z));
        q6Var.m2270r4().m14783o(new TdApi.DiscardCall(i, false, 0, z, 0L), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10552b0.m4587Z(i, object);
            }
        });
    }

    public static void m4591V(int i, TdApi.Object object) {
        Log.m14716v(2, "#%d: AcceptCall completed: %s", Integer.valueOf(i), object);
    }

    public static void m4590W(Context context, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void m4589X(Context context, DialogInterface dialogInterface, int i) {
        Settings.System.putInt(context.getContentResolver(), "airplane_mode_on", 0);
    }

    public void m4588Y(AbstractC9323v4 v4Var, long j, TdApi.Call call, C10930q6 q6Var, Context context, int i, boolean z) {
        TdApi.Call g0;
        if (!z) {
            m4610C0(false);
        } else if (v4Var != null) {
            m4559o0(v4Var, j, null, false);
        } else if (call != null && (g0 = q6Var.m2480e2().m1644g0(call.f25367id)) != null && g0.state.getConstructor() == 1073048620) {
            m4615A(context, q6Var, call.f25367id);
        }
    }

    public static void m4587Z(int i, TdApi.Object object) {
        Log.m14716v(2, "#%d: DiscardCall completed: %s", Integer.valueOf(i), object);
    }

    public static void m4586a0(int i, TdApi.Object object) {
        Log.m14716v(2, "#%d: DiscardCall completed: %s", Integer.valueOf(i), object);
    }

    public static void m4585b0(boolean[] zArr) {
        if (!zArr[0]) {
            zArr[0] = true;
            C1379j0.m37295y0(R.string.VoipFailed, 0);
        }
    }

    public void m4583c0(C10930q6 q6Var, TdApi.Call call, final AbstractC9323v4 v4Var, final long j, final TdApi.UserFullInfo userFullInfo, DialogInterface dialogInterface, int i) {
        final boolean[] zArr = new boolean[1];
        m4596Q(q6Var, call.f25367id, new Runnable() {
            @Override
            public final void run() {
                C10552b0.this.m4561n0(zArr, v4Var, j, userFullInfo);
            }
        });
        C1379j0.m37335e0(new Runnable() {
            @Override
            public final void run() {
                C10552b0.m4585b0(zArr);
            }
        }, 1500L);
    }

    public void m4579e0(TdApi.Call call, C10930q6 q6Var, DialogInterface dialogInterface, int i) {
        TdApi.Call L = m4601L();
        if (L == null) {
            return;
        }
        if (L == call || (L.f25367id == call.f25367id && !C4779t2.m25563Z2(L))) {
            m4543w0(q6Var, call);
        }
    }

    public static void m4577f0(AbstractC9323v4 v4Var, long j, DialogInterface dialogInterface, int i) {
        v4Var.mo4348c().m2485dd().m3439u7(v4Var, j, null);
    }

    public static void m4573h0(AbstractC9323v4 v4Var, DialogInterface dialogInterface, int i) {
        Settings.System.putInt(v4Var.mo4347s().getContentResolver(), "airplane_mode_on", 0);
    }

    public void m4571i0(AbstractC9323v4 v4Var, long j, boolean z, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor != 2138747126) {
            Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class);
        } else {
            m4559o0(v4Var, j, (TdApi.UserFullInfo) object, z);
        }
    }

    public boolean m4569j0(AbstractC9323v4 v4Var, long j, TdApi.UserFullInfo userFullInfo, View view, int i) {
        if (i != R.id.btn_phone_call) {
            return true;
        }
        m4545v0(v4Var, j, userFullInfo, false);
        return true;
    }

    public static void m4567k0(long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14727e(2, "Failed to create call: %s", C4779t2.m25379z5(object));
            C1379j0.m37305t0(object);
        } else if (constructor != 65717769) {
            Log.unexpectedTdlibResponse(object, TdApi.CreateCall.class, TdApi.CallId.class, TdApi.Error.class);
        } else {
            Log.m14716v(2, "#%d: call created, user_id:%d", Integer.valueOf(((TdApi.CallId) object).f25368id), Long.valueOf(j));
        }
    }

    public void m4561n0(boolean[] zArr, AbstractC9323v4 v4Var, long j, TdApi.UserFullInfo userFullInfo) {
        if (!zArr[0]) {
            zArr[0] = true;
            m4559o0(v4Var, j, userFullInfo, false);
        }
    }

    public void m4557p0(DialogInterface dialogInterface, int i) {
        m4593T();
    }

    public static void m4551s0(Context context, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public void m4615A(Context context, C10930q6 q6Var, final int i) {
        if (m4608E(context, q6Var) && m4607F(context, q6Var, q6Var.m2480e2().m1644g0(i), 0L, null)) {
            Log.m14716v(2, "#%d: AcceptCall requested", Integer.valueOf(i));
            q6Var.m2270r4().m14783o(new TdApi.AcceptCall(i, new TdApi.CallProtocol(true, true, 65, VoIPController.getConnectionMaxLayer(), new String[]{VoIPController.getVersion()})), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10552b0.m4591V(i, object);
                }
            });
        }
    }

    public void m4614A0(AbstractC10553a aVar) {
        this.f33845a.remove(aVar);
    }

    public void m4613B(C10930q6 q6Var, int i) {
        m4615A(C1379j0.m37318n(), q6Var, i);
    }

    public final void m4612B0(C10930q6 q6Var, TdApi.Call call) {
        TdApi.Call call2 = this.f33847c;
        if (call2 != null || call != null) {
            if (call2 == null || call == null) {
                this.f33846b = q6Var;
                this.f33847c = call;
                boolean z = false;
                boolean z2 = call == null || C1379j0.m37367F() != 0 || C1379j0.m37355P();
                this.f33848d = z2;
                if (z2) {
                    m4541x0();
                }
                if (call != null) {
                    Intent intent = new Intent(C1379j0.m37318n(), TGCallService.class);
                    intent.putExtra("account_id", q6Var.m2188w6());
                    intent.putExtra("call_id", call.f25367id);
                    if (C1379j0.m37367F() != 0) {
                        z = true;
                    }
                    C1379j0.m37370D0(intent, z, true);
                    m4543w0(this.f33846b, this.f33847c);
                }
            } else if (this.f33846b.m2188w6() == q6Var.m2188w6() && this.f33847c.f25367id == call.f25367id) {
                this.f33846b = q6Var;
                this.f33847c = call;
            } else {
                m4605H(q6Var, call.f25367id, call.isVideo);
            }
        }
    }

    public void m4611C(int i) {
        TdApi.Call call;
        if (!this.f33848d && (call = this.f33847c) != null && call.f25367id == i) {
            this.f33848d = true;
            m4541x0();
        }
    }

    public final void m4610C0(boolean z) {
        final Context q = C1379j0.m37312q();
        AlertDialog.Builder builder = new AlertDialog.Builder(q, C11524j.m150v());
        builder.setTitle(C4403w.m27871i1(R.string.MicrophonePermission));
        if (z) {
            builder.setMessage(C4403w.m27871i1(R.string.MicrophoneMissing));
        } else {
            builder.setMessage(C4403w.m27871i1(R.string.MicrophonePermissionDesc));
        }
        builder.setPositiveButton(C4403w.m27952P0(), DialogInterface$OnClickListenerC10675g.f34164a);
        builder.setNeutralButton(C4403w.m27871i1(R.string.Settings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10552b0.m4551s0(q, dialogInterface, i);
            }
        });
        AbstractView$OnTouchListenerC7889a.m14555O1(q, builder.show(), null);
    }

    public void m4609D(AbstractC10553a aVar) {
        this.f33845a.add(aVar);
    }

    public final boolean m4608E(final Context context, C10930q6 q6Var) {
        AlertDialog.Builder builder;
        if (q6Var.m2704P6()) {
            builder = null;
        } else if (C7389v0.m16644d1()) {
            builder = new AlertDialog.Builder(context, C11524j.m150v());
            builder.setTitle(C4403w.m27871i1(R.string.VoipOfflineAirplaneTitle));
            builder.setMessage(C4403w.m27871i1(R.string.VoipOfflineAirplane));
            if (Build.VERSION.SDK_INT >= 17) {
                builder.setNeutralButton(C4403w.m27871i1(R.string.Settings), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C10552b0.m4590W(context, dialogInterface, i);
                    }
                });
            } else {
                builder.setNeutralButton(C4403w.m27871i1(R.string.AirplaneModeDisable), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C10552b0.m4589X(context, dialogInterface, i);
                    }
                });
            }
        } else {
            builder = new AlertDialog.Builder(context, C11524j.m150v());
            builder.setTitle(C4403w.m27871i1(R.string.VoipOfflineTitle));
            builder.setMessage(C4403w.m27871i1(R.string.VoipOffline));
        }
        if (builder == null) {
            return true;
        }
        try {
            AbstractView$OnTouchListenerC7889a.m14555O1(context, builder.show(), null);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean m4607F(final Context context, final C10930q6 q6Var, final TdApi.Call call, final long j, final AbstractC9323v4<?> v4Var) {
        if (Build.VERSION.SDK_INT < 23 || C1379j0.m37318n().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37369E();
        if (E == null) {
            return false;
        }
        E.m14554O2(new AbstractC5096a() {
            @Override
            public final void mo4252o1(int i, boolean z) {
                C10552b0.this.m4588Y(v4Var, j, call, q6Var, context, i, z);
            }
        });
        return false;
    }

    public void m4606G(C10930q6 q6Var, int i, boolean z) {
        m4605H(q6Var, i, z);
    }

    public int m4604I(C10930q6 q6Var, int i) {
        TGCallService w = TGCallService.m14210w();
        if (w == null || !w.m14212u(q6Var, i)) {
            return -1;
        }
        return w.m14208y();
    }

    public int m4603J(C10930q6 q6Var, int i) {
        long K = m4602K(q6Var, i);
        if (K != -1) {
            return (int) (K / 1000);
        }
        return -1;
    }

    public final long m4602K(C10930q6 q6Var, int i) {
        TGCallService w = TGCallService.m14210w();
        if (w == null || !w.m14212u(q6Var, i)) {
            return -1L;
        }
        return w.m14207z();
    }

    public TdApi.Call m4601L() {
        if (!this.f33848d || C4779t2.m25563Z2(this.f33847c)) {
            return null;
        }
        return this.f33847c;
    }

    public int m4600M() {
        TdApi.Call call = this.f33847c;
        if (call == null || C4779t2.m25563Z2(call)) {
            return 0;
        }
        return this.f33847c.f25367id;
    }

    public C10930q6 m4599N() {
        TdApi.Call call = this.f33847c;
        if (call == null || C4779t2.m25563Z2(call)) {
            return null;
        }
        return this.f33846b;
    }

    public long m4598O(C10930q6 q6Var, int i) {
        long K = m4602K(q6Var, i);
        if (K != -1) {
            return 1000 - (K % 1000);
        }
        return 1000L;
    }

    public void m4597P(C10930q6 q6Var, int i) {
        m4596Q(q6Var, i, null);
    }

    public void m4596Q(C10930q6 q6Var, int i, Runnable runnable) {
        TGCallService w = TGCallService.m14210w();
        m4594S(q6Var, i, false, w != null ? w.m14259B() : 0L, runnable);
    }

    public void m4595R(C10930q6 q6Var, int i, boolean z, long j) {
        m4594S(q6Var, i, z, j, null);
    }

    public void m4594S(C10930q6 q6Var, final int i, boolean z, long j, Runnable runnable) {
        TdApi.Call g0 = q6Var.m2480e2().m1644g0(i);
        if (g0 != null) {
            if (runnable != null) {
                if (C4779t2.m25563Z2(g0)) {
                    runnable.run();
                } else {
                    this.f33849e.offer(runnable);
                    int J = m4603J(q6Var, i);
                    Log.m14716v(2, "#%d: DiscardCall, isDisconnect: %b, connectionId: %d, duration: %d", Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), Integer.valueOf(J));
                    q6Var.m2270r4().m14783o(new TdApi.DiscardCall(i, z, Math.max(0, J), false, j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10552b0.m4586a0(i, object);
                        }
                    });
                }
            }
            int J2 = m4603J(q6Var, i);
            Log.m14716v(2, "#%d: DiscardCall, isDisconnect: %b, connectionId: %d, duration: %d", Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), Integer.valueOf(J2));
            q6Var.m2270r4().m14783o(new TdApi.DiscardCall(i, z, Math.max(0, J2), false, j), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10552b0.m4586a0(i, object);
                }
            });
        }
    }

    public void m4593T() {
        int M = m4600M();
        if (M != 0) {
            m4597P(this.f33846b, M);
        }
    }

    public boolean m4592U() {
        return m4601L() != null;
    }

    @Override
    public void mo1771a(C10930q6 q6Var, int i, CallSettings callSettings) {
    }

    @Override
    public void mo1770b(C10930q6 q6Var, TdApi.Call call) {
        TdApi.Call call2 = this.f33847c;
        if (call2 != null && C4779t2.m25687G2(call2)) {
            if (this.f33846b.m2188w6() == q6Var.m2188w6()) {
                if (this.f33847c.f25367id != call.f25367id) {
                    if (!call.isOutgoing && call.state.getConstructor() == 1073048620) {
                        q6Var.m2270r4().m14783o(new TdApi.DiscardCall(call.f25367id, false, 0, call.isVideo, 0L), q6Var.m2392ja());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (Log.isEnabled(2)) {
            Log.m14716v(2, "#%d: updateCall, userId:%s isOutgoing:%b state:%s", Integer.valueOf(call.f25367id), Long.valueOf(call.userId), Boolean.valueOf(call.isOutgoing), call.state);
        }
        if (call.state.getConstructor() == -2000107571) {
            VoIPServerConfig.setConfig(((TdApi.CallStateReady) call.state).config);
        }
        if (C4779t2.m25563Z2(call)) {
            m4612B0(null, null);
            while (true) {
                Runnable poll = this.f33849e.poll();
                if (poll != null) {
                    poll.run();
                } else {
                    return;
                }
            }
        } else {
            m4612B0(q6Var, call);
        }
    }

    public void m4549t0(AbstractC9323v4<?> v4Var, long j, TdApi.UserFullInfo userFullInfo) {
        m4559o0(v4Var, j, userFullInfo, C4868i.m24727c2().m24848L2());
    }

    public void m4559o0(final AbstractC9323v4<?> v4Var, final long j, final TdApi.UserFullInfo userFullInfo, final boolean z) {
        AlertDialog.Builder builder;
        if (j != 0) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C10552b0.this.m4565l0(v4Var, j, userFullInfo, z);
                    }
                });
                return;
            }
            final TdApi.UserFullInfo E2 = userFullInfo == null ? v4Var.mo4348c().m2480e2().m1745E2(j) : userFullInfo;
            if (!C7389v0.m16667X(C1379j0.m37318n())) {
                m4610C0(true);
                return;
            }
            final TdApi.Call L = m4601L();
            final C10930q6 q6Var = L != null ? this.f33846b : null;
            if (L != null || ((E2 != null && !E2.canBeCalled) || !v4Var.mo4348c().m2704P6())) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(v4Var.mo4347s(), C11524j.m150v());
                builder2.setPositiveButton(C4403w.m27952P0(), DialogInterface$OnClickListenerC10525a0.f33751a);
                if (L != null) {
                    if (L.userId == j) {
                        m4539y0();
                        return;
                    }
                    builder2.setTitle(C4403w.m27871i1(R.string.VoipOngoingAlertTitle));
                    TdApi.User v2 = q6Var.m2480e2().m1583v2(L.userId);
                    TdApi.User v22 = v4Var.mo4348c().m2480e2().m1583v2(j);
                    final C10930q6 q6Var2 = q6Var;
                    builder2.setPositiveButton(C4403w.m27871i1(R.string.HangUp), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C10552b0.this.m4583c0(q6Var2, L, v4Var, j, E2, dialogInterface, i);
                        }
                    });
                    builder2.setMessage(C4403w.m27855m1(R.string.CallInProgressDesc, C4779t2.m25438r2(v2), C4779t2.m25418u1(v22)));
                    builder2.setNegativeButton(C4403w.m27871i1(R.string.Cancel), DialogInterface$OnClickListenerC11157z.f35789a);
                    builder2.setNeutralButton(C4403w.m27871i1(R.string.ShowCall), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C10552b0.this.m4579e0(L, q6Var, dialogInterface, i);
                        }
                    });
                    builder = builder2;
                } else if (E2 == null || E2.canBeCalled) {
                    builder = builder2;
                    if (C7389v0.m16644d1()) {
                        builder.setTitle(C4403w.m27871i1(R.string.VoipOfflineAirplaneTitle));
                        builder.setMessage(C4403w.m27871i1(R.string.VoipOfflineAirplane));
                        if (Build.VERSION.SDK_INT >= 17) {
                            builder.setNeutralButton(C4403w.m27871i1(R.string.Settings), DialogInterface$OnClickListenerC10618e.f34025a);
                        } else {
                            builder.setNeutralButton(C4403w.m27871i1(R.string.AirplaneModeDisable), new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C10552b0.m4573h0(AbstractC9323v4.this, dialogInterface, i);
                                }
                            });
                        }
                    } else {
                        builder.setTitle(C4403w.m27871i1(R.string.VoipOfflineTitle));
                        builder.setMessage(C4403w.m27871i1(R.string.VoipOffline));
                    }
                } else {
                    builder2.setTitle(C4403w.m27871i1(R.string.AppName));
                    builder2.setMessage(C4403w.m27855m1(R.string.NoRightToCall, v4Var.mo4348c().m2480e2().m1721K2(j)));
                    builder = builder2;
                    builder.setNeutralButton(C4403w.m27871i1(R.string.OpenChat), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C10552b0.m4577f0(AbstractC9323v4.this, j, dialogInterface, i);
                        }
                    });
                }
                AbstractView$OnTouchListenerC7889a.m14555O1(v4Var.mo4347s(), builder.show(), null);
            } else if (E2 == null) {
                v4Var.mo4348c().m2270r4().m14783o(new TdApi.GetUserFullInfo(j), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10552b0.this.m4571i0(v4Var, j, z, object);
                    }
                });
            } else if (z) {
                final TdApi.UserFullInfo userFullInfo2 = E2;
                v4Var.m9261ee(C4403w.m27855m1(R.string.CallX, v4Var.mo4348c().m2480e2().m1721K2(j)), new int[]{R.id.btn_phone_call, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Call), C4403w.m27871i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_call_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean j0;
                        j0 = C10552b0.this.m4569j0(v4Var, j, userFullInfo2, view, i);
                        return j0;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23935b(this, i);
                    }
                });
            } else if (m4607F(v4Var.mo4347s(), v4Var.mo4348c(), null, j, null)) {
                v4Var.mo4347s().m14454p0(false);
                v4Var.mo4348c().m2270r4().m14783o(new TdApi.CreateCall(j, new TdApi.CallProtocol(true, true, 65, VoIPController.getConnectionMaxLayer(), new String[]{VoIPController.getVersion()}), false), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10552b0.m4567k0(j, object);
                    }
                });
            }
        }
    }

    public void m4545v0(final AbstractC9323v4<?> v4Var, final long j, final TdApi.UserFullInfo userFullInfo, final boolean z) {
        C1379j0.m37335e0(new Runnable() {
            @Override
            public final void run() {
                C10552b0.this.m4559o0(v4Var, j, userFullInfo, z);
            }
        }, 180L);
    }

    public final boolean m4543w0(C10930q6 q6Var, TdApi.Call call) {
        C9270q1 x;
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37369E();
        if (E == null || E.m14582I0() != 0 || (x = C1379j0.m37298x()) == null) {
            return false;
        }
        AbstractC9323v4<?> F = !x.m9741S() ? x.m9762F() : null;
        if ((F instanceof View$OnClickListenerC2162b) && F.mo4348c() == q6Var) {
            View$OnClickListenerC2162b bVar = (View$OnClickListenerC2162b) F;
            if (bVar.m35469Ye(call.userId)) {
                bVar.m35467af(call);
                return true;
            }
        }
        if (E.m14423w1()) {
            return true;
        }
        View$OnClickListenerC2162b bVar2 = new View$OnClickListenerC2162b(E, q6Var);
        bVar2.m35466bf(new View$OnClickListenerC2162b.C2168e(call));
        x.m9718h0(bVar2);
        return true;
    }

    public final void m4541x0() {
        Iterator<AbstractC10553a> it = this.f33845a.iterator();
        while (it.hasNext()) {
            it.next().mo4536y2(this.f33846b, this.f33847c);
        }
    }

    public void m4539y0() {
        TdApi.Call L = m4601L();
        if (L != null) {
            m4543w0(this.f33846b, L);
        }
    }

    public boolean m4537z0() {
        if (!m4592U()) {
            return false;
        }
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37369E();
        if (E == null) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(E, C11524j.m150v());
        builder.setMessage(C4403w.m27871i1(R.string.SomeCallInProgressDesc));
        builder.setNeutralButton(C4403w.m27871i1(R.string.HangUp), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10552b0.this.m4557p0(dialogInterface, i);
            }
        });
        builder.setPositiveButton(C4403w.m27952P0(), DialogInterface$OnClickListenerC10649f.f34099a);
        AbstractView$OnTouchListenerC7889a.m14555O1(E, builder.show(), null);
        return true;
    }
}
