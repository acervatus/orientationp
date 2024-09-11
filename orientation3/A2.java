import java.util.Random;
public class AgeDistribution 
{
    public static void main(String[] args) 
    {
        final int ITERATIONS = 1000;
        int[] studentAges = {18, 18, 18, 19, 19, 19, 19, 19, 20, 20, 21, 22, 22, 23, 25, 26, 29, 30, 31, 34};
        int[] ageRange = new int[studentAges[studentAges.length-1]+1];
        Random r = new Random();
        for(int a = 0; a < ITERATIONS; a++) ageRange[studentAges[r.nextInt(0, studentAges.length)]]++;
        double sum = 0;
        for (int i : ageRange) if(i != 0) sum++;
        for(int i = 0; i < ageRange.length; i++) {
            if(ageRange[i] != 0) {
                System.out.println("Age: " + i + " Count: " + ageRange[i] + " Share: " + ageRange[i] / sum + "%");
            }
        }
    }
}