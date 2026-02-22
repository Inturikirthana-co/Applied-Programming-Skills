import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char t : tasks)
            freq[t - 'A']++;

        Arrays.sort(freq);

        int maxFreq = freq[25];

        int maxCount = 0;
        for (int i = 25; i >= 0 && freq[i] == maxFreq; i--)
            maxCount++;

        int partCount = maxFreq - 1;
        int partLength = n + 1;

        int result = partCount * partLength + maxCount;

        return Math.max(result, tasks.length);
    }
}
