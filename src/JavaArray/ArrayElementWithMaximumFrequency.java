package JavaArray;

public class ArrayElementWithMaximumFrequency {
    public static void main(String[] args) {
        int arrayElements[]=new int[]{7,3,7,3,3,7,8,7,3,3};
        int max=Integer.MIN_VALUE,element=0;
        for (int i=0;i<arrayElements.length;i++)
        {
            int count=1;
            for(int j=0;j<arrayElements.length;j++)
            {
                if(arrayElements[i]==arrayElements[j])
                    count++;

            }
            if(count>max) {
                max = count;
                element = arrayElements[i];
            }

        }
        System.out.println(element);

    }
}
