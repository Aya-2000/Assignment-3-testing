package Lab2;

public class MaxMin {
    int max,min;
    float Average;

    public int maximum(int A[])
    {
        for (int i=0;i<A.length;i++) {
            max=A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (A[j]>max)
                    max=A[j];

            }
        }
        return max;
    }
    public int minimum(int A[])
    {
        for (int i=0;i<A.length;i++) {
            min=A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (A[j]<min)
                    min=A[j];

            }
        }
        return max;
    }
    public float Av(int A[])
    {
        int sum=0;
        for (int i=0;i<A.length;i++) {
           sum+=A[i];
            }
        Average=sum/A.length;
        return Average ;
    }

}
