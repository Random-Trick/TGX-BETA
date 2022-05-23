package de;

import android.content.Context;
import android.view.View;
import gd.w;
import he.d;
import java.util.ArrayList;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.s;
import ud.v4;
import zd.o6;

public class lv extends vo<Void> implements View.OnClickListener {
    public iq D0;
    public s E0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            cVar.setIconColorId(raVar.j() == R.id.btn_logout ? R.id.theme_color_iconNegative : 0);
        }
    }

    public lv(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public View G9() {
        return this.E0;
    }

    @Override
    public int R9() {
        return R.id.controller_logOut;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.LogOut);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_addAccount:
                this.f24495b.hd().z2(this.f24493a, true, false);
                return;
            case R.id.btn_changePhoneNumber:
                ac(new hw(this.f24493a, this.f24495b));
                return;
            case R.id.btn_help:
                this.f24495b.hd().C7(this);
                return;
            case R.id.btn_logout:
                this.f24495b.hd().a7(this, false);
                return;
            case R.id.btn_passcode:
                if (!d.w().x()) {
                    ac(new mi(this.f24493a, this.f24495b));
                    return;
                }
                return;
            case R.id.btn_storageUsage:
                ac(new qs(this.f24493a, this.f24495b));
                return;
            default:
                return;
        }
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        s sVar = new s(context);
        sVar.setThemedTextColor(this);
        sVar.A1(0, true);
        sVar.setTitle(X9());
        sVar.setSubtitle(w.i1(R.string.SignOutAlt));
        this.E0 = sVar;
        this.D0 = new a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(4, R.id.btn_addAccount, R.drawable.baseline_person_add_24, R.string.SignOutAltAddAccount));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.SignOutAltAddAccountHint));
        if (!d.w().x()) {
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, R.id.btn_passcode, R.drawable.baseline_lock_24, R.string.SignOutAltPasscode));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.SignOutAltPasscodeHint));
        }
        arrayList.add(new ra(2));
        arrayList.add(new ra(4, R.id.btn_storageUsage, R.drawable.templarian_baseline_broom_24, R.string.SignOutAltClearCache));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.SignOutAltClearCacheHint));
        arrayList.add(new ra(2));
        arrayList.add(new ra(4, R.id.btn_changePhoneNumber, R.drawable.baseline_sim_card_24, R.string.SignOutAltChangeNumber));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.SignOutAltChangeNumberHint));
        arrayList.add(new ra(2));
        arrayList.add(new ra(4, R.id.btn_help, R.drawable.baseline_help_24, R.string.SignOutAltHelp));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.SignOutAltHelpHint));
        arrayList.add(new ra(2));
        arrayList.add(new ra(4, R.id.btn_logout, R.drawable.baseline_delete_forever_24, R.string.LogOut).d0(R.id.theme_color_textNegative));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.SignOutAltHint2));
        this.D0.s2(arrayList, false);
        customRecyclerView.setAdapter(this.D0);
    }
}
