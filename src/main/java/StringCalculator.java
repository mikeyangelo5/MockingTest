public class StringCalculator {
    public int Add(String input){
        if(input.contains(",")){
            //TODO
            // if input "a,b" then return a+b
            String[] values = input.split(",");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            if(a > 1000){
                a = 0;
            }
            if(b > 1000){
                b = 0;
            }
            return a+b;
        } else if(input.contains("-")) {
            throw new IllegalArgumentException("Tidak boleh ada negatif");
        } else {
            return 0;
        }
    }
}

