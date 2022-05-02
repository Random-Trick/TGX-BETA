package p319wc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1399s0;
import gd.C4623e3;
import java.util.ArrayList;
import java.util.Iterator;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p080fb.C4336c;

public class View$OnClickListenerC10037b extends RecyclerView.AbstractC0890h<C10039b> implements View.OnClickListener, View.OnLongClickListener {
    public Context f32664M;
    public ArrayList<C4623e3> f32665N;
    public AbstractC10038a f32666O;
    public C4336c.AbstractC4337a f32667P;
    public boolean f32668Q;

    public interface AbstractC10038a {
        void mo6159C0(View view, TdApi.Animation animation);

        void mo6158D1(View view, TdApi.Animation animation);
    }

    public static class C10039b extends RecyclerView.AbstractC0886d0 {
        public C10039b(View view) {
            super(view);
        }

        public static C10039b m6157O(Context context, int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, C4336c.AbstractC4337a aVar) {
            if (i == 0) {
                C10036a aVar2 = new C10036a(context);
                if (aVar != null) {
                    aVar2.m6171B0(aVar);
                } else {
                    aVar2.setOnClickListener(onClickListener);
                    aVar2.setOnLongClickListener(onLongClickListener);
                }
                C1399s0.m37193a0(aVar2);
                aVar2.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new C10039b(aVar2);
            } else if (i == 1) {
                View view = new View(context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize()));
                return new C10039b(view);
            } else {
                throw new RuntimeException();
            }
        }
    }

    public View$OnClickListenerC10037b(Context context, C4336c.AbstractC4337a aVar) {
        this.f32664M = context;
        this.f32667P = aVar;
    }

    @Override
    public int mo6153D() {
        ArrayList<C4623e3> arrayList = this.f32665N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public int mo6150F(int i) {
        return (i != 0 || !this.f32668Q) ? 0 : 1;
    }

    public void m6168a0() {
        m6160j0(null);
    }

    public C4623e3 m6167c0(int i) {
        ArrayList<C4623e3> arrayList = this.f32665N;
        if (this.f32668Q) {
            i--;
        }
        return arrayList.get(i);
    }

    public void mo6146Q(C10039b bVar, int i) {
        C10036a aVar = (C10036a) bVar.f3479a;
        ArrayList<C4623e3> arrayList = this.f32665N;
        if (this.f32668Q) {
            i--;
        }
        aVar.setGif(arrayList.get(i));
    }

    public C10039b mo6145S(ViewGroup viewGroup, int i) {
        return C10039b.m6157O(this.f32664M, i, this, this, this.f32667P);
    }

    public void mo6144V(C10039b bVar) {
        ((C10036a) bVar.f3479a).m6169f();
    }

    public void mo6143W(C10039b bVar) {
        ((C10036a) bVar.f3479a).m6170b();
    }

    public void m6162h0(int i) {
        ArrayList<C4623e3> arrayList = this.f32665N;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            if (this.f32665N.size() != 1) {
                Iterator<C4623e3> it = this.f32665N.iterator();
                while (it.hasNext()) {
                    if (it.next().m26838c() == i) {
                        this.f32665N.remove(i2);
                        m39313H();
                        return;
                    }
                    i2++;
                }
            } else if (this.f32665N.get(0).m26838c() == i) {
                m6168a0();
            }
        }
    }

    public void m6161i0(AbstractC10038a aVar) {
        this.f32666O = aVar;
    }

    public void m6160j0(ArrayList<C4623e3> arrayList) {
        ArrayList<C4623e3> arrayList2 = this.f32665N;
        boolean z = false;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        int size2 = arrayList != null ? arrayList.size() : 0;
        if (size == size2) {
            if (size2 != 0) {
                Iterator<C4623e3> it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().m26838c() != this.f32665N.get(i).m26838c()) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        ArrayList<C4623e3> arrayList3 = this.f32665N;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.f32665N.size();
            this.f32665N = null;
        }
        this.f32665N = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.size();
        }
        m39313H();
    }

    @Override
    public void onClick(View view) {
        AbstractC10038a aVar = this.f32666O;
        if (aVar != null) {
            aVar.mo6159C0(view, ((C10036a) view).getGif().m26840a());
        }
    }

    @Override
    public boolean onLongClick(View view) {
        AbstractC10038a aVar = this.f32666O;
        if (aVar == null) {
            return false;
        }
        aVar.mo6158D1(view, ((C10036a) view).getGif().m26840a());
        return true;
    }
}
