package p118i5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.AbstractC0767i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0759c;
import p163l5.C6378r;

public class C5227k extends DialogInterface$OnCancelListenerC0759c {
    public Dialog f17377S0;
    public DialogInterface.OnCancelListener f17378T0;
    public Dialog f17379U0;

    public static C5227k m23563q1(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C5227k kVar = new C5227k();
        Dialog dialog2 = (Dialog) C6378r.m20506l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.f17377S0 = dialog2;
        if (onCancelListener != null) {
            kVar.f17378T0 = onCancelListener;
        }
        return kVar;
    }

    @Override
    public Dialog mo23565m1(Bundle bundle) {
        Dialog dialog = this.f17377S0;
        if (dialog != null) {
            return dialog;
        }
        m40071n1(false);
        if (this.f17379U0 == null) {
            this.f17379U0 = new AlertDialog.Builder(m40137i()).create();
        }
        return this.f17379U0;
    }

    @Override
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17378T0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public void mo23564p1(@RecentlyNonNull AbstractC0767i iVar, String str) {
        super.mo23564p1(iVar, str);
    }
}
