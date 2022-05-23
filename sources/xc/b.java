package xc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.p0;
import gb.c;
import hd.e3;
import java.util.ArrayList;
import java.util.Iterator;
import ne.z0;
import org.drinkless.td.libcore.telegram.TdApi;

public class b extends RecyclerView.h<C0245b> implements View.OnClickListener, View.OnLongClickListener {
    public Context M;
    public ArrayList<e3> N;
    public a O;
    public c.a P;
    public boolean Q;

    public interface a {
        void B1(View view, TdApi.Animation animation);

        void C0(View view, TdApi.Animation animation);
    }

    public static class C0245b extends RecyclerView.c0 {
        public C0245b(View view) {
            super(view);
        }

        public static C0245b O(Context context, int i10, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, c.a aVar) {
            if (i10 == 0) {
                xc.a aVar2 = new xc.a(context);
                if (aVar != null) {
                    aVar2.C0(aVar);
                } else {
                    aVar2.setOnClickListener(onClickListener);
                    aVar2.setOnLongClickListener(onLongClickListener);
                }
                p0.T(aVar2);
                aVar2.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new C0245b(aVar2);
            } else if (i10 == 1) {
                View view = new View(context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, z0.getHeaderSize()));
                return new C0245b(view);
            } else {
                throw new RuntimeException();
            }
        }
    }

    public b(Context context, c.a aVar) {
        this.M = context;
        this.P = aVar;
    }

    @Override
    public int D() {
        ArrayList<e3> arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public int F(int i10) {
        return (i10 != 0 || !this.Q) ? 0 : 1;
    }

    public void a0() {
        i0(null);
    }

    public e3 b0(int i10) {
        ArrayList<e3> arrayList = this.N;
        if (this.Q) {
            i10--;
        }
        return arrayList.get(i10);
    }

    public void Q(C0245b bVar, int i10) {
        xc.a aVar = (xc.a) bVar.f2982a;
        ArrayList<e3> arrayList = this.N;
        if (this.Q) {
            i10--;
        }
        aVar.setGif(arrayList.get(i10));
    }

    public C0245b S(ViewGroup viewGroup, int i10) {
        return C0245b.O(this.M, i10, this, this, this.P);
    }

    public void V(C0245b bVar) {
        ((xc.a) bVar.f2982a).e();
    }

    public void W(C0245b bVar) {
        ((xc.a) bVar.f2982a).b();
    }

    public void g0(int i10) {
        ArrayList<e3> arrayList = this.N;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            if (this.N.size() != 1) {
                Iterator<e3> it = this.N.iterator();
                while (it.hasNext()) {
                    if (it.next().c() == i10) {
                        this.N.remove(i11);
                        H();
                        return;
                    }
                    i11++;
                }
            } else if (this.N.get(0).c() == i10) {
                a0();
            }
        }
    }

    public void h0(a aVar) {
        this.O = aVar;
    }

    public void i0(ArrayList<e3> arrayList) {
        ArrayList<e3> arrayList2 = this.N;
        boolean z10 = false;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        int size2 = arrayList != null ? arrayList.size() : 0;
        if (size == size2) {
            if (size2 != 0) {
                Iterator<e3> it = arrayList.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().c() != this.N.get(i10).c()) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (!z10) {
                    return;
                }
            } else {
                return;
            }
        }
        ArrayList<e3> arrayList3 = this.N;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.N.size();
            this.N = null;
        }
        this.N = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.size();
        }
        H();
    }

    @Override
    public void onClick(View view) {
        a aVar = this.O;
        if (aVar != null) {
            aVar.C0(view, ((xc.a) view).getGif().a());
        }
    }

    @Override
    public boolean onLongClick(View view) {
        a aVar = this.O;
        if (aVar == null) {
            return false;
        }
        aVar.B1(view, ((xc.a) view).getGif().a());
        return true;
    }
}
