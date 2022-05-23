package j5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import m5.r;

public class b extends DialogFragment {
    public Dialog f15064a;
    public DialogInterface.OnCancelListener f15065b;
    public Dialog f15066c;

    public static b a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) r.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f15064a = dialog2;
        if (onCancelListener != null) {
            bVar.f15065b = onCancelListener;
        }
        return bVar;
    }

    @Override
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15065b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f15064a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f15066c == null) {
            this.f15066c = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f15066c;
    }

    @Override
    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
