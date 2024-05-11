package Day11;

public class StringBufferAndStringBuilderPerformanceTest {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("Hello");

        for(int i=0;i<10000;i++){
            sb.append(" world");
        }

        System.out.println("Time take by Stringbuffer: "+(System.currentTimeMillis()-startTime)+ "ms");

        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("Hello");

        for(int i=0;i<10000;i++){
            stringBuilder.append(" world");
        }

        System.out.println("Time take by Stringbuilder: "+(System.currentTimeMillis()-startTime)+ "ms");
    }
}
