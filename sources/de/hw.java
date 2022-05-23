package de;

import android.content.Context;
import android.view.View;
import ce.c0;
import gd.w;
import ie.g0;
import ie.h0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import zd.o6;

public class hw extends vo<Void> implements View.OnClickListener {
    public hw(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Cg(View view, int i10) {
        if (i10 == R.id.btn_edit) {
            fk fkVar = new fk(this.f24493a, this.f24495b);
            fkVar.vg(1);
            ac(fkVar);
        }
        return true;
    }

    @Override
    public int R9() {
        return R.id.controller_editPhone;
    }

    @Override
    public CharSequence X9() {
        TdApi.User da2 = this.f24495b.da();
        return da2 != null ? c0.w(da2.phoneNumber) : w.i1(R.string.PhoneNumberChange);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_changePhoneNumber) {
            ee(w.i1(R.string.PhoneNumberAlert), new int[]{R.id.btn_edit, R.id.btn_cancel}, new String[]{w.i1(R.string.PhoneNumberChangeDone), w.i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean Cg;
                    Cg = hw.this.Cg(view2, i10);
                    return Cg;
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        iq iqVar = new iq(this);
        iqVar.t2(new ra[]{new ra(19, (int) R.id.changePhoneText, (int) R.drawable.baseline_sim_card_96, c0.Z(w.i1(R.string.PhoneNumberHelp), R.id.theme_color_background_textLight), false), new ra(2), new ra(20, R.id.btn_changePhoneNumber, 0, R.string.PhoneNumberChange), new ra(3)}, false);
        customRecyclerView.setAdapter(iqVar);
    }
}
