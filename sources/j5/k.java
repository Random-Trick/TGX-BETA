package j5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import m5.r;

public class k extends c {
    public Dialog S0;
    public DialogInterface.OnCancelListener T0;
    public Dialog U0;

    public static k q1(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        Dialog dialog2 = (Dialog) r.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.S0 = dialog2;
        if (onCancelListener != null) {
            kVar.T0 = onCancelListener;
        }
        return kVar;
    }

    @Override
    public Dialog m1(Bundle bundle) {
        Dialog dialog = this.S0;
        if (dialog != null) {
            return dialog;
        }
        n1(false);
        if (this.U0 == null) {
            this.U0 = new AlertDialog.Builder(i()).create();
        }
        return this.U0;
    }

    @Override
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.T0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public void p1(@RecentlyNonNull i iVar, String str) {
        super.p1(iVar, str);
    }
}
