public class shortestPath
{
    public static float displacement(String str)
    {
        int x=0, y=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)=='N') {
                y++;
            }
            else if (str.charAt(i)=='S') {
                y--;
            }
            else if (str.charAt(i)=='E') {
                x++;
            }
            else if (str.charAt(i)=='W') {
                x--;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(displacement(path));
    }
}