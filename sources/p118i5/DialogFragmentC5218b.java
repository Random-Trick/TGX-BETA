package p118i5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p163l5.C6378r;

public class DialogFragmentC5218b extends DialogFragment {
    public Dialog f17358a;
    public DialogInterface.OnCancelListener f17359b;
    public Dialog f17360c;

    public static DialogFragmentC5218b m23609a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC5218b bVar = new DialogFragmentC5218b();
        Dialog dialog2 = (Dialog) C6378r.m20505l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f17358a = dialog2;
        if (onCancelListener != null) {
            bVar.f17359b = onCancelListener;
        }
        return bVar;
    }

    @Override
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17359b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f17358a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f17360c == null) {
            this.f17360c = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f17360c;
    }

    @Override
    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
