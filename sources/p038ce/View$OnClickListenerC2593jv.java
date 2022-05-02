package p038ce;

import android.content.Context;
import android.view.View;
import be.C1363c0;
import be.C1379j0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.k30;
import p038ce.x00;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5918j;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2593jv extends AbstractC3204vo<C2595b> implements View.OnClickListener, Log.AbstractC7880c {
    public C2546iq f8813D0;
    public Log.C7879b f8814E0;
    public boolean f8815F0;

    public class C2594a extends C2546iq {
        public C2594a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.btn_file) {
                File file = (File) raVar.m32847d();
                cVar.setData(C4403w.m27804z0(file.lastModified(), TimeUnit.MILLISECONDS, file.length()));
            }
        }
    }

    public static class C2595b {
        public Log.C7879b f8817a;

        public C2595b(Log.C7879b bVar) {
            this.f8817a = bVar;
        }
    }

    public View$OnClickListenerC2593jv(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34107Hg(Log.C7879b bVar) {
        if (!m9347Sa()) {
            m34101Ng(bVar);
        }
    }

    public void m34106Ig(final Log.C7879b bVar) {
        if (!m9347Sa()) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2593jv.this.m34107Hg(bVar);
                }
            });
        }
    }

    public boolean m34105Jg(File file, View view, int i) {
        if (i == R.id.btn_delete) {
            long length = file.length();
            boolean startsWith = file.getName().startsWith(Log.CRASH_PREFIX);
            if (Log.deleteFile(file)) {
                C1379j0.m37293z0("OK. Freed " + C1363c0.m37426m(length), 0);
                m34103Lg(file, length, startsWith);
                return true;
            }
            C1379j0.m37293z0("Failed", 0);
            return true;
        } else if (i == R.id.btn_open) {
            k30 k30Var = new k30(this.f30168a, this.f30170b);
            k30Var.m9476Ad(k30.C2608a.m34038f(file.getName(), file.getPath(), "text/plain"));
            m9291ac(k30Var);
            return true;
        } else if (i != R.id.btn_share) {
            return true;
        } else {
            x00 x00Var = new x00(this.f30168a, this.f30170b);
            x00Var.m30996Vi(new x00.C3281m(file, "text/plain"));
            x00Var.m30962ej();
            return true;
        }
    }

    public void m34104Kg() {
        if (!m9347Sa()) {
            if (this.f8813D0.m34243F0() != null) {
                int i = 0;
                for (C2964ra raVar : this.f8813D0.m34243F0()) {
                    if (raVar.m32838j() == R.id.btn_file) {
                        this.f8813D0.m34127u3(i);
                    }
                    i++;
                }
            }
            Log.C7879b bVar = this.f8814E0;
            if (bVar == null || bVar.m14707a()) {
                m34108Gg();
            }
        }
    }

    public final void m34109Fg() {
        ArrayList arrayList = new ArrayList();
        if (this.f8815F0) {
            Log.C7879b bVar = this.f8814E0;
            if (bVar == null || bVar.m14707a()) {
                arrayList.add(new C2964ra(24, 0, 0, (CharSequence) "Application Logs are empty", false));
            } else {
                boolean z = true;
                for (File file : this.f8814E0.f25454a) {
                    if (z) {
                        z = false;
                    } else {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(5, (int) R.id.btn_file, 0, (CharSequence) file.getName(), false).m32873G(file));
                }
                arrayList.add(new C2964ra(3));
            }
        }
        this.f8813D0.m34119x2(arrayList, false);
    }

    @Override
    public void mo14706G6(int i, int i2, String str, Throwable th) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2593jv.this.m34104Kg();
            }
        });
    }

    public final void m34108Gg() {
        Log.getLogFiles(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2593jv.this.m34106Ig((Log.C7879b) obj);
            }
        });
    }

    public final void m34103Lg(File file, long j, boolean z) {
        int indexOf;
        Log.C7879b bVar = this.f8814E0;
        if (bVar != null && (indexOf = bVar.f25454a.indexOf(file)) != -1) {
            Log.C7879b bVar2 = this.f8814E0;
            bVar2.f25457d -= j;
            if (z) {
                bVar2.f25456c--;
            } else {
                bVar2.f25455b--;
            }
            m34102Mg(indexOf);
        }
    }

    public final void m34102Mg(int i) {
        this.f8814E0.f25454a.remove(i);
        if (this.f8814E0.f25454a.isEmpty()) {
            m34109Fg();
        } else if (i == 0) {
            this.f8813D0.m34243F0().remove(0);
            this.f8813D0.m34243F0().remove(0);
            this.f8813D0.m39310N(0, 2);
        } else if (i == this.f8814E0.f25454a.size()) {
            int size = this.f8813D0.m34243F0().size();
            this.f8813D0.m34243F0().remove(size - 2);
            int i2 = size - 3;
            this.f8813D0.m34243F0().remove(i2);
            this.f8813D0.m39310N(i2, 2);
        } else {
            int i3 = i * 2;
            this.f8813D0.m34243F0().remove(i3 + 1);
            this.f8813D0.m34243F0().remove(i3);
            this.f8813D0.m39310N(i3, 2);
        }
    }

    public final void m34101Ng(Log.C7879b bVar) {
        this.f8814E0 = bVar;
        this.f8815F0 = true;
        m34109Fg();
    }

    @Override
    public void mo14705Q6() {
    }

    @Override
    public int mo407R9() {
        return R.id.controller_logs;
    }

    @Override
    public CharSequence mo9313X9() {
        return "Application Logs";
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        Log.removeOutputListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_file) {
            final File file = (File) ((C2964ra) view.getTag()).m32847d();
            m9261ee(file.getName() + " (" + C1363c0.m37426m(file.length()) + ")", new int[]{R.id.btn_open, R.id.btn_share, R.id.btn_delete}, new String[]{"View", "Share", "Delete"}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_visibility_24, R.drawable.baseline_forward_24, R.drawable.baseline_delete_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Jg;
                    Jg = View$OnClickListenerC2593jv.this.m34105Jg(file, view2, i);
                    return Jg;
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
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f8813D0 = new C2594a(this);
        if (m9139w9() == null || m9139w9().f8817a == null || m9139w9().f8817a.m14707a()) {
            m34109Fg();
            m34108Gg();
        } else {
            m34101Ng(m9139w9().f8817a);
        }
        customRecyclerView.setAdapter(this.f8813D0);
        Log.addOutputListener(this);
    }
}
