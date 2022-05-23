package ce;

public class f0 {
    public static String a(String str, boolean z10) {
        int c10;
        int length = str.length();
        String b10 = b(str, length);
        if (!(b10 != null || (c10 = c(str)) == -1 || length == c10)) {
            if (length > c10) {
                b10 = b(str, c10);
                if (b10 != null) {
                    return b10 + str.substring(c10);
                }
            } else {
                int i10 = c10 - length;
                StringBuilder sb2 = new StringBuilder(str);
                sb2.ensureCapacity(str.length() + i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    sb2.append('0');
                }
                String b11 = b(sb2.toString(), c10);
                if (b11 != null) {
                    int length2 = b11.length();
                    while (length2 > 0) {
                        char charAt = b11.charAt(length2 - 1);
                        if (Character.isDigit(charAt) && i10 <= 0) {
                            break;
                        }
                        if (i10 <= 0) {
                            if (charAt == ')' && z10) {
                                break;
                            }
                        } else if (charAt == '0') {
                            i10--;
                        }
                        length2--;
                    }
                    if (!(length2 == 0 || length2 == b11.length())) {
                        return b11.substring(0, length2);
                    }
                }
            }
        }
        return b10;
    }

    public static String b(String str, int i10) {
        switch (i10) {
            case 8:
                if (!str.startsWith("290")) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append("+290 ");
                sb2.append((CharSequence) str, 3, 5);
                sb2.append(' ');
                sb2.append((CharSequence) str, 5, 8);
                return sb2.toString();
            case 9:
                if (str.startsWith("672")) {
                    StringBuilder sb3 = new StringBuilder(13);
                    sb3.append("+672 ");
                    sb3.append(str.charAt(3));
                    sb3.append(' ');
                    sb3.append((CharSequence) str, 4, 6);
                    sb3.append(' ');
                    sb3.append((CharSequence) str, 6, 9);
                    return sb3.toString();
                } else if (str.startsWith("299")) {
                    StringBuilder sb4 = new StringBuilder(12);
                    sb4.append("+299 ");
                    sb4.append((CharSequence) str, 3, 6);
                    sb4.append(' ');
                    sb4.append((CharSequence) str, 6, 9);
                    return sb4.toString();
                } else if (str.startsWith("298")) {
                    StringBuilder sb5 = new StringBuilder(12);
                    sb5.append("+298 ");
                    sb5.append((CharSequence) str, 3, 6);
                    sb5.append(' ');
                    sb5.append((CharSequence) str, 6, 9);
                    return sb5.toString();
                } else if (!str.startsWith("376")) {
                    return null;
                } else {
                    StringBuilder sb6 = new StringBuilder(13);
                    sb6.append("+376 ");
                    sb6.append((CharSequence) str, 3, 5);
                    sb6.append(' ');
                    sb6.append((CharSequence) str, 5, 7);
                    sb6.append(' ');
                    sb6.append((CharSequence) str, 7, 9);
                    return sb6.toString();
                }
            case 10:
                if (str.startsWith("354")) {
                    StringBuilder sb7 = new StringBuilder(13);
                    sb7.append("+354 ");
                    sb7.append((CharSequence) str, 3, 6);
                    sb7.append(' ');
                    sb7.append((CharSequence) str, 6, 10);
                    return sb7.toString();
                } else if (str.startsWith("248")) {
                    StringBuilder sb8 = new StringBuilder(15);
                    sb8.append("+248 ");
                    sb8.append(str.charAt(3));
                    sb8.append(' ');
                    sb8.append((CharSequence) str, 4, 6);
                    sb8.append(' ');
                    sb8.append((CharSequence) str, 6, 8);
                    sb8.append(' ');
                    sb8.append((CharSequence) str, 8, 10);
                    return sb8.toString();
                } else if (str.startsWith("269")) {
                    StringBuilder sb9 = new StringBuilder(13);
                    sb9.append("+269 ");
                    sb9.append((CharSequence) str, 3, 6);
                    sb9.append(' ');
                    sb9.append((CharSequence) str, 6, 10);
                    return sb9.toString();
                } else if (str.startsWith("291")) {
                    StringBuilder sb10 = new StringBuilder(14);
                    sb10.append("+291 ");
                    sb10.append(str.charAt(3));
                    sb10.append(' ');
                    sb10.append((CharSequence) str, 4, 7);
                    sb10.append(' ');
                    sb10.append((CharSequence) str, 7, 10);
                    return sb10.toString();
                } else if (str.startsWith("220")) {
                    StringBuilder sb11 = new StringBuilder(13);
                    sb11.append("+220 ");
                    sb11.append((CharSequence) str, 3, 6);
                    sb11.append(' ');
                    sb11.append((CharSequence) str, 6, 10);
                    return sb11.toString();
                } else if (str.startsWith("241")) {
                    StringBuilder sb12 = new StringBuilder(15);
                    sb12.append("+241 ");
                    sb12.append(str.charAt(3));
                    sb12.append(' ');
                    sb12.append((CharSequence) str, 4, 6);
                    sb12.append(' ');
                    sb12.append((CharSequence) str, 6, 8);
                    sb12.append(' ');
                    sb12.append((CharSequence) str, 8, 10);
                    return sb12.toString();
                } else if (str.startsWith("245")) {
                    StringBuilder sb13 = new StringBuilder(13);
                    sb13.append("+245 ");
                    sb13.append((CharSequence) str, 3, 6);
                    sb13.append(' ');
                    sb13.append((CharSequence) str, 6, 10);
                    return sb13.toString();
                } else if (str.startsWith("239")) {
                    StringBuilder sb14 = new StringBuilder(13);
                    sb14.append("+239 ");
                    sb14.append((CharSequence) str, 3, 5);
                    sb14.append(' ');
                    sb14.append((CharSequence) str, 5, 10);
                    return sb14.toString();
                } else if (str.startsWith("238")) {
                    StringBuilder sb15 = new StringBuilder(13);
                    sb15.append("+238 ");
                    sb15.append((CharSequence) str, 3, 5);
                    sb15.append(' ');
                    sb15.append((CharSequence) str, 5, 10);
                    return sb15.toString();
                } else if (str.startsWith("246")) {
                    StringBuilder sb16 = new StringBuilder(13);
                    sb16.append("+246 ");
                    sb16.append((CharSequence) str, 3, 6);
                    sb16.append(' ');
                    sb16.append((CharSequence) str, 6, 10);
                    return sb16.toString();
                } else if (str.startsWith("297")) {
                    StringBuilder sb17 = new StringBuilder(13);
                    sb17.append("+297 ");
                    sb17.append((CharSequence) str, 3, 6);
                    sb17.append(' ');
                    sb17.append((CharSequence) str, 6, 10);
                    return sb17.toString();
                } else if (str.startsWith("960")) {
                    StringBuilder sb18 = new StringBuilder(13);
                    sb18.append("+960 ");
                    sb18.append((CharSequence) str, 3, 6);
                    sb18.append(' ');
                    sb18.append((CharSequence) str, 6, 10);
                    return sb18.toString();
                } else if (str.startsWith("961")) {
                    StringBuilder sb19 = new StringBuilder(14);
                    sb19.append("+961 ");
                    sb19.append(str.charAt(3));
                    sb19.append(' ');
                    sb19.append((CharSequence) str, 4, 7);
                    sb19.append(' ');
                    sb19.append((CharSequence) str, 7, 10);
                    return sb19.toString();
                } else if (str.startsWith("673")) {
                    StringBuilder sb20 = new StringBuilder(13);
                    sb20.append("+673 ");
                    sb20.append((CharSequence) str, 3, 6);
                    sb20.append(' ');
                    sb20.append((CharSequence) str, 6, 10);
                    return sb20.toString();
                } else if (str.startsWith("597")) {
                    StringBuilder sb21 = new StringBuilder(13);
                    sb21.append("+597 ");
                    sb21.append((CharSequence) str, 3, 6);
                    sb21.append(' ');
                    sb21.append((CharSequence) str, 6, 10);
                    return sb21.toString();
                } else if (str.startsWith("45")) {
                    StringBuilder sb22 = new StringBuilder(13);
                    sb22.append("+45 ");
                    sb22.append((CharSequence) str, 2, 6);
                    sb22.append(' ');
                    sb22.append((CharSequence) str, 6, 10);
                    return sb22.toString();
                } else if (str.startsWith("47")) {
                    StringBuilder sb23 = new StringBuilder(13);
                    sb23.append("+47 ");
                    sb23.append((CharSequence) str, 2, 6);
                    sb23.append(' ');
                    sb23.append((CharSequence) str, 6, 10);
                    return sb23.toString();
                } else if (str.startsWith("95")) {
                    StringBuilder sb24 = new StringBuilder(13);
                    sb24.append("+95 ");
                    sb24.append(str.charAt(2));
                    sb24.append(' ');
                    sb24.append((CharSequence) str, 3, 10);
                    return sb24.toString();
                } else if (str.startsWith("65")) {
                    StringBuilder sb25 = new StringBuilder(13);
                    sb25.append("+65 ");
                    sb25.append((CharSequence) str, 2, 6);
                    sb25.append(' ');
                    sb25.append((CharSequence) str, 6, 10);
                    return sb25.toString();
                } else if (!str.startsWith("64")) {
                    return null;
                } else {
                    StringBuilder sb26 = new StringBuilder(13);
                    sb26.append("+64 ");
                    sb26.append((CharSequence) str, 2, 6);
                    sb26.append(' ');
                    sb26.append((CharSequence) str, 6, 10);
                    return sb26.toString();
                }
            case 11:
                if (str.startsWith("1649")) {
                    StringBuilder sb27 = new StringBuilder(14);
                    sb27.append("+1649 ");
                    sb27.append((CharSequence) str, 4, 7);
                    sb27.append(' ');
                    sb27.append((CharSequence) str, 7, 11);
                    return sb27.toString();
                } else if (str.startsWith("1473")) {
                    StringBuilder sb28 = new StringBuilder(14);
                    sb28.append("+1473 ");
                    sb28.append((CharSequence) str, 4, 7);
                    sb28.append(' ');
                    sb28.append((CharSequence) str, 7, 11);
                    return sb28.toString();
                } else if (str.startsWith("1664")) {
                    StringBuilder sb29 = new StringBuilder(14);
                    sb29.append("+1664 ");
                    sb29.append((CharSequence) str, 4, 7);
                    sb29.append(' ');
                    sb29.append((CharSequence) str, 7, 11);
                    return sb29.toString();
                } else if (str.startsWith("1670")) {
                    StringBuilder sb30 = new StringBuilder(14);
                    sb30.append("+1670 ");
                    sb30.append((CharSequence) str, 4, 7);
                    sb30.append(' ');
                    sb30.append((CharSequence) str, 7, 11);
                    return sb30.toString();
                } else if (str.startsWith("1671")) {
                    StringBuilder sb31 = new StringBuilder(14);
                    sb31.append("+1671 ");
                    sb31.append((CharSequence) str, 4, 7);
                    sb31.append(' ');
                    sb31.append((CharSequence) str, 7, 11);
                    return sb31.toString();
                } else if (str.startsWith("1441")) {
                    StringBuilder sb32 = new StringBuilder(14);
                    sb32.append("+1441 ");
                    sb32.append((CharSequence) str, 4, 7);
                    sb32.append(' ');
                    sb32.append((CharSequence) str, 7, 11);
                    return sb32.toString();
                } else if (str.startsWith("1345")) {
                    StringBuilder sb33 = new StringBuilder(14);
                    sb33.append("+1345 ");
                    sb33.append((CharSequence) str, 4, 7);
                    sb33.append(' ');
                    sb33.append((CharSequence) str, 7, 11);
                    return sb33.toString();
                } else if (str.startsWith("1264")) {
                    StringBuilder sb34 = new StringBuilder(14);
                    sb34.append("+1264 ");
                    sb34.append((CharSequence) str, 4, 7);
                    sb34.append(' ');
                    sb34.append((CharSequence) str, 7, 11);
                    return sb34.toString();
                } else if (str.startsWith("1242")) {
                    StringBuilder sb35 = new StringBuilder(14);
                    sb35.append("+1242 ");
                    sb35.append((CharSequence) str, 4, 7);
                    sb35.append(' ');
                    sb35.append((CharSequence) str, 7, 11);
                    return sb35.toString();
                } else if (str.startsWith("1268")) {
                    StringBuilder sb36 = new StringBuilder(14);
                    sb36.append("+1268 ");
                    sb36.append((CharSequence) str, 4, 7);
                    sb36.append(' ');
                    sb36.append((CharSequence) str, 7, 11);
                    return sb36.toString();
                } else if (str.startsWith("1284")) {
                    StringBuilder sb37 = new StringBuilder(14);
                    sb37.append("+1284 ");
                    sb37.append((CharSequence) str, 4, 7);
                    sb37.append(' ');
                    sb37.append((CharSequence) str, 7, 11);
                    return sb37.toString();
                } else if (str.startsWith("1340")) {
                    StringBuilder sb38 = new StringBuilder(14);
                    sb38.append("+1340 ");
                    sb38.append((CharSequence) str, 4, 7);
                    sb38.append(' ');
                    sb38.append((CharSequence) str, 7, 11);
                    return sb38.toString();
                } else if (str.startsWith("1684")) {
                    StringBuilder sb39 = new StringBuilder(14);
                    sb39.append("+1684 ");
                    sb39.append((CharSequence) str, 4, 7);
                    sb39.append(' ');
                    sb39.append((CharSequence) str, 7, 11);
                    return sb39.toString();
                } else if (str.startsWith("1246")) {
                    StringBuilder sb40 = new StringBuilder(14);
                    sb40.append("+1246 ");
                    sb40.append((CharSequence) str, 4, 7);
                    sb40.append(' ');
                    sb40.append((CharSequence) str, 7, 11);
                    return sb40.toString();
                } else if (str.startsWith("1721")) {
                    StringBuilder sb41 = new StringBuilder(14);
                    sb41.append("+1721 ");
                    sb41.append((CharSequence) str, 4, 7);
                    sb41.append(' ');
                    sb41.append((CharSequence) str, 7, 11);
                    return sb41.toString();
                } else if (str.startsWith("1849")) {
                    StringBuilder sb42 = new StringBuilder(14);
                    sb42.append("+1849 ");
                    sb42.append((CharSequence) str, 4, 7);
                    sb42.append(' ');
                    sb42.append((CharSequence) str, 7, 11);
                    return sb42.toString();
                } else if (str.startsWith("1869")) {
                    StringBuilder sb43 = new StringBuilder(14);
                    sb43.append("+1869 ");
                    sb43.append((CharSequence) str, 4, 7);
                    sb43.append(' ');
                    sb43.append((CharSequence) str, 7, 11);
                    return sb43.toString();
                } else if (str.startsWith("1876")) {
                    StringBuilder sb44 = new StringBuilder(14);
                    sb44.append("+1876 ");
                    sb44.append((CharSequence) str, 4, 7);
                    sb44.append(' ');
                    sb44.append((CharSequence) str, 7, 11);
                    return sb44.toString();
                } else if (str.startsWith("1939")) {
                    StringBuilder sb45 = new StringBuilder(14);
                    sb45.append("+1939 ");
                    sb45.append((CharSequence) str, 4, 7);
                    sb45.append(' ');
                    sb45.append((CharSequence) str, 7, 11);
                    return sb45.toString();
                } else if (str.startsWith("1829")) {
                    StringBuilder sb46 = new StringBuilder(14);
                    sb46.append("+1829 ");
                    sb46.append((CharSequence) str, 4, 7);
                    sb46.append(' ');
                    sb46.append((CharSequence) str, 7, 11);
                    return sb46.toString();
                } else if (str.startsWith("1868")) {
                    StringBuilder sb47 = new StringBuilder(14);
                    sb47.append("+1868 ");
                    sb47.append((CharSequence) str, 4, 7);
                    sb47.append(' ');
                    sb47.append((CharSequence) str, 7, 11);
                    return sb47.toString();
                } else if (str.startsWith("1809")) {
                    StringBuilder sb48 = new StringBuilder(14);
                    sb48.append("+1809 ");
                    sb48.append((CharSequence) str, 4, 7);
                    sb48.append(' ');
                    sb48.append((CharSequence) str, 7, 11);
                    return sb48.toString();
                } else if (str.startsWith("1758")) {
                    StringBuilder sb49 = new StringBuilder(14);
                    sb49.append("+1758 ");
                    sb49.append((CharSequence) str, 4, 7);
                    sb49.append(' ');
                    sb49.append((CharSequence) str, 7, 11);
                    return sb49.toString();
                } else if (str.startsWith("1767")) {
                    StringBuilder sb50 = new StringBuilder(14);
                    sb50.append("+1767 ");
                    sb50.append((CharSequence) str, 4, 7);
                    sb50.append(' ');
                    sb50.append((CharSequence) str, 7, 11);
                    return sb50.toString();
                } else if (str.startsWith("1784")) {
                    StringBuilder sb51 = new StringBuilder(14);
                    sb51.append("+1784 ");
                    sb51.append((CharSequence) str, 4, 7);
                    sb51.append(' ');
                    sb51.append((CharSequence) str, 7, 11);
                    return sb51.toString();
                } else if (str.startsWith("1787")) {
                    StringBuilder sb52 = new StringBuilder(14);
                    sb52.append("+1787 ");
                    sb52.append((CharSequence) str, 4, 7);
                    sb52.append(' ');
                    sb52.append((CharSequence) str, 7, 11);
                    return sb52.toString();
                } else if (str.startsWith("253")) {
                    StringBuilder sb53 = new StringBuilder(16);
                    sb53.append("+253 ");
                    sb53.append((CharSequence) str, 3, 5);
                    sb53.append(' ');
                    sb53.append((CharSequence) str, 5, 7);
                    sb53.append(' ');
                    sb53.append((CharSequence) str, 7, 9);
                    sb53.append(' ');
                    sb53.append((CharSequence) str, 9, 11);
                    return sb53.toString();
                } else if (str.startsWith("350")) {
                    StringBuilder sb54 = new StringBuilder(14);
                    sb54.append("+350 ");
                    sb54.append((CharSequence) str, 3, 7);
                    sb54.append(' ');
                    sb54.append((CharSequence) str, 7, 11);
                    return sb54.toString();
                } else if (str.startsWith("268")) {
                    StringBuilder sb55 = new StringBuilder(14);
                    sb55.append("+268 ");
                    sb55.append((CharSequence) str, 3, 7);
                    sb55.append(' ');
                    sb55.append((CharSequence) str, 7, 11);
                    return sb55.toString();
                } else if (str.startsWith("267")) {
                    StringBuilder sb56 = new StringBuilder(15);
                    sb56.append("+267 ");
                    sb56.append((CharSequence) str, 3, 5);
                    sb56.append(' ');
                    sb56.append((CharSequence) str, 5, 8);
                    sb56.append(' ');
                    sb56.append((CharSequence) str, 8, 11);
                    return sb56.toString();
                } else if (str.startsWith("266")) {
                    StringBuilder sb57 = new StringBuilder(15);
                    sb57.append("+266 ");
                    sb57.append((CharSequence) str, 3, 5);
                    sb57.append(' ');
                    sb57.append((CharSequence) str, 5, 8);
                    sb57.append(' ');
                    sb57.append((CharSequence) str, 8, 11);
                    return sb57.toString();
                } else if (str.startsWith("229")) {
                    StringBuilder sb58 = new StringBuilder(15);
                    sb58.append("+229 ");
                    sb58.append((CharSequence) str, 3, 5);
                    sb58.append(' ');
                    sb58.append((CharSequence) str, 5, 8);
                    sb58.append(' ');
                    sb58.append((CharSequence) str, 8, 11);
                    return sb58.toString();
                } else if (str.startsWith("223")) {
                    StringBuilder sb59 = new StringBuilder(16);
                    sb59.append("+223 ");
                    sb59.append((CharSequence) str, 3, 5);
                    sb59.append(' ');
                    sb59.append((CharSequence) str, 5, 7);
                    sb59.append(' ');
                    sb59.append((CharSequence) str, 7, 9);
                    sb59.append(' ');
                    sb59.append((CharSequence) str, 9, 11);
                    return sb59.toString();
                } else if (str.startsWith("222")) {
                    StringBuilder sb60 = new StringBuilder(14);
                    sb60.append("+222 ");
                    sb60.append((CharSequence) str, 3, 7);
                    sb60.append(' ');
                    sb60.append((CharSequence) str, 7, 11);
                    return sb60.toString();
                } else if (str.startsWith("225")) {
                    StringBuilder sb61 = new StringBuilder(16);
                    sb61.append("+225 ");
                    sb61.append((CharSequence) str, 3, 5);
                    sb61.append(' ');
                    sb61.append((CharSequence) str, 5, 7);
                    sb61.append(' ');
                    sb61.append((CharSequence) str, 7, 9);
                    sb61.append(' ');
                    sb61.append((CharSequence) str, 9, 11);
                    return sb61.toString();
                } else if (str.startsWith("227")) {
                    StringBuilder sb62 = new StringBuilder(16);
                    sb62.append("+227 ");
                    sb62.append((CharSequence) str, 3, 5);
                    sb62.append(' ');
                    sb62.append((CharSequence) str, 5, 7);
                    sb62.append(' ');
                    sb62.append((CharSequence) str, 7, 9);
                    sb62.append(' ');
                    sb62.append((CharSequence) str, 9, 11);
                    return sb62.toString();
                } else if (str.startsWith("226")) {
                    StringBuilder sb63 = new StringBuilder(16);
                    sb63.append("+226 ");
                    sb63.append((CharSequence) str, 3, 5);
                    sb63.append(' ');
                    sb63.append((CharSequence) str, 5, 7);
                    sb63.append(' ');
                    sb63.append((CharSequence) str, 7, 9);
                    sb63.append(' ');
                    sb63.append((CharSequence) str, 9, 11);
                    return sb63.toString();
                } else if (str.startsWith("216")) {
                    StringBuilder sb64 = new StringBuilder(15);
                    sb64.append("+216 ");
                    sb64.append((CharSequence) str, 3, 5);
                    sb64.append(' ');
                    sb64.append((CharSequence) str, 5, 8);
                    sb64.append(' ');
                    sb64.append((CharSequence) str, 8, 11);
                    return sb64.toString();
                } else if (str.startsWith("228")) {
                    StringBuilder sb65 = new StringBuilder(15);
                    sb65.append("+228 ");
                    sb65.append((CharSequence) str, 3, 5);
                    sb65.append(' ');
                    sb65.append((CharSequence) str, 5, 8);
                    sb65.append(' ');
                    sb65.append((CharSequence) str, 8, 11);
                    return sb65.toString();
                } else if (str.startsWith("232")) {
                    StringBuilder sb66 = new StringBuilder(15);
                    sb66.append("+232 ");
                    sb66.append((CharSequence) str, 3, 5);
                    sb66.append(' ');
                    sb66.append((CharSequence) str, 5, 8);
                    sb66.append(' ');
                    sb66.append((CharSequence) str, 8, 11);
                    return sb66.toString();
                } else if (str.startsWith("236")) {
                    StringBuilder sb67 = new StringBuilder(16);
                    sb67.append("+236 ");
                    sb67.append((CharSequence) str, 3, 5);
                    sb67.append(' ');
                    sb67.append((CharSequence) str, 5, 7);
                    sb67.append(' ');
                    sb67.append((CharSequence) str, 7, 9);
                    sb67.append(' ');
                    sb67.append((CharSequence) str, 9, 11);
                    return sb67.toString();
                } else if (str.startsWith("965")) {
                    StringBuilder sb68 = new StringBuilder(14);
                    sb68.append("+965 ");
                    sb68.append((CharSequence) str, 3, 7);
                    sb68.append(' ');
                    sb68.append((CharSequence) str, 7, 11);
                    return sb68.toString();
                } else if (str.startsWith("968")) {
                    StringBuilder sb69 = new StringBuilder(14);
                    sb69.append("+968 ");
                    sb69.append((CharSequence) str, 3, 7);
                    sb69.append(' ');
                    sb69.append((CharSequence) str, 7, 11);
                    return sb69.toString();
                } else if (str.startsWith("880")) {
                    StringBuilder sb70 = new StringBuilder(15);
                    sb70.append("+880 ");
                    sb70.append((CharSequence) str, 3, 5);
                    sb70.append(' ');
                    sb70.append((CharSequence) str, 5, 8);
                    sb70.append(' ');
                    sb70.append((CharSequence) str, 8, 11);
                    return sb70.toString();
                } else if (str.startsWith("599")) {
                    StringBuilder sb71 = new StringBuilder(15);
                    sb71.append("+599 ");
                    sb71.append(str.charAt(3));
                    sb71.append(' ');
                    sb71.append((CharSequence) str, 4, 7);
                    sb71.append(' ');
                    sb71.append((CharSequence) str, 7, 11);
                    return sb71.toString();
                } else if (str.startsWith("993")) {
                    StringBuilder sb72 = new StringBuilder(14);
                    sb72.append("+993 ");
                    sb72.append((CharSequence) str, 3, 5);
                    sb72.append(' ');
                    sb72.append((CharSequence) str, 5, 11);
                    return sb72.toString();
                } else if (str.startsWith("974")) {
                    StringBuilder sb73 = new StringBuilder(15);
                    sb73.append("+974 ");
                    sb73.append((CharSequence) str, 3, 5);
                    sb73.append(' ');
                    sb73.append((CharSequence) str, 5, 8);
                    sb73.append(' ');
                    sb73.append((CharSequence) str, 8, 11);
                    return sb73.toString();
                } else if (str.startsWith("973")) {
                    StringBuilder sb74 = new StringBuilder(14);
                    sb74.append("+973 ");
                    sb74.append((CharSequence) str, 3, 7);
                    sb74.append(' ');
                    sb74.append((CharSequence) str, 7, 11);
                    return sb74.toString();
                } else if (str.startsWith("975")) {
                    StringBuilder sb75 = new StringBuilder(15);
                    sb75.append("+975 ");
                    sb75.append((CharSequence) str, 3, 5);
                    sb75.append(' ');
                    sb75.append((CharSequence) str, 5, 8);
                    sb75.append(' ');
                    sb75.append((CharSequence) str, 8, 11);
                    return sb75.toString();
                } else if (str.startsWith("976")) {
                    StringBuilder sb76 = new StringBuilder(15);
                    sb76.append("+976 ");
                    sb76.append((CharSequence) str, 3, 5);
                    sb76.append(' ');
                    sb76.append((CharSequence) str, 5, 7);
                    sb76.append(' ');
                    sb76.append((CharSequence) str, 7, 11);
                    return sb76.toString();
                } else if (str.startsWith("356")) {
                    StringBuilder sb77 = new StringBuilder(16);
                    sb77.append("+356 ");
                    sb77.append((CharSequence) str, 3, 5);
                    sb77.append(' ');
                    sb77.append((CharSequence) str, 5, 7);
                    sb77.append(' ');
                    sb77.append((CharSequence) str, 7, 9);
                    sb77.append(' ');
                    sb77.append((CharSequence) str, 9, 11);
                    return sb77.toString();
                } else if (str.startsWith("855")) {
                    StringBuilder sb78 = new StringBuilder(15);
                    sb78.append("+855 ");
                    sb78.append((CharSequence) str, 3, 5);
                    sb78.append(' ');
                    sb78.append((CharSequence) str, 5, 8);
                    sb78.append(' ');
                    sb78.append((CharSequence) str, 8, 11);
                    return sb78.toString();
                } else if (str.startsWith("381")) {
                    StringBuilder sb79 = new StringBuilder(15);
                    sb79.append("+381 ");
                    sb79.append((CharSequence) str, 3, 5);
                    sb79.append(' ');
                    sb79.append((CharSequence) str, 5, 8);
                    sb79.append(' ');
                    sb79.append((CharSequence) str, 8, 11);
                    return sb79.toString();
                } else if (str.startsWith("503")) {
                    StringBuilder sb80 = new StringBuilder(14);
                    sb80.append("+503 ");
                    sb80.append((CharSequence) str, 3, 7);
                    sb80.append(' ');
                    sb80.append((CharSequence) str, 7, 11);
                    return sb80.toString();
                } else if (str.startsWith("502")) {
                    StringBuilder sb81 = new StringBuilder(14);
                    sb81.append("+502 ");
                    sb81.append((CharSequence) str, 3, 7);
                    sb81.append(' ');
                    sb81.append((CharSequence) str, 7, 11);
                    return sb81.toString();
                } else if (str.startsWith("377")) {
                    StringBuilder sb82 = new StringBuilder(14);
                    sb82.append("+377 ");
                    sb82.append((CharSequence) str, 3, 7);
                    sb82.append(' ');
                    sb82.append((CharSequence) str, 7, 11);
                    return sb82.toString();
                } else if (str.startsWith("357")) {
                    StringBuilder sb83 = new StringBuilder(14);
                    sb83.append("+357 ");
                    sb83.append((CharSequence) str, 3, 7);
                    sb83.append(' ');
                    sb83.append((CharSequence) str, 7, 11);
                    return sb83.toString();
                } else if (str.startsWith("853")) {
                    StringBuilder sb84 = new StringBuilder(14);
                    sb84.append("+853 ");
                    sb84.append((CharSequence) str, 3, 7);
                    sb84.append(' ');
                    sb84.append((CharSequence) str, 7, 11);
                    return sb84.toString();
                } else if (str.startsWith("370")) {
                    StringBuilder sb85 = new StringBuilder(14);
                    sb85.append("+370 ");
                    sb85.append((CharSequence) str, 3, 6);
                    sb85.append(' ');
                    sb85.append((CharSequence) str, 6, 11);
                    return sb85.toString();
                } else if (str.startsWith("371")) {
                    StringBuilder sb86 = new StringBuilder(14);
                    sb86.append("+371 ");
                    sb86.append((CharSequence) str, 3, 6);
                    sb86.append(' ');
                    sb86.append((CharSequence) str, 6, 11);
                    return sb86.toString();
                } else if (str.startsWith("373")) {
                    StringBuilder sb87 = new StringBuilder(14);
                    sb87.append("+373 ");
                    sb87.append((CharSequence) str, 3, 7);
                    sb87.append(' ');
                    sb87.append((CharSequence) str, 7, 11);
                    return sb87.toString();
                } else if (str.startsWith("504")) {
                    StringBuilder sb88 = new StringBuilder(14);
                    sb88.append("+504 ");
                    sb88.append((CharSequence) str, 3, 7);
                    sb88.append(' ');
                    sb88.append((CharSequence) str, 7, 11);
                    return sb88.toString();
                } else if (str.startsWith("598")) {
                    StringBuilder sb89 = new StringBuilder(15);
                    sb89.append("+598 ");
                    sb89.append(str.charAt(3));
                    sb89.append(' ');
                    sb89.append((CharSequence) str, 4, 7);
                    sb89.append(' ');
                    sb89.append((CharSequence) str, 7, 11);
                    return sb89.toString();
                } else if (str.startsWith("686")) {
                    StringBuilder sb90 = new StringBuilder(14);
                    sb90.append("+686 ");
                    sb90.append((CharSequence) str, 3, 7);
                    sb90.append(' ');
                    sb90.append((CharSequence) str, 7, 11);
                    return sb90.toString();
                } else if (str.startsWith("505")) {
                    StringBuilder sb91 = new StringBuilder(14);
                    sb91.append("+505 ");
                    sb91.append((CharSequence) str, 3, 7);
                    sb91.append(' ');
                    sb91.append((CharSequence) str, 7, 11);
                    return sb91.toString();
                } else if (str.startsWith("852")) {
                    StringBuilder sb92 = new StringBuilder(15);
                    sb92.append("+852 ");
                    sb92.append(str.charAt(3));
                    sb92.append(' ');
                    sb92.append((CharSequence) str, 4, 7);
                    sb92.append(' ');
                    sb92.append((CharSequence) str, 7, 11);
                    return sb92.toString();
                } else if (str.startsWith("675")) {
                    StringBuilder sb93 = new StringBuilder(15);
                    sb93.append("+675 ");
                    sb93.append((CharSequence) str, 3, 6);
                    sb93.append(' ');
                    sb93.append((CharSequence) str, 6, 8);
                    sb93.append(' ');
                    sb93.append((CharSequence) str, 8, 11);
                    return sb93.toString();
                } else if (str.startsWith("506")) {
                    StringBuilder sb94 = new StringBuilder(14);
                    sb94.append("+506 ");
                    sb94.append((CharSequence) str, 3, 7);
                    sb94.append(' ');
                    sb94.append((CharSequence) str, 7, 11);
                    return sb94.toString();
                } else if (str.startsWith("509")) {
                    StringBuilder sb95 = new StringBuilder(14);
                    sb95.append("+509 ");
                    sb95.append((CharSequence) str, 3, 7);
                    sb95.append(' ');
                    sb95.append((CharSequence) str, 7, 11);
                    return sb95.toString();
                } else if (str.startsWith("591")) {
                    StringBuilder sb96 = new StringBuilder(15);
                    sb96.append("+591 ");
                    sb96.append(str.charAt(3));
                    sb96.append(' ');
                    sb96.append((CharSequence) str, 4, 7);
                    sb96.append(' ');
                    sb96.append((CharSequence) str, 7, 11);
                    return sb96.toString();
                } else if (str.startsWith("507")) {
                    StringBuilder sb97 = new StringBuilder(14);
                    sb97.append("+507 ");
                    sb97.append((CharSequence) str, 3, 7);
                    sb97.append(' ');
                    sb97.append((CharSequence) str, 7, 11);
                    return sb97.toString();
                } else if (str.startsWith("43")) {
                    StringBuilder sb98 = new StringBuilder(14);
                    sb98.append("+43 ");
                    sb98.append((CharSequence) str, 2, 6);
                    sb98.append(' ');
                    sb98.append((CharSequence) str, 6, 11);
                    return sb98.toString();
                } else if (str.startsWith("46")) {
                    StringBuilder sb99 = new StringBuilder(15);
                    sb99.append("+46 ");
                    sb99.append((CharSequence) str, 2, 4);
                    sb99.append(' ');
                    sb99.append((CharSequence) str, 4, 7);
                    sb99.append(' ');
                    sb99.append((CharSequence) str, 7, 11);
                    return sb99.toString();
                } else if (str.startsWith("41")) {
                    StringBuilder sb100 = new StringBuilder(15);
                    sb100.append("+41 ");
                    sb100.append((CharSequence) str, 2, 4);
                    sb100.append(' ');
                    sb100.append((CharSequence) str, 4, 7);
                    sb100.append(' ');
                    sb100.append((CharSequence) str, 7, 11);
                    return sb100.toString();
                } else if (str.startsWith("51")) {
                    StringBuilder sb101 = new StringBuilder(15);
                    sb101.append("+51 ");
                    sb101.append((CharSequence) str, 2, 5);
                    sb101.append(' ');
                    sb101.append((CharSequence) str, 5, 8);
                    sb101.append(' ');
                    sb101.append((CharSequence) str, 8, 11);
                    return sb101.toString();
                } else if (str.startsWith("48")) {
                    StringBuilder sb102 = new StringBuilder(16);
                    sb102.append("+48 ");
                    sb102.append((CharSequence) str, 2, 5);
                    sb102.append(' ');
                    sb102.append((CharSequence) str, 5, 7);
                    sb102.append(' ');
                    sb102.append((CharSequence) str, 7, 9);
                    sb102.append(' ');
                    sb102.append((CharSequence) str, 9, 11);
                    return sb102.toString();
                } else if (str.startsWith("32")) {
                    StringBuilder sb103 = new StringBuilder(16);
                    sb103.append("+32 ");
                    sb103.append((CharSequence) str, 2, 5);
                    sb103.append(' ');
                    sb103.append((CharSequence) str, 5, 7);
                    sb103.append(' ');
                    sb103.append((CharSequence) str, 7, 9);
                    sb103.append(' ');
                    sb103.append((CharSequence) str, 9, 11);
                    return sb103.toString();
                } else if (str.startsWith("56")) {
                    StringBuilder sb104 = new StringBuilder(15);
                    sb104.append("+56 ");
                    sb104.append(str.charAt(2));
                    sb104.append(' ');
                    sb104.append((CharSequence) str, 3, 7);
                    sb104.append(' ');
                    sb104.append((CharSequence) str, 7, 11);
                    return sb104.toString();
                } else if (str.startsWith("31")) {
                    StringBuilder sb105 = new StringBuilder(17);
                    sb105.append("+31 ");
                    sb105.append(str.charAt(2));
                    sb105.append(' ');
                    sb105.append((CharSequence) str, 3, 5);
                    sb105.append(' ');
                    sb105.append((CharSequence) str, 5, 7);
                    sb105.append(' ');
                    sb105.append((CharSequence) str, 7, 9);
                    sb105.append(' ');
                    sb105.append((CharSequence) str, 9, 11);
                    return sb105.toString();
                } else if (str.startsWith("33")) {
                    StringBuilder sb106 = new StringBuilder(17);
                    sb106.append("+33 ");
                    sb106.append(str.charAt(2));
                    sb106.append(' ');
                    sb106.append((CharSequence) str, 3, 5);
                    sb106.append(' ');
                    sb106.append((CharSequence) str, 5, 7);
                    sb106.append(' ');
                    sb106.append((CharSequence) str, 7, 9);
                    sb106.append(' ');
                    sb106.append((CharSequence) str, 9, 11);
                    return sb106.toString();
                } else if (str.startsWith("39")) {
                    StringBuilder sb107 = new StringBuilder(15);
                    sb107.append("+39 ");
                    sb107.append((CharSequence) str, 2, 5);
                    sb107.append(' ');
                    sb107.append((CharSequence) str, 5, 8);
                    sb107.append(' ');
                    sb107.append((CharSequence) str, 8, 11);
                    return sb107.toString();
                } else if (str.startsWith("36")) {
                    StringBuilder sb108 = new StringBuilder(15);
                    sb108.append("+36 ");
                    sb108.append((CharSequence) str, 2, 4);
                    sb108.append(' ');
                    sb108.append((CharSequence) str, 4, 7);
                    sb108.append(' ');
                    sb108.append((CharSequence) str, 7, 11);
                    return sb108.toString();
                } else if (str.startsWith("34")) {
                    StringBuilder sb109 = new StringBuilder(15);
                    sb109.append("+34 ");
                    sb109.append((CharSequence) str, 2, 5);
                    sb109.append(' ');
                    sb109.append((CharSequence) str, 5, 8);
                    sb109.append(' ');
                    sb109.append((CharSequence) str, 8, 11);
                    return sb109.toString();
                } else if (str.startsWith("40")) {
                    StringBuilder sb110 = new StringBuilder(15);
                    sb110.append("+40 ");
                    sb110.append((CharSequence) str, 2, 5);
                    sb110.append(' ');
                    sb110.append((CharSequence) str, 5, 8);
                    sb110.append(' ');
                    sb110.append((CharSequence) str, 8, 11);
                    return sb110.toString();
                } else if (str.startsWith("84")) {
                    StringBuilder sb111 = new StringBuilder(15);
                    sb111.append("+84 ");
                    sb111.append((CharSequence) str, 2, 4);
                    sb111.append(' ');
                    sb111.append((CharSequence) str, 4, 7);
                    sb111.append(' ');
                    sb111.append((CharSequence) str, 7, 11);
                    return sb111.toString();
                } else if (str.startsWith("82")) {
                    StringBuilder sb112 = new StringBuilder(15);
                    sb112.append("+82 ");
                    sb112.append((CharSequence) str, 2, 4);
                    sb112.append(' ');
                    sb112.append((CharSequence) str, 4, 8);
                    sb112.append(' ');
                    sb112.append((CharSequence) str, 8, 11);
                    return sb112.toString();
                } else if (str.startsWith("93")) {
                    StringBuilder sb113 = new StringBuilder(15);
                    sb113.append("+93 ");
                    sb113.append((CharSequence) str, 2, 5);
                    sb113.append(' ');
                    sb113.append((CharSequence) str, 5, 8);
                    sb113.append(' ');
                    sb113.append((CharSequence) str, 8, 11);
                    return sb113.toString();
                } else if (str.startsWith("94")) {
                    StringBuilder sb114 = new StringBuilder(15);
                    sb114.append("+94 ");
                    sb114.append((CharSequence) str, 2, 4);
                    sb114.append(' ');
                    sb114.append((CharSequence) str, 4, 7);
                    sb114.append(' ');
                    sb114.append((CharSequence) str, 7, 11);
                    return sb114.toString();
                } else if (str.startsWith("61")) {
                    StringBuilder sb115 = new StringBuilder(15);
                    sb115.append("+61 ");
                    sb115.append(str.charAt(2));
                    sb115.append(' ');
                    sb115.append((CharSequence) str, 3, 7);
                    sb115.append(' ');
                    sb115.append((CharSequence) str, 7, 11);
                    return sb115.toString();
                } else if (str.startsWith("62")) {
                    StringBuilder sb116 = new StringBuilder(14);
                    sb116.append("+62 ");
                    sb116.append((CharSequence) str, 2, 5);
                    sb116.append(' ');
                    sb116.append((CharSequence) str, 5, 11);
                    return sb116.toString();
                } else if (str.startsWith("66")) {
                    StringBuilder sb117 = new StringBuilder(15);
                    sb117.append("+66 ");
                    sb117.append(str.charAt(2));
                    sb117.append(' ');
                    sb117.append((CharSequence) str, 3, 7);
                    sb117.append(' ');
                    sb117.append((CharSequence) str, 7, 11);
                    return sb117.toString();
                } else if (str.startsWith("1")) {
                    StringBuilder sb118 = new StringBuilder(17);
                    sb118.append("+1 (");
                    sb118.append((CharSequence) str, 1, 4);
                    sb118.append(") ");
                    sb118.append((CharSequence) str, 4, 7);
                    sb118.append('-');
                    sb118.append((CharSequence) str, 7, 11);
                    return sb118.toString();
                } else if (!str.startsWith("7")) {
                    return null;
                } else {
                    StringBuilder sb119 = new StringBuilder(18);
                    sb119.append("+7 (");
                    sb119.append((CharSequence) str, 1, 4);
                    sb119.append(") ");
                    sb119.append((CharSequence) str, 4, 7);
                    sb119.append('-');
                    sb119.append((CharSequence) str, 7, 9);
                    sb119.append('-');
                    sb119.append((CharSequence) str, 9, 11);
                    return sb119.toString();
                }
            case 12:
                if (str.startsWith("260")) {
                    StringBuilder sb120 = new StringBuilder(16);
                    sb120.append("+260 ");
                    sb120.append((CharSequence) str, 3, 5);
                    sb120.append(' ');
                    sb120.append((CharSequence) str, 5, 8);
                    sb120.append(' ');
                    sb120.append((CharSequence) str, 8, 12);
                    return sb120.toString();
                } else if (str.startsWith("258")) {
                    StringBuilder sb121 = new StringBuilder(16);
                    sb121.append("+258 ");
                    sb121.append((CharSequence) str, 3, 5);
                    sb121.append(' ');
                    sb121.append((CharSequence) str, 5, 8);
                    sb121.append(' ');
                    sb121.append((CharSequence) str, 8, 12);
                    return sb121.toString();
                } else if (str.startsWith("261")) {
                    StringBuilder sb122 = new StringBuilder(17);
                    sb122.append("+261 ");
                    sb122.append((CharSequence) str, 3, 5);
                    sb122.append(' ');
                    sb122.append((CharSequence) str, 5, 7);
                    sb122.append(' ');
                    sb122.append((CharSequence) str, 7, 10);
                    sb122.append(' ');
                    sb122.append((CharSequence) str, 10, 12);
                    return sb122.toString();
                } else if (str.startsWith("264")) {
                    StringBuilder sb123 = new StringBuilder(16);
                    sb123.append("+264 ");
                    sb123.append((CharSequence) str, 3, 5);
                    sb123.append(' ');
                    sb123.append((CharSequence) str, 5, 8);
                    sb123.append(' ');
                    sb123.append((CharSequence) str, 8, 12);
                    return sb123.toString();
                } else if (str.startsWith("263")) {
                    StringBuilder sb124 = new StringBuilder(16);
                    sb124.append("+263 ");
                    sb124.append((CharSequence) str, 3, 5);
                    sb124.append(' ');
                    sb124.append((CharSequence) str, 5, 8);
                    sb124.append(' ');
                    sb124.append((CharSequence) str, 8, 12);
                    return sb124.toString();
                } else if (str.startsWith("262")) {
                    StringBuilder sb125 = new StringBuilder(16);
                    sb125.append("+262 ");
                    sb125.append((CharSequence) str, 3, 6);
                    sb125.append(' ');
                    sb125.append((CharSequence) str, 6, 9);
                    sb125.append(' ');
                    sb125.append((CharSequence) str, 9, 12);
                    return sb125.toString();
                } else if (str.startsWith("249")) {
                    StringBuilder sb126 = new StringBuilder(16);
                    sb126.append("+249 ");
                    sb126.append((CharSequence) str, 3, 5);
                    sb126.append(' ');
                    sb126.append((CharSequence) str, 5, 8);
                    sb126.append(' ');
                    sb126.append((CharSequence) str, 8, 12);
                    return sb126.toString();
                } else if (str.startsWith("250")) {
                    StringBuilder sb127 = new StringBuilder(16);
                    sb127.append("+250 ");
                    sb127.append((CharSequence) str, 3, 6);
                    sb127.append(' ');
                    sb127.append((CharSequence) str, 6, 9);
                    sb127.append(' ');
                    sb127.append((CharSequence) str, 9, 12);
                    return sb127.toString();
                } else if (str.startsWith("265")) {
                    StringBuilder sb128 = new StringBuilder(16);
                    sb128.append("+265 ");
                    sb128.append((CharSequence) str, 3, 5);
                    sb128.append(' ');
                    sb128.append((CharSequence) str, 5, 8);
                    sb128.append(' ');
                    sb128.append((CharSequence) str, 8, 12);
                    return sb128.toString();
                } else if (str.startsWith("251")) {
                    StringBuilder sb129 = new StringBuilder(16);
                    sb129.append("+251 ");
                    sb129.append((CharSequence) str, 3, 5);
                    sb129.append(' ');
                    sb129.append((CharSequence) str, 5, 8);
                    sb129.append(' ');
                    sb129.append((CharSequence) str, 8, 12);
                    return sb129.toString();
                } else if (str.startsWith("255")) {
                    StringBuilder sb130 = new StringBuilder(16);
                    sb130.append("+255 ");
                    sb130.append((CharSequence) str, 3, 5);
                    sb130.append(' ');
                    sb130.append((CharSequence) str, 5, 8);
                    sb130.append(' ');
                    sb130.append((CharSequence) str, 8, 12);
                    return sb130.toString();
                } else if (str.startsWith("254")) {
                    StringBuilder sb131 = new StringBuilder(16);
                    sb131.append("+254 ");
                    sb131.append((CharSequence) str, 3, 6);
                    sb131.append(' ');
                    sb131.append((CharSequence) str, 6, 9);
                    sb131.append(' ');
                    sb131.append((CharSequence) str, 9, 12);
                    return sb131.toString();
                } else if (str.startsWith("256")) {
                    StringBuilder sb132 = new StringBuilder(16);
                    sb132.append("+256 ");
                    sb132.append((CharSequence) str, 3, 5);
                    sb132.append(' ');
                    sb132.append((CharSequence) str, 5, 8);
                    sb132.append(' ');
                    sb132.append((CharSequence) str, 8, 12);
                    return sb132.toString();
                } else if (str.startsWith("351")) {
                    StringBuilder sb133 = new StringBuilder(16);
                    sb133.append("+351 ");
                    sb133.append(str.charAt(3));
                    sb133.append(' ');
                    sb133.append((CharSequence) str, 4, 8);
                    sb133.append(' ');
                    sb133.append((CharSequence) str, 8, 12);
                    return sb133.toString();
                } else if (str.startsWith("352")) {
                    StringBuilder sb134 = new StringBuilder(16);
                    sb134.append("+352 ");
                    sb134.append((CharSequence) str, 3, 6);
                    sb134.append(' ');
                    sb134.append((CharSequence) str, 6, 9);
                    sb134.append(' ');
                    sb134.append((CharSequence) str, 9, 12);
                    return sb134.toString();
                } else if (str.startsWith("224")) {
                    StringBuilder sb135 = new StringBuilder(16);
                    sb135.append("+224 ");
                    sb135.append((CharSequence) str, 3, 6);
                    sb135.append(' ');
                    sb135.append((CharSequence) str, 6, 9);
                    sb135.append(' ');
                    sb135.append((CharSequence) str, 9, 12);
                    return sb135.toString();
                } else if (str.startsWith("221")) {
                    StringBuilder sb136 = new StringBuilder(16);
                    sb136.append("+221 ");
                    sb136.append((CharSequence) str, 3, 5);
                    sb136.append(' ');
                    sb136.append((CharSequence) str, 5, 8);
                    sb136.append(' ');
                    sb136.append((CharSequence) str, 8, 12);
                    return sb136.toString();
                } else if (str.startsWith("212")) {
                    StringBuilder sb137 = new StringBuilder(16);
                    sb137.append("+212 ");
                    sb137.append((CharSequence) str, 3, 5);
                    sb137.append(' ');
                    sb137.append((CharSequence) str, 5, 8);
                    sb137.append(' ');
                    sb137.append((CharSequence) str, 8, 12);
                    return sb137.toString();
                } else if (str.startsWith("211")) {
                    StringBuilder sb138 = new StringBuilder(16);
                    sb138.append("+211 ");
                    sb138.append((CharSequence) str, 3, 5);
                    sb138.append(' ');
                    sb138.append((CharSequence) str, 5, 8);
                    sb138.append(' ');
                    sb138.append((CharSequence) str, 8, 12);
                    return sb138.toString();
                } else if (str.startsWith("213")) {
                    StringBuilder sb139 = new StringBuilder(17);
                    sb139.append("+213 ");
                    sb139.append((CharSequence) str, 3, 6);
                    sb139.append(' ');
                    sb139.append((CharSequence) str, 6, 8);
                    sb139.append(' ');
                    sb139.append((CharSequence) str, 8, 10);
                    sb139.append(' ');
                    sb139.append((CharSequence) str, 10, 12);
                    return sb139.toString();
                } else if (str.startsWith("218")) {
                    StringBuilder sb140 = new StringBuilder(16);
                    sb140.append("+218 ");
                    sb140.append((CharSequence) str, 3, 5);
                    sb140.append(' ');
                    sb140.append((CharSequence) str, 5, 8);
                    sb140.append(' ');
                    sb140.append((CharSequence) str, 8, 12);
                    return sb140.toString();
                } else if (str.startsWith("355")) {
                    StringBuilder sb141 = new StringBuilder(16);
                    sb141.append("+355 ");
                    sb141.append((CharSequence) str, 3, 6);
                    sb141.append(' ');
                    sb141.append((CharSequence) str, 6, 9);
                    sb141.append(' ');
                    sb141.append((CharSequence) str, 9, 12);
                    return sb141.toString();
                } else if (str.startsWith("240")) {
                    StringBuilder sb142 = new StringBuilder(16);
                    sb142.append("+240 ");
                    sb142.append((CharSequence) str, 3, 6);
                    sb142.append(' ');
                    sb142.append((CharSequence) str, 6, 9);
                    sb142.append(' ');
                    sb142.append((CharSequence) str, 9, 12);
                    return sb142.toString();
                } else if (str.startsWith("243")) {
                    StringBuilder sb143 = new StringBuilder(16);
                    sb143.append("+243 ");
                    sb143.append((CharSequence) str, 3, 5);
                    sb143.append(' ');
                    sb143.append((CharSequence) str, 5, 8);
                    sb143.append(' ');
                    sb143.append((CharSequence) str, 8, 12);
                    return sb143.toString();
                } else if (str.startsWith("244")) {
                    StringBuilder sb144 = new StringBuilder(16);
                    sb144.append("+244 ");
                    sb144.append((CharSequence) str, 3, 6);
                    sb144.append(' ');
                    sb144.append((CharSequence) str, 6, 9);
                    sb144.append(' ');
                    sb144.append((CharSequence) str, 9, 12);
                    return sb144.toString();
                } else if (str.startsWith("233")) {
                    StringBuilder sb145 = new StringBuilder(16);
                    sb145.append("+233 ");
                    sb145.append((CharSequence) str, 3, 5);
                    sb145.append(' ');
                    sb145.append((CharSequence) str, 5, 8);
                    sb145.append(' ');
                    sb145.append((CharSequence) str, 8, 12);
                    return sb145.toString();
                } else if (str.startsWith("237")) {
                    StringBuilder sb146 = new StringBuilder(18);
                    sb146.append("+237 ");
                    sb146.append(str.charAt(3));
                    sb146.append(' ');
                    sb146.append((CharSequence) str, 4, 6);
                    sb146.append(' ');
                    sb146.append((CharSequence) str, 6, 8);
                    sb146.append(' ');
                    sb146.append((CharSequence) str, 8, 10);
                    sb146.append(' ');
                    sb146.append((CharSequence) str, 10, 12);
                    return sb146.toString();
                } else if (str.startsWith("966")) {
                    StringBuilder sb147 = new StringBuilder(16);
                    sb147.append("+966 ");
                    sb147.append((CharSequence) str, 3, 5);
                    sb147.append(' ');
                    sb147.append((CharSequence) str, 5, 8);
                    sb147.append(' ');
                    sb147.append((CharSequence) str, 8, 12);
                    return sb147.toString();
                } else if (str.startsWith("967")) {
                    StringBuilder sb148 = new StringBuilder(16);
                    sb148.append("+967 ");
                    sb148.append((CharSequence) str, 3, 6);
                    sb148.append(' ');
                    sb148.append((CharSequence) str, 6, 9);
                    sb148.append(' ');
                    sb148.append((CharSequence) str, 9, 12);
                    return sb148.toString();
                } else if (str.startsWith("970")) {
                    StringBuilder sb149 = new StringBuilder(16);
                    sb149.append("+970 ");
                    sb149.append((CharSequence) str, 3, 6);
                    sb149.append(' ');
                    sb149.append((CharSequence) str, 6, 8);
                    sb149.append(' ');
                    sb149.append((CharSequence) str, 8, 12);
                    return sb149.toString();
                } else if (str.startsWith("963")) {
                    StringBuilder sb150 = new StringBuilder(16);
                    sb150.append("+963 ");
                    sb150.append((CharSequence) str, 3, 6);
                    sb150.append(' ');
                    sb150.append((CharSequence) str, 6, 9);
                    sb150.append(' ');
                    sb150.append((CharSequence) str, 9, 12);
                    return sb150.toString();
                } else if (str.startsWith("962")) {
                    StringBuilder sb151 = new StringBuilder(16);
                    sb151.append("+962 ");
                    sb151.append(str.charAt(3));
                    sb151.append(' ');
                    sb151.append((CharSequence) str, 4, 8);
                    sb151.append(' ');
                    sb151.append((CharSequence) str, 8, 12);
                    return sb151.toString();
                } else if (str.startsWith("886")) {
                    StringBuilder sb152 = new StringBuilder(16);
                    sb152.append("+886 ");
                    sb152.append((CharSequence) str, 3, 6);
                    sb152.append(' ');
                    sb152.append((CharSequence) str, 6, 9);
                    sb152.append(' ');
                    sb152.append((CharSequence) str, 9, 12);
                    return sb152.toString();
                } else if (str.startsWith("971")) {
                    StringBuilder sb153 = new StringBuilder(16);
                    sb153.append("+971 ");
                    sb153.append((CharSequence) str, 3, 5);
                    sb153.append(' ');
                    sb153.append((CharSequence) str, 5, 8);
                    sb153.append(' ');
                    sb153.append((CharSequence) str, 8, 12);
                    return sb153.toString();
                } else if (str.startsWith("972")) {
                    StringBuilder sb154 = new StringBuilder(16);
                    sb154.append("+972 ");
                    sb154.append((CharSequence) str, 3, 5);
                    sb154.append(' ');
                    sb154.append((CharSequence) str, 5, 8);
                    sb154.append(' ');
                    sb154.append((CharSequence) str, 8, 12);
                    return sb154.toString();
                } else if (str.startsWith("995")) {
                    StringBuilder sb155 = new StringBuilder(16);
                    sb155.append("+995 ");
                    sb155.append((CharSequence) str, 3, 6);
                    sb155.append(' ');
                    sb155.append((CharSequence) str, 6, 9);
                    sb155.append(' ');
                    sb155.append((CharSequence) str, 9, 12);
                    return sb155.toString();
                } else if (str.startsWith("994")) {
                    StringBuilder sb156 = new StringBuilder(16);
                    sb156.append("+994 ");
                    sb156.append((CharSequence) str, 3, 5);
                    sb156.append(' ');
                    sb156.append((CharSequence) str, 5, 8);
                    sb156.append(' ');
                    sb156.append((CharSequence) str, 8, 12);
                    return sb156.toString();
                } else if (str.startsWith("996")) {
                    StringBuilder sb157 = new StringBuilder(15);
                    sb157.append("+996 ");
                    sb157.append((CharSequence) str, 3, 6);
                    sb157.append(' ');
                    sb157.append((CharSequence) str, 6, 12);
                    return sb157.toString();
                } else if (str.startsWith("998")) {
                    StringBuilder sb158 = new StringBuilder(15);
                    sb158.append("+998 ");
                    sb158.append((CharSequence) str, 3, 5);
                    sb158.append(' ');
                    sb158.append((CharSequence) str, 5, 12);
                    return sb158.toString();
                } else if (str.startsWith("992")) {
                    StringBuilder sb159 = new StringBuilder(16);
                    sb159.append("+992 ");
                    sb159.append((CharSequence) str, 3, 5);
                    sb159.append(' ');
                    sb159.append((CharSequence) str, 5, 8);
                    sb159.append(' ');
                    sb159.append((CharSequence) str, 8, 12);
                    return sb159.toString();
                } else if (str.startsWith("387")) {
                    StringBuilder sb160 = new StringBuilder(16);
                    sb160.append("+387 ");
                    sb160.append((CharSequence) str, 3, 5);
                    sb160.append(' ');
                    sb160.append((CharSequence) str, 5, 8);
                    sb160.append(' ');
                    sb160.append((CharSequence) str, 8, 12);
                    return sb160.toString();
                } else if (str.startsWith("420")) {
                    StringBuilder sb161 = new StringBuilder(16);
                    sb161.append("+420 ");
                    sb161.append((CharSequence) str, 3, 6);
                    sb161.append(' ');
                    sb161.append((CharSequence) str, 6, 9);
                    sb161.append(' ');
                    sb161.append((CharSequence) str, 9, 12);
                    return sb161.toString();
                } else if (str.startsWith("421")) {
                    StringBuilder sb162 = new StringBuilder(16);
                    sb162.append("+421 ");
                    sb162.append((CharSequence) str, 3, 6);
                    sb162.append(' ');
                    sb162.append((CharSequence) str, 6, 9);
                    sb162.append(' ');
                    sb162.append((CharSequence) str, 9, 12);
                    return sb162.toString();
                } else if (str.startsWith("380")) {
                    StringBuilder sb163 = new StringBuilder(17);
                    sb163.append("+380 ");
                    sb163.append((CharSequence) str, 3, 5);
                    sb163.append(' ');
                    sb163.append((CharSequence) str, 5, 8);
                    sb163.append(' ');
                    sb163.append((CharSequence) str, 8, 10);
                    sb163.append(' ');
                    sb163.append((CharSequence) str, 10, 12);
                    return sb163.toString();
                } else if (str.startsWith("593")) {
                    StringBuilder sb164 = new StringBuilder(16);
                    sb164.append("+593 ");
                    sb164.append((CharSequence) str, 3, 5);
                    sb164.append(' ');
                    sb164.append((CharSequence) str, 5, 8);
                    sb164.append(' ');
                    sb164.append((CharSequence) str, 8, 12);
                    return sb164.toString();
                } else if (str.startsWith("595")) {
                    StringBuilder sb165 = new StringBuilder(16);
                    sb165.append("+595 ");
                    sb165.append((CharSequence) str, 3, 6);
                    sb165.append(' ');
                    sb165.append((CharSequence) str, 6, 9);
                    sb165.append(' ');
                    sb165.append((CharSequence) str, 9, 12);
                    return sb165.toString();
                } else if (str.startsWith("44")) {
                    StringBuilder sb166 = new StringBuilder(15);
                    sb166.append("+44 ");
                    sb166.append((CharSequence) str, 2, 6);
                    sb166.append(' ');
                    sb166.append((CharSequence) str, 6, 12);
                    return sb166.toString();
                } else if (str.startsWith("55")) {
                    StringBuilder sb167 = new StringBuilder(15);
                    sb167.append("+55 ");
                    sb167.append((CharSequence) str, 2, 4);
                    sb167.append(' ');
                    sb167.append((CharSequence) str, 4, 12);
                    return sb167.toString();
                } else if (str.startsWith("30")) {
                    StringBuilder sb168 = new StringBuilder(16);
                    sb168.append("+30 ");
                    sb168.append((CharSequence) str, 2, 5);
                    sb168.append(' ');
                    sb168.append((CharSequence) str, 5, 8);
                    sb168.append(' ');
                    sb168.append((CharSequence) str, 8, 12);
                    return sb168.toString();
                } else if (str.startsWith("20")) {
                    StringBuilder sb169 = new StringBuilder(16);
                    sb169.append("+20 ");
                    sb169.append((CharSequence) str, 2, 4);
                    sb169.append(' ');
                    sb169.append((CharSequence) str, 4, 8);
                    sb169.append(' ');
                    sb169.append((CharSequence) str, 8, 12);
                    return sb169.toString();
                } else if (str.startsWith("90")) {
                    StringBuilder sb170 = new StringBuilder(16);
                    sb170.append("+90 ");
                    sb170.append((CharSequence) str, 2, 5);
                    sb170.append(' ');
                    sb170.append((CharSequence) str, 5, 8);
                    sb170.append(' ');
                    sb170.append((CharSequence) str, 8, 12);
                    return sb170.toString();
                } else if (str.startsWith("91")) {
                    StringBuilder sb171 = new StringBuilder(15);
                    sb171.append("+91 ");
                    sb171.append((CharSequence) str, 2, 7);
                    sb171.append(' ');
                    sb171.append((CharSequence) str, 7, 12);
                    return sb171.toString();
                } else if (str.startsWith("92")) {
                    StringBuilder sb172 = new StringBuilder(16);
                    sb172.append("+92 ");
                    sb172.append((CharSequence) str, 2, 5);
                    sb172.append(' ');
                    sb172.append((CharSequence) str, 5, 8);
                    sb172.append(' ');
                    sb172.append((CharSequence) str, 8, 12);
                    return sb172.toString();
                } else if (str.startsWith("98")) {
                    StringBuilder sb173 = new StringBuilder(16);
                    sb173.append("+98 ");
                    sb173.append((CharSequence) str, 2, 5);
                    sb173.append(' ');
                    sb173.append((CharSequence) str, 5, 8);
                    sb173.append(' ');
                    sb173.append((CharSequence) str, 8, 12);
                    return sb173.toString();
                } else if (str.startsWith("57")) {
                    StringBuilder sb174 = new StringBuilder(16);
                    sb174.append("+57 ");
                    sb174.append((CharSequence) str, 2, 5);
                    sb174.append(' ');
                    sb174.append((CharSequence) str, 5, 8);
                    sb174.append(' ');
                    sb174.append((CharSequence) str, 8, 12);
                    return sb174.toString();
                } else if (str.startsWith("81")) {
                    StringBuilder sb175 = new StringBuilder(16);
                    sb175.append("+81 ");
                    sb175.append((CharSequence) str, 2, 4);
                    sb175.append(' ');
                    sb175.append((CharSequence) str, 4, 8);
                    sb175.append(' ');
                    sb175.append((CharSequence) str, 8, 12);
                    return sb175.toString();
                } else if (str.startsWith("60")) {
                    StringBuilder sb176 = new StringBuilder(16);
                    sb176.append("+60 ");
                    sb176.append((CharSequence) str, 2, 4);
                    sb176.append(' ');
                    sb176.append((CharSequence) str, 4, 8);
                    sb176.append(' ');
                    sb176.append((CharSequence) str, 8, 12);
                    return sb176.toString();
                } else if (str.startsWith("58")) {
                    StringBuilder sb177 = new StringBuilder(16);
                    sb177.append("+58 ");
                    sb177.append((CharSequence) str, 2, 5);
                    sb177.append(' ');
                    sb177.append((CharSequence) str, 5, 8);
                    sb177.append(' ');
                    sb177.append((CharSequence) str, 8, 12);
                    return sb177.toString();
                } else if (!str.startsWith("63")) {
                    return null;
                } else {
                    StringBuilder sb178 = new StringBuilder(16);
                    sb178.append("+63 ");
                    sb178.append((CharSequence) str, 2, 5);
                    sb178.append(' ');
                    sb178.append((CharSequence) str, 5, 8);
                    sb178.append(' ');
                    sb178.append((CharSequence) str, 8, 12);
                    return sb178.toString();
                }
            case 13:
                if (str.startsWith("234")) {
                    StringBuilder sb179 = new StringBuilder(17);
                    sb179.append("+234 ");
                    sb179.append((CharSequence) str, 3, 5);
                    sb179.append(' ');
                    sb179.append((CharSequence) str, 5, 9);
                    sb179.append(' ');
                    sb179.append((CharSequence) str, 9, 13);
                    return sb179.toString();
                } else if (str.startsWith("964")) {
                    StringBuilder sb180 = new StringBuilder(17);
                    sb180.append("+964 ");
                    sb180.append((CharSequence) str, 3, 6);
                    sb180.append(' ');
                    sb180.append((CharSequence) str, 6, 9);
                    sb180.append(' ');
                    sb180.append((CharSequence) str, 9, 13);
                    return sb180.toString();
                } else if (str.startsWith("856")) {
                    StringBuilder sb181 = new StringBuilder(18);
                    sb181.append("+856 ");
                    sb181.append((CharSequence) str, 3, 5);
                    sb181.append(' ');
                    sb181.append((CharSequence) str, 5, 7);
                    sb181.append(' ');
                    sb181.append((CharSequence) str, 7, 10);
                    sb181.append(' ');
                    sb181.append((CharSequence) str, 10, 13);
                    return sb181.toString();
                } else if (str.startsWith("977")) {
                    StringBuilder sb182 = new StringBuilder(17);
                    sb182.append("+977 ");
                    sb182.append((CharSequence) str, 3, 5);
                    sb182.append(' ');
                    sb182.append((CharSequence) str, 5, 9);
                    sb182.append(' ');
                    sb182.append((CharSequence) str, 9, 13);
                    return sb182.toString();
                } else if (str.startsWith("49")) {
                    StringBuilder sb183 = new StringBuilder(18);
                    sb183.append("+49 ");
                    sb183.append((CharSequence) str, 2, 4);
                    sb183.append(' ');
                    sb183.append((CharSequence) str, 4, 7);
                    sb183.append(' ');
                    sb183.append((CharSequence) str, 7, 10);
                    sb183.append(' ');
                    sb183.append((CharSequence) str, 10, 13);
                    return sb183.toString();
                } else if (!str.startsWith("86")) {
                    return null;
                } else {
                    StringBuilder sb184 = new StringBuilder(17);
                    sb184.append("+86 ");
                    sb184.append((CharSequence) str, 2, 5);
                    sb184.append(' ');
                    sb184.append((CharSequence) str, 5, 9);
                    sb184.append(' ');
                    sb184.append((CharSequence) str, 9, 13);
                    return sb184.toString();
                }
            default:
                return null;
        }
    }

    public static int c(String str) {
        if (str.startsWith("1649") || str.startsWith("1473") || str.startsWith("1664") || str.startsWith("1670") || str.startsWith("1671") || str.startsWith("1441") || str.startsWith("1345") || str.startsWith("1264") || str.startsWith("1242") || str.startsWith("1268") || str.startsWith("1284") || str.startsWith("1340") || str.startsWith("1684") || str.startsWith("1246") || str.startsWith("1721") || str.startsWith("1849") || str.startsWith("1869") || str.startsWith("1876") || str.startsWith("1939") || str.startsWith("1829") || str.startsWith("1868") || str.startsWith("1809") || str.startsWith("1758") || str.startsWith("1767") || str.startsWith("1784") || str.startsWith("1787") || str.startsWith("253") || str.startsWith("350") || str.startsWith("268") || str.startsWith("267") || str.startsWith("266") || str.startsWith("229") || str.startsWith("223") || str.startsWith("222") || str.startsWith("225") || str.startsWith("227") || str.startsWith("226") || str.startsWith("216") || str.startsWith("228") || str.startsWith("232") || str.startsWith("236") || str.startsWith("965") || str.startsWith("968") || str.startsWith("880") || str.startsWith("599") || str.startsWith("993") || str.startsWith("974") || str.startsWith("973") || str.startsWith("975") || str.startsWith("976") || str.startsWith("356") || str.startsWith("855") || str.startsWith("381") || str.startsWith("503") || str.startsWith("502") || str.startsWith("377") || str.startsWith("357") || str.startsWith("853") || str.startsWith("370") || str.startsWith("371") || str.startsWith("373") || str.startsWith("504") || str.startsWith("598") || str.startsWith("686") || str.startsWith("505") || str.startsWith("852") || str.startsWith("675") || str.startsWith("506") || str.startsWith("509") || str.startsWith("591") || str.startsWith("507") || str.startsWith("43") || str.startsWith("46") || str.startsWith("41") || str.startsWith("51") || str.startsWith("48") || str.startsWith("32") || str.startsWith("56") || str.startsWith("31") || str.startsWith("33") || str.startsWith("39") || str.startsWith("36") || str.startsWith("34") || str.startsWith("40") || str.startsWith("84") || str.startsWith("82") || str.startsWith("93") || str.startsWith("94") || str.startsWith("61") || str.startsWith("62") || str.startsWith("66") || str.startsWith("1") || str.startsWith("7")) {
            return 11;
        }
        if (str.startsWith("260") || str.startsWith("258") || str.startsWith("261") || str.startsWith("264") || str.startsWith("263") || str.startsWith("262") || str.startsWith("249") || str.startsWith("250") || str.startsWith("265") || str.startsWith("251") || str.startsWith("255") || str.startsWith("254") || str.startsWith("256") || str.startsWith("351") || str.startsWith("352") || str.startsWith("224") || str.startsWith("221") || str.startsWith("212") || str.startsWith("211") || str.startsWith("213") || str.startsWith("218") || str.startsWith("355") || str.startsWith("240") || str.startsWith("243") || str.startsWith("244") || str.startsWith("233") || str.startsWith("237") || str.startsWith("966") || str.startsWith("967") || str.startsWith("970") || str.startsWith("963") || str.startsWith("962") || str.startsWith("886") || str.startsWith("971") || str.startsWith("972") || str.startsWith("995") || str.startsWith("994") || str.startsWith("996") || str.startsWith("998") || str.startsWith("992") || str.startsWith("387") || str.startsWith("420") || str.startsWith("421") || str.startsWith("380") || str.startsWith("593") || str.startsWith("595") || str.startsWith("44") || str.startsWith("55") || str.startsWith("30") || str.startsWith("20") || str.startsWith("90") || str.startsWith("91") || str.startsWith("92") || str.startsWith("98") || str.startsWith("57") || str.startsWith("81") || str.startsWith("60") || str.startsWith("58") || str.startsWith("63")) {
            return 12;
        }
        if (str.startsWith("672") || str.startsWith("299") || str.startsWith("298") || str.startsWith("376")) {
            return 9;
        }
        if (str.startsWith("354") || str.startsWith("248") || str.startsWith("269") || str.startsWith("291") || str.startsWith("220") || str.startsWith("241") || str.startsWith("245") || str.startsWith("239") || str.startsWith("238") || str.startsWith("246") || str.startsWith("297") || str.startsWith("960") || str.startsWith("961") || str.startsWith("673") || str.startsWith("597") || str.startsWith("45") || str.startsWith("47") || str.startsWith("95") || str.startsWith("65") || str.startsWith("64")) {
            return 10;
        }
        if (str.startsWith("290")) {
            return 8;
        }
        return (str.startsWith("234") || str.startsWith("964") || str.startsWith("856") || str.startsWith("977") || str.startsWith("49") || str.startsWith("86")) ? 13 : -1;
    }
}
