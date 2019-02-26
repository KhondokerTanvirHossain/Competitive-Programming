import java.util.*;
import java.io.*;
public class Main {
                       /////////////////////////My Solve
    static void solve() throws IOException {
       
    }
                       /////////////////////////My Main
    public static void main(String[] args) throws IOException {
        solve();
        out.close();
    }
                       /////////////////////////My Writer var
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
                       /////////////////////////My Reader Class
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st = null;
    static String next() throws IOException {
        while(st == null || !st.hasMoreElements()){
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    static double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }
    static float nextFloat() throws IOException{
        return Float.parseFloat(next());
    }
    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }
    static String nextLine() throws IOException{
        String str="";
        do{
            str=br.readLine();
        }while(str.length()==0);
        return str;
    }
}
