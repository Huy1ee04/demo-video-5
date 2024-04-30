public class Bai5_5 {
    public static void main(String[] args) {
        long startTimeString = System.currentTimeMillis();
        String resultString = appendStringWithString(10000);
        long endTimeString = System.currentTimeMillis();
        long durationString = endTimeString - startTimeString;
        System.out.println("Thời gian sử dụng String: " + durationString + " millis");
        long startTimeStringBuffer = System.currentTimeMillis();
        String resultStringBuffer = appendStringWithStringBuffer(10000);
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Thời gian sử dụng StringBuffer: " + durationStringBuffer + " millis");
    }
    public static String appendStringWithString(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "Hello";
        }
        return result;
    }
    public static String appendStringWithStringBuffer(int count) {
        StringBuffer resultBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            resultBuffer.append("Hello");
        }
        return resultBuffer.toString();
    }
}
