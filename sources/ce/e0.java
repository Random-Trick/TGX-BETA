package ce;

import d.j;
import ib.i;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class e0 {
    public static String a(String str) {
        if (i.i(str)) {
            return null;
        }
        TdApi.Object e10 = Client.e(new TdApi.GetFileExtension(str));
        if (e10 != null && e10.getConstructor() == 578181272) {
            TdApi.Text text = (TdApi.Text) e10;
            if (!i.i(text.text)) {
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

    public static boolean b(String str) {
        if (i.i(str)) {
            return false;
        }
        str.hashCode();
        return str.equals("audio/mpeg");
    }

    public static boolean c(String str) {
        if (i.i(str) || !str.startsWith("image/")) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1487464693:
                if (str.equals("image/heic")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c10 = 1;
                    break;
                }
                break;
            case -879267568:
                if (str.equals("image/gif")) {
                    c10 = 2;
                    break;
                }
                break;
            case -879264467:
                if (str.equals("image/jpg")) {
                    c10 = 3;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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

    public static boolean d(String str) {
        if (i.i(str)) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 99:
                if (str.equals("c")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102:
                if (str.equals("f")) {
                    c10 = 1;
                    break;
                }
                break;
            case 112:
                if (str.equals("p")) {
                    c10 = 2;
                    break;
                }
                break;
            case j.G0:
                if (str.equals("s")) {
                    c10 = 3;
                    break;
                }
                break;
            case j.H0:
                if (str.equals("t")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3311:
                if (str.equals("gv")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3401:
                if (str.equals("js")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3461:
                if (str.equals("n3")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3593:
                if (str.equals("py")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3669:
                if (str.equals("sh")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3744:
                if (str.equals("uu")) {
                    c10 = 11;
                    break;
                }
                break;
            case 98819:
                if (str.equals("css")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 98822:
                if (str.equals("csv")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 99764:
                if (str.equals("dsc")) {
                    c10 = 14;
                    break;
                }
                break;
            case 100777:
                if (str.equals("etx")) {
                    c10 = 15;
                    break;
                }
                break;
            case 101490:
                if (str.equals("flx")) {
                    c10 = 16;
                    break;
                }
                break;
            case 101491:
                if (str.equals("fly")) {
                    c10 = 17;
                    break;
                }
                break;
            case 104089:
                if (str.equals("ics")) {
                    c10 = 18;
                    break;
                }
                break;
            case 104973:
                if (str.equals("jad")) {
                    c10 = 19;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c10 = 20;
                    break;
                }
                break;
            case 107512:
                if (str.equals("lua")) {
                    c10 = 21;
                    break;
                }
                break;
            case 110753:
                if (str.equals("par")) {
                    c10 = 22;
                    break;
                }
                break;
            case 110968:
                if (str.equals("php")) {
                    c10 = 23;
                    break;
                }
                break;
            case 113270:
                if (str.equals("rtx")) {
                    c10 = 24;
                    break;
                }
                break;
            case 115159:
                if (str.equals("tsv")) {
                    c10 = 25;
                    break;
                }
                break;
            case 115180:
                if (str.equals("ttl")) {
                    c10 = 26;
                    break;
                }
                break;
            case 115312:
                if (str.equals("txt")) {
                    c10 = 27;
                    break;
                }
                break;
            case 116076:
                if (str.equals("uri")) {
                    c10 = 28;
                    break;
                }
                break;
            case 116569:
                if (str.equals("vcf")) {
                    c10 = 29;
                    break;
                }
                break;
            case 116582:
                if (str.equals("vcs")) {
                    c10 = 30;
                    break;
                }
                break;
            case 117846:
                if (str.equals("wml")) {
                    c10 = 31;
                    break;
                }
                break;
            case 118807:
                if (str.equals("xml")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1618928:
                if (str.equals("3dml")) {
                    c10 = '!';
                    break;
                }
                break;
            case 3065388:
                if (str.equals("curl")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    c10 = '#';
                    break;
                }
                break;
            case 3254818:
                if (str.equals("java")) {
                    c10 = '$';
                    break;
                }
                break;
            case 3271912:
                if (str.equals("json")) {
                    c10 = '%';
                    break;
                }
                break;
            case 3528435:
                if (str.equals("sgml")) {
                    c10 = '&';
                    break;
                }
                break;
            case 3537154:
                if (str.equals("spot")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 3653341:
                if (str.equals("wmls")) {
                    c10 = '(';
                    break;
                }
                break;
            case 3701415:
                if (str.equals("yaml")) {
                    c10 = ')';
                    break;
                }
                break;
            case 95417488:
                if (str.equals("dcurl")) {
                    c10 = '*';
                    break;
                }
                break;
            case 103729177:
                if (str.equals("mcurl")) {
                    c10 = '+';
                    break;
                }
                break;
            case 109270303:
                if (str.equals("scurl")) {
                    c10 = ',';
                    break;
                }
                break;
        }
        switch (c10) {
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
            case j.K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.P3:
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

    public static boolean e(String str) {
        if (i.i(str)) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2074721821:
                if (str.equals("text/vnd.sun.j2me.app-descriptor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1882575103:
                if (str.equals("text/uri-list")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1808693885:
                if (str.equals("text/x-pascal")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1719079914:
                if (str.equals("text/x-setext")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1484596875:
                if (str.equals("text/vnd.wap.wmlscript")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1417884249:
                if (str.equals("text/n3")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1348224732:
                if (str.equals("application/x-php")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1248334791:
                if (str.equals("application/php")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1248326952:
                if (str.equals("application/xml")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1082243251:
                if (str.equals("text/html")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1081928043:
                if (str.equals("text/sgml")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1081755063:
                if (str.equals("text/yaml")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1046908403:
                if (str.equals("text/vnd.fmi.flexstor")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1039440398:
                if (str.equals("text/vnd.curl.dcurl")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1031128709:
                if (str.equals("text/vnd.curl.mcurl")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1025587583:
                if (str.equals("text/vnd.curl.scurl")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1004747231:
                if (str.equals("text/css")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1004747228:
                if (str.equals("text/csv")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1004735082:
                if (str.equals("text/php")) {
                    c10 = 18;
                    break;
                }
                break;
            case -1004729236:
                if (str.equals("text/x-c")) {
                    c10 = 19;
                    break;
                }
                break;
            case -958424608:
                if (str.equals("text/calendar")) {
                    c10 = 20;
                    break;
                }
                break;
            case -941910972:
                if (str.equals("text/vnd.in3d.3dml")) {
                    c10 = 21;
                    break;
                }
                break;
            case -939992746:
                if (str.equals("text/vnd.in3d.spot")) {
                    c10 = 22;
                    break;
                }
                break;
            case -816908365:
                if (str.equals("application/x-httpd-php")) {
                    c10 = 23;
                    break;
                }
                break;
            case -737146065:
                if (str.equals("text/plain-bas")) {
                    c10 = 24;
                    break;
                }
                break;
            case -309045154:
                if (str.equals("text/turtle")) {
                    c10 = 25;
                    break;
                }
                break;
            case -185814068:
                if (str.equals("text/prs.lines.tag")) {
                    c10 = 26;
                    break;
                }
                break;
            case -122135691:
                if (str.equals("application/x-httpd-php-source")) {
                    c10 = 27;
                    break;
                }
                break;
            case -119630659:
                if (str.equals("text/x-fortran")) {
                    c10 = 28;
                    break;
                }
                break;
            case -105630993:
                if (str.equals("text/x-java-source")) {
                    c10 = 29;
                    break;
                }
                break;
            case -43840953:
                if (str.equals("application/json")) {
                    c10 = 30;
                    break;
                }
                break;
            case -43491031:
                if (str.equals("application/x-sh")) {
                    c10 = 31;
                    break;
                }
                break;
            case 262346941:
                if (str.equals("text/x-vcalendar")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 302663708:
                if (str.equals("application/ecmascript")) {
                    c10 = '!';
                    break;
                }
                break;
            case 462708944:
                if (str.equals("text/vnd.curl")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 501428239:
                if (str.equals("text/x-vcard")) {
                    c10 = '#';
                    break;
                }
                break;
            case 569118031:
                if (str.equals("text/vnd.fly")) {
                    c10 = '$';
                    break;
                }
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c10 = '%';
                    break;
                }
                break;
            case 821222095:
                if (str.equals("text/troff")) {
                    c10 = '&';
                    break;
                }
                break;
            case 822847556:
                if (str.equals("text/x-asm")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 822861633:
                if (str.equals("text/x-php")) {
                    c10 = '(';
                    break;
                }
                break;
            case 1440428940:
                if (str.equals("application/javascript")) {
                    c10 = ')';
                    break;
                }
                break;
            case 1596571048:
                if (str.equals("text/tab-separated-values")) {
                    c10 = '*';
                    break;
                }
                break;
            case 1610669197:
                if (str.equals("text/x-uuencode")) {
                    c10 = '+';
                    break;
                }
                break;
            case 1779467453:
                if (str.equals("text/vnd.graphviz")) {
                    c10 = ',';
                    break;
                }
                break;
            case 1964277419:
                if (str.equals("text/richtext")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2006143018:
                if (str.equals("text/vnd.wap.wml")) {
                    c10 = '.';
                    break;
                }
                break;
        }
        switch (c10) {
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
            case j.K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.P3:
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

    public static boolean f(String str) {
        if (i.i(str) || (!str.startsWith("video/") && !str.startsWith("application/"))) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1248337486:
                if (str.equals("application/mp4")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1331848029:
                if (str.equals("video/mp4")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331848064:
                if (str.equals("video/mov")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static String g(String str) {
        if (i.i(str)) {
            return null;
        }
        if ("tgx-theme".equals(str)) {
            return "text/plain";
        }
        TdApi.Object e10 = Client.e(new TdApi.GetFileMimeType("file." + str));
        if (e10 != null && e10.getConstructor() == 578181272) {
            TdApi.Text text = (TdApi.Text) e10;
            if (!i.i(text.text)) {
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
