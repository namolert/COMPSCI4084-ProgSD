import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Call {
    public String number;
    public int duration;

    public Call(String number, int duration) {
        this.number = number;
        this.duration = duration;
    }

    public double calculateBill(List<Call> calls, String favourite) {
        Map<String, Integer> totals = new HashMap<>();
        for (Call call : calls) {
            // totals = new HashMap<>();
            if (totals.containsKey(call.number)) {
                totals.put(call.number,
                        totals.get(call.number) + call.duration);
            } else {
                totals.put(call.number, call.duration);
            }
        }
        double totalCharge = 0;
        for (String number : totals.keySet()) {
            totalCharge += totals.get(number) / 2;
        }
        return totalCharge;
    }

    public static void main(String[] args) {
        Call callTest = new Call("01234567890", 5);
    }
}
