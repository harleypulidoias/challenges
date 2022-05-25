import CommonPrefix.commonPrefix;

public class App {
    public static void main(String[] args) throws Exception {

        String[] words = { "flower", "flow", "floght" };
        // String[] words = { "flower", "flow", "flight" };
        commonPrefix cP = new commonPrefix();
        System.out.println(cP.processCommonPrefix(words));
    }
}
