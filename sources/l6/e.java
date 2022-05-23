package l6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import j5.a;
import w5.b;
import w5.c;

public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override
    public final boolean E1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                a aVar = (a) c.b(parcel, a.CREATOR);
                b bVar = (b) c.b(parcel, b.CREATOR);
                break;
            case 4:
                Status status = (Status) c.b(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) c.b(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) c.b(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.b(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                u((l) c.b(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) c.b(parcel, h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
