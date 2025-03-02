public class Example02_05 {
    
    public static void main(String[] args) {
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        char varChar;
        
        //Initial value to variable
        varByte = (byte) 256; //ในวงเล็บคือการแคสติ้ง คือการแปลงข้อมูล มันจะวิ่งไปเรื่อยๆไปสุด127แล้ววนมาใหม่จนกว่าเลขจะหมด หยุดตรงไหนเอาตรงนั้น
        varShort = (short) 32800; //เหมือนไบต์แต่ไบต์ขอบเขตคือ-128 - 127 ส่วนชอตคือ -32768 - 32767
        varInt = 200000000;
        varLong = 5000000000L;
        varFloat = 120e12F + 234e10f;
        varDouble = 120e10 + 234e10;
        varChar = 'A';
        
        System.out.println("Value byte " + varByte);
        System.out.println("Value short " + varShort);
        System.out.println("Value int " + varInt);
        System.out.println("Value long " + varLong);
        System.out.println("Value float " + varFloat);
        System.out.println("Value double " + varDouble);
        System.out.print("Value char " + varChar);
        System.out.println(", Value ascii " + (byte) varChar);
        System.out.print("Value ascii " + 68);
        System.out.println(", Value char " + (char) 68);
    }
}
