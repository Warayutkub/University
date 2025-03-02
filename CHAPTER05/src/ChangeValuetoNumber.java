import javax.swing.JOptionPane;

public class ChangeValuetoNumber {

    public void mainProgram(){
        int type;
        while (true) {
            type = Integer.parseInt(JOptionPane.showInputDialog("Enter Type(1/2) : "));
            if (type == 1 || type == 2){
                break;
            }
        }
        if (type == 1){
            String data = JOptionPane.showInputDialog("Enter data String : ").toLowerCase().trim();
            String mess = "Your data is \""+ data + "\" change to number \n : " + TurnToNumber(data);
            JOptionPane.showMessageDialog(null, mess, "Turn to number result", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String data = JOptionPane.showInputDialog("Enter data Number : ").trim();
            String mess = "Your data is \""+ data + "\" change to string \n : " + TurnToString(data);
            JOptionPane.showMessageDialog(null, mess, "Turn to String result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String TurnToString(String value){
        String result="";
        int index = 1;
        while (value.length() !=0) {
            int data = Integer.parseInt(value.substring(0,index));
            switch (data) {
                case 0 -> result += "zero ";
                case 1 -> result += "One ";
                case 2 -> result += "Two ";
                case 3 -> result += "Three ";
                case 4 -> result += "Four ";
                case 5 -> result += "Five ";
                case 6 -> result += "Six ";
                case 7 -> result += "Seven ";
                case 8 -> result += "Eight ";
                case 9 -> result += "Nine ";
            }
            value = value.substring(index);

        }
        return result;
    }

    public static String TurnToNumber(String value){
        String result = "";
        String data;
        while (value.length()!=0) {
            int index = value.indexOf(" ");
            if (index >= 0){
                data = value.substring(0,index);
            }else{
                data = value;
            }
            switch (data) {
                case "zero" -> result += "0";
                case "one" -> result += "1";
                case "two" -> result += "2";
                case "three" -> result += "3";
                case "four" -> result += "4";
                case "five" -> result += "5";
                case "six" -> result += "6";
                case "seven" -> result += "7";
                case "eight" -> result += "8";
                case "nine" -> result += "9";
            }
            if (index >= 0){
                value = value.substring(index+1);
            }else{
                value = "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ChangeValuetoNumber Let = new ChangeValuetoNumber();
        Let.mainProgram();
    }
}
