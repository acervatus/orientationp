public class A3 {

    static class Customer {
        int id;
        long startTime;
        long endTime;
        public void SetID(int idSet) {
            id = idSet;
        }
        public void SetStartTime(long startTimeSet) {
            startTime = startTimeSet;
        }
        public void SetEndTime(long endTimeSet) {
            endTime = endTimeSet;
        }
        public int GetId() {
            return id;
        }
        public long GetStartTime() {
            return startTime;
        }
        public long GetEndTime() {
            return endTime;
        }
        public long GetTimeSpent() {
            return endTime-startTime;
        }
    }
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.SetID(1);
        customer.SetStartTime(System.currentTimeMillis());
        customer.SetEndTime(System.currentTimeMillis() + 1000L);
        System.out.println("Id: " + customer.GetId() + " Start time: " + customer.GetStartTime()+ " End time: " + customer.GetEndTime() + " Time spent: " + customer.GetTimeSpent());
    }
}