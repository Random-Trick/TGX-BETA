package de;

import android.content.Context;
import android.view.View;
import ce.c0;
import ce.j0;
import de.l30;
import de.y00;
import gd.w;
import ie.g0;
import ie.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kb.j;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.v4;
import zd.o6;

public class kv extends vo<b> implements View.OnClickListener, Log.c {
    public iq D0;
    public Log.b E0;
    public boolean F0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_file) {
                File file = (File) raVar.d();
                cVar.setData(w.z0(file.lastModified(), TimeUnit.MILLISECONDS, file.length()));
            }
        }
    }

    public static class b {
        public Log.b f8521a;

        public b(Log.b bVar) {
            this.f8521a = bVar;
        }
    }

    public kv(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Hg(Log.b bVar) {
        if (!Sa()) {
            Ng(bVar);
        }
    }

    public void Ig(final Log.b bVar) {
        if (!Sa()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    kv.this.Hg(bVar);
                }
            });
        }
    }

    public boolean Jg(File file, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            long length = file.length();
            boolean startsWith = file.getName().startsWith(Log.CRASH_PREFIX);
            if (Log.deleteFile(file)) {
                j0.z0("OK. Freed " + c0.m(length), 0);
                Lg(file, length, startsWith);
                return true;
            }
            j0.z0("Failed", 0);
            return true;
        } else if (i10 == R.id.btn_open) {
            l30 l30Var = new l30(this.f24493a, this.f24495b);
            l30Var.Ad(l30.a.f(file.getName(), file.getPath(), "text/plain"));
            ac(l30Var);
            return true;
        } else if (i10 != R.id.btn_share) {
            return true;
        } else {
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00Var.Vi(new y00.m(file, "text/plain"));
            y00Var.ej();
            return true;
        }
    }

    public void Kg() {
        if (!Sa()) {
            if (this.D0.D0() != null) {
                int i10 = 0;
                for (ra raVar : this.D0.D0()) {
                    if (raVar.j() == R.id.btn_file) {
                        this.D0.r3(i10);
                    }
                    i10++;
                }
            }
            Log.b bVar = this.E0;
            if (bVar == null || bVar.a()) {
                Gg();
            }
        }
    }

    @Override
    public void D6(int i10, int i11, String str, Throwable th) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                kv.this.Kg();
            }
        });
    }

    public final void Fg() {
        ArrayList arrayList = new ArrayList();
        if (this.F0) {
            Log.b bVar = this.E0;
            if (bVar == null || bVar.a()) {
                arrayList.add(new ra(24, 0, 0, (CharSequence) "Application Logs are empty", false));
            } else {
                boolean z10 = true;
                for (File file : this.E0.f19990a) {
                    if (z10) {
                        z10 = false;
                    } else {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(5, (int) R.id.btn_file, 0, (CharSequence) file.getName(), false).G(file));
                }
                arrayList.add(new ra(3));
            }
        }
        this.D0.s2(arrayList, false);
    }

    public final void Gg() {
        Log.getLogFiles(new j() {
            @Override
            public final void a(Object obj) {
                kv.this.Ig((Log.b) obj);
            }
        });
    }

    public final void Lg(File file, long j10, boolean z10) {
        int indexOf;
        Log.b bVar = this.E0;
        if (bVar != null && (indexOf = bVar.f19990a.indexOf(file)) != -1) {
            Log.b bVar2 = this.E0;
            bVar2.f19993d -= j10;
            if (z10) {
                bVar2.f19992c--;
            } else {
                bVar2.f19991b--;
            }
            Mg(indexOf);
        }
    }

    public final void Mg(int i10) {
        this.E0.f19990a.remove(i10);
        if (this.E0.f19990a.isEmpty()) {
            Fg();
        } else if (i10 == 0) {
            this.D0.D0().remove(0);
            this.D0.D0().remove(0);
            this.D0.N(0, 2);
        } else if (i10 == this.E0.f19990a.size()) {
            int size = this.D0.D0().size();
            this.D0.D0().remove(size - 2);
            int i11 = size - 3;
            this.D0.D0().remove(i11);
            this.D0.N(i11, 2);
        } else {
            int i12 = i10 * 2;
            this.D0.D0().remove(i12 + 1);
            this.D0.D0().remove(i12);
            this.D0.N(i12, 2);
        }
    }

    public final void Ng(Log.b bVar) {
        this.E0 = bVar;
        this.F0 = true;
        Fg();
    }

    @Override
    public void Q6() {
    }

    @Override
    public int R9() {
        return R.id.controller_logs;
    }

    @Override
    public CharSequence X9() {
        return "Application Logs";
    }

    @Override
    public void Z8() {
        super.Z8();
        Log.removeOutputListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_file) {
            final File file = (File) ((ra) view.getTag()).d();
            ee(file.getName() + " (" + c0.m(file.length()) + ")", new int[]{R.id.btn_open, R.id.btn_share, R.id.btn_delete}, new String[]{"View", "Share", "Delete"}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_visibility_24, R.drawable.baseline_forward_24, R.drawable.baseline_delete_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean Jg;
                    Jg = kv.this.Jg(file, view2, i10);
                    return Jg;
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.D0 = new a(this);
        if (w9() == null || w9().f8521a == null || w9().f8521a.a()) {
            Fg();
            Gg();
        } else {
            Ng(w9().f8521a);
        }
        customRecyclerView.setAdapter(this.D0);
        Log.addOutputListener(this);
    }
}
