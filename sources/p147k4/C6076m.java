package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p020b5.C1216l0;
import p174m3.C6693s1;

public final class C6076m extends AbstractC6069i {
    public static final Parcelable.Creator<C6076m> CREATOR = new C6077a();
    public final String f19300b;
    public final String f19301c;

    public class C6077a implements Parcelable.Creator<C6076m> {
        public C6076m createFromParcel(Parcel parcel) {
            return new C6076m(parcel);
        }

        public C6076m[] newArray(int i) {
            return new C6076m[i];
        }
    }

    public C6076m(String str, String str2, String str3) {
        super(str);
        this.f19300b = str2;
        this.f19301c = str3;
    }

    public static List<Integer> m21394a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6076m.class != obj.getClass()) {
            return false;
        }
        C6076m mVar = (C6076m) obj;
        return C1216l0.m37982c(this.f19289a, mVar.f19289a) && C1216l0.m37982c(this.f19300b, mVar.f19300b) && C1216l0.m37982c(this.f19301c, mVar.f19301c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f19289a.hashCode()) * 31;
        String str = this.f19300b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19301c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        String str = this.f19289a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    bVar.m19537M(this.f19301c);
                    return;
                case 1:
                case 11:
                    bVar.m19532R(this.f19301c);
                    return;
                case 2:
                case '\f':
                    bVar.m19516d0(Integer.valueOf(Integer.parseInt(this.f19301c.substring(2, 4)))).m19518c0(Integer.valueOf(Integer.parseInt(this.f19301c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.m19536N(this.f19301c);
                    return;
                case 4:
                case 18:
                    bVar.m19538L(this.f19301c);
                    return;
                case 5:
                case 19:
                    bVar.m19531S(this.f19301c);
                    return;
                case 6:
                case 20:
                    String[] A0 = C1216l0.m38020A0(this.f19301c, "/");
                    bVar.m19496n0(Integer.valueOf(Integer.parseInt(A0[0]))).m19498m0(A0.length > 1 ? Integer.valueOf(Integer.parseInt(A0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.m19502k0(this.f19301c);
                    return;
                case '\b':
                case 15:
                    bVar.m19492p0(this.f19301c);
                    return;
                case '\t':
                case 21:
                    bVar.m19514e0(Integer.valueOf(Integer.parseInt(this.f19301c)));
                    return;
                case '\r':
                    List<Integer> a = m21394a(this.f19301c);
                    int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.m19518c0(a.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.m19516d0(a.get(1));
                    }
                    bVar.m19514e0(a.get(0));
                    return;
                case 14:
                    List<Integer> a2 = m21394a(this.f19301c);
                    int size2 = a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.m19512f0(a2.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.m19510g0(a2.get(1));
                    }
                    bVar.m19508h0(a2.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19300b;
        String str3 = this.f19301c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19289a);
        parcel.writeString(this.f19300b);
        parcel.writeString(this.f19301c);
    }

    public C6076m(Parcel parcel) {
        super((String) C1216l0.m37968j(parcel.readString()));
        this.f19300b = parcel.readString();
        this.f19301c = (String) C1216l0.m37968j(parcel.readString());
    }
}
