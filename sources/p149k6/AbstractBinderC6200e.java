package p149k6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p118i5.C5217a;
import p299v5.BinderC9842b;
import p299v5.C9843c;

public abstract class AbstractBinderC6200e extends BinderC9842b implements AbstractC6201f {
    public AbstractBinderC6200e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override
    public final boolean mo6758G1(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C5217a aVar = (C5217a) C9843c.m6756b(parcel, C5217a.CREATOR);
                C6197b bVar = (C6197b) C9843c.m6756b(parcel, C6197b.CREATOR);
                break;
            case 4:
                Status status = (Status) C9843c.m6756b(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) C9843c.m6756b(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C9843c.m6756b(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C9843c.m6756b(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo21073r0((C6207l) C9843c.m6756b(parcel, C6207l.CREATOR));
                break;
            case 9:
                C6203h hVar = (C6203h) C9843c.m6756b(parcel, C6203h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
