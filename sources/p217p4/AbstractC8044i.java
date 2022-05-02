package p217p4;

import p174m3.C6600g1;
import p231q4.C8227a;
import p231q4.C8231c;
import p245r4.C8360a;
import p260s4.C8641a;
import p284u4.C9439a;
import p298v4.C9839a;
import p311w4.C9970c;
import p326x4.C10095a;
import p341y4.C10371a;
import p341y4.C10383h;

public interface AbstractC8044i {
    public static final AbstractC8044i f26201a = new C8045a();

    public class C8045a implements AbstractC8044i {
        @Override
        public boolean mo13723a(C6600g1 g1Var) {
            String str = g1Var.f20575U;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override
        public AbstractC8042g mo13722b(C6600g1 g1Var) {
            String str = g1Var.f20575U;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C8360a(g1Var.f20577W);
                    case 1:
                        return new C8641a();
                    case 2:
                        return new C10371a();
                    case 3:
                        return new C10383h();
                    case 4:
                        return new C10095a(g1Var.f20577W);
                    case 5:
                        return new C9439a(g1Var.f20577W);
                    case 6:
                    case '\b':
                        return new C8227a(str, g1Var.f20596m0, 16000L);
                    case 7:
                        return new C8036d();
                    case '\t':
                        return new C8231c(g1Var.f20596m0, g1Var.f20577W);
                    case '\n':
                        return new C9839a();
                    case 11:
                        return new C9970c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean mo13723a(C6600g1 g1Var);

    AbstractC8042g mo13722b(C6600g1 g1Var);
}
