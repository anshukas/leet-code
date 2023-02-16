//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long a[], int N, int k)
    {
       int n = a.length;
        long[] firstNegativeNumbers = new long[n - k + 1];
        int idx = 0;

        Queue<Long> q = new LinkedList<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            if (a[windowEnd] < 0) {
                q.add(a[windowEnd]);
            }

            if (windowEnd - windowStart + 1 == k) { // Calculate result and Slide the window
                if (q.isEmpty()) {
                    firstNegativeNumbers[idx++] = 0;
                } else {
                    long num = q.peek();
                    firstNegativeNumbers[idx++] = num;

                    // Remove a[windowStart] from the queue since we need to slide the window now.
                    // But only if it was added to the queue previously
                    if (num == a[windowStart]) {
                        q.remove();
                    }
                }
                windowStart++; // Slide the window ahead
            }
        }
        return firstNegativeNumbers;
    }
}