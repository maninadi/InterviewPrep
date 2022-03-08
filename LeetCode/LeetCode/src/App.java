
public class App {
    public static void main(String[] args) throws Exception {
        UserWebSitePattern l = new UserWebSitePattern();
        String[] usernames = new String[]{"joe","joe","joe","james","james","james","james","mary","mary","mary"};
        String[] websites = new String[]{"home","about","career","home","cart","maps","home","home","about","career"};
        int[] timestamps = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(String.valueOf(l.mostVisitedPattern(usernames, timestamps, websites)));
        
    }
}
