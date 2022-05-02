package be;

import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p108hb.C5070i;

public class C1369e0 {
    public static String m37401a(String str) {
        if (C5070i.m24062i(str)) {
            return null;
        }
        TdApi.Object e = Client.m14793e(new TdApi.GetFileExtension(str));
        if (e != null && e.getConstructor() == 578181272) {
            TdApi.Text text = (TdApi.Text) e;
            if (!C5070i.m24062i(text.text)) {
                return text.text;
            }
        }
        if ("image/heic".equals(str)) {
            return "heic";
        }
        if ("application/x-tgsticker".equals(str)) {
            return "tgs";
        }
        return null;
    }

    public static boolean m37400b(String str) {
        if (C5070i.m24062i(str)) {
            return false;
        }
        str.hashCode();
        return str.equals("audio/mpeg");
    }

    public static boolean m37399c(String str) {
        if (C5070i.m24062i(str) || !str.startsWith("image/")) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1487464693:
                if (str.equals("image/heic")) {
                    c = 0;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c = 1;
                    break;
                }
                break;
            case -879267568:
                if (str.equals("image/gif")) {
                    c = 2;
                    break;
                }
                break;
            case -879264467:
                if (str.equals("image/jpg")) {
                    c = 3;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    public static boolean m37398d(String str) {
        if (C5070i.m24062i(str)) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 99:
                if (str.equals("c")) {
                    c = 0;
                    break;
                }
                break;
            case 102:
                if (str.equals("f")) {
                    c = 1;
                    break;
                }
                break;
            case 112:
                if (str.equals("p")) {
                    c = 2;
                    break;
                }
                break;
            case C3563j.f11932G0:
                if (str.equals("s")) {
                    c = 3;
                    break;
                }
                break;
            case C3563j.f11937H0:
                if (str.equals("t")) {
                    c = 4;
                    break;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    c = 5;
                    break;
                }
                break;
            case 3311:
                if (str.equals("gv")) {
                    c = 6;
                    break;
                }
                break;
            case 3401:
                if (str.equals("js")) {
                    c = 7;
                    break;
                }
                break;
            case 3461:
                if (str.equals("n3")) {
                    c = '\b';
                    break;
                }
                break;
            case 3593:
                if (str.equals("py")) {
                    c = '\t';
                    break;
                }
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\n';
                    break;
                }
                break;
            case 3744:
                if (str.equals("uu")) {
                    c = 11;
                    break;
                }
                break;
            case 98819:
                if (str.equals("css")) {
                    c = '\f';
                    break;
                }
                break;
            case 98822:
                if (str.equals("csv")) {
                    c = '\r';
                    break;
                }
                break;
            case 99764:
                if (str.equals("dsc")) {
                    c = 14;
                    break;
                }
                break;
            case 100777:
                if (str.equals("etx")) {
                    c = 15;
                    break;
                }
                break;
            case 101490:
                if (str.equals("flx")) {
                    c = 16;
                    break;
                }
                break;
            case 101491:
                if (str.equals("fly")) {
                    c = 17;
                    break;
                }
                break;
            case 104089:
                if (str.equals("ics")) {
                    c = 18;
                    break;
                }
                break;
            case 104973:
                if (str.equals("jad")) {
                    c = 19;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 20;
                    break;
                }
                break;
            case 107512:
                if (str.equals("lua")) {
                    c = 21;
                    break;
                }
                break;
            case 110753:
                if (str.equals("par")) {
                    c = 22;
                    break;
                }
                break;
            case 110968:
                if (str.equals("php")) {
                    c = 23;
                    break;
                }
                break;
            case 113270:
                if (str.equals("rtx")) {
                    c = 24;
                    break;
                }
                break;
            case 115159:
                if (str.equals("tsv")) {
                    c = 25;
                    break;
                }
                break;
            case 115180:
                if (str.equals("ttl")) {
                    c = 26;
                    break;
                }
                break;
            case 115312:
                if (str.equals("txt")) {
                    c = 27;
                    break;
                }
                break;
            case 116076:
                if (str.equals("uri")) {
                    c = 28;
                    break;
                }
                break;
            case 116569:
                if (str.equals("vcf")) {
                    c = 29;
                    break;
                }
                break;
            case 116582:
                if (str.equals("vcs")) {
                    c = 30;
                    break;
                }
                break;
            case 117846:
                if (str.equals("wml")) {
                    c = 31;
                    break;
                }
                break;
            case 118807:
                if (str.equals("xml")) {
                    c = ' ';
                    break;
                }
                break;
            case 1618928:
                if (str.equals("3dml")) {
                    c = '!';
                    break;
                }
                break;
            case 3065388:
                if (str.equals("curl")) {
                    c = '\"';
                    break;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    c = '#';
                    break;
                }
                break;
            case 3254818:
                if (str.equals("java")) {
                    c = '$';
                    break;
                }
                break;
            case 3271912:
                if (str.equals("json")) {
                    c = '%';
                    break;
                }
                break;
            case 3528435:
                if (str.equals("sgml")) {
                    c = '&';
                    break;
                }
                break;
            case 3537154:
                if (str.equals("spot")) {
                    c = '\'';
                    break;
                }
                break;
            case 3653341:
                if (str.equals("wmls")) {
                    c = '(';
                    break;
                }
                break;
            case 3701415:
                if (str.equals("yaml")) {
                    c = ')';
                    break;
                }
                break;
            case 95417488:
                if (str.equals("dcurl")) {
                    c = '*';
                    break;
                }
                break;
            case 103729177:
                if (str.equals("mcurl")) {
                    c = '+';
                    break;
                }
                break;
            case 109270303:
                if (str.equals("scurl")) {
                    c = ',';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case C3563j.f11955K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case C3563j.f11980P3:
            case 30:
            case 31:
            case Log.TAG_IMAGE_LOADER:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
                return true;
            default:
                return false;
        }
    }

    public static boolean m37397e(String str) {
        if (C5070i.m24062i(str)) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2074721821:
                if (str.equals("text/vnd.sun.j2me.app-descriptor")) {
                    c = 0;
                    break;
                }
                break;
            case -1882575103:
                if (str.equals("text/uri-list")) {
                    c = 1;
                    break;
                }
                break;
            case -1808693885:
                if (str.equals("text/x-pascal")) {
                    c = 2;
                    break;
                }
                break;
            case -1719079914:
                if (str.equals("text/x-setext")) {
                    c = 3;
                    break;
                }
                break;
            case -1484596875:
                if (str.equals("text/vnd.wap.wmlscript")) {
                    c = 4;
                    break;
                }
                break;
            case -1417884249:
                if (str.equals("text/n3")) {
                    c = 5;
                    break;
                }
                break;
            case -1348224732:
                if (str.equals("application/x-php")) {
                    c = 6;
                    break;
                }
                break;
            case -1248334791:
                if (str.equals("application/php")) {
                    c = 7;
                    break;
                }
                break;
            case -1248326952:
                if (str.equals("application/xml")) {
                    c = '\b';
                    break;
                }
                break;
            case -1082243251:
                if (str.equals("text/html")) {
                    c = '\t';
                    break;
                }
                break;
            case -1081928043:
                if (str.equals("text/sgml")) {
                    c = '\n';
                    break;
                }
                break;
            case -1081755063:
                if (str.equals("text/yaml")) {
                    c = 11;
                    break;
                }
                break;
            case -1046908403:
                if (str.equals("text/vnd.fmi.flexstor")) {
                    c = '\f';
                    break;
                }
                break;
            case -1039440398:
                if (str.equals("text/vnd.curl.dcurl")) {
                    c = '\r';
                    break;
                }
                break;
            case -1031128709:
                if (str.equals("text/vnd.curl.mcurl")) {
                    c = 14;
                    break;
                }
                break;
            case -1025587583:
                if (str.equals("text/vnd.curl.scurl")) {
                    c = 15;
                    break;
                }
                break;
            case -1004747231:
                if (str.equals("text/css")) {
                    c = 16;
                    break;
                }
                break;
            case -1004747228:
                if (str.equals("text/csv")) {
                    c = 17;
                    break;
                }
                break;
            case -1004735082:
                if (str.equals("text/php")) {
                    c = 18;
                    break;
                }
                break;
            case -1004729236:
                if (str.equals("text/x-c")) {
                    c = 19;
                    break;
                }
                break;
            case -958424608:
                if (str.equals("text/calendar")) {
                    c = 20;
                    break;
                }
                break;
            case -941910972:
                if (str.equals("text/vnd.in3d.3dml")) {
                    c = 21;
                    break;
                }
                break;
            case -939992746:
                if (str.equals("text/vnd.in3d.spot")) {
                    c = 22;
                    break;
                }
                break;
            case -816908365:
                if (str.equals("application/x-httpd-php")) {
                    c = 23;
                    break;
                }
                break;
            case -737146065:
                if (str.equals("text/plain-bas")) {
                    c = 24;
                    break;
                }
                break;
            case -309045154:
                if (str.equals("text/turtle")) {
                    c = 25;
                    break;
                }
                break;
            case -185814068:
                if (str.equals("text/prs.lines.tag")) {
                    c = 26;
                    break;
                }
                break;
            case -122135691:
                if (str.equals("application/x-httpd-php-source")) {
                    c = 27;
                    break;
                }
                break;
            case -119630659:
                if (str.equals("text/x-fortran")) {
                    c = 28;
                    break;
                }
                break;
            case -105630993:
                if (str.equals("text/x-java-source")) {
                    c = 29;
                    break;
                }
                break;
            case -43840953:
                if (str.equals("application/json")) {
                    c = 30;
                    break;
                }
                break;
            case -43491031:
                if (str.equals("application/x-sh")) {
                    c = 31;
                    break;
                }
                break;
            case 262346941:
                if (str.equals("text/x-vcalendar")) {
                    c = ' ';
                    break;
                }
                break;
            case 302663708:
                if (str.equals("application/ecmascript")) {
                    c = '!';
                    break;
                }
                break;
            case 462708944:
                if (str.equals("text/vnd.curl")) {
                    c = '\"';
                    break;
                }
                break;
            case 501428239:
                if (str.equals("text/x-vcard")) {
                    c = '#';
                    break;
                }
                break;
            case 569118031:
                if (str.equals("text/vnd.fly")) {
                    c = '$';
                    break;
                }
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c = '%';
                    break;
                }
                break;
            case 821222095:
                if (str.equals("text/troff")) {
                    c = '&';
                    break;
                }
                break;
            case 822847556:
                if (str.equals("text/x-asm")) {
                    c = '\'';
                    break;
                }
                break;
            case 822861633:
                if (str.equals("text/x-php")) {
                    c = '(';
                    break;
                }
                break;
            case 1440428940:
                if (str.equals("application/javascript")) {
                    c = ')';
                    break;
                }
                break;
            case 1596571048:
                if (str.equals("text/tab-separated-values")) {
                    c = '*';
                    break;
                }
                break;
            case 1610669197:
                if (str.equals("text/x-uuencode")) {
                    c = '+';
                    break;
                }
                break;
            case 1779467453:
                if (str.equals("text/vnd.graphviz")) {
                    c = ',';
                    break;
                }
                break;
            case 1964277419:
                if (str.equals("text/richtext")) {
                    c = '-';
                    break;
                }
                break;
            case 2006143018:
                if (str.equals("text/vnd.wap.wml")) {
                    c = '.';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case C3563j.f11955K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case C3563j.f11980P3:
            case 30:
            case 31:
            case Log.TAG_IMAGE_LOADER:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
                return true;
            default:
                return false;
        }
    }

    public static boolean m37396f(String str) {
        if (C5070i.m24062i(str) || (!str.startsWith("video/") && !str.startsWith("application/"))) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1248337486:
                if (str.equals("application/mp4")) {
                    c = 0;
                    break;
                }
                break;
            case 1331848029:
                if (str.equals("video/mp4")) {
                    c = 1;
                    break;
                }
                break;
            case 1331848064:
                if (str.equals("video/mov")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static String m37395g(String str) {
        if (C5070i.m24062i(str)) {
            return null;
        }
        if ("tgx-theme".equals(str)) {
            return "text/plain";
        }
        TdApi.Object e = Client.m14793e(new TdApi.GetFileMimeType("file." + str));
        if (e != null && e.getConstructor() == 578181272) {
            TdApi.Text text = (TdApi.Text) e;
            if (!C5070i.m24062i(text.text)) {
                return text.text;
            }
        }
        if ("heic".equals(str)) {
            return "image/heic";
        }
        if ("tgs".equals(str)) {
            return "application/x-tgsticker";
        }
        return null;
    }
}
