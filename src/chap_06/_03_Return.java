package chap_06;

public class _03_Return {
    public static String getphoneNumber(){
        String phoneNumber = "02-0123-1234";
        return phoneNumber;
    }
    public static String getAdderss(){
        String address = "경기도 화성시";
        return address;
    }
    public static String getActivities(){
        String activities = "볼링, 탁구, 노래";
        return activities;
    }

    public static void main(String[] args) {
        String phoneNumber = getphoneNumber();
        System.out.println(phoneNumber);
        String address=  getAdderss();
        String activities = getActivities();
        System.out.println(address);
        System.out.println(activities);
    }
}
