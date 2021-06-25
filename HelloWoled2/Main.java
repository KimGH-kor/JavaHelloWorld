package HelloWoled2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim()); 
        
        for (int i = 0; i < T; i++) {
            String text = br.readLine();
            String[] W = text.split(" ");
            int A = Integer.parseInt(W[0]);
            int B = Integer.parseInt(W[1]);
            bw.write(A+B+"\n");
            bw.flush();
            }

        bw.close();
        br.close();
 
    }
}