package tc;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.v;
import de.iq;
import de.ra;
import gd.w;
import org.thunderdog.challegram.R;
import uc.c;
import ud.v4;
import yd.g;

public class m2 extends o<Void> implements View.OnClickListener {
    public iq I0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_openLink) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_close) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }
    }

    public m2(y1 y1Var, int i10) {
        super(y1Var, i10);
    }

    @Override
    public int A9() {
        return 4;
    }

    @Override
    public int R9() {
        return R.id.controller_sponsoredMessagesInfo;
    }

    @Override
    public ViewGroup hf() {
        RecyclerView recyclerView = new RecyclerView(this.f24493a);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f24493a));
        b bVar = new b(this);
        recyclerView.setAdapter(bVar);
        bVar.t2(new ra[]{new ra(2), new ra(4, R.id.btn_close, R.drawable.baseline_check_circle_24, R.string.Continue).d0(R.id.theme_color_textNeutral), new ra(4, R.id.btn_openLink, R.drawable.baseline_help_24, R.string.SponsoredInfoAction)}, false);
        return recyclerView;
    }

    @Override
    public boolean jc(boolean z10) {
        this.f23267n0.p2(false);
        return true;
    }

    @Override
    public View oc(Context context) {
        bf(false);
        jg(new LinearLayoutManager(t(), 1, false));
        a aVar = new a(this);
        this.I0 = aVar;
        hg(aVar);
        g.j(this.f23277x0, R.id.theme_color_background);
        this.I0.t2(new ra[]{new ra(14), new ra(9, 0, 0, R.string.SponsoredInfoText), new ra(2), new ra(4, (int) R.id.btn_openLink, (int) R.drawable.baseline_language_24, (CharSequence) w.i1(R.string.url_promote), false).d0(R.id.theme_color_textNeutral), new ra(3), new ra(9, 0, 0, R.string.SponsoredInfoText2)}, false);
        return this.f23275v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_openLink) {
            this.f23267n0.p2(false);
            v.F(Uri.parse(w.i1(R.string.url_promote)));
        }
    }
}
