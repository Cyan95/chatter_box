package leensamziv.chatterbox.util;

import java.util.Random;

public class AvatarUtil {
    private static String string = "🐶^🐱^🐭^🐹^🐰^🦊^🐻^🐼^🐨^🐯^🦁^🐮^🐷^🐸^🐵^🐔^🐧^🐦^🐤^🦆^🦅^🦉^🦇^🐺^🐗^🐴^🦄^🐝^🐛^🦋^🐌^🐞^🐜^🦟^🦗^🕷^🦂^🐢^🐍^🦎^🦖^🦕^🐙^🦑^🦐^🦞^🦀^🐡^🐠^🐟^🐬^🐳^🐋^🦈^🐊^🐅^🐆^🦓^🦍^🐘^🦛^🦏^🐪^🐫^🦒^🦘^🐃^🐂^🐄^🐎^🐖^🐏^🐑^🦙^🐐^🦌^🐕^🐩^🐈^🐓^🦃^🦚^🦜^🦢^🕊^🐇^🦝^🦡^🐁^🐀^🐿^🦔^🐲^🦧^🦮^🦥^🦦^🦨^🦩";
    private static String[] array = string.split("\\^");
    public static String getRandom() {
        return array[new Random().nextInt(array.length)];
    }
}
